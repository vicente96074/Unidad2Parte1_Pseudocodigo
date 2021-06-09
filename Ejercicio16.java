import java.util.Scanner;

public class Ejercicio16{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;

		System.out.print("Ingrese el numero 1: ");		
		numero1 = entrada.nextInt();
		System.out.print("Ingrese el numero 2: ");
		numero2 = entrada.nextInt();
		System.out.print("Ingrese el numero 3: ");
		numero3 = entrada.nextInt();
		
		if(numero1>numero2 && numero2>numero3){
			System.out.println("Numero1 es el mayor de todos.");

		} else if(numero2>numero3 && numero3>numero1){
			System.out.println("Numero2 es el mayor de todos.");
		} else if(numero3>numero1 && numero1>numero2){
			System.out.println("Numero3 es el mayor de todos.");
		}
	
	}
	
	
}
