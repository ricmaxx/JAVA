package br.com.fiap.tds;

public class operadorAritmetico {
	public static void main (String[]args) {
		int x = 15;
		int y = 12;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da adição:" + soma);
		System.out.println ("Resultado da subtracao:" + subtracao);
		System.out.println("Resultado da multiplicação:" + multiplicacao);
		System.out.println("Resultado da divisão:" + divisao);
		System.out.println("Resultado da resto:" + resto);
		x++;
		System.out.println("Resultado do incremento de x:" + x);
		y--;
		System.out.println("Resultado do decremento de y:" + y);
		x += 10; 
		System.out.println("Atribuição aditiva de x:" + x);
		y -= 15;
		System.out.println("Atribuição subtrativa de y:" + y);
			
	}

}
