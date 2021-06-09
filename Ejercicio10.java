import java.util.Scanner;

public class Ejercicio10{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int base;
		int altura;
		int area;				
		int perimetro;
		
		System.out.print("Ingrese la base: ");
		base = entrada.nextInt();
		System.out.print("Ingrese la altura: ");
		altura = entrada.nextInt();
		
		area = base*altura;
		perimetro = 2*base + 2*altura;
		
		System.out.println("El area es: " + area + " u^2.");
		System.out.println("El perimetro es: " + perimetro + " u.");		
	}
	
	
}
