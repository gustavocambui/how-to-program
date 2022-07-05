package random;

/*
Criando uma aplicação que gere números aleatórios seguros. Esse exemplo simula as faces de um dado com 6 lados, gerando valores
aleatórios de 1 a 6, 20 vezes.
 */
import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {

		SecureRandom aleatorios = new SecureRandom();

		for (int i = 1; i <= 20; i++) {
			
			// seleciona o inteiro aleatório entre 1 e 6
			int face = 1 + aleatorios.nextInt(6);
			
			System.out.printf("%d ", face); // exibe o valor gerado
			
			// se o contador for divisível por 5, inicia uma nova linha de saída
			if(i % 5 == 0)
				System.out.println();

		}

	}

}
