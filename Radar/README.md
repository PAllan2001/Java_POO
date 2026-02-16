# 🚓 Sistema de Radar Inteligente (Java POO)

## 📌 Descrição

Este projeto simula um **radar de rodovia inteligente** desenvolvido em **Java utilizando Programação Orientada a Objetos**.
O sistema monitora a velocidade de veículos e só registra dados quando ocorre uma infração.

Ele foi projetado com foco em **lógica de negócio**, **organização em camadas** e **simulação realista de funcionamento de radares rodoviários**.

---

## 🎯 Funcionalidades

✔ Solicita apenas a velocidade do veículo inicialmente
✔ Identifica se o veículo é **carro** ou **caminhão**
✔ Usa limites diferentes de velocidade para cada tipo
✔ Detecta infrações:

* Acima da velocidade
* Muito acima da velocidade
* Abaixo da velocidade mínima

✔ Só pede dados do veículo se houver multa:

* Placa
* Tipo de veículo

✔ Registra automaticamente:

* Horário da infração
* Local fixo do radar

✔ Caso não haja infração → o sistema continua rodando normalmente

---

## 🚦 Regras de Velocidade

### Carro

* Máxima: 110 km/h
* Mínima: 55 km/h

### Caminhão

* Máxima: 90 km/h
* Mínima: 55 km/h

---

## 🧠 Lógica do Sistema

Fluxo simplificado:

```
Inserir velocidade
      ↓
Está dentro do limite?
      ↓
Sim → volta ao início
Não → pede placa e tipo de veículo
      ↓
Calcula tipo de multa
      ↓
Registra infração
      ↓
Mostra resultado
```

---

## 🏗 Estrutura do Projeto

```
src/
 ├── models/
 │     ├── Veiculo.java
 │     ├── Multa.java
 │     └── Radar.java
 │
 ├── services/
 │     └── RadarService.java
 │
 └── Main.java
```

---

## 📚 Conceitos de POO Aplicados

* Encapsulamento
* Separação de responsabilidades
* Organização Em Camadas
* Regras de negócio isoladas
* Métodos reutilizáveis

