
package practica1;

import java.util.Scanner;

public class MATRIZ {
     static  int a =0;
     static int b = 0;
     static int c = 0;
     static String nombre = "";
    public static void Matriz(){
        Scanner entrada = new Scanner(System.in);
       
      
         System.out.println("INGRESE SU NOMBRE: " + nombre);
        nombre = entrada.nextLine();
        do{
          
         
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("   BIENVENIDO " + nombre);
        System.out.println("     PACMAN      ");
       
        System.out.print("INGRESE EL TAMAÑO DE SU TABLERO");
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
 