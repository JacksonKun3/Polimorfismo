package entities;

public class SavingsAccountPlus extends SavingsAccount{ 
	
	@Override 
	//nao vou poder sobrepor esse m�todo porque eu coloquei um final no m�todo withdraw na classe SavingsAccount
	public void withdraw(double amount) {
		balance -=amount + 2.0;
	}

}
