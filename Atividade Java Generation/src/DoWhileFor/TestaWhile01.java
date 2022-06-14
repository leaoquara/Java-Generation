package DoWhileFor;

public class TestaWhile01 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador < 10) {
			System.out.print("R");
			Thread.sleep(200);
			
			System.out.print("E");
			Thread.sleep(200);
			
			System.out.print("P");
			Thread.sleep(200);
			
			System.out.print("E");
			Thread.sleep(200);
			
			System.out.print("T");
			Thread.sleep(200);
			
			System.out.print("I");
			Thread.sleep(200);
			
			System.out.print("Ç");
			Thread.sleep(200);
			
			System.out.print("Ã");
			Thread.sleep(200);
			
			System.out.print("O");
			Thread.sleep(200);
			
			System.out.print(": ");
			Thread.sleep(200);
			
			System.out.println(contador);
			
			contador++;
			
			Thread.sleep(200);
		}	
	}	
}
