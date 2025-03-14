# 💄 API de Produtos de Maquiagem 💅

Bem-vindo à **API de Produtos de Maquiagem**, onde a beleza encontra a tecnologia! Essa aplicação foi projetada para gerenciar um catálogo incrível de produtos de maquiagem, como bases líquidas, batons, paletas de sombra e muito mais. 💜

Abaixo você encontrará todas as informações necessárias para começar a usar a API, explorar seus endpoints e, é claro, transformar dados em beleza! ✨

---

## 🛠️ Tecnologias Utilizadas

- **Java** com **Jakarta EE** para desenvolvimento da API.
- **JAX-RS** para implementação de recursos RESTful.
- **Apache Tomcat** como servidor de aplicação.
- Banco de Dados SQL para armazenamento de dados.
- **Postman** para testes.

---

## 📖 Endpoints Disponíveis

### 1. **Listar Produtos**
**Descrição:** Retorna a lista completa de produtos disponíveis.

- **URL:** `GET /produtos`
- **Exemplo de Uso:**
    - **Requisição:** `http://localhost:8080/gerenciador-produtos/produtos`
    - **Resposta (200 OK):**
      ```json
      [
          {
              "id": 1,
              "nome": "Base Líquida",
              "categoria": "Pele",
              "preco": 59.90
          },
          {
              "id": 2,
              "nome": "Batom Matte",
              "categoria": "Lábios",
              "preco": 29.90
          }
      ]
      ```

---

### 2. **Adicionar um Produto**
**Descrição:** Insere um novo produto no catálogo de maquiagem.

- **URL:** `POST /produtos`
- **Exemplo de Uso:**
    - **Requisição:** `http://localhost:8080/gerenciador-produtos/produtos`
    - **Headers:**
      ```
      Content-Type: application/json
      ```
    - **Corpo da Requisição:**
      ```json
      {
          "nome": "Iluminador Cremoso",
          "categoria": "Pele",
          "preco": 45.90
      }
      ```
    - **Resposta (201 Created):**
      ```json
      {
          "nome": "Iluminador Cremoso",
          "categoria": "Pele",
          "preco": 45.90
      }
      ```

---

## 🧪 Testes com Postman

### ✅ **Evidências positivas do Postman**
<div align="center">
    <img src="https://github.com/user-attachments/assets/029423d2-7407-4c63-a8db-55cd098e882b" alt="Descrição da Imagem" width="700px">
</div>

<div align="center">
    <img src="https://github.com/user-attachments/assets/059de2f8-b0de-4f89-a139-cb707bcbfeb7" alt="Descrição da Imagem" width="700px">
</div>

---

## 🚀 Como Executar a API

1. Clone este repositório para sua máquina.
2. Configure o banco de dados SQL e crie as tabelas necessárias.
3. Importe o projeto para sua IDE favorita.
4. Faça o deploy no servidor Tomcat.
5. Use o Postman ou qualquer ferramenta de sua escolha para consumir os endpoints.

---

## 💅 Dicas Finais

- **Organize sua make:** Explore os produtos cadastrados ou adicione novos ao catálogo!
- **Facilidade de integração:** Esta API está pronta para ser integrada em e-commerce, aplicativos ou sistemas de gestão de estoque.
- **Se divirta!** Afinal, programação pode ser tão divertida quanto criar um look novo.

---

