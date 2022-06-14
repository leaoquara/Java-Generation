package ExercicioMatrizVetores;

import java.util.Random;

public class ExercicioVetores02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] dados = new int[10];
		int maior = 0, repeticoes = 1;
		double soma= 0.0, media = 0.0;
		for (int i = 0; i < 10; i++)
		{
			dados[i] = random.nextInt(6) + 1;
			soma += dados[i];
			System.out.println("O número lançado foi " + dados[i]);
			
			if (dados[i] >= maior || i == 0)
			{
				if (dados[i] == maior)
				{
					repeticoes++;
				}
				else 
				{
					maior = dados[i];
					repeticoes = 1;
				}
			}
		}media = soma / 10;
		
		System.out.println("A media aritmetica é: " + media);
		
		System.out.println("Repetiu " + repeticoes + "x");

	}
}
