# jSilk app by Pedro Ivo, 2025
# Parte das notas no app

from data.database import conn, cur
from ui.utils import extract_tags

# Adicionar uma nota
def add_note(title, content):
    cur.execute("INSERT INTO notes (title, content) VALUES (?, ?)", (title, content))
    note_id = cur.lastrowid

    tags = extract_tags(content)
    
    for t in tags:
        cur.execute("INSERT INTO note_tags (note_id, tag) VALUES (?, ?)", (note_id, t))

    conn.commit()
    print('Nota adicionada')

def list_notes():
    return cur.execute("SELECT id, title FROM notes ORDER BY id DESC").fetchall()

def get_note(note_id):
    return cur.execute("SELECT title, content FROM notes WHERE id=?", (note_id,)).fetchone()

def notes_by_tag(tag):
    return cur.execute("""
    SELECT notes.title, notes.content FROM notes
    JOIN note_tags ON notes.id = note_tags.note_id
    WHERE note_tags.tag=?
    """, (tag,)).fetchall()

def list_tags():
    return cur.execute("SELECT DISTINCT tag FROM note_tags ORDER BY tag").fetchall()