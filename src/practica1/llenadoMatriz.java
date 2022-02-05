
package practica1;

import java.util.Random;
import static practica1.MATRIZ.columna;
import static practica1.MATRIZ.fila;

/**
 *
 * @author Jonatan Garcia
 */
public class llenadoMatriz {
 
      public String[][] TABLERO(){
          
       int[][] TableroID = new int[fila][columna];//dimensiones del tablero
       String[][] Tablero = new String[fila][columna];//Tablero para el pacman y 
       Random random = new Random();

            
            
     int NR = 0;
   
//imprimir matriz
    System.out.println("JUGADOR: "+ MATRIZ.nombre);
    System.out.println("----------------------------");
    int c = 0;
    for(int i = 0; i <TableroID.length; i++){ 
        for(int j = 0; j<TableroID[0].length;j++){  
            
        
            do{
                i = random.nextInt(fila);
                j = random.nextInt(columna);
               if(Tablero[i][j] ==" #"){
                   
               }else
           
                    Tablero[i][j] = "@ ";
                    System.out.print(Tablero[i][j]);
         
                c++;
            }while(c==MATRIZ.a);
                        }
        System.out.println("");
        }
    
    System.out.println("----------------------------");
    //
        return null;// indicar que salimos del metodo
      
}
}