package ExercicioDoWhileFor;

public class ExercicioFor01 {

	public static void main(String[] args) {
		int div;
		for(int num = 1000; num <= 1999; num++) {
			div = num % 11;
			if(div == 5) {
				System.out.println(num);
			}
		}	
	}	
}
