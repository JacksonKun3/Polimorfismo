package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001,"alex",1000.0);
		acc1.withdraw(200.0);//fiz um saque 
		System.out.println(acc1.getBalance());
		Account acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		/*o acc2 que � do tipo Account aponta para a subclass SavingsAccount, mesmo a subclass SavingsAccount
tendo mais coisas, ela tem em comum o withdraw, por�m � um withdraw modificado, entao eu posso usar o acc2 que est� apontando para o SavingsAccount
// usar uma fun��o dele chamada withdraw, j� que se o acc2 aponta para o SavingsAccount ent�o quer dizer que o acc2 "se torna" do tipo SavingsAccount
		 */
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Bob",1000.0,500.0);
		
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		}
	
	
	
	

}
