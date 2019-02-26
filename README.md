# ubsapi
teste/desafio de programação Bionexo 

Json de consulta

Este é um pequeno desafio realizado para um processo seletivo. 
O objetivo do mesmo é informar quais são as UBS (Unidade Basica de Saude) que estão mais proximas de uma coordenada, para consulta pelo cidadão.

Foi utilizado para este desafio:

SpringBoot
JPA
FlyWay
Swagger
PostgresSQL

SpringBoot --> Configura e publica a aplicação.

JPA --> Mapeamento de entidades com o Banco de dados.

FlyWay --> Ferramenta de migração de Dados, utilizada para criar a estrutura de banco de dados e popular as mesmas(Insert). Esta possui scripts sql que são executados, os mesmos se encontram no diretorio:

src/main/resources/db/migration

Ao iniciar a aplicação, esses scripts são executados para atualizar a base de dados, sendo executados apenas uma vez. Para outras mudanças na estrutura é necessario criar novos scripts e versionar os mesmos em uma sequencia simples, exemplo são os arquivos que já estão no diretorio, V01..., V02... etc.

Para esta api, basta criar um banco com o nome ubs no postgres, e executar a mesma, as tabelas seram criadas e populadas.



Swagger -->  Ferramenta que auxilia o desenvolvedor de APIs REST a modelar e documentar a mesma.

Apos api iniciada, pode-se acessar a url abaixo

http://localhost:8080/swagger-ui.html

Nela da para vê os serviços REST que foram publicados, assim como exemplo dos valores de entrada e de resposta, podendo fazer o consumo dos serviços para teste.


PostgresSQL --> Banco de dados.


Esta API esta organizada da seguinte forma

Resource 			--> Responsavel pelas requisições, nela estão os mapeamentos de recursos REST.
Service 			--> Responsavelpela logica de negocio da API.
Repository 			--> Acesso a banco de dados.
Model 				--> Mapeamento de entidades.
Converter 			--> Conversores de entidade para o DTO
DTO 				--> Objetos que representam os dados que são visiveis para o front end
ExceptionHandler 	--> Pequeno tratamento de excptions da aplicação

==========================================
Demais estruturas
==========================================

Calculation 		--> Contem a implementação de calculos de distancia, nesse momento possui o metodo de Haversine, que calcula a distancia entre dois pontos levando em consideração a curvatura do planeta terra.

Swaggerdoc 			--> Inicializa a configuração para a interface do swagger.


