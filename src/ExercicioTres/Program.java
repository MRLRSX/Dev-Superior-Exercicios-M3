package ExercicioTres;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      
      System.out.println("SISTEMA DE LEITURA E MEDIA DE NUMEROS INFORMADOS");
      System.out.println("INFORME A QUANTIDADE DE NUMEROS A SEREM LIDOS ....");
      int contador = entradaDados.nextInt();
      for(int x = 0; x < contador; x++) {
    	  System.out.println("Informe o primeiro numero");
    	  double a  = entradaDados.nextDouble();
    	  System.out.println("Informe o segundo numero");
    	  double b = entradaDados.nextDouble();
    	  System.out.println("Informe o terceiro numero");
    	  double c = entradaDados.nextDouble();
    	  System.out.printf("\nMEDIA FEITA %.2f", (a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
      }
      
      entradaDados.close();
	}
}
