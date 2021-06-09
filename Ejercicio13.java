import java.util.Scanner;

public class Ejercicio13{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double PI = 3.14159265359;
		int radio;
		int altura;
		double volumen;

		System.out.print("Ingrese le radio del cilindro: ");		
		radio = entrada.nextInt();
		System.out.print("Ingrese la altura del cilindro: ");
		altura = entrada.nextInt();
		
		if(radio > 0){
			if(altura > 0){
				volumen = radio*radio*altura*PI;
				System.out.println("El volumen del cilindro es: " + volumen);
			} else {
				System.out.println("La altura del cilindro es diferente de positivo, corrigela.");
			}
			
		} else {
			System.out.println("El radio del cilindro es diferente de positivo, corrigela.");
		}
	
	}
	
	
}
