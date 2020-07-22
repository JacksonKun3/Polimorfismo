package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance; /*nao posso colocar publico, se nao qualquer um pode mexer no saldo da conta, pense assim, ali no program � que o usuario pode mexer, ent�o nao posso
	deixar ele mexer no saldo da conta*/
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	/*Como o usuario nao pode mexer no saldo da conta livremente, ent�o vou tirar essa opera��o do set
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	*/
	public void withdraw(double amount) {//saque
		balance -= amount +5.0;//o meu balance vai ficar com o dinheiro dele menos o dinheiro que eu quero tirar +5 ou seja, se o meu balance tem 10 reais, e eu tiro 4, o meu balance vai ficar com 1
		// pq 10 - 9 � 1
	}
	public void deposit(double amount) {//deposito
		balance += amount;
	}
	
	
}
