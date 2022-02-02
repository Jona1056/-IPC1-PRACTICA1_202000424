

package practica1;

import java.util.Scanner;


public class PRACTICA1 {

 
    public static void main(String[] args) {
      int OPCION;
      
        Scanner entrada = new Scanner(System.in);
      
    
  do{ System.out.println(""); //hacer que se repita el mensaje 
      System.out.println("PACMAN - IPC - 2022");
       System.out.println("-------------------");
       System.out.println("1.    INICIAR JUEGO");
       System.out.println("2. TABLA POSICIONES");
       System.out.println("3.            SALIR");
       System.out.println("-------------------");
       System.out.println("  ELIGA UNA OPCION ");
      System.out.println("");
   OPCION= entrada.nextInt();// //GUARDAR LA VARIABLE OPCION 
  }while(OPCION > 3 || OPCION == 0   );//SI LA VARIABLE OPCION CUMPLE CON ESTAS CONDICIONES, terminara el ciclo
  
  switch(OPCION){
      case 1:
      MATRIZ MATRIZ1 = new MATRIZ();//CREAMOS UN NUEVO OBJETO DESDE LA CLASE MATRIZ
      MATRIZ1.Matriz(); //MANDAMOS A LLAMAR LA CLASE MATRIZ 
      break;
      case 2:
      System.out.println("hola mundo");
      break;
      case 3:
      System.out.println("!!!!!GRACIAS POR JUGAR!!!!!!!!");
      System.exit(0);//OPCION PARA TERMINAR EL JUEGO
  }
    }}


