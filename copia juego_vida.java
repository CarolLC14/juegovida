import java.util.Scanner;
public class juegodelavida {
Scanner entrada= new Scanner (System.in);
		public static void main(String[] args) {
			
			juegodelavida p= new juegodelavida();
			p.principal();
			}
			
			public void principal() {
				
				//pedir info
				
				System.out.println("¿Cuantas filas quieres en el tablero?");
				int fila= scanner();
				System.out.println("¿Cuántas columnas quieres en el tablero?");
				int col= scanner();
				System.out.println("Introduce el num de grupos de células iniciales:");
				int grup= scanner();
				
				//inicializar arrays
				
				int [][] tablero_uno= new int [fila][col];
				int [][] tablero_dos= new int [fila][col];
				
				//filas y columnas random
				
				int fila_random=(int)(Math.random()*(1+tablero_uno.length));
				int col_random=(int)(Math.random()*(1+tablero_uno.length));	
				}
			//scanner
			public int scanner() {
				int num;
				num=entrada.nextInt();
				return num;
			}
			
			 
}
