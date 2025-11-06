# jSilk app by Pedro Ivo, 2025
# Banco de dados com sqlite

import sqlite3

conn = sqlite3.connect("jsilk.db")
cur = conn.cursor()

cur.execute("""
CREATE TABLE IF NOT EXISTS notes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT,
    content TEXT
)
""")

cur.execute("""
CREATE TABLE IF NOT EXISTS note_tags (
    note_id INTEGER,
    tag TEXT
)
""")

cur.execute("""
CREATE TABLE IF NOT EXISTS todos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    task TEXT,
    done INTEGER DEFAULT 0
)
""")

conn.commit()