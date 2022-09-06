package ExercicioQuatro;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      System.out.println("SISTEMA IRA LER N NUMEROS DEPOIS MOSTRA DIVISÃO DELES");
      System.out.println("INFORME QUANTIDADE DE NUMEROS DE REPETIÇÕES ....");
      int contador = entradaDados.nextInt();
      
      for(int x = 0; x < contador; x++) {
    	  System.out.println("INFORME NUMERO 1 PARA DIVISÃO");
    	  double a = entradaDados.nextDouble();
    	  System.out.println("INFORME NUMERO 2 PARA DIVISÃO");
    	  double b = entradaDados.nextDouble();
    	  
    	  if(a > 0 && b > 0){
    		  System.out.printf("\nA DIVISÃO E: %.2f", a /b);
    	  }else {
    		  System.out.println("DIVISÃO IMPOSSIVEL");
    	  }
      }
      entradaDados.close();
	}
}
