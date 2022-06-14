package Metodo;

public class TestaMetodos {

	static int num1 = 3, num2 = 6, multiplicacao;
	
	public static void main(String[] args) {
		
		System.out.println("Olá sou o método principal, sou o start da sua aplicação!");
		
		metodo01();
		
		metodo02();
		
		metodo03();
		
		metodo04();
		
		TestaMetodoFora.metodo05();
		
		metodo06(90,20);
		
	}

	public static void metodo01() {
		
		System.out.println("Olá sou o método01!");
		
	}
	
	public static void metodo02() {
		
		double numero1, numero2, soma;
		
		numero1 = 30;
		numero2 = 22;		
		
		soma = numero1 + numero2;
		
		System.out.println("Resultado da soma: " + soma);
		
	}
	
	public static void metodo03() {
		
		multiplicacao = num1 * num2;
		
	}
	
	public static void metodo04() {
		
		System.out.println("Resultado do calculo feito no metodo03: " + multiplicacao);
		
	}
	
	public static void metodo06(int num3, int num4) {
		
		int subtracao = num3 - num4;
		
		System.out.println("Resultado do calculo feito no metodo06: " + subtracao);
		
	}
	
	
}
