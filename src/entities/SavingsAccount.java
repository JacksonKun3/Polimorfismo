package entities;
//esse final é o método final que vai evitar que a classe SavingsAccount seja herdada
public class  SavingsAccount extends Account {

	private Double interestRate;//no caso vai vir a taxa de juros para cá, e ela vai funcionar quando eu chamar a função updateBalance 
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {//vai atualizar o meu balance com a taxa de juros,
//no caso o valor dele mais o valor dele multiplicado pela taxa de juro
		balance+= balance* interestRate;
	}
	@Override 
	public final void withdraw(double amount) {
		balance -=amount;
	}
}
