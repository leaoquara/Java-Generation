package Collections;

import java.util.ArrayList;

public class TestaAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("ArrayList" , 60);
		Aula a2 = new Aula("Lista Objetos" , 90);
		Aula a3 = new Aula("Relacionamentos" , 120);
		
		ArrayList<Aula> listaAulas = new ArrayList<>();
		
		listaAulas.add(a1);
		listaAulas.add(a2);
		listaAulas.add(a3);
		
		System.out.println("Lista de aulas: " + listaAulas);
	}

}
