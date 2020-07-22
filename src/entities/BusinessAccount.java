package entities;

//quando eu faço extends então estou fazendo o conceito de herança, ou seja, BusinessAccount herda
// tudo de Account
public class BusinessAccount extends Account {

	private Double loanLimit;
	
	
	//construtor padrao
	public BusinessAccount() {
		//eu posso colocar o super aqui também, então se tiver alguma lógica no construtor sem argumentos que eu fiz na classe account, vai vir para cá também,
		//eu digo essa classe public Account() {  }
		
		super();
	}
	//fiz um construtor aqui também para ficar com todos os argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // nao preciso repetir as atribuições dos 3 primeiros argumentos, então eu vou chamar o construtor da super classe que é a classe
		// Account, e para isso eu faço super(number, holder, balance); 
		/*IMPORTANTE, então resumindo, o super serve para implementar a lógica da classe "base" no caso a filha ou posso chamar de super classe, no caso falar
		  pegar a logica da classe base, classe super ou filha é a mesma coisa*/
		this.loanLimit = loanLimit;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public void loan(double amount) {//loan = emprestimo
		if(amount <= loanLimit) {/*como o limit de emprestimo nao pode ultrapassar o limite, então tenho que fazer esse if, no caso se o dinheiro empresto é menor ou igual o limite, entao
		entra aqui*/
		//deposit(amount);se eu fizesse assim, então o emprestimo iria entrar na minha conta por meio de deposito
			balance += amount - 10.0; /*esse -10 é a taxa. Aqui vai dar um erro pq vai dizer que o "balance" não é visível, isso ocorre pq o "balance" está como private, então
			para ele ficar visiavel, eu preciso colocar ele como protected*/
		}
		
		
	}
	
	@Override 
	public void withdraw(double amount) {
		/*é bom usar essa ideia de upcasting pq eu posso aproveitar funções da superclasse e modificalas nas classes filhas*/
		
		//estou reutilizando  o codigo que está na superclasse isso atráves do super
		super.withdraw(amount);/*lembra que o super ja me trás os valores da super classe? então se eu fazer super.withdraw vai fazer a função do saque, e o parametro amount, 
		é o quanto eu quero tirar, então o balance já vai estar atualizado, porem o balance vai ser diminuido em -2 a cada saque, no caso vai ser os 5 da função withdraw e -2 daqui */
		balance -=2.0;
	}
	
	
}
