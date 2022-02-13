

package practica1;


import java.util.InputMismatchException;
import java.util.Scanner;


public class PRACTICA1 {
static int OPCION = 0;
static int cont = 0;
 
    public static void main(String[] args) {
  
       Scanner entrada = new Scanner(System.in);
       boolean salir = false; //dato para guardar el metodo de salir, lo ponemos false
       while(!salir){
       System.out.println(""); //hacer que se repita el mensaje 
       System.out.println("PACMAN - IPC - 2022");
       System.out.println("-------------------");
       System.out.println("1.    INICIAR JUEGO");
       System.out.println("2. TABLA POSICIONES");
       System.out.println("3.            SALIR");
       System.out.println("-------------------");
       System.out.print  ("ELIGA UNA OPCION...");

   
       try{// metodo para que no nos salga un error y si lo hay que vaya al catch
       OPCION= entrada.nextInt();// //GUARDAR LA VARIABLE OPCION 
       switch(OPCION){
  
       case 1:
   
         
       System.out.println("-------------------");
       MATRIZ MATRIZ1 = new MATRIZ();
       MATRIZ1.Matriz();
     
      break;
      case 2:
      POSICIONES pos = new POSICIONES();
      pos.Tabla();
      break;
      case 3:
      System.out.println("!!!!!GRACIAS POR JUGAR!!!!!!!!");
      salir = true; //como es verdadero nos saca del juego
      
      break;
      }}catch(InputMismatchException e) {//envia un mensaje que queramos si no cumple alguna de las opciones que estaban anteriormente
 
       entrada.nextLine();//entrada para reconocer una letra y no sea infinito el bucle
        }
          }
        }
      }


