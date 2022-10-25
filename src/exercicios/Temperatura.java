package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {
	public static void main(String [] args) {
	
	double f;
	double c;

	Scanner teclado = new Scanner(System.in);
	DecimalFormat formatador = new DecimalFormat("#0.0");
	
	System.out.print("qual a temperatura em faherenthin? ");
	f = teclado.nextDouble();
	c = (5 * (f - 32)) / 9;
	
	System.out.println("temperatura em ceulcius ficou em : " + formatador.format(c) + "°C");
	
	
	teclado.close();
	
  }
}
