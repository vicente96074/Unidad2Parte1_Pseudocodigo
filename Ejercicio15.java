import java.util.Scanner;

public class Ejercicio15{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.print("Ingrese un numero: ");		
		numero = entrada.nextInt();
		
		if(numero == 0){
			System.out.println("El numero ingresado es nulo.");

		} else if(numero>0){
			System.out.println("El numero ingresado es positivo.");
		} else {
			System.out.println("El numero ingresado es negativo.");
		}
	
	}
	
	
}
