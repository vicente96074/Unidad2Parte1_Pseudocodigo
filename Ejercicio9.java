import java.util.Scanner;

public class Ejercicio9{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String letra1;
		String letra2;
		String auxiliar;				
		
		System.out.print("Ingrese la letra 1: ");
		letra1 = entrada.nextLine();
		System.out.print("Ingrese la letra 2: ");
		letra2 = entrada.nextLine();
		
		auxiliar = letra1;
		letra1 = letra2;
		letra2 = auxiliar;
		
		System.out.println("Letra 1 intercambiado: " + letra1);
		System.out.println("Letra 2 intercambiado: " + letra2);
	}
	
	
}
