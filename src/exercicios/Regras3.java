package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regras3 {

	public static void main(String[] args) {
		// variaveis 
		
		double x;
		double y;
		double valor;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.println("regra de 3...");
		System.out.println("x% de y = valor");
		
	    System.out.print("qual o valor de x?");
	    x = teclado.nextDouble();
	    
	    System.out.print("qual o valor de y");
	    y = teclado.nextDouble();
	    
	    valor = (x * y)/ 100;
	    
	    System.out.println("valor do desconto é de " + formatador.format(valor));
	    
		
		
		
		teclado.close();

	}

}
