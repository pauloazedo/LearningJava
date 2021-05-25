package com.example.java;

import java.util.Scanner;

public class CalculoFatoracao {
	
	public static void main(String[] args) {		
			
			Scanner input = new Scanner(System.in);
					
			System.out.println("Digite o numero a ser fatorado");
			
			int numero = input.nextInt();
			
			int soma = 0;
			
			while (numero>1) {
				if (soma==0) {
					soma = numero * (numero-1);
					numero--;
				} else {
					soma = soma * (numero-1);
					numero--;
				}
			}
					
			System.out.println("Resultado: " + soma);
			
			input.close();
	
		}

}
