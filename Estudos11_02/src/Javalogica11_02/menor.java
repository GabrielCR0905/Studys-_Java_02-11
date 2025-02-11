package Javalogica11_02;

import java.util.Scanner;

public class menor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("VARIAVEL A:");
		double a = scanner.nextDouble();
		
		System.out.print("VARIAVEL B:");
		double b = scanner.nextDouble();
		
		
		if(a > b) {
			System.out.print("Variavel A é MAIOR");
		}
		else {
			System.out.print("Variavel B é MAIOR");
		}
scanner.close();
	}

}
