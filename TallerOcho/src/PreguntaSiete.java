import java.util.Scanner;
public class PreguntaSiete {
	public void promedioestudiantes() {
	int totalnotas = 0;
	int total = 0;
	double promedio = 0;
	Scanner dig = new Scanner (System.in);
		
		int notas [] = new int [5];
		 for(int i = 0; i<notas.length;i++) {
		 System.out.println("ingrese la nota: ");
		 totalnotas= dig.nextInt();
			 
		 notas[i]= totalnotas;
		 total = total + notas[i];
		 }
		
			
		 for(int valor:notas) {
				System.out.println(valor);
		 }
			
		 promedio = total/5;
		 System.out.println("el promedio de las 5 notas es: " + promedio);
			
		} 
		 
	}	 
		 

