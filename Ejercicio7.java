import java.util.Scanner;

public class Ejercicio7{

	public static void main(String[] args){
		int numero;
		float numeroDisminuido;
		
		numero = (int) (Math.random() * (50 - 10 + 1) + 10);
		
		System.out.println("Numero generado aleatoriamente entre 10-50 es: " + numero);
		
		numeroDisminuido = numero-+ numero*0.15f;
		
		System.out.println("El numero disminuido a un 15% es: " + numeroDisminuido);
	}
	
	
}
