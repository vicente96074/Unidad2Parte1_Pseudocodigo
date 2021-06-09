import java.util.Scanner;

public class Ejercicio14{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.print("Ingrese el numero 1: ");		
		numero1 = entrada.nextInt();
		System.out.print("Ingrese el numero 2: ");
		numero2 = entrada.nextInt();
		
		if(numero1 != 0){
			System.out.println("El numero 2 es divisible entre el numero 1.");

		} else {
			System.out.println("El numero 2 no es divisible entre el numero 1.");
		}
	
	}
	
	
}
