import java.util.Scanner;

public class Ejercicio17{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;

		System.out.print("Ingrese el lado 1: ");		
		lado1 = entrada.nextInt();
		System.out.print("Ingrese el lado 2: ");
		lado2 = entrada.nextInt();
		System.out.print("Ingrese el lado 3: ");
		lado3 = entrada.nextInt();
		
		if(lado1 == lado2 && lado2 == lado3){
			System.out.println("El triangulo es equilatero.");
		} else if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1){
			System.out.println("El triangulo es escaleno.");
		} else {
			System.out.println("El triangulo es isoceles.");
		}
	
	}
	
	
}
