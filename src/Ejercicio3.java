import java.util.Iterator;
import java.util.Random;

import MyExceptions.MyException;

public class Ejercicio3 {

	public static void main(String[] args) {

		System.out.println("Generando numero aleatorio...");
		
		try {
			//Numero aleatorio entre [0,999]
			Random rnd = new Random();
			int aleatorio = (int) (rnd.nextDouble()*1000);
			System.out.println("El numero generado es: " + aleatorio);
			//Lanzador de excepcion segun el valor de aleatorio
			if ((aleatorio % 2) != 0) throw new MyException(1);
			else throw new MyException(2);
		} catch(MyException e) {
			//Muestra el mensaje determinado por el codigo que se le pasa al constructor de la excepcion
			System.out.println(e.getMessage());
		}
	}
}
