package entities;

//quando eu fa�o extends ent�o estou fazendo o conceito de heran�a, ou seja, BusinessAccount herda
// tudo de Account
public class BusinessAccount extends Account {

	private Double loanLimit;
	
	
	//construtor padrao
	public BusinessAccount() {
		//eu posso colocar o super aqui tamb�m, ent�o se tiver alguma l�gica no construtor sem argumentos que eu fiz na classe account, vai vir para c� tamb�m,
		//eu digo essa classe public Account() {  }
		
		super();
	}
	//fiz um construtor aqui tamb�m para ficar com todos os argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // nao preciso repetir as atribui��es dos 3 primeiros argumentos, ent�o eu vou chamar o construtor da super classe que � a classe
		// Account, e para isso eu fa�o super(number, holder, balance); 
		/*IMPORTANTE, ent�o resumindo, o super serve para implementar a l�gica da classe "base" no caso a filha ou posso chamar de super classe, no caso falar
		  pegar a logica da classe base, classe super ou filha � a mesma coisa*/
		this.loanLimit = loanLimit;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public void loan(double amount) {//loan = emprestimo
		if(amount <= loanLimit) {/*como o limit de emprestimo nao pode ultrapassar o limite, ent�o tenho que fazer esse if, no caso se o dinheiro empresto � menor ou igual o limite, entao
		entra aqui*/
		//deposit(amount);se eu fizesse assim, ent�o o emprestimo iria entrar na minha conta por meio de deposito
			balance += amount - 10.0; /*esse -10 � a taxa. Aqui vai dar um erro pq vai dizer que o "balance" n�o � vis�vel, isso ocorre pq o "balance" est� como private, ent�o
			para ele ficar visiavel, eu preciso colocar ele como protected*/
		}
		
		
	}
	
	@Override 
	public void withdraw(double amount) {
		/*� bom usar essa ideia de upcasting pq eu posso aproveitar fun��es da superclasse e modificalas nas classes filhas*/
		
		//estou reutilizando  o codigo que est� na superclasse isso atr�ves do super
		super.withdraw(amount);/*lembra que o super ja me tr�s os valores da super classe? ent�o se eu fazer super.withdraw vai fazer a fun��o do saque, e o parametro amount, 
		� o quanto eu quero tirar, ent�o o balance j� vai estar atualizado, porem o balance vai ser diminuido em -2 a cada saque, no caso vai ser os 5 da fun��o withdraw e -2 daqui */
		balance -=2.0;
	}
	
	
}
