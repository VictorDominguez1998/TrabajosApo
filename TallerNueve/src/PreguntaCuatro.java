import java.util.Scanner;
public class PreguntaCuatro {
	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;
	 public void puntoscuatro () {
		 
		 Scanner digite = new Scanner(System.in);
		 
		 
		 /* A.	Un error de sintaxis.

		 int lado;
		 int areacuadrado;
		 System.out.println("ingrese el lado de este cuadrado: ");
		 lado = digite.nextInt();
		 areacuadrado= lado * lado;
		 System.out.println("el area del cuadrado es: ");
		 System.out.println(AreaCuadrado);
		 */
		 
		 //B.	Un error lógico.
		 int lado1;
		 int areacuadrado1;
		 System.out.println("ingrese el lado de este cuadrado: ");
		 lado1 = digite.nextInt();
		 areacuadrado1= lado1 * lado1 * lado1;
		 System.out.println("el area del cuadrado es: ");
		 System.out.println(areacuadrado1);
		 
		 
		 /*C. Una excepción.
		 System.out.println("No he hecho la división");
		 division = numerador / denominador;
		 System.out.println("Despues de hacer la división");
		 */
		 
		 
		 
	 }
		

}
