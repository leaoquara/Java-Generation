package ExercicioDoWhileFor;

import java.util.Scanner;

public class ExercicioWhile03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		while(idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
			
				if(idade < 21 && idade > -98) {
					menor = menor + 1;
				}	
				
				if(idade > 50){
					maior = maior + 1;
				}
				
		}	System.out.println("O numero de pessoas com menos de 21 anos são: " + menor);
			System.out.println("O numero de pessoas com mais de 50 anos são: " + maior);
	}		
}

		
	