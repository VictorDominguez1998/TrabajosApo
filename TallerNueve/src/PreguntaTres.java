
	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class PreguntaTres {
	    public void catchs(){
	        Scanner digg = new Scanner(System.in);
	        try {
	            int num1, num2;
	            System.out.print("Ingrese primer valor entero (dividendo):");
	            num1 = digg.nextInt();
	            System.out.print("Ingrese segundo valor entero (divisor):");
	            num2 = digg.nextInt();
	            int resu = num1 / num2;
	            System.out.print("La división de " + num1 + " / " + num2 + " es " + resu);
	        } catch (InputMismatchException ex) {
	            System.out.println("Debe ingresar obligatoriamente números enteros");
	        } catch (ArithmeticException ex) {
	            System.out.println("No se puede dividir por cero");
	        }
	    }
	}

	/* El bloque try implementa la captura de la excepción 'InputMismatchException' que puede suceder en cualquiera de las dos llamadas al método 'nextInt' de la clase Scanner.
	También implementa la captura de la excepción 'ArithmeticException' que sucede si en la línea siguiente la variable num2 almacena un cero:

	    int resu = num1 / num2;
	    */


