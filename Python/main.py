# Primeiro passo: vamos simular os dados que usaremos no nosso modelo.
# Importamos numpy e pandas, bibliotecas fundamentais para ciência de dados.
# - numpy: geração de números aleatórios, operações matemáticas eficientes.
# - pandas: manipulação de tabelas (DataFrame).
import numpy as np
import pandas as pd

# Definimos uma semente (seed) para o gerador aleatório.
# Isso garante reprodutibilidade: toda vez que rodar o código, gera os mesmos números.
# curiosidade, geralmente se utiliza seed(42) por conta do guia do mochileiro das galáxias
np.random.seed(42) 

# Número de alunos na nossa simulação
n = 300

# Criamos um DataFrame com as notas de Matemática, Estatística, Programação e Frequência.
# - np.random.normal(media, desvio, tamanho): gera valores simulando uma distribuição normal.
# - np.random.randint(inicio, fim, tamanho): gera inteiros aleatórios em um intervalo.
df = pd.DataFrame({
    "matematica": np.random.normal(70, 10, n),
    "estatistica": np.random.normal(65, 12, n),
    "programacao": np.random.normal(75, 8, n),
    "frequencia": np.random.randint(50, 101, n)
})

# Agora criamos a "nota_final" como se fosse a média ponderada dessas variáveis.
# Atribuímos pesos diferentes para simular relevâncias distintas:
# - Matemática = 40%
# - Estatística = 30%
# - Programação = 20%
# - Frequência = 10%
# Além disso, adicionamos ruído (np.random.normal(0, 5, n)) para simular imprevisibilidade.
df["nota_final"] = (
    0.4*df["matematica"] +
    0.3*df["estatistica"] +
    0.2*df["programacao"] +
    0.1*df["frequencia"] +
    np.random.normal(0, 5, n)
)

# Mostramos as primeiras linhas para inspecionar nosso dataset.
df.head()

"""
e pra regressão logística (rodar em outra célula)

from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score, confusion_matrix
import pandas as pd
"""