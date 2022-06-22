package lojaSuprimentos;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Invoice invoice1 = new Invoice("22222", "Mouses", 3, 23.45);
		
		invoice1.getInvoiceAmount();
		System.out.println(invoice1.getInvoiceAmount());

	}

}
