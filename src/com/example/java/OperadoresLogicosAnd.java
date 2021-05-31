package com.example.java;

import java.util.Scanner;

public class OperadoresLogicosAnd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		
		int idade = reader.nextInt();
		
		boolean precisaVotar = idade >= 18 && idade <= 70;
		
		if ( precisaVotar == true) {
			System.out.println("Precisa Votar");
		} else {
			System.out.println("Não precisa votar");
		}
			
		reader.close();

	}

}
