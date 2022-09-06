package ExercicioSete;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      System.out.println("SISTEMA DEVE LER N LINHAS E DEPOIS MOSTRAR O QUADRADO E O CUBO ");
      System.out.println("INFORME O NUMERO N ...");
      int numero = entradaDados.nextInt();
      
      for(int x = 1; x <= numero; x++) {
    	  System.out.printf("\nNUMERO %d QUADRADO %d E CUBO %d", x, x * x, x*x*x);
      }
      
      entradaDados.close();
	}
}
