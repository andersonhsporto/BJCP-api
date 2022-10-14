# BJCP API
<p align="center">
<img src="https://github.com/andersonhsporto/bjcp-api/blob/master/img/beer.jpg" style="width:400px;height:200px; alt="Taygeta Star"/><br>
</p>

&emsp;BJCP API é uma [API REST](https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api)
que utiliza dados do [Beer Judge Certification Program](https://github.com/andersonhsporto/BJCP-csv)
e o framework
[Spring](https://spring.io/projects/spring-boot).

</br>
</br>
</br>

## Ferramentas Utilizadas

* [JAVA 18](https://www.java.com/pt-BR/) - Linguagem de programação (JDK 18).
* [Spring](https://spring.io/projects/spring-boot) - Framework MVC.
* [Apache Maven 3.8.6](https://maven.apache.org/) - Gerenciador de dependências.
* [IntelliJ](https://www.jetbrains.com/idea/) - IDE para desenvolvimento.
* [Docker](https://www.docker.com/) - Serviço de virtualização.
* [H2](https://www.h2database.com/html/main.html) - Banco de dados em memoria.

## Métodos

Requisições para a API devem seguir os padrões:
| Método | Rota | Descrição |
|:---:    |:---: |:---:      |
| `GET`              | `/api/v1/styles`| Retorna uma lista ( JSON ) com os dados de todos os estilos
de cervejas disponíveis no BJCP |

## Inicialização

Para iniciar a api utilize o comando:

```sh
  docker-compose up
```

Este comando irá iniciar um contêiner com a api na porta `8080`.

Para gerar o artefato da api utilize o comando:

    ```sh
    mvn clean install
    ```

Este comando irá gerar um arquivo `jar` na pasta `target` do projeto.

## Dependências

&emsp;As dependências são declaradas no
arquivo [pom.xml](https://github.com/andersonhsporto/taygeta-api/blob/master/pom.xml).

| Dependência                     | Descrição                                                          | Versão  |
| :----------------------------:  | :---------------------------------------------------------------: | :-----: |
| H2database                      | Banco de dados relacional escrito em Java que funciona em memória | 2.1.214 |
| Spring-boot-starter-data-jpa    | Responsável por conectar a aplicação Spring como o banco de dados | 2.7.4   |
| Spring-boot-starter-web         | Responsável pela camada MVC do Spring                             | 2.7.4   |
| Springfox-swagger-ui            | Documentação JSON API para aplicações Spring                      | 3.0.0   |

<p align=left> <b>Minhas informações de contato 📬</b></p>
<p align=left>
<a href="https://github.com/andersonhsporto" target="_blank"><img src="https://img.shields.io/badge/Github-181717?logo=Github&logoColor=white"/></a>  
<a href="mailto:anderson.higo2@gmail.com" target="_blank"><img src="https://img.shields.io/badge/Gmail-EA4335?logo=Gmail&logoColor=white"/></a>
<a href= "https://www.linkedin.com/in/andersonhsporto/"target="_blank"><img src="https://img.shields.io/badge/linkedin-%230077B5.svg?logo=linkedin&logoColor=white"/></a>

***

Copyright © 2015, BJCP, Inc.
The BJCP grants the right to make copies for use
in BJCP-sanctioned competitions or for educational/judge training purposes.  
All other rights reserved.

The 2015 guidelines were replaced by the 2021 guidelines, so the prior version is no longer valid.

you can find the current version on www.bjcp.org
