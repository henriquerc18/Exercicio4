package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Antecessor ant = new Antecessor();
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		scan.nextLine();
		
		if(ant.numAntecessor(numero) > 0){
			System.out.println("Número: " + numero);
			System.out.println("Seu Antecessor é: " + (numero - 1));
			scan.nextLine();
		}else{
			System.out.println("Este número é negativo!");
			scan.nextLine();
		}

	}

}
