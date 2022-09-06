package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entradaDados = new Scanner(System.in);
       System.out.println("SISTEMA DE LEITURA DE DADOS CONTROLADOS");
       System.out.println("SISTEMA IRA INFORMAR OS NUMEROS LINDOS DENTRO DO 10 E 20 E FORA DESTE INTERVALO");
       System.out.println("INFORME A QUANTIDADE DE NUMEROS A SEREM LIDOS ...");
       int contador = entradaDados.nextInt();
       int in =0;
       int out = 0;
       for(int x = 0; x < contador; x++){
    	   System.out.printf("INFORME O NUMERO %d º", x);
    	   int numeroInformado = entradaDados.nextInt();
    	   if(numeroInformado >= 10 && numeroInformado <= 20) {
    		   System.out.printf("\n%d in", numeroInformado);
    		   in += 1;
    	   }else {
    		   System.out.printf("\n%d out", numeroInformado);
    		   out += 1;
    	   }
       }
       System.out.printf("\nNUMERO INFORMADOS DENTRO IN %d NUMEROS INFORMADOS FORA OUT %d", in , out);
       entradaDados.close();
	}
}
