import java.util.Scanner;

public class Ejercicio18{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numeros1;
		String numeros2;
		int suma = 0;
		
		System.out.print("Ingrese un numero, maximo 4 digitos: ");
		numeros1 = entrada.nextInt();
		
		numeros2 = String.valueOf(numeros1);
		
		char[] digitos = numeros2.toCharArray();
		
		for(int i = 0; i < digitos.length; i++) {
			suma = suma + Character.getNumericValue(digitos[i]);
			System.out.print(digitos[i] + " ");
        	}
        	
		System.out.println("\nLa suma de los digitos del numero ingresado es: " + suma);
	}
	
	
}
