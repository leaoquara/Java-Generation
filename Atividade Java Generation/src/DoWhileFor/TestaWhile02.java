
package DoWhileFor;

import java.util.Scanner;

public class TestaWhile02 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		
	int num1 = -1;
	
		while(num1 != 10) {
			System.out.println("Digite um numero: ");
			num1 =sc.nextInt();
			
			if(num1 % 2 == 0) {
				num1 ++;
				System.out.println(num1);
			
			}else {
				num1 --;
				System.out.println(num1);
				
			}
		}System.out.println("programa finalizado: " + num1);
	}
}