package contaBancaria;

import java.util.Scanner;

public class AccountTest 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner (System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("Nome inicial: %s%n%n", myAccount.getName());
		
		System.out.println("Por favor, digite um nome: ");
		String newName = input.nextLine(); 
		myAccount.setName(newName); 
		System.out.println();
	
		System.out.printf("Nome armazenado: %s%n%n", myAccount.getName());

	}

}
