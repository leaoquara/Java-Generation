package ExercicioDoWhileFor;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, impares = 0, pares = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
				if(numero % 2 == 0) {
					pares = pares + 1;
				}else{
					impares = impares + 1;
			}
		}System.out.println("Desses numeros : " + pares + " são pares, e: " + impares + " são impares.");
	}
}
