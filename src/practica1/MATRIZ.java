
package practica1;

import java.util.Scanner;

public class MATRIZ {
     static  int a =0;
     static int b = 0;
     static int c = 0;
     static int fila = 0;
     static int columna =0;
     static String nombre = "";
     public static void Matriz(){
        
         Scanner entrada = new Scanner(System.in);
       
         int[][] TableroID = new int[fila][columna];//dimensiones del tablero
        String[][] Tablero = new String[fila][columna];//Tablero para el pacman y 
        
        
         System.out.println("INGRESE SU NOMBRE");
        nombre = entrada.nextLine();
        
        do{
          
         
       
        System.out.println("-----------------------------");
        System.out.println("    BIENVENIDO " + nombre);
        System.out.println("          PACMAN             ");
       
        System.out.println("INGRESE EL TAMAÑO DE SU TABLERO"); 
        System.out.println("numero de filas");
        fila = entrada.nextInt();
        System.out.println("numero de columnas");
        columna = entrada.nextInt();
        
        System.out.print("INGRESE CANTIDAD DE COMIDA: [0-20]:");
        a = entrada.nextInt();
        System.out.print("INGRESE CANTIDAD DE PAREDES: [0-13]:");
        b = entrada.nextInt();
        System.out.print("INGRESE CANTIDAD DE TRAMPAS: [0-10]");
        c = entrada.nextInt();
       System.out.println("");
      System.out.println(a);
      System.out.println(b);
        }while(a > 20   || b >13   || c >10);
        
      
            
        
    }
}
 