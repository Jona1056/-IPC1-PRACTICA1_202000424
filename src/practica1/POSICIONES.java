
package practica1;

import java.util.InputMismatchException;
import java.util.Scanner;
import static practica1.MATRIZ.Pos;
import static practica1.MATRIZ.columna;
import static practica1.MATRIZ.fila;

/**
 *
 * @author Jonatan Garcia
 */
public class POSICIONES {
    Scanner entrada = new Scanner(System.in);
  static String Top [] = new String [11];//VARIABLE PARA NOMBRES
   static int FRUTAS[]= new int [11]; //FRUTAS
         static  int TOP = 1;
   static int a= 1;
    public static void Tabla (){
        if(MATRIZ.nombre == ""){
            System.out.println("");
            System.out.println("-------------------");
           System.out.println("AUN NO HAY JUGADORES");
            System.out.println("-------------------");
            System.out.println("");
      
       
        }else if(PRACTICA1.cont == 1){
            System.out.println("");
            System.out.println("-------------------");
           System.out.println("AUN NO HAY JUGADORES");
            System.out.println("-------------------");
            System.out.println("");
        }else if(PRACTICA1.cont<11){
    
            System.out.println("");
            System.out.println("--------------");
            System.out.println("TOP 10 ");
            System.out.println("");
  
            
            
           for(int i = 1; i<PRACTICA1.cont; i++){
            for(int j = 1; j<PRACTICA1.cont-1; j++){
                if(FRUTAS[j-1] < FRUTAS[j]){
                    a = FRUTAS[j-1];
                    FRUTAS[j-1] = FRUTAS[j];
                    FRUTAS[j] = a;
                      
                }
                
            }
   
           } 
        for(int  i = 1; i<PRACTICA1.cont; i++){
     System.out.println(i + ". " + Top[i] +  " - " + FRUTAS[i]);
         
          
        }
       System.out.println("--------------");
            System.out.println("");
      
        
    
        }
      
    }
    
 
    
}
