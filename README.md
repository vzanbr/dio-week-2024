# Projeto Trilha java DIO Backend

#### Deploy de um simples projeto Spring

- 💬 Descrição e objetivo: API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

  ## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

# Tabela de conteúdos

<!--ts-->

- [Sobre](#Descrição)
- [Tabela de Conteudo](#tabela-de-conteudo)
- [Pré Requisitos](#pre-requisitos)
- [Configurações](#Configurações)
- [Tecnologias](#tecnologias)
- [Autor](#autor)
  <!--te-->
  <br>

### Pré-Requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Java JDK](https://www.oracle.com/java/technologies/downloads/) preferência para versão 14 para cima.<br>
Além disto é bom ter um editor para trabalhar com o código como o [IntelliJ](https://www.jetbrains.com/pt-br/idea/).

### 🎲 Configurações

```bash
# Instalar o java JDK na sua máquina preferência para versão 14 para cima
# Configurar o projeto para utilizar o JDK
# Ir no arquivo delegação e colocar o caminho do arquivo para a sua máquina no lugar especificado.
# Executar o arquivo Delegação class main
```

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.oracle.com/java/technologies/downloads/)

## Autor

<a href="https://www.linkedin.com/in/gabriel19br/">
<img style="border-radius: 50%;" src="https://media-exp1.licdn.com/dms/image/C4D03AQEN5MndpcR7Rg/profile-displayphoto-shrink_200_200/0/1613396219696?e=1644451200&v=beta&t=tzL1BFQ4hpDlXAsW1se7Wp1-Rud4DdBGOnocCIEPNUA" width="100px;" alt=""/>
<br/>
<sub><b>Gabriel Alves de Lima</b></sub></a>🚀

Feito por Gabriel Alves de Lima 👋🏽 Entre em contato!
