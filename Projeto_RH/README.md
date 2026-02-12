🏗️ Estrutura do Sistema

O sistema é composto por uma classe base e classes derivadas, representando diferentes tipos de funcionários dentro de uma empresa.

🔹 Classe Base: Funcionario

A classe Funcionario representa um funcionário genérico e serve como base para os demais tipos.

Atributos (privados):

nome: nome do funcionário

cpf: CPF do funcionário

salarioBase: salário base do funcionário

Métodos públicos:

calcularSalario(): método responsável por calcular o salário final do funcionário. Ele é sobrescrito nas subclasses.

mostrarInfo(): exibe as informações do funcionário, como nome, CPF e salário final.

Além disso, todos os atributos possuem getters e setters, garantindo o encapsulamento e o controle do acesso aos dados.

🔹 Subclasses

As subclasses herdam da classe Funcionario e implementam regras específicas para o cálculo do salário.

🧑‍💼 Classe Gerente

Herda todos os atributos e métodos de Funcionario.

Sobrescreve o método calcularSalario().

Regra de cálculo:
salário final = salárioBase + 2000

🧑‍💻 Classe Vendedor

Também herda de Funcionario.

Possui um valor adicional de comissão.

Sobrescreve o método calcularSalario().

Regra de cálculo:
salário final = salárioBase + comissão

🔁 Polimorfismo

O polimorfismo é aplicado ao sobrescrever o método calcularSalario() em cada subclasse.
Mesmo chamando o método a partir de uma referência do tipo Funcionario, o sistema executa a versão correta do método conforme o tipo real do objeto (Gerente ou Vendedor).

Isso torna o código mais flexível, organizado e fácil de manter.

🔐 Encapsulamento e Modificadores de Acesso

Todos os atributos são privados, impedindo acesso direto externo.

O acesso aos dados é feito exclusivamente por métodos públicos (getters e setters).

Na classe Main:

São criados objetos do tipo Gerente e Vendedor.

Para cada objeto, são chamados os métodos:

calcularSalario()

mostrarInfo()

Isso demonstra, na prática, o funcionamento do sistema e a aplicação dos conceitos de POO.


Este projeto foi desenvolvido com fins educacionais, com o objetivo de:

Aplicar herança entre classes

Utilizar polimorfismo por meio da sobrescrita de métodos

Garantir encapsulamento dos dados

Organizar um sistema simples seguindo boas práticas de POO
Os métodos principais do sistema também são públicos, garantindo comunicação controlada entre as classes.

