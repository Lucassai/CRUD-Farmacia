# 💊Projeto Farmácia💊

Este projeto consiste em uma API RESTful para a gestão de produtos e categorias de uma farmácia, implementada em Java utilizando o framework Spring Boot. A aplicação permite o gerenciamento de produtos e categorias, incluindo funcionalidades como criação, listagem, atualização e exclusão.

## 📋 Funcionalidades

### Produtos
- **Cadastrar Produto**: Adicionar um novo produto à farmácia.
- **Listar Todos Produtos**: Obter a lista de todos os produtos cadastrados.
- **Listar Produtos por Nome**: Obter o produto por nome.
- **Listar Produtos por ID**: Obter o produto por ID.
- **Atualizar Produto**: Alterar informações de um produto existente.
- **Excluir Produto**: Remover um produto da farmácia.
- **Consultar Disponibilidade**: Verificar os produtos disponiveis.
  

### Categorias
- **Cadastrar Categoria**: Adicionar uma nova categoria à farmácia.
- **Listar Categorias**: Obter a lista de todas as categorias cadastradas.
- **Listar Categorias por Nome**: Obter o produto por nome.
- **Listar Categorias por ID**: Obter o produto por ID.
- **Atualizar Categoria**: Alterar informações de uma categoria existente.
- **Excluir Categoria**: Remover uma categoria da farmácia.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework utilizado para construção da API.
- **Hibernate**: Biblioteca para mapeamento objeto-relacional (ORM).
- **MySQL**: Banco de dados relacional.
- **Maven**: Gerenciador de dependências.
- **Insomnia**: Ferramenta para testar a funcionalidade da API.

## 🗂️ Estrutura do Projeto

### Modelo de Produto
A classe `Produto` representa os produtos da farmácia. Seus principais atributos são:

- `id` (long): Identificador único do produto.
- `nome` (String): Nome do produto.
- `valor` (Double): Preço do produto.
- `disponivel` (boolean): Indica se o produto está disponível para venda.

### Modelo de Categoria
A classe `Categoria` representa as categorias dos produtos. Seus principais atributos são:

- `id` (long): Identificador único da categoria.
- `nome` (String): Nome da categoria.
- `descricao` (String): Descrição da categoria.

### Validações
- **`@NotNull`**: Utilizado para garantir que campos obrigatórios não sejam nulos.
- **`@GeneratedValue`**: Configurado para gerar o ID automaticamente.

### Relacionamento
- Um produto pode estar associado a uma categoria, relação **@OneToMany**.
- A relação entre `Produto` e `Categoria` pode ser configurada como **@ManyToOne** no modelo de Produto.


### Endpoints
#### Produtos
- **GET /produtos**: Retorna a lista de todos os produtos.
- **GET /produtos/id/{id}**: Retorna os detalhes de um produto específico.
- **GET /produtos/nome/{nome}**: Retorna os detalhes.
- **GET /produtos/disponiveis**: Retorna todos os produtos disponiveis.
- **POST /produtos**: Cadastra um novo produto.
- **PUT /produtos/{id}**: Atualiza as informações de um produto existente.
- **DELETE /produtos/{id}**: Remove um produto pelo ID.

#### Categorias
- **GET /categorias**: Retorna a lista de todas as categorias.
- **GET /categorias/{id}**: Retorna os detalhes de uma categoria específica.
- **GET /categorias/nome/{nome}**: Retorna o produto referente ao nome.
- **POST /categorias**: Cadastra uma nova categoria.
- **PUT /categorias/{id}**: Atualiza as informações de uma categoria existente.
- **DELETE /categorias/{id}**: Remove uma categoria pelo ID.

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Lucassai/CRUD-Farmacia.git
   ```
   
   Se precisar de mais detalhes ou ajustes, é só avisar! 🚀
