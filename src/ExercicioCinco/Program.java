package ExercicioCinco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		System.out.println("SISTEMA DE NUMERO FATORIAL");
		System.out.println("INFORME O NUMERO QUE VOCÊ DESEJA SABER ELE FATORIAL");
		int contadorFatorial = entradaDados.nextInt();
		int resultadoFatorial = 0;
		for (int x = 1; x <= contadorFatorial; x++) {
			resultadoFatorial *= x;
		}
		System.out.printf("\nRESULTADO DE %d FATORIAL E %d", contadorFatorial, resultadoFatorial);
		entradaDados.close();
	}
}
