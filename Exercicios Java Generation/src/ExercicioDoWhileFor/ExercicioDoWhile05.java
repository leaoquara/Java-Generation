package ExercicioDoWhileFor;

import java.util.Scanner;

public class ExercicioDoWhile05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, soma = 0;
		
		
		do { 
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			soma += numero;
			}while(numero != 0);
			System.out.println("Soma dos numeros: " + soma);	
	}	
}
			
		
		
	
	

