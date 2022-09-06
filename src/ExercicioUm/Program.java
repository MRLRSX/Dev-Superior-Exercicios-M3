package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		System.out.println("SISTEMA DE REPETIÇÃO CONTROLADA ....");
		System.out.println("INFORME O NUMERO DE REPETIÇÕES");
		int contador = entradaDados.nextInt();
		for (int x = 0; x < contador; x++) {
			System.out.printf("\nREPETIÇÃO DE NUMERO: %d º", x);
		}
		entradaDados.close();
	}
}
