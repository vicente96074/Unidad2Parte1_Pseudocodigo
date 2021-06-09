import java.util.Scanner;

public class Ejercicio6{

	public static void main(String[] args){
		int numero;
		float numeroAumentado;
		
		numero = (int) (Math.random() * 200);
		
		System.out.println("Numero generado aleatoriamente entre 0-200 es: " + numero);
		
		numeroAumentado = numero + numero*0.3f;
		
		System.out.println("El numero aumentado a un 30% es: " + numeroAumentado);
	}
	
	
}
