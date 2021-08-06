package MyExceptions;
import MyExceptions.MyException;

public class MyException extends Exception {
 
	private int code;
	
	public MyException(int code) {
		super();
		this.code = code;
	}
	
	public MyException() {
		super();
	}
	@Override
	public String getMessage() {
		
		String msg="";
		
		switch(code) {
		case 1:
			msg = "El numero generado es un numero impar";
			break;
		case 2:
			msg = "El numero generado es un numero par";
			break;
		case 3:
			msg= "My excepcion personalizada de codigo 3";
			break;
		case 4: //Ej4 - operador invalido
			msg = "Operador no reconocido";
		}
	
		
		return msg;
		
	}
} 
