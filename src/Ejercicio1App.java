import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1App {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int numSecreto = (int) (rnd.nextDouble()*500 +1);
		int userValue = 0;
		int counter = 0;
		boolean found = false;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ADIVINA EL NUMERO SECRETO\nIntroduce valor >>");
		while (!found) {
			try {
				//if (!(sc.hasNextInt())) throw new InputMismatchException();
				userValue = sc.nextInt();
				checkValue(numSecreto, userValue, found, counter);
				counter++;
			} catch (InputMismatchException ex) {
				System.out.println("Eso no era un numero !!");
				sc.next();
				counter++;
			}
		}
	}
	//Comprueba si el valor introducido (v2) es igual, mayor o menos al valor buscado (v1)
	//Muestra pistas para aproximarse al valor buscado o si se ha encontrado
	public static void checkValue(int v1, int v2, boolean found, int counter) {
		if (v1 < v2) {
			System.out.println("El valor secreto es menor");
		}
		if (v1 > v2) {
			System.out.println("El valor secreto es mayor");
		}
		if (v1 == v2) {
			System.out.println("Valor correcto !!");
			counter++;
			System.out.println("Numero de intentos: "+ counter);
			found = true;
		}
		
	}
}
