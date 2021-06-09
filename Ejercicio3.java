import java.util.Scanner;

public class Ejercicio3{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		int doble;
		int triple;
		
		System.out.print("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		doble = numero*2;
		triple = numero*3;
		
		System.out.println("El doble del numero ingresado es: "+doble);
		System.out.println("El triple del numero ingresado es: "+triple);		
	}
	
}
