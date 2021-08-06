import java.util.Scanner;

import MyExceptions.MyException;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//variables
		Scanner sc = new Scanner(System.in);
		 String operando;
		 int operador1;
		 int operador2;
		 boolean calcular = true;
		
		
		//Solicita operacion a realizar
		System.out.println("CALCULADORA\n Qué operacion quieres realizar?  "
				+ "( + , - , * , / , raiz2 , raiz3, potencia )");
		operando = sc.nextLine();
		System.out.println(operando);
		
		
		//Operaciones
		try {
			switch (operando) {
			case ("+"):
				System.out.println("Introduce primer operador:");
				operador1 = sc.nextInt();
				System.out.println("Introduce segundo operador:");
				operador2 = sc.nextInt();
				System.out.println("Resultado: " + (operador1 + operador2));
				break;
			case ("-"):
				System.out.println("Introduce primer operador:");
				operador1 = sc.nextInt();
				System.out.println("Introduce segundo operador:");
				operador2 = sc.nextInt();
				System.out.println("Resultado: " + (operador1 - operador2));
				break;
			case ("*"):
				System.out.println("Introduce primer operador:");
				operador1 = sc.nextInt();
				System.out.println("Introduce segundo operador:");
				operador2 = sc.nextInt();
				System.out.println("Resultado: " + (operador1 * operador2));
				break;
			case ("/"):
				System.out.println("Introduce primer operador:");
				operador1 = sc.nextInt();
				System.out.println("Introduce segundo operador:");
				operador2 = sc.nextInt();
				System.out.println("Resultado: " + (operador1 / operador2));
				break;
			case ("potencia"):
				System.out.println("Introduce la base:");
				operador1 = sc.nextInt();
				System.out.println("Introduce el exponente:");
				operador2 = sc.nextInt();
				System.out.println("Resultado: " + (Math.pow(operador1, operador2)));
				break;
			case ("raiz2"):
				System.out.println("Introduce la base de la raiz cuadrada:");
				operador1 = sc.nextInt();
				System.out.println("Resultado: " + (Math.sqrt(operador1)));
				break;
			case ("raiz3"):
				System.out.println("IIntroduce la base de la raiz cubica:");
				operador1 = sc.nextInt();
				System.out.println("Resultado: " + (Math.cbrt(operador1)));
				break;
			default:
				throw new MyException(4);
			}
		} catch (Exception e) {
			if (e instanceof MyException) {
				System.out.println(e.getMessage());
			} else {
				System.out.println(e.toString()); //Se usa toString() en lugar de getMessage() para obtener informacion mas detallada
			}
			
		} finally {
			sc.close();
			System.out.println("Saliendo...");
		}

	}

}
