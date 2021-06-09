import java.util.Scanner;

public class Ejercicio20{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String numeros1;
		String auxiliar = null;
		
		System.out.print("Ingrese un numero, maximo 4 digitos: ");
		
		numeros1 = String.valueOf(entrada.nextLine());
		
		char[] digitos = numeros1.toCharArray();
		
		for(int i = digitos.length-1; i>=0; i--) {
		
			//Intercambiar la posicion de los digitos, para poder evaluar después que sea capicua
			int siguienteDigito = Character.getNumericValue(digitos[i]);		
			if(i==digitos.length-1){
				auxiliar = String.valueOf(siguienteDigito);
			} else {
				auxiliar = String.valueOf(auxiliar + siguienteDigito);
			}

        	}
        	
        	if(auxiliar.equals(numeros1)){
        		System.out.println("\nNumero ingresado: " + numeros1);
        		System.out.println("\nNumero capicua: " + auxiliar);        		
        	} else {
        		System.out.println("\nNumero ingresado: " + numeros1);
        		System.out.println("\nNumero no capicua: " + auxiliar);        		
        	}
		
	}
	
	
}
