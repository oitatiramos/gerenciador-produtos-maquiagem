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

Aqui está o espaço reservado para você adicionar as **evidências positivas do Postman**:

### ✅ **Evidências**
1. Capturas de tela das requisições com os endpoints funcionando.
2. Respostas bem-sucedidas retornadas pela API.
3. Demonstração de inclusão e listagem.

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

