import MyExceptions.MyException;

public class Ejercicio2App {
	
	public static void main(String[] args) {
		try {
			System.out.println("Ejercicio 2: expceciones personalizadas");
			throw new MyException(3);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Fin ejecución.");
		}
	}
}
