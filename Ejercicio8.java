import java.util.Scanner;

public class Ejercicio8{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;				
		float promedio;
		
		System.out.print("Ingrese el numero 1: ");
		numero1 = entrada.nextInt();
		System.out.print("Ingrese el numero 2: ");
		numero2 = entrada.nextInt();
		System.out.print("Ingrese el numero 3: ");
		numero3 = entrada.nextInt();				
		
		promedio = (numero1 + numero2 + numero3)/3;
		
		System.out.println("El promedio es: " + promedio);
	}
	
	
}
