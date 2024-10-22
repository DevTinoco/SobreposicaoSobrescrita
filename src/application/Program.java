package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
         
		
		//PROGRAMA DE DESCONTO NO SISTEMA BANCÁRIO, RETIRADA E NAO RETIRADA
		
		Account acc1 = new Account(1001,"Alex",1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//SOBREPOSICAO SEM TAXA EM FUNCIONAMENTO: 
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//A PALAVRA SUPER:
		/*É POSSÍVEL CHAMAR A IMPLEMENTAÇÃO DA SUPERCLASSE USANDO  APALAVA SUPER.
		 * 
		 * EXEMPLO: SUPONHAQUE, NA CLASSE BusineAccount, A REGRA PARA SAQUE SEJA REALIZAR
		 * O SAQUE NORMALMENTE DA SUPERCLASSE DESCONTAR MAIS 2.0.
		 * 
		 * @Override
		 * public void withdraw(double amount){
		 *  super.withdraw(amount);
		 *  balance -= 2.0;
		 *  }
		 *  	 */
		
	}

}
