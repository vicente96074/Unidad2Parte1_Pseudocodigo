import java.util.Scanner;

public class Ejercicio5{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		numero = numero + 1;
		
		System.out.println("El numero siguiente es: " + numero);
	}
	
	
}
