package basicojava;
/**
 * @author jhonatan-chaves
 * Hello word
 * */

public class Basico {

	public static void main(String[] args) {
		
		// primeiro progama em java
		System.out.println("Hello word");
		
		
		// variaveis e seus tipos
		
        String nome = "Jhonatan Chaves"; // String tudo nesse tipo de variavel é texto e não tem limite ...
        
        int idade = 24; // int representa os numeros inteiros assim podendo fazer calculos numericos ...
        
        char genero = 'M'; // essa variavel só pode conter um caractere ...
        
        boolean frio = true; // essa variavel é utilizada quando queremos saber se o valor é verdadeiro ou falso... 
        
		float dinheiroGuardado = 30524; // esse tipo de variavel consegue retornar valores não inteiros
		
		double valorPi = 3.141592; // consegue voltar pontos flutuantes
		
		// vamos ver a saida delas no console
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("TIPOS DE VARIAVEIS");
		System.out.println("STRING: " + nome);
		System.out.println("INTEIRO: " + idade);
		System.out.println("char: " + genero);
		System.out.println("boolean: " + frio);
		System.out.println("float: " + dinheiroGuardado);
		System.out.println("double: " + valorPi);
		
		// agora vamos ver essas variaveis juntas num dialogo
		
		System.out.println("Óla tudo bem " + nome + "? \n" + " vi aqui que vc tem "+ idade + " anos de idade né ? \n" 
				              + " seu genero é  " + genero + " pelo visto vc esta com " + frio + " mas sua conta esta bem quente pelo visto vc atualmente tem " + dinheiroGuardado + "\n"
				              + "vi aqui que vc tambem é bom em matematica sabe ate o numero pi que equivale a " + valorPi);
		
		// vamos agora fazer umas contas com variaveis ?
		
		int num1 = 20;
		int num2 = 10;
		double num3 = 50;
		float num4 = 2;
		
		System.out.println(num1 + num2);
		System.out.println();
		System.out.println(num3 + num1);
		System.out.println();
		System.out.println(num1 + num2 + num3 + num4);
		System.out.println();
		System.out.println(num3 * num4);
		
		
		
		
		

	}

}
