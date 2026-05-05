# 💨 Projeto Ventilador (Java)

Projeto em Java desenvolvido com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO), com foco em separação de responsabilidades.

---

## 🎯 Objetivo

Aplicar uma estrutura mais organizada no código, separando:

- **Model**: representa os dados do objeto (Ventilador)
- **Service**: contém as regras de negócio
- **Main**: responsável pela interação com o usuário

---

## ⚙️ Funcionalidades

- Ligar e desligar o ventilador
- Aumentar e diminuir velocidade
- Validação de regras:
  - Não permite alterar velocidade fora da tomada
  - Limite máximo de velocidade
  - Velocidade mínima controlada

---

## 🧱 Estrutura do Projeto

src/
├── app/
│ └── Main.java
├── model/
│ └── Ventilador.java
└── service/
└── VentiladorService.java
