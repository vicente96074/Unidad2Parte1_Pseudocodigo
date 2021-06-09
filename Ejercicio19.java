import java.util.Scanner;

public class Ejercicio19{

	public static void main(String[] args){
		int numero;
		
		numero = (int) (Math.random() * 1000);
		
		if(numero%5==0 && numero<=25){
			System.out.println("Correcto: " + numero);
		} else {
			System.out.println("Incorrecto: " + numero);
		}
	}
	
	
}
