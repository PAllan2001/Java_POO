Este projeto tem como objetivo simular o gerenciamento de veículos de uma concessionária, aplicando os principais conceitos da Programação Orientada a Objetos (POO), como herança, polimorfismo, encapsulamento e o uso correto de modificadores de acesso.

O sistema permite cadastrar diferentes tipos de veículos, exibir suas informações e simular ações específicas de cada tipo, como o modo de ligar o veículo.

🏗️ Estrutura do Sistema

O projeto é organizado a partir de uma classe base genérica, que representa um veículo, e classes especializadas, que representam tipos específicos de veículos.

🔹 Classe Base: Veiculo

A classe Veiculo representa um veículo genérico da concessionária e define características e comportamentos comuns a todos os veículos.

Atributos (privados)

marca: marca do veículo

modelo: modelo do veículo

ano: ano de fabricação

Métodos públicos

ligar(): método que simula a ação de ligar o veículo. É sobrescrito nas subclasses.

mostrarInfo(): exibe as informações do veículo (marca, modelo e ano).

Todos os atributos possuem getters e setters, garantindo o encapsulamento e permitindo acesso controlado aos dados.

🔹 Herança – Subclasses

As subclasses herdam os atributos e métodos da classe Veiculo, reutilizando código e especializando comportamentos.

🚙 Classe Carro

Herda da classe Veiculo.

Sobrescreve o método ligar().

Exibe a mensagem:

"Carro ligado com chave."

🏍️ Classe Moto

Também herda de Veiculo.

Sobrescreve o método ligar().

Exibe a mensagem:

"Moto ligada com pedal."

🔁 Polimorfismo

O polimorfismo é aplicado por meio da sobrescrita do método ligar().
Mesmo chamando esse método a partir de uma referência do tipo Veiculo, o sistema executa a implementação correta de acordo com o tipo real do objeto (Carro ou Moto).

Isso permite que diferentes veículos tenham comportamentos distintos utilizando a mesma interface de método.

🔐 Encapsulamento e Modificadores de Acesso

Todos os atributos são privados (private), impedindo acesso direto.

O acesso aos dados é feito apenas por métodos públicos (get e set).

Os métodos principais do sistema são públicos.

O modificador protected pode ser utilizado, se necessário, para permitir acesso controlado às subclasses, mantendo a segurança do código.

▶️ Classe Principal (Main)

Na classe Main:

São criados objetos das subclasses Carro e Moto.

São chamados os métodos:

ligar()

mostrarInfo()



Este projeto foi desenvolvido com fins educacionais, com o objetivo de:

Aplicar herança entre classes

Utilizar polimorfismo por meio da sobrescrita de métodos

Garantir encapsulamento dos dados

Organizar um sistema simples seguindo boas práticas de POO
Essa etapa demonstra, na prática, o funcionamento do sistema, evidenciando a herança e o polimorfismo.
