package metodos;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com três valores flutuantes: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		double result = maximum(n1, n2, n3);
		
		System.out.println("O valor máximo é: " + result);
	}

	public static double maximum(double x, double y, double z) {
		double maximumValue = x;
		if(y > maximumValue) {
			maximumValue = y;
		}
		if(z > maximumValue) {
			maximumValue = z;
		}
		return maximumValue;
	}
}
