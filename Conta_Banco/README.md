💳 Simulador de Conta Bancária em Java
📌 Descrição

Aplicação em Java via terminal que simula operações básicas de uma conta bancária, utilizando Programação Orientada a Objetos (POO).

Operações disponíveis:

Abertura de conta

Depósito

Saque

Pagamento de boleto

Pagamento de mensalidade

Consulta de dados

Encerramento da conta

🏦 Classe ContaBanco

Responsável por representar a conta e conter as regras de negócio.

🔐 Atributos
Atributo	Tipo	Acesso	Função
numConta	int	public	Número identificador da conta
tipo	String	protected	CC (Corrente) ou CP (Poupança)
dono	String	private	Nome do titular
saldo	float	private	Saldo atual
status	boolean	private	Indica se a conta está ativa
🔒 Encapsulamento

Os atributos principais são private e acessados via getters e setters, garantindo:

Proteção dos dados

Controle sobre alterações

Aplicação de regras antes de modificar valores

⚙️ Principais Métodos

abrirConta(String tipo) → Ativa a conta e gera número aleatório.

depositar(float valor) → Adiciona saldo se a conta estiver ativa.

sacar(float valor) → Permite saque se houver saldo suficiente.

pagarBoleto(float valor) → Desconta valor do saldo.

pagarMensal() → Cobra taxa mensal (CC = R$12 | CP = R$20).

estadoAtual() → Exibe dados da conta.

fecharConta() → Encerra a conta se não houver pendências.

🎮 Classe Main

Responsável pela interação com o usuário:

Exibe menu

Recebe dados via Scanner

Executa operações

Mantém o programa em loop até o encerramento

🧠 Conceitos Aplicados

Encapsulamento

Controle de estado do objeto

Separação entre regra de negócio e interface

Uso de construtor

Geração de número aleatório

🎯 Objetivo

Projeto com finalidade educacional para praticar:

Lógica de programação

Estruturação de classes

Fundamentos de POO em Java
