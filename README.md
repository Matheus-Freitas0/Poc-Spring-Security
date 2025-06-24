# 🔐 Spring Security - JWT Authentication POC

Este projeto é uma Prova de Conceito (PoC) com **Spring Boot 3.5.3** utilizando **Spring Security** e **JWT (JSON Web Tokens)** para autenticação e autorização. A aplicação simula uma API REST protegida, com emissão de tokens JWT e controle de acesso a rotas privadas.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.3
- Spring Security
- OAuth2 Resource Server
- JWT com chaves RSA
- Spring Data JPA
- Banco H2 (em memória)
- Maven

---

## 📁 Estrutura do Projeto

```
├── config                # Configurações de segurança e JWT
├── controller            # Endpoints públicos e privados
├── domain                # Entidades de domínio (Users)
├── repository            # Interface de repositório (UserRepository)
├── service               # Regras de negócio e geração de tokens
├── application.properties
├── app.key / app.pub     # Chaves RSA para JWT
```

---

## 🔐 Funcionalidades

- Autenticação básica via `/authenticate`
- Geração de JWT com escopos
- Proteção de rotas com validação de token
- Configuração de usuário via JPA + H2
- Senhas criptografadas com BCrypt

---

## 🔄 Endpoints

| Método | Caminho           | Acesso      | Descrição                          |
|--------|-------------------|-------------|------------------------------------|
| POST   | `/authenticate`   | Público     | Gera um JWT para autenticação      |
| GET    | `/private`        | Protegido   | Exibe mensagem apenas se autenticado |

---

## ⚙️ Como Rodar o Projeto

### Pré-requisitos
- Java 21 instalado
- Maven 3.x instalado

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/spring-security-jwt-poc.git
   cd spring-security-jwt-poc
   ```

2. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse o console do banco (opcional):
   - URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Usuário: `sa`
   - Senha: *(em branco)*

---

## 🔑 Gerando as Chaves RSA

Se desejar gerar suas próprias chaves:

```bash
openssl genrsa -out app.key 2048
openssl rsa -in app.key -pubout -out app.pub
```

Depois, coloque os arquivos em `src/main/resources`.

---

## 🧪 Testes

Este projeto inclui dependências para testes com:

- `spring-boot-starter-test`
- `spring-security-test`

Use o Maven para rodar os testes:

```bash
./mvnw test
```

---

## 🧔 Usuário Padrão

Você pode inserir um usuário diretamente no H2 ao iniciar a aplicação (via `data.sql`, interface JPA ou manualmente no console H2).

Tabela `USERS`:

| Campo     | Tipo        |
|-----------|-------------|
| username  | VARCHAR(250) (PK) |
| password  | VARCHAR(250) |

> Lembre-se: a senha deve ser criptografada com BCrypt.

---

## 📌 Observações

- A aplicação utiliza autenticação **stateless** (sem sessão), ideal para APIs REST.
- JWT é assinado com chave privada e validado com chave pública.
- O token carrega o nome do usuário e escopos (roles).

---

## 🧑‍💻 Autor

Matheus M. Freitas  
Desenvolvedor Full Stack | Java & Spring | React  
[LinkedIn](https://www.linkedin.com/in/matheus-m-freitas/)

---
