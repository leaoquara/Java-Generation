package DoWhileFor;

public class TestaFor02 {

	public static void main(String[] args) throws InterruptedException {
		
		int n = 10;
		int i, soma;
		
		for(i = 0, soma = 0; i <= n; i++) {
			
			System.out.print("Soma " + soma + " + " + i);
			Thread.sleep(750);
			soma += i;
			System.out.println(" = " + soma);
			Thread.sleep(500);
		}
	}	
}
