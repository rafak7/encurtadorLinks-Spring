# Desafio Backend: Encurtador de URL

Resolução do desafio proposto pelo repositório Backend Brasil, confira detalhes neste [link](https://github.com/Backend-Brasil).

## 🚀 Tecnologias utilizadas
- Java
- Spring Boot
- Spring Data MongoDB
- Docker
- MongoDB

## 📄 Exemplo de Uso da API

Você pode encurtar uma URL fazendo uma requisição POST para o endpoint `/shorten-url` com um corpo JSON contendo a URL que deseja encurtar. Veja um exemplo utilizando o Postman:

### Request
- **Method**: POST
- **URL**: `http://localhost:8080/shorten-url`
- **Body**:
    ```json
    {
        "url": "https://www.linkedin.com/in/rafael-lino7/"
    }
    ```

### Response
- **Status**: 200 OK
- **Body**:
    ```json
    {
        "url": "http://localhost:8080/A1Xfj"
    }
    ```

## 🔍 Baixe o projeto e teste você mesmo na prática
1. Clone o repositório:
    ```sh
    git clone https://github.com/rafak7/encurtadorLinks-Spring.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd urlshortener
    ```
3. Inicie os serviços do Docker:
    ```sh
    docker-compose up -d
    ```
4. Execute a aplicação:
    ```sh
    mvn clean spring-boot:run
    ```

Acesse a aplicação em `http://localhost:8080`.

## 😃 Conheça mais sobre o nosso trabalho

Para mais informações e projetos, siga-nos nas redes sociais e visite nosso site!

---

🌟 Não se esqueça de deixar uma estrela no repositório se você gostou do projeto!
