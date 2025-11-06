# jSilk app by Pedro Ivo, 2025
# Barra de ferramentas

import ui.theme as theme
import tkinter as tk
from tkinter import messagebox

def create_toolbar(root, widgets):
    def new_file():
        # Novo arquivo
        print("Criar arquivo novo")

    def open_file():
        # Abrir arquivo
        print("Abrir arquivo existente")

    def about():
        messagebox.showinfo("Sobre", "jSilk, um aplicativo de notas e tarefas. \nBy Pedro Ivo, 2025")

    def change_theme():
        # Alternar modo
        print("mudou tema")

    toolbar = tk.Menu(root)

    # Menus - Arquivo
    file_menu = tk.Menu(toolbar, tearoff=0)
    file_menu.add_command(label="Novo", command=new_file)
    file_menu.add_command(label="Abrir", command=open_file)
    file_menu.add_separator()
    file_menu.add_command(label="Sobre", command=about)
    file_menu.add_command(label="Sair", command=root.quit)
    toolbar.add_cascade(label="Arquivo", menu=file_menu)
    # Tema
    theme_menu = tk.Menu(toolbar, tearoff=0)
    theme_menu.add_command(label="Alternar modo", command=lambda: theme.toggle_theme(root, widgets))
    toolbar.add_cascade(label="Tema", menu=theme_menu)

    # Configure the menu bar
    root.config(menu=toolbar)
