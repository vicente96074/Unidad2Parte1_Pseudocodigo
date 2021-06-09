import java.util.Scanner;

public class Ejercicio1{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int resultado;
		
		System.out.print("Ingrese un numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingrese otro numero: ");
		numero2 = entrada.nextInt();		
		
		resultado = numero1 + numero2;
		System.out.println("La suma es: " + resultado);		
	}
}
