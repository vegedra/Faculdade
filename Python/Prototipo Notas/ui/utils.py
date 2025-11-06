# jSilk app by Pedro Ivo, 2025
# Funções utilitárias

import re
import tkinter as tk

# Extrair tags de uma nota
def extract_tags(text):
    return re.findall(r"#(\w+)", text)

# Função para adicionar placeholder
def set_placeholder(widget, placeholder_text):
    # Detecta se é Entry ou Text
    if isinstance(widget, tk.Entry):
        start_index = 0
    elif isinstance(widget, tk.Text):
        start_index = "1.0"
    else:
        raise TypeError("Widget não suportado: use Entry ou Text")

    # Define placeholder
    widget.insert(start_index, placeholder_text)
    widget.config(fg="gray")

    def on_focus_in(event):
        if isinstance(widget, tk.Entry):
            if widget.get() == placeholder_text:
                widget.delete(0, tk.END)
                widget.config(fg="black")
        elif isinstance(widget, tk.Text):
            if widget.get("1.0", tk.END).strip() == placeholder_text:
                widget.delete("1.0", tk.END)
                widget.config(fg="black")

    def on_focus_out(event):
        if isinstance(widget, tk.Entry):
            if not widget.get():
                widget.insert(0, placeholder_text)
                widget.config(fg="gray")
        elif isinstance(widget, tk.Text):
            if not widget.get("1.0", tk.END).strip():
                widget.insert("1.0", placeholder_text)
                widget.config(fg="gray")

    widget.bind("<FocusIn>", on_focus_in)
    widget.bind("<FocusOut>", on_focus_out)
