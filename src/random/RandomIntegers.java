package random;

/*
Criando uma aplica��o que gere n�meros aleat�rios seguros. Esse exemplo simula as faces de um dado com 6 lados, gerando valores
aleat�rios de 1 a 6, 20 vezes.
 */
import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {

		SecureRandom aleatorios = new SecureRandom();

		for (int i = 1; i <= 20; i++) {
			
			// seleciona o inteiro aleat�rio entre 1 e 6
			int face = 1 + aleatorios.nextInt(6);
			
			System.out.printf("%d ", face); // exibe o valor gerado
			
			// se o contador for divis�vel por 5, inicia uma nova linha de sa�da
			if(i % 5 == 0)
				System.out.println();

		}

	}

}
