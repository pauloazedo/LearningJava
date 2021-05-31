package com.example.java;

import java.util.Scanner;

public class OperadoresLogicosXor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int x = leitor.nextInt();
		
		boolean test = x < 10 ^ x > 50;
		
		System.out.println(test);
		
		leitor.close();	
		
	}

}
