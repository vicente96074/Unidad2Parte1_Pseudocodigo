import java.util.Scanner;

public class Ejercicio12{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int temperaturaCelsius;
		double temperaturaFahreheit;

		System.out.print("Ingrese los grados en celsius: ");
		temperaturaCelsius = entrada.nextInt();
		
		temperaturaFahreheit = ((temperaturaCelsius*9)/5) + 32;
		System.out.println("La temperatura equivalente a grados Fahreheit es: " + temperaturaFahreheit + " °F.");
	
	}
	
	
}
