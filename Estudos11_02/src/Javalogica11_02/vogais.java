package Javalogica11_02;

import java.util.Scanner;

public class vogais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra");
		String palavra = scanner.next().toLowerCase();
		
		int contador = 0;
		
		for(int i = 0; i < palavra.length(); i ++) {
			
			char letra = palavra.charAt(i);
			
			if(letra == 'a' || letra == 'e' 
					|| letra == 'i' || letra =='o'|| letra =='u') {
				contador++;
				
			}
		}
  System.out.print("numero de vogais é:"+ contador);
  scanner.close();
	}


}
