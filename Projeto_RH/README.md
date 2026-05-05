# 🧑‍💼 Sistema de RH (Java)

Projeto desenvolvido em Java com o objetivo de praticar Programação Orientada a Objetos (POO) e organização de código com separação de responsabilidades.

---

## 🎯 Objetivo

Simular um sistema simples de gestão de funcionários, aplicando conceitos como herança, polimorfismo e regras de negócio.

---

## ⚙️ Funcionalidades

- Cadastro de funcionários (Gerente e Vendedor)
- Cálculo de salário baseado em regras específicas:
  - Vendedor: salário + comissão sobre vendas
  - Gerente: salário + bônus sobre faturamento
- Listagem de funcionários
- Busca por CPF
- Remoção de funcionário

---

## 🧱 Estrutura do Projeto

src/
├── model/
│ ├── Funcionarios.java
│ ├── Vendedor.java
│ └── Gerente.java
├── service/
│ └── FuncionarioService.java
└── app/
└── Main.java

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança e Polimorfismo
- Encapsulamento
- Separação de responsabilidades (Model / Service / Main)
- Uso de ArrayList para simular armazenamento

---

📚 Aprendizados
- Estruturação de código em camadas
- Implementação de regras de negócio fora da classe principal
- Evolução de código simples para um modelo mais organizado