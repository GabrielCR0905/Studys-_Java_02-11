package Javalogica11_02;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua idade:");
		int idade = scanner.nextInt();
		
		
		if(idade <=12) {
			System.out.print("Voce é uma Criança");
		}
		else if(idade <18) {
			System.out.print("Voce é um Adolecente");
		}
		else if(idade >=18 && idade <=59) {
			System.out.print("Voce é um Adulto");
		}
		else if (idade >=60){
			System.out.print("Voce é um Idoso");
		}
		scanner.close();
	}

}
