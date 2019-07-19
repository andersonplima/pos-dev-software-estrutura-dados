package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		final int TAM_NOTAS = 10;
		float[] notas = new float[TAM_NOTAS];
		
		try(Scanner scanner = new Scanner(System.in)) {
			float soma = 0f;
			
			for (int i = 0; i < TAM_NOTAS; ++i) {
				System.out.print("Entre com uma nota: ");
				float nota = scanner.nextFloat();
				notas[i] = nota;
				soma += nota;
			}
			
			System.out.printf("Notas: %s%n", Arrays.toString(notas));
			
			float media = soma / TAM_NOTAS;
			
			System.out.printf("A média é: %.2f", media);
		}
	}
}
