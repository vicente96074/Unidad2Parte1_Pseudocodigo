import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		int cuadrado;
		int cubo;
		
		System.out.print("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		cuadrado = numero*numero;
		cubo = numero*numero*numero;
		
		System.out.println("El cuadrado del numero ingresado es: "+cuadrado);
		System.out.println("El cubo del numero ingresado es: "+cubo);		
	}
	
}
