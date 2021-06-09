import java.util.Scanner;

public class Ejercicio11{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int centimetro;
		double auxiliar;

		System.out.print("Ingrese una medida en centimetros: ");		
		centimetro = entrada.nextInt();
		
		auxiliar = centimetro/91.44;
		System.out.println(centimetro + " cm equivale a: " + auxiliar + " yardas.");
		
		auxiliar = centimetro/100.0;
		System.out.println(centimetro + " cm equivale a: " + auxiliar + " metros.");
		
		auxiliar = centimetro/30.48;
		System.out.println(centimetro + " cm equivale a: " + auxiliar + " pies.");
		
		auxiliar = centimetro/2.54;
		System.out.println(centimetro + " cm equivale a: " + auxiliar + " pulgadas.");				
	
	}
	
	
}
