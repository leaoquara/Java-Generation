package DoWhileFor;

public class TestaFor03 {

	public static void main(String[] args) throws InterruptedException {

		int numero = 0;
		
		while (numero < 9) {
			for( int sobe = 1, desce = 9 ; sobe <= 9 && desce >= 1 ; sobe++, desce--) {
				System.out.println(sobe + " || " + desce);
				Thread.sleep(500);
			}
		}
	}

}