package com.example.java;

import java.util.Scanner;

public class OperadoresLogicosNot {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int x = reader.nextInt();
		
		boolean test = !(x < 18);
		
		System.out.println("Maioridade: " + test);

	}

}
