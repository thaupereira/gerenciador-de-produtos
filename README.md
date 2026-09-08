# 📦 Gerenciador de Produtos

Sistema de gerenciamento de estoque desenvolvido em **Java**, aplicando conceitos de **Programação Orientada a Objetos (POO)** e operações de **CRUD** (Create, Read, Update, Delete). O projeto permite cadastrar, consultar, editar e remover produtos, organizando as informações por categoria.

## ✨ Funcionalidades

- ➕ Cadastrar novos produtos (ID, nome, descrição, preço, categoria e data de cadastro)
- 🔍 Consultar produtos cadastrados
- ✏️ Editar informações de um produto existente
- 🗑️ Remover produtos do sistema
- 🗂️ Organização e seleção de produtos por categoria, via janelas de diálogo (`JOptionPane`)

## 🛠️ Tecnologias utilizadas

- **Java**
- **Swing** (`JOptionPane`) para interação com o usuário
- **Maven** para gerenciamento de dependências e build
- Padrão **Repository** para acesso e manipulação dos dados

## 🧱 Estrutura do projeto

```
gerenciador-de-produtos/
├── src/main/java/br/com/fiap/produtos/
│   ├── model/         # Entidades (Produto, Categoria)
│   ├── repository/    # Camada de acesso aos dados (findAll, etc.)
│   └── Main.java       # Ponto de entrada da aplicação
├── pom.xml
└── README.md
```

> Observação: os dados são armazenados **em memória** durante a execução — ou seja, o estoque é reiniciado a cada vez que o programa é executado. Uma evolução natural do projeto seria persistir essas informações em arquivo ou banco de dados.

## ▶️ Como executar

Pré-requisitos: **Java JDK 17+** e **Maven** instalados.

```bash
# Clone o repositório
git clone https://github.com/thaupereira/gerenciador-de-produtos.git

# Entre na pasta do projeto
cd gerenciador-de-produtos

# Compile o projeto
mvn clean install

# Execute a classe principal
mvn exec:java
```

Ao rodar, o sistema abre janelas de diálogo (`JOptionPane`) guiando o usuário pelas opções de cadastro, consulta, edição e remoção de produtos e categorias.

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido como exercício prático para consolidar conceitos de **Programação Orientada a Objetos**, organização de código em camadas e implementação de operações de **CRUD** em Java, durante o curso de Análise e Desenvolvimento de Sistemas (ADS).

## 🚀 Possíveis melhorias futuras

- [ ] Persistência de dados em banco de dados (SQL)
- [ ] Migração da interface para uma tela gráfica única (JavaFX ou interface web)
- [ ] Testes unitários com JUnit
- [ ] Validações de entrada mais robustas

## 👤 Autor

**Thauan Pereira**
Estudante de Análise e Desenvolvimento de Sistemas (ADS)
🔗 [github.com/thaupereira](https://github.com/thaupereira)
