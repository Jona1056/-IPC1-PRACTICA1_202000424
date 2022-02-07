
package practica1;

import java.util.Random;
import static practica1.MATRIZ.columna;
import static practica1.MATRIZ.fila;

/**
 *
 * @author Jonatan Garcia
 */
public class llenadoMatriz {
 static int marcofila = 0;
      public String[][] TABLERO(){
          
     
       Random random = new Random();
     
       //LLENADO DE MATRIZ
       int contadorfrutas = 0;
       int contadorparedes= 0;
       int marcofila = fila + 2;//le agregamos 2 para el marco, 1 que es la primera fila y la ultima y asi no se altera el numero de filas y columnas que pidio el usuario
       int marcocolumna = columna + 2;
         String Matriz[][] = new String[marcofila][marcocolumna];
       for(int i = 0; i<marcofila; i++){
           for(int j = 0; j <marcocolumna; j++){
           if(i == 0 || i== fila+1){//delimita las columnas para el marco
             Matriz[i][j] = "-";
           }else if (j == 0 || j == columna+1){
               Matriz[i][j]= "|";
           }else
               Matriz[i][j]= " ";
           if((i ==fila && (j==columna))){//ponemos el if para que no se repita con el bucle el do, ya que si no podemos algo que restringa el numero de columnas y filas no nos imprime
           
               
               //IMPRESION DE FRUTAS
               if(MATRIZ.frutas ==0){
               
               // SI EL USUARIO PIDE 0 FRUTAS NO HACE NI UNA ACCINO
            }else{
               do{ //COMIENZA ACCION DE GENERAR FRUTAS AL AZAR
                   int tipodefruta = random.nextInt(2);// GUARDAMOS EN UNA VARIABLE QUE NOS DE NUMEROS DE 0 A 1
                   if(tipodefruta == 0){ // SI LA VARIABLE ES IGUAL A 0 IMPRIMIRA  @
                   int x = random.nextInt(fila + 1 ); 
                   int y = random.nextInt(columna + 1 ); 
                   if(Matriz[x][y] != " "){ // SI EN LA POSICICON RANDOM QUE NOS DIO ES DIFERENTE DE ESPACIO EN BLANCO NO HACE NADA
                       
                   }else{ // DE LO CONTRARIO IMPRIMIRA UN @
                       Matriz[x][y]= "@"; 
                       contadorfrutas++; // se suma el contador de frutas para el mientras que se encuentra mas abajo
                   }
                   }
                   if(tipodefruta==1){ // si el numero random que salio es igual a 1 imprimira @ esto para que los tipos de frutas sean aleatorios
                      int x = random.nextInt(fila); // guardamos valores random
                   int y = random.nextInt(columna);
                   if(Matriz[x][y] != " "){ // si en las posiciones random es diferente de "" no hace nada
                       
                   }
                   else if(Matriz[x][y] == "@"){ // si en la posicion donde ya hay una fruta de otro tipo, esta no imprimire nada
                       
                      
                   }else{
                       Matriz[x][y]= "?";// imprime ? hasta que encuentre una posocion que que no tenga @
                       contadorfrutas++; // se aumenta el contador de frutas
                   }
                   }
               }while(contadorfrutas<MATRIZ.frutas); // todo el proceso anterior se hace mientras el contador de frutas sea menor al numero de frutas que pidio el usuario
               }
               
               
               // IMPRESION DE PAREDES
               do{// repetimos el proceso pero ahora para paredes
                   
                   
                   int x = random.nextInt(fila);
                   int y = random.nextInt(columna);
                   if(Matriz[x][y] != " " ){
                       
                   }else if(Matriz[x][y] == "@" || Matriz[x][y] == "?"){
                       
                      
                   }else{
                       Matriz[x][y] = "#";
                       contadorparedes++;
                   }
                       
                       
               }while(contadorparedes<MATRIZ.paredes);
           }
       }
       }
            
     
   
//imprimir matriz
    System.out.println("JUGADOR: "+ MATRIZ.nombre);
        
  for(int i = 0; i<marcofila; i++){
           for(int j = 0; j <marcocolumna; j++){
         System.out.print(Matriz[i][j] +"   ");
           }
           System.out.println("  ");
           }
   
  
  
        return null;// indicar que salimos del metodo
      
       
      } 
}