package revisaoPoo;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice inv = new Invoice(45, "Tablet", 2, 2555.00f);
		System.out.println("Valor total = " + inv.getInvoiceAmount());
	}

}
