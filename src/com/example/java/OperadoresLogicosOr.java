package com.example.java;

import java.util.Scanner;

public class OperadoresLogicosOr {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x = leitor.nextInt();
		
		boolean teste = x < 10 || x > 50;
		
		System.out.println(teste);

		leitor.close();
	}

}
