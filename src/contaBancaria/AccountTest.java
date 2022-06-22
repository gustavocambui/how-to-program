package contaBancaria;

import java.util.Scanner;

public class AccountTest 
{

	public static void main(String[] args) 
	{
		
		Account account1 = new Account("Gumball Watterson", 55.00);
		Account account2 = new Account("Darwin Watterson", -13.00);
		
		displayAccount(account1);
		displayAccount(account2);
		
		depositAccount(account1);
		depositAccount(account2);
		
		withdrawAccount(account1);
		withdrawAccount(account2);
		
		displayAccount(account1);
		displayAccount(account2);

	}
	public static void displayAccount(Account accountToDisplay) {
		
		System.out.printf("%s%nSaldo na conta: R$%.2f %n",accountToDisplay.getName(), accountToDisplay.getBalance());
	}
	
	public static void depositAccount(Account accountToDeposit) {
		
		Scanner input = new Scanner (System.in);
		System.out.println(accountToDeposit.getName() + ", entre com valor para depósito em sua conta: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nAdicionando %.2f ao saldo de sua conta...%n%n", depositAmount);
		accountToDeposit.deposit(depositAmount);
	}
	
	public static void withdrawAccount(Account accountToWithdraw) {
		
		Scanner input = new Scanner (System.in);
		System.out.println(accountToWithdraw.getName() + ", digite o valor que deseja sacar: ");
		double retirarDinheiro = input.nextDouble();
		System.out.printf("%nSacando %.2f do saldo de sua conta...%n%n", retirarDinheiro);
		accountToWithdraw.withdraw(retirarDinheiro);
	}
}
