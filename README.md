
![API](https://user-images.githubusercontent.com/49596891/135698025-51bb0fae-f709-4f64-8b61-857e07a8d780.gif)

# Api Rest Spring Boot - FORUM

API REST [Spring Boot](https://spring.io/quickstart) com o gerenciador de dependências [Maven](https://mvnrepository.com/) para um projeto  de Fórum utilizando o banco de dados o H2, com a finalidade de cadastrar, excluir, alterar, detalhar e listar todos o s tópicos.  

### O Projeto foi criado utilizando as dependências:

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* spring-boot-starter-validation
* spring-boot-devtools
* spring-boot-starter-test
* h2

### Comandos para criar a imagem do projeto spring boot e rodar o mesmo em um Docker:

#### Execute os comandos via terminal dentro da pasta raiz do projeto:

* Para cria a imagem execute: </br>
  docker build -t forum-spring-app .
* Para rodar o projeto no container docker execute: </br>
  docker run -p 8080:8080 forum-spring-app

### EndPoints:

* Cadastra tópicos: </br>
 POST: http://localhost:8080/topicos
 
* Lista todos os tópicos: </br>
 GET: http://localhost:8080/topicos
 
* Lista tópicos por Id: </br>
 GET: http://localhost:8080/topicos/{id}
 
* Atualiza tópicos por Id: </br>
 PUT: http://localhost:8080/topicos/{id}
 
 * Deleta tópicos por Id: </br>
 DELETE: http://localhost:8080/topicos/{id}
