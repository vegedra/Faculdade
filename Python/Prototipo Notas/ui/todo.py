# jSilk app by Pedro Ivo, 2025
# Parte das tarefas no app

from data.database import conn, cur

def add_task(task):
    cur.execute("INSERT INTO todos (task) VALUES (?)", (task,))
    conn.commit()
    print('Tarefa adicionada')

def toggle_task(task_id):
    cur.execute("UPDATE todos SET done = NOT done WHERE id=?", (task_id,))
    conn.commit()
    print('Tarefa marcada')

def list_tasks():
    return cur.execute("SELECT id, task, done FROM todos ORDER BY id DESC").fetchall()