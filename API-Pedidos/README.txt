Nesse arquivo README explica-se como verificar as regras de negocio do exerc�cio
Regra de negocio:  Todos os servi�os devem trabalhar com XML e JSON para chamadas e retornos. Para verificar a implementa��o de esta regra de negocio se crio para cada request em formato Json sua equivalente em formato XML.

Regra de neg�cio: Criar um servi�o que receba pedidos com 6 campos:
n�mero controle - n�mero aleat�rio informado pelo cliente, data cadastro (opcional)
nome - nome do produto, valor - valor monet�rio unit�rio produto, quantidade (opcional) - quantidade de produtos,  c�digo cliente - identifica��o num�rica do cliente. Para verificar a implementa��o desta regra primeiro criamos alguns par�metros que utilizaremos como os clientes, items, e depois criamos 1 arquivo que contem 1 pedido com 2 items.
Executamos no postman
1-Teste cria��o clientes
2-Teste cria��o items
3-Teste cria��o arquivo

Regra de negocio:   O arquivo pode conter 1 ou mais pedidos, limitado a 10. Esta regra de neg�cio foi verificada no teste unit�rio:  teste_arquivo_com_mais_de_10_pedidos_exception

Regra de negocio:  N�o poder� aceitar um n�mero de controle j� cadastrado. Verifica��o: Caso tentar cadastrar dois pedidos, clientes ou items com o mesmo id-c�digo o sistema retorna um status 409 que representa um conflito por recursos duplicados.

Regra de neg�cio: Caso a data de cadastro n�o seja enviada o sistema deve assumir a data atual. Esta regra de negocio foi verificada no teste unit�rio:
teste_sem_data_de_cadastro

Regra de neg�cio:   Caso a quantidade n�o seja enviada considerar 1. Esta regra de negocio foi verificada no teste unit�rio:
teste_quantidade_igual_a_cero

Regra de negocio:  Caso a quantidade seja maior que 5 aplicar 5% de desconto no valor total, para quantidades a partir de 10 aplicar 10% de desconto no valor total. Esta regra de negocio foi verificada nos testes unitarios:
teste_calcula_valor_com_5_por_cento_desconto
teste_calcula_valor_com_10_por_cento_desconto

Regra de negocio:  O sistema deve calcular e gravar o valor total do pedido. Esta regra de negocio foi verificada no teste unit�rio:
teste_calcula_valor_total_sem_desconto

Regra de negocio: Criar um servi�o onde possa consultar os pedidos enviados pelos clientes. 
Crit�rios aceita��o: O retorno deve trazer todos os dados do pedido, filtros da consulta: 
n�mero pedido, data cadastro, cliente, todos.  Para verificar esta regra de negocio, executamos as request que est�o dentro da pasta 5-Teste consultas no postman
Buscar pedido por cliente
Buscar todos os pedidos do cliente
Buscar todos os pedidos por data
Buscar todos os pedidos

Regra de negocio:  Ao subir a aplica��o, o banco de dados deve conter 10 pedidos cadastrados, um para cada cliente cadastrado, com c�digos de cliente de 1 a 10. Esta configura��o foi feita na aplica��o, apenas � necess�rio criar o banco de dados com o nome �pedidos� e um usuario: �marcos� com a senha �marcos123� no MySQL. A aplica��o cada v�z que sobe, cria todas as tabelas automaticamente, e insere os dados de exemplo nas tabelas.
