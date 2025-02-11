package Javalogica11_02;
 
import java.util.Scanner;


public class inicial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.print("Digite Seu Primeiro Nome");
	String nome = scanner.next();
	
	
	if( nome.equals("Gabriel") || nome.equals("gabriel")) {
		System.out.print("Gabriel de Carvalho Rodrigues");
		
	}else {
		System.out.print("Não te conheço");
	}
 scanner.close();
	}

}
