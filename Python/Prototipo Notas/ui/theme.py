# jSilk app by Pedro Ivo, 2025
# Controle de tema

import tkinter as tk
from tkinter import ttk

# Estado global do tema
dark_mode = False

def get_colors():
    if dark_mode:
        return {
            "root_bg": "#1e1e1e",
            "fg": "#ffffff",
            "entry_bg": "#2b2b2b",
            "select_bg": "#3e3e3e",
            "toolbar_bg": "#303030"
        }
    else:
        return {
            "root_bg": "#fafafa",
            "fg": "#000000",
            "entry_bg": "#ffffff",
            "select_bg": "#d8d8d8",
            "toolbar_bg": "#e6e6e6"
        }

def apply_style(root):
    # Configura o ttk theme conforme o modo atual
    c = get_colors()
    style = ttk.Style()

    style.theme_use("clam")
    style.configure(".", background=c["root_bg"], foreground=c["fg"], fieldbackground=c["entry_bg"])
    
    # Notebook
    style.configure("TNotebook", background=c["root_bg"])
    style.configure("TNotebook.Tab", background=c["entry_bg"], foreground=c["fg"])
    style.map("TNotebook.Tab", background=[("selected", c["select_bg"])])

    # Toolbar buttons
    style.configure("Toolbutton", background=c["toolbar_bg"], foreground=c["fg"], padding=5, relief="flat")
    style.map("Toolbutton", background=[("active", c["select_bg"])])

    root.configure(bg=c["root_bg"])

def apply_widget_colors(widgets):
    # Aplica cores explícitas para widgets tk
    c = get_colors()
    for w in widgets:
        try:
            if isinstance(w, tk.Text):
                w.configure(bg=c["entry_bg"], fg=c["fg"], insertbackground=c["fg"], selectbackground=c["select_bg"])
            elif isinstance(w, tk.Entry):
                w.configure(bg=c["entry_bg"], fg=c["fg"], insertbackground=c["fg"])
            elif isinstance(w, tk.Listbox):
                w.configure(bg=c["entry_bg"], fg=c["fg"], selectbackground=c["select_bg"])
        except:
            pass

def toggle_theme(root, widgets):
    # Alterna tema
    global dark_mode
    dark_mode = not dark_mode

    apply_style(root)
    apply_widget_colors(widgets)
