package Javalogica11_02;


import java.util.Scanner;

public class primos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		int num = scanner.nextInt();
		
		if( num  == 1 || num == 2 ||  num == 3 || num == 5 || num == 7 || num == 11) {
			System.out.print("É Primo");
		}
		else {
			System.out.print("não é Primo");
		}
scanner.close();
	}

}
