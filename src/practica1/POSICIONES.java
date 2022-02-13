
package practica1;


import java.util.Scanner;

import static practica1.MATRIZ.Pos;
import static practica1.MATRIZ.columna;
import static practica1.MATRIZ.fila;
import static practica1.llenadoMatriz.Matriz;
import static practica1.llenadoMatriz.columnapacman;
import static practica1.llenadoMatriz.filapacman;
import static practica1.llenadoMatriz.posPacman;
import static practica1.llenadoMatriz.puntos;
import static practica1.llenadoMatriz.vidas;


/**
 *
 * @author Jonatan Garcia
 */
public class POSICIONES {
    Scanner entrada = new Scanner(System.in);
  static String Top [] = new String [12];//VARIABLE PARA NOMBRES
   static int FRUTAS[]= new int [12]; //FRUTAS
         static  int TOP = 1;
   static int a= 1;
   static String b = "";
    public static void Tabla (){
        if(MATRIZ.nombre == ""){
            System.out.println("");
            System.out.println("-------------------");
           System.out.println("AUN NO HAY JUGADORES");
            System.out.println("-------------------");
            System.out.println("");
      
       
        }else if(PRACTICA1.cont == 0){
            System.out.println("");
            System.out.println("-------------------");
           System.out.println("AUN NO HAY JUGADORES");
            System.out.println("-------------------");
            System.out.println("");
        }if (PRACTICA1.cont ==1){
                System.out.println("");
                System.out.println("--------------");
                System.out.println("TOP 10");
                System.out.println("");
                System.out.println("1. " + Top[1] + " " + FRUTAS[1]);
                   System.out.println("--------------");
                System.out.println("");
            }
        
       
        
       
   
         if(PRACTICA1.cont <11){
      if(PRACTICA1.cont>=2 ){
    for(int i = 1; i<=PRACTICA1.cont; i++){
            for(int j = 1; j<=PRACTICA1.cont; j++){
               
                
                
                if(FRUTAS[j] > FRUTAS[j+1]){
                  
                            }else if (FRUTAS[j] < FRUTAS[j+1]){
                      a = FRUTAS[j+1];
                    FRUTAS[j+1] = FRUTAS[j];
                    FRUTAS[j] = a;
                    
                    b = Top[j+1];
                    Top[j+1] = Top[j];
                    Top[j] = b;
                }else if(FRUTAS[j] ==FRUTAS[j+1]){
                    
                }
                
                
                
            }
   
           } 
           int va = 1;
           System.out.println("--------------");
           System.out.println("TOP 10");
            System.out.println("");
        for(int  i = 1; i<=PRACTICA1.cont; i++){
        
     System.out.println(va + ". " + Top[i] +  " - " + FRUTAS[i]);
         
          va++;
     
        }
       System.out.println("--------------");
            System.out.println("");
        
      
  
    }
       
       
         }else{
             int va = 1;
        for(int  i = 1; i<11; i++){
        
     System.out.println(va + ". " + Top[i] +  " - " + FRUTAS[i]);
         
          va++;
     
        }
         }
        
        
           
            
         
            
 
    
        }
         
          
public boolean validacion(){
    
    try{
 do{
        System.out.print(  "INGRESE EL TAMAÑO DE SU TABLERO (FILAS[5-25], COLUMNAS[5-25]): "); 
        Pos = entrada.nextLine();
        String []datos = Pos.split(",");
         fila = Integer.parseInt(datos[0]);
    
        columna = Integer.parseInt(datos[1]);
          if(fila <5 ){
            System.out.println("El tablero no puede conterner filas tan pequeñas");
        }else if(columna<5){
               System.out.println("El tablero no puede contener columnas tan pequeñas");
        }
            else if(fila >25 ){
            System.out.println("El tablero no puede contener filas tan pequeñas");
        }else if(columna>25){
            System.out.println("El tablero no puede contener columnas tan grandes");
        }
 
 }while(fila<5|| columna <5 ||fila >25 || columna >25);
            return true;
    }
    
     catch(Exception e){
       return false;
}}

public boolean VALIDAR(){
    try{
     
      do{
         vidas = 3;
         puntos = 0;
     System.out.println("------------------");
     System.out.print("INGRESE LA POSICION DE EL PACMAN; (FILAS(1 - "+ fila + ")" + "(COLUMNAS(1 - " + columna + ")"); 
     posPacman = entrada.next();
     String []datos = posPacman.split(",");//se hace un split con una coma

    
    
   
      filapacman = Integer.parseInt(datos[0]);
      columnapacman = Integer.parseInt(datos[1]);
        if(filapacman >fila || columnapacman > columna){
           System.out.println("la fila o columna que ingreso no existe");
       }
      }while(filapacman>fila || columnapacman> columna || filapacman == 0  );
     
      return true;
 
       
    } catch(Exception e){
       return false;
}
        
}
}


    
     
    


 
    

