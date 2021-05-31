package com.example.java;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserir altura: ");
		double altura = sc.nextDouble();
		System.out.println("Inserir peso: ");
		double peso = sc.nextDouble();
		double imc = (peso / (altura * altura));
		if (imc < 18.5) {
			System.out.println("Seu IMC é " + imc + ", abaixo do peso");
		} else  if (imc <= 25) {
			System.out.println("Seu IMC é " + imc + ", peso normal");
		} else {
			System.out.println("Seu IMC é " + imc + ", acima do peso");
		}
		sc.close();
	}

}
