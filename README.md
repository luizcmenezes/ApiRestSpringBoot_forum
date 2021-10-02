
![API](https://user-images.githubusercontent.com/49596891/135698025-51bb0fae-f709-4f64-8b61-857e07a8d780.gif)

# Api Rest Spring Boot - FORUM

API REST [Spring Boot](https://spring.io/quickstart) com o gerenciador de dependências [Maven](https://mvnrepository.com/) para um fórum, com a finalidade de cadastrar, excluir, alterar, detalhar e listar todos o s tópicos.  

### O Projeto foi criado utilizando as dependências:

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* spring-boot-starter-validation
* spring-boot-devtools
* spring-boot-starter-test
* h2

### EndPoints:

* Cadastra tópicos:
 POST: http://localhost:8080/topicos
 
* Lista todos os tópicos:
 GET: http://localhost:8080/topicos
 
* Lista tópicos por Id:
 GET: http://localhost:8080/topicos/{id}
 
* Atualiza tópicos por Id:
 PUT: http://localhost:8080/topicos/{id}
 
 * Deleta tópicos por Id:
 DELETE: http://localhost:8080/topicos/{id}
