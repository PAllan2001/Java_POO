🏦 Descrição do Projeto – Sistema de Conta Bancária

Este projeto tem como objetivo simular o funcionamento básico de uma conta bancária, permitindo a realização de operações financeiras comuns, como depósitos, saques e pagamentos, além do controle do cheque especial.
O sistema aplica conceitos importantes da Programação Orientada a Objetos (POO), como encapsulamento, controle de regras de negócio e organização lógica do código.

🏗️ Estrutura do Sistema

O sistema é baseado em uma classe que representa uma conta bancária, responsável por armazenar informações financeiras e garantir que todas as operações sigam as regras definidas.

🔹 Classe Principal: ContaBancaria

A classe ContaBancaria representa uma conta bancária e centraliza todas as operações possíveis.

Atributos (privados)

saldo: valor disponível na conta

limiteChequeEspecial: valor máximo disponível como cheque especial

valorUsadoChequeEspecial: valor atualmente utilizado do cheque especial

taxaPendenteChequeEspecial: valor da taxa a ser cobrada quando o cheque especial for utilizado

Todos os atributos são privados, garantindo o encapsulamento e evitando alterações diretas no estado da conta.

⚙️ Operações Disponíveis

A conta bancária oferece as seguintes operações:

Consultar saldo
Exibe o saldo atual da conta.

Consultar cheque especial
Mostra o valor total disponível de cheque especial e quanto já foi utilizado.

Depositar dinheiro
Adiciona um valor ao saldo da conta.
Caso a conta esteja utilizando cheque especial, o depósito é utilizado prioritariamente para:

Quitar o valor usado do cheque especial

Cobrir a taxa de 20% sobre o valor utilizado

Sacar dinheiro
Permite sacar valores usando o saldo disponível e, se necessário, o limite do cheque especial.

Pagar um boleto
Funciona de forma semelhante ao saque, debitando o valor do saldo ou do cheque especial.

Verificar uso do cheque especial
Indica se a conta está operando com saldo negativo, ou seja, utilizando o cheque especial.

📏 Regras de Funcionamento

O sistema segue rigorosamente as seguintes regras:

A conta possui um limite de cheque especial somado ao saldo

O valor do cheque especial é definido no momento da criação da conta:

Depósito inicial ≤ R$500,00 → cheque especial de R$50,00

Depósito inicial > R$500,00 → cheque especial de 50% do valor depositado

O saque e o pagamento de boletos podem utilizar o cheque especial caso o saldo não seja suficiente

Ao utilizar o cheque especial, a conta passa a ter uma taxa de 20% sobre o valor utilizado

Essa taxa deve ser cobrada assim que houver saldo disponível, priorizando sua quitação

Nenhuma operação pode ultrapassar o limite total disponível (saldo + cheque especial)

🔐 Encapsulamento e Controle Financeiro

O sistema utiliza encapsulamento para proteger os dados financeiros da conta.
Todos os cálculos e validações são feitos internamente pelos métodos da classe, garantindo:

Consistência dos valores

Cumprimento das regras de negócio

Segurança no controle do cheque especial

▶️ Classe Principal (Main)

Na classe Main:

É criada uma conta bancária com um depósito inicial

São chamadas as operações disponíveis:

Consulta de saldo e cheque especial

Depósitos

Saques

Pagamento de boletos

Verificação do uso do cheque especial

Essa classe serve para demonstrar o funcionamento completo do sistema e o impacto das regras financeiras aplicadas.

🎯 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, com o objetivo de:

Simular um sistema bancário realista

Implementar regras de negócio complexas

Praticar encapsulamento e controle de estados

Desenvolver lógica financeira em programação orientada a objetos
