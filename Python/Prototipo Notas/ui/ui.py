# jSilk app by Pedro Ivo, 2025
# Interface gráfica com modo escuro e toolbar

import tkinter as tk
from tkinter import simpledialog, messagebox, ttk

import ui.notes as notes
import ui.todo as todo
import ui.utils as utils
import ui.toolbar as toolbar
from ui.theme import apply_style, apply_widget_colors, toggle_theme, dark_mode

def create_ui(root):
    # Aplica tema inicial
    apply_style(root)

    # Notebook
    tabs = ttk.Notebook(root)
    tab_notes, tab_todo, tab_tags = ttk.Frame(tabs), ttk.Frame(tabs), ttk.Frame(tabs)
    tabs.add(tab_notes, text="Notas")
    tabs.add(tab_todo, text="Tarefas")
    tabs.add(tab_tags, text="Tags")
    tabs.pack(expand=True, fill="both")

    # Notas
    title = tk.Entry(tab_notes); title.pack(fill="x", padx=6, pady=6)
    utils.set_placeholder(title, "Digite o título aqui.")

    text = tk.Text(tab_notes, height=10); text.pack(fill="both", expand=False, padx=6, pady=6)
    utils.set_placeholder(text, "Digite suas anotações aqui.")

    notes_list = tk.Listbox(tab_notes)

    # Função para alternar visibilidade
    notes_visible = {"value": False}

    def toggle_notes_list():
        if notes_visible["value"]:
            notes_list.pack_forget()
            notes_visible["value"] = False
            #btn_toggle_notes.config(text="Notas salvas")
        else:
            notes_list.pack(fill="both", expand=True, padx=6, pady=6)
            notes_visible["value"] = True
            #btn_toggle_notes.config(text="Ocultar")

    #btn_toggle_notes.config(command=toggle_notes_list)

    # Salvar e abrir
    ttk.Button(tab_notes, text="Salvar", command=lambda: save_note(title, text, refresh)).pack(anchor="w", padx=6, pady=2)
    ttk.Button(tab_notes, text="Abrir", command=lambda: open_note(notes_list)).pack(anchor="w", padx=6, pady=2)

    # TODO
    todo_list = tk.Listbox(tab_todo)
    todo_list.pack(fill="both", expand=True, padx=6, pady=6)
    ttk.Button(tab_todo, text="Adicionar Tarefa", command=lambda: add_todo(refresh)).pack(anchor="w", padx=6, pady=2)
    ttk.Button(tab_todo, text="Marcar/Desmarcar", command=lambda: toggle_t(todo_list, refresh)).pack(anchor="w", padx=6, pady=2)

    # Tags
    tag_list = tk.Listbox(tab_tags); tag_list.pack(fill="both", expand=True, padx=6, pady=6)
    ttk.Button(tab_tags, text="Mostrar", command=lambda: show_tag(tag_list)).pack(anchor="w", padx=6, pady=2)

    # Atualiza
    def refresh():
        notes_list.delete(0, tk.END)
        for nid, t in notes.list_notes(): 
            notes_list.insert(tk.END, f"{nid} - {t}")

        todo_list.delete(0, tk.END)
        for tid, t, done in todo.list_tasks():
            todo_list.insert(tk.END, f"{tid} - {'✅' if done else '⬜'} {t}")

        tag_list.delete(0, tk.END)
        for (tag,) in notes.list_tags(): 
            tag_list.insert(tk.END, tag)

    refresh()

    widgets = [title, text, notes_list, todo_list, tag_list]
    apply_widget_colors(widgets)

    # Cria a toolbar
    toolbar.create_toolbar(root, widgets)

    # Conecta o toggle
    #btn_theme.config(command=lambda: toggle_theme(root, widgets, btn_theme))

    return widgets

# Funções auxiliares
def save_note(title, text, refresh):
    notes.add_note(title.get(), text.get("1.0", tk.END))
    title.delete(0, tk.END); text.delete("1.0", tk.END)
    refresh()

# Abre as notas
def open_note(listbox):
    s = listbox.get(tk.ACTIVE)
    if not s: return
    nid = s.split(" - ")[0]
    t, c = notes.get_note(nid)
    messagebox.showinfo(t, c)

# Cria nova tarefa
def add_todo(refresh):
    t = simpledialog.askstring("Nova tarefa", "Digite a tarefa:")
    if t:
        todo.add_task(t); refresh()

def toggle_t(lb, refresh):
    s = lb.get(tk.ACTIVE)
    if not s: return
    tid = s.split(" - ")[0]
    todo.toggle_task(tid); refresh()

def show_tag(lb):
    t = lb.get(tk.ACTIVE)
    if not t: return
    d = notes.notes_by_tag(t)
    msg = "\n\n".join([f"{title}\n{content}" for title, content in d])
    messagebox.showinfo(f"#{t}", msg)
