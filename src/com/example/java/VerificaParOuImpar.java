package com.example.java;

import java.util.Scanner;

public class VerificaParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		int soma = numero1 + numero2;
		if ( soma % 2 == 0 ) {
			System.out.println("Resultado é Par");
		} else {
			System.out.println("Resultado é impar");
		}
		sc.close();
	}

}
