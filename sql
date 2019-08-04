SELECT * FROM vendas, clientes where vendas.id_cliente = clientes.id
                            ou
select * from vendas JOIN clientes ON (vendas.id_cliente = clientes.id)	


relacionamento de duas tabelas onde um campo nao seja obrigatorio:
SELECT * FROM vendas RIGHT/LEFT join clientes on (vendas.id_cliente = clientes.id)
SELECT * FROM vendas RIGHT/LEFT join clientes on (vendas.id_cliente = clientes.id) WHERE clientes.id = 3


SELECT vendas.valor1, vendas.valor2, vendas.valor3, clientes.nome FROM vendas RIGHT join clientes on (vendas.id_cliente = clientes.id) WHERE clientes.id = 3

SELECT vendas.valor1, vendas.valor2, vendas.valor3, clientes.nome, (vendas.valor1 * 1.15) AS valor_com_aumento FROM vendas RIGHT join clientes on (vendas.id_cliente = clientes.id) WHERE clientes.id = 3


total de vendas por cliente 
SELECT  sum(vendas.valor1), sum(vendas.valor2), sum(vendas.valor3), clientes.nome FROM vendas RIGHT join clientes on (vendas.id_cliente = clientes.id) group by clientes.nome

SELECT  sum(vendas.valor1), sum(vendas.valor2), sum(vendas.valor3), clientes.nome FROM vendas INNER join clientes on (vendas.id_cliente = clientes.id) group by clientes.nome

