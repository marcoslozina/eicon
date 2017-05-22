Neste repositório, encontra-se os exercícios do exame: Prova - TESTE “PROGRAMADOR JAVA” – EICON BRASIL
Para a resolução do exércicio se crio um Web Services RESTful utilizando o estilo de arquitetura REST proposto por Roy Fielding, este estilo de arquitetura se caracteriza por ser escalável, incremental, simples, extensível, e global, ou seja, caraterísticas que a web atual possui.
A implementação foi feita utilizando a tecnologia do framework Spring MVC, junto com APIs de java 8. 
Os componentes do framework utilizado foram: Spring boot, Spring Data, devtools. 
O Banco de dados MySQL, e servidor web tomcat embutido independente, rodando no porto 8080. 
Os testes foram realizados utilizando Junit e Mock Object junto com testes automatizados feitos em Postman.
Foi utilizado design patterns, o pattern builder para construção de objetos grandes como é o caso do objeto pedido de venda, nos testes unitarios.
Para executar o exercício, descarregar este repositório, compilar o projeto utilizando mvn compile. 
Antes de executar a API, implantar o banco de dados
Para implantar o banco de dados, criar um banco de dados em MySQL com o nome "pedidos" e Criar o usuário "marcos" com a senha "marcos123"
----------------------------------------------------------------------------
CREATE DATABASE pedidos
CREATE USER 'marcos'@'localhost' IDENTIFIED BY 'marcos123';
GRANT ALL PRIVILEGES ON * . * TO 'marcos'@'localhost';
----------------------------------------------------------------------------
Executar a APIs executar como spring-boot-aplication. 
Após iniciar a API, importar os testes automatizados em postman (API-Pedidos.postman_collection.json) e executá-los.
A aplicação está configurada para criar automaticamente as tabelas e popular com os dados de exemplo cada vês que inicie a aplicação.
Dentro da pasta API-Pedidos encontrasse um arquivo README que explica como executar os testes para verificar as regras de negócios pedidas nos exercícios.
