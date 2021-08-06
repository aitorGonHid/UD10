import java.util.Random;
import java.util.Scanner;

public class Password {
	
	//Atributos
	int longitud;
	String contrase�a;
	Random rnd = new Random();
	static Scanner sc = new Scanner(System.in);
	
	//Constructores
	public Password () {
		this.longitud = 8;
		generaPassword(8);
	}
	public Password(int longitud) {
		this.longitud = longitud;
		generaPassword(longitud);
	}
	
	//Getters & setters
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	//Metodos de clase
	//M�todo que genera una contrase�a aleatoria de numeros, letras mayusculas y minusculas y caracteres especiales
	public void generaPassword(int length) {
		
		StringBuilder pass = new StringBuilder();
		for (int i=0; i < length; i++) {
			//Genera un entero entre el numero 48 y el 122 (ref. tabla ascii)
			int charRef = (int) (rnd.nextDouble() * (123 - 48)) + 48; 
			pass.append((char) charRef);
		}
		
		this.contrase�a = pass.toString();
	}
	
	//M�todo que retorna si la contrase�a es segura o no segun el criterio establecido:
	//Devuelve true si tiene >5 numeros, >2 mayusculas y >1 minuscula
	public boolean esFuerte() {
		
		int upperC=0, numbers=0, lowerC=0;
		String password = this.getContrase�a();
		
		for (int i = 0; i < this.getLongitud(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c)) upperC++;
			if (Character.isDigit(c)) numbers++;
			if (Character.isLowerCase(c)) lowerC++;
		}
		if (upperC > 2 && numbers > 5 && lowerC > 1) return true;
		return false;
	}
	public static void main(String[] args) {

		//solicita cantidad de contrase�as
		System.out.println("Cuantas contrase�as quieres generar?");
		int n = sc.nextInt();
		// Genera los arrays
		boolean[] checks = new boolean[n];
		Password[] passwords = new Password[n];
		//Solicita la loncitud de la contrase�a
		System.out.println("De que longitud ser�n?");
		int longitud = sc.nextInt();
		//Genera la contrase�a y comprobaciones y las almacena en los arrays a la vez que los muestra por pantalla
		for (int i=0; i<n ; i++) {
			passwords[i] = new Password(longitud);
			checks[i] = passwords[i].esFuerte();
			System.out.println("Password: " + passwords[i].getContrase�a() + "  >> segura = " + checks[i]);
		}

	}

}
