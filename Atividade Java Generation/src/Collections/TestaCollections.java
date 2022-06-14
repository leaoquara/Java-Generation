package Collections;

import java.util.ArrayList;

import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
	
		String aula1 = "Bloco I   - Java";
		String aula2 = "Bloco II  - SpringBoot";
		String aula3 = "Bloco III - FrontEnd";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		/*System.out.println(aulas);
		aulas.remove(1);
		System.out.println(aulas);*/
		
		/*for(String i: aulas) {S
			System.out.println("Aula: " + i);
		}*/	
		
		/*String terceiraAula = aulas.get(2);
		System.out.println(terceiraAula);*/
		
		/*System.out.println(aulas.get(2));*/
		
		/*for(int i = 0; i < aulas.size(); i++) {
			System.out.println((i+1) + "° aula: " + aulas.get(i));
		}*/

		/*System.out.println("Tamanho do ArrayList: " + aulas.size());*/
		
		/*Collections.sort(aulas);//organiza a lista
		Collections.shuffle(aulas);//embaralha a lista
		System.out.println(aulas);*/
		
	}
}
