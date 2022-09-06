package ExercicioSeis;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner entradaDados = new Scanner(System.in);
     System.out.println("SISTEMA DE LEITURA DE N NUMEROS E MOSTRA SEUS DIVISORES");
     System.out.println("INFORME NUMERO PARA VERIFICAÇÃO ....");
     int numero = entradaDados.nextInt();
     
     for(int x = 1; x < numero; x++) {
    	 if(numero % x ==0) {
    		 System.out.printf("\nE %d DIVISOR DE %d", x, numero);
    	 }else {
    		 System.out.printf("\nNÃO E %d DIVISOR DE %d", x, numero);    		 
    	 }
     }
     
     
     entradaDados.close();
	}
}
