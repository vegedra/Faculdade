# jSilk app by Pedro Ivo, 2025
# Módulo principal

import tkinter as tk
from ui.ui import create_ui

# Cria a janela e carrega a UI
root = tk.Tk()
root.title("jSilk (Prototipo)")
create_ui(root)
root.mainloop()
print('Fechando...')
