-- Aula 14/11/25 - Conteudo AR

-- Cria database
create database Aula

-- cria tabela - nao da pra criar duas vezes
create Table ProdutosLoja (
id int,
nome varchar(100),
categoria varchar(50),
preco decimal(10, 2),
estoque int
)

select * from ProdutosLoja

create table Fornecedores (
id_forn int,
nome_forn varchar(100),
cidade varchar(50)
)

-- inserindo dados
insert into ProdutosLoja values 
(1, 'Pote Hermetico 2L', 'cozinha', 29.90, 150)

insert into ProdutosLoja values
(2, 'Jogo de toalhas', 'casa', 89.90, 60),
(3, 'Smartwatch', 'Tecnologia', 199.90, 35),
(4, 'luminaria de mesa', 'iluminacao', 79.90, 90),
(5, 'cabo hdmi', 'eletronicos', 29.90, 200)

-- atualizar: aumento de 10% no valor de produtos de cozinha
update ProdutosLoja
set preco = preco*1.10
where categoria = 'cozinha'

-- Exercicio:  reduza o preco smartwatch em 10 reais
update ProdutosLoja
set preco = preco - 10
where id = 3

-- Funcao like -> procurar algo com palavra x -- string usa aspas, para nao depende
where like 'mouse%' -- nome termina com mouse
where like '%mouse' -- nome comeca com mouse
where like '%mouse%' -- em qualquer lugar que tenha mouse

-- procurar telefone que comeca com 11 9...
where telefone like %11 9%


-- exercicio: zere o estoque de todos os produtos que possuam mouse
update ProdutosLoja
set estoque = estoque * 0
where nome like '%Mouse%'

-- exercicio: deletar um produto(linha) por algum filtro
delete from ProdutosLoja
where id = 4

-- exercicio: 
alter table ProdutosLoja
add data_cadastro DATE

-- GETDATE() pega a data de hoje
-- exercicio: adicione a data de hoje na tabela
update ProdutosLoja
set data_cadastro = getdate()


-- alter table tambem serve para adicionar e retirar coluna
