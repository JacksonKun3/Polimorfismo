package entities;

public class SavingsAccountPlus extends SavingsAccount{ 
	
	@Override 
	//nao vou poder sobrepor esse método porque eu coloquei um final no método withdraw na classe SavingsAccount
	public void withdraw(double amount) {
		balance -=amount + 2.0;
	}

}
