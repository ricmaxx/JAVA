package br.com.fiap.tds;

import java.util.Scanner;

public class CalculoDeIMC {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite seu peso \n ");
		int peso = sc.nextInt();
		System.out.print("Digite sua altura \n  ");
		double altura = sc.nextDouble();
		double imc = peso/(altura*altura);
			System.out.println ("Seu IMC é " + imc);
		if (imc >18.5 && imc <25) {
			System.out.println ("Você está no peso ideal ");
		} else {
			System.out.println ("Você está fora do peso ideal ");
		}
		sc.close();
	}
}
