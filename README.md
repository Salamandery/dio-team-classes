# Employee Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![VSCode](https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

> Sistema de cadastro e gerenciamento de funcionários em Java, demonstrando conceitos de orientação a objetos, herança, polimorfismo e encapsulamento.
> 
> **English below**

---

## 📑 Sumário / Table of Contents
- [Sobre o Projeto / About](#sobre-o-projeto--about)
- [Tecnologias e Bibliotecas / Technologies](#tecnologias-e-bibliotecas--technologies)
- [Estrutura do Projeto / Project Structure](#estrutura-do-projeto--project-structure)
- [Funcionalidades / Features](#funcionalidades--features)
- [Setup e Execução / Setup](#setup-e-execução--setup)
- [Como Usar / How to Use](#como-usar--how-to-use)

---

## Sobre o Projeto / About
**PT-BR:**
Sistema simples para cadastro e exibição de informações de funcionários, com especializações para Gerente (Manager) e Vendedor (Salesman). Demonstra conceitos de orientação a objetos, como herança, polimorfismo, encapsulamento e uso de classes abstratas e seladas.

**EN:**
Simple system for registering and displaying employee information, with specializations for Manager and Salesman. Demonstrates object-oriented concepts such as inheritance, polymorphism, encapsulation, and the use of abstract and sealed classes.

## Tecnologias e Bibliotecas / Technologies
- **Java 17+** (Standard Edition)
- **Biblioteca padrão / Standard Library**
- **Visual Studio Code** (recomendado / recommended)

## Estrutura do Projeto / Project Structure
- **PT-BR:**
  - `src/` — código-fonte Java
    - `App.java` — classe principal que instancia e exibe detalhes de funcionários
    - `Employee.java` — classe abstrata selada base para funcionários
    - `Manager.java` — classe concreta para gerente
    - `Salesman.java` — classe concreta para vendedor
  - `bin/` — arquivos compilados (.class)
  - `lib/` — dependências externas (não utilizadas)
- **EN:**
  - `src/` — Java source code
    - `App.java` — main class that instantiates and displays employee details
    - `Employee.java` — sealed abstract base class for employees
    - `Manager.java` — concrete class for manager
    - `Salesman.java` — concrete class for salesman
  - `bin/` — compiled files (.class)
  - `lib/` — external dependencies (not used)

## Funcionalidades / Features
**PT-BR:**
- Cadastro e exibição de informações de funcionários
- Especialização para Gerente (comissão, login, senha)
- Especialização para Vendedor (percentual por venda, valor vendido)
- Cálculo de salário total considerando comissões e vendas
- Demonstração de polimorfismo e uso de classes seladas

**EN:**
- Register and display employee information
- Specialization for Manager (commission, login, password)
- Specialization for Salesman (percent per sale, sold amount)
- Calculation of total salary considering commissions and sales
- Demonstration of polymorphism and sealed classes

## Setup e Execução / Setup
**PT-BR:**
1. Pré-requisitos:
   - Java JDK 17+ ([download](https://adoptium.net/))
   - VS Code com extensão Java (opcional)
2. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd dioTeamClasses
   ```
3. Compile o projeto:
   ```bash
   javac -d bin src/*.java
   ```
4. Execute a aplicação:
   ```bash
   java -cp bin App
   ```

**EN:**
1. Prerequisites:
   - Java JDK 17+ ([download](https://adoptium.net/))
   - VS Code with Java extension (optional)
2. Clone the repository:
   ```bash
   git clone <repository-url>
   cd dioTeamClasses
   ```
3. Compile the project:
   ```bash
   javac -d bin src/*.java
   ```
4. Run the application:
   ```bash
   java -cp bin App
   ```

## Como Usar / How to Use
**PT-BR:**
Ao executar o programa, serão exibidos detalhes de um gerente e de um vendedor, incluindo informações pessoais e cálculo de salário total (com comissões e vendas). O código pode ser expandido para incluir entrada de dados via terminal.

**Exemplo de saída:**
```
=======Manager========
Code: MGR001
Login: managerLogin
Password: managerPassword
Commission: 0.15
Address: Manager Address
Age: 40
Salary: 5000.0
Full Salary: 5000.15
Full Salary with Extra: 6000.15
true
==================
=======Salesman========
Sold Amount: 20000.0
Code: SLS001
Name: Salesman Name
Address: Salesman Address
Age: 30
Salary: 3000.0
Percent per Sale: 0.1
Full Salary: 3000.2
true
==================
```

**EN:**
When running the program, details of a manager and a salesman will be displayed, including personal information and total salary calculation (with commissions and sales). The code can be expanded to include user input via terminal.

**Sample output:**
```
=======Manager========
Code: MGR001
Login: managerLogin
Password: managerPassword
Commission: 0.15
Address: Manager Address
Age: 40
Salary: 5000.0
Full Salary: 5000.15
Full Salary with Extra: 6000.15
true
==================
=======Salesman========
Sold Amount: 20000.0
Code: SLS001
Name: Salesman Name
Address: Salesman Address
Age: 30
Salary: 3000.0
Percent per Sale: 0.1
Full Salary: 3000.2
true
==================
```

---
## 👨‍💻 Autor

<div align="center">

![Developer](https://img.shields.io/badge/Developer-Rodolfo%20M.%20F.%20Abreu-blue?style=for-the-badge&logo=github)
![Java](https://img.shields.io/badge/Java-Developer-orange?style=for-the-badge&logo=java)
![VSCode](https://img.shields.io/badge/VS%20Code-Editor-007ACC?style=for-the-badge&logo=visual-studio-code)
![Education](https://img.shields.io/badge/Education-Java%20OOP-yellow?style=for-the-badge&logo=book)

**by [Rodolfo M. F. Abreu](https://github.com/salamandery)**

[![GitHub](https://img.shields.io/badge/GitHub-salamandery-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

</div>

---

<div align="center">

<b>Feito com 💙 para estudos de Java e Orientação a Objetos.</b><br/>
<sub>Made with 💙 for Java and Object-Oriented Programming studies.</sub>

</div>