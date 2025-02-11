package Javalogica11_02;

 import java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero para ver sua tabuada");
		int numero = scanner.nextInt();
		
		
		for( int i = 1; i <=10; i++) {
			System.out.print(numero  + "X" + i + "=" + (numero * i) + ",");
		}
scanner.close();
	}

}
