
# Problema SEDEX - Verificação de Compatibilidade de Bolas de Boliche

Este é um sistema de gestão de testes de envio de boliche, onde são realizados testes de envio de pacotes com bolas de boliche, registrando as dimensões dos pacotes e o status do envio.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- PostgreSQL
- Maven
- Docker
- Flyway
- Lombok
- Spring Data
- Swagger

## Funcionalidades

- Cadastro de testes de envio
- Consultar testes de envio por ID
- Atualização de testes de envio
- Exclusão de testes de envio
- Armazenamento dos testes de envio no banco de dados PostgreSQL

## Estrutura do Projeto

- **Controller**: Endpoints REST que expõem as funcionalidades do sistema.
- **Service**: Lógica de negócio que manipula os dados dos testes de envio.
- **Repository**: Repositórios JPA que interagem com o banco de dados.
- **Entity**: Representação das entidades do banco de dados, como TesteEnvio.
- **DTOs**: Objetos de Transferência de Dados para comunicação entre a API e o cliente.
- **Enum**: Definição dos status do envio.
- **Validation**: Lógica de validação dos testes de envio.
- **Exception**: Tratamento de exceções para os casos de testes de envio não encontrados.

## Como Rodar o Projeto

### Pré-requisitos

- Docker
- Java 17
- Maven

### Rodando com Docker

1. Clone o repositório:
   ```bash
   git clone https://github.com/luizhenrique3651/Ocorrencias.git
   cd Ocorrencias
   ```

2. Construa e suba os containers:
   ```bash
   docker-compose up --build
   ```

3. O projeto estará disponível em `http://localhost:8080/swagger-ui/index.html`.

### Rodando Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/luizhenrique3651/Ocorrencias.git
   cd Ocorrencias
   ```

2. Construa o projeto com Maven:
   ```bash
   mvn clean install
   ```

3. Rode o projeto com o Spring Boot:
   ```bash
   mvn spring-boot:run
   ```

4. O projeto estará disponível em `http://localhost:8080/swagger-ui/index.html`.

## Endpoints

### GET /teste-envio
Retorna uma lista de todos os testes de envio.

### GET /teste-envio/{id}
Retorna um teste de envio específico, dado um ID.

### POST /teste-envio
Cria um novo teste de envio.

### PUT /teste-envio/{id}
Atualiza um teste de envio existente.

### DELETE /teste-envio/{id}
Deleta um teste de envio.



## Futuras implementações

- Casos de teste
