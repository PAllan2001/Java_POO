🐶 Descrição do Projeto – Sistema de Controle de Banho de Petshop

Este projeto tem como objetivo simular o funcionamento de uma máquina de banho para pets, utilizada em um petshop, aplicando conceitos fundamentais da Programação Orientada a Objetos (POO), como encapsulamento, controle de estado, regras de negócio e organização lógica do sistema.

O sistema controla o uso de água, shampoo, a presença do pet na máquina e garante que todas as regras de funcionamento sejam respeitadas.

🏗️ Estrutura do Sistema

O sistema é baseado em uma classe que representa a máquina de banho, responsável por gerenciar recursos, estados e operações disponíveis.

🔹 Classe Principal: MaquinaBanho

A classe MaquinaBanho representa a máquina de banho do petshop e centraliza toda a lógica de funcionamento.

Atributos (privados)

nivelAgua: quantidade atual de água na máquina (em litros)

nivelShampoo: quantidade atual de shampoo na máquina (em litros)

temPet: indica se há um pet dentro da máquina

petLimpo: indica se o pet já foi limpo

precisaLimpeza: indica se a máquina precisa ser limpa antes de receber outro pet

Todos os atributos são privados, garantindo o encapsulamento e evitando alterações indevidas no estado da máquina.

⚙️ Operações Disponíveis

A máquina oferece as seguintes operações:

Colocar pet na máquina
Permite a entrada de apenas um pet por vez, desde que a máquina esteja limpa e vazia.

Dar banho no pet
Realiza o banho consumindo:

10 litros de água

2 litros de shampoo
O banho só ocorre se houver pet na máquina e se houver recursos suficientes.

Retirar pet da máquina
Remove o pet da máquina.
Caso o pet seja retirado sem estar limpo, a máquina passa a exigir limpeza antes de aceitar outro pet.

Abastecer com água
Aumenta o nível de água em 2 litros por acionamento, respeitando o limite máximo de 30 litros.

Abastecer com shampoo
Aumenta o nível de shampoo em 2 litros por acionamento, respeitando o limite máximo de 10 litros.

Verificar nível de água
Exibe a quantidade atual de água disponível na máquina.

Verificar nível de shampoo
Exibe a quantidade atual de shampoo disponível na máquina.

Verificar se há pet na máquina
Informa se existe um pet atualmente na máquina de banho.

Limpar máquina
Necessária quando um pet é retirado sem estar limpo.
A limpeza consome:

3 litros de água

1 litro de shampoo
Após a limpeza, a máquina fica apta a receber um novo pet.

📏 Regras de Funcionamento

O sistema segue rigorosamente as seguintes regras:

A máquina permite apenas um pet por vez

Cada banho consome 10L de água e 2L de shampoo

Capacidade máxima:

30L de água

10L de shampoo

Se o pet sair da máquina sem banho, a máquina deve ser limpa

A limpeza consome 3L de água e 1L de shampoo

O abastecimento adiciona 2L por acionamento

Nenhuma operação pode ultrapassar os limites máximos ou ser executada sem recursos suficientes

🔐 Encapsulamento e Controle de Estado

O sistema utiliza encapsulamento para proteger os atributos internos da máquina e métodos públicos para controlar todas as ações possíveis.
Cada método valida o estado atual da máquina antes de executar qualquer operação, garantindo consistência e segurança lógica.

▶️ Classe Principal (Main)

Na classe Main:

É criada uma instância da máquina de banho

São chamadas as operações disponíveis para:

Abastecer água e shampoo

Inserir e retirar pets

Dar banho

Verificar níveis

Limpar a máquina

Essa classe demonstra o funcionamento completo do sistema e o cumprimento das regras estabelecidas.

🎯 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais para:

Simular um sistema real com regras bem definidas

Aplicar encapsulamento e controle de estados

Desenvolver lógica condicional baseada em regras de negócio

Praticar organização e clareza de código em POO
