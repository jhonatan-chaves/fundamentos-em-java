package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pdv {

	public static void main(String[] args) {
		// variaveis
		double valorTotal;
		double desconto;
		double totalComDesconto;
		double valorPago;
		double troco;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		valorTotal = 50;
		desconto = (valorTotal * 5)/100;
		totalComDesconto = valorTotal - desconto; 
		System.out.println("valor total: " + valorTotal );
		System.out.println("que legal voc� teve 5% de desconto: " + desconto);// vai ser 5
		System.out.println("agora o valor a ser pago ser�: " + totalComDesconto);
        System.out.println("quanto em dinheiro o senhor vai pagar? ");
        valorPago = teclado.nextDouble();
        System.out.println("ok! voc� pagou "+ valorPago +" para ser reduzido de " + totalComDesconto );
        troco =   valorPago - totalComDesconto;
        System.out.println("seu troco � de : " + troco);
		

	}

}
