
package practica1;

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
       
      //llenado de la matriz
      int x = fila*columna;// guardamos en la variable x el numero total espacios en el tablero
      for(int i = 0; i<TableroID.length; i++){
        for(int j = 0 ; j>TableroID[0].length; j++){//
            TableroID[i][j] = x;//guarda el numero de espacios que habran en el tablero
            x--;
        }
    }//imprimir matriz
    System.out.println("----------------------------");
    int c = 0;
    for(int i = 0; i <TableroID.length; i++){ 
        for(int j = 0; j<TableroID[0].length;j++){
           
            System.out.print(c +  " ");
            c++;
            }
        System.out.println("");
    }
    System.out.println("----------------------------");
    //
        return null;// indicar que salimos del metodo
      
}
}