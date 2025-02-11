package Javalogica11_02;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um Numero N:");
		int num = scanner.nextInt();
		
		int soma = 0;
		
		for( int i = 0; i <=num;i++) {
			
			soma += i;
			 	
		}
    System.out.print(" A soma de  1 até" + num + "é" + soma );
    scanner.close();
	}

}
