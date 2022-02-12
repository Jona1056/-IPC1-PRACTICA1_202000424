
package practica1;


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
      
       
        }else if(PRACTICA1.cont == 0){
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
  
            if (PRACTICA1.cont ==1){
                System.out.println("1. " + Top[1] + " " + FRUTAS[1]);
            }else if(PRACTICA1.cont==2){
            if(FRUTAS[1]>FRUTAS[2]){
            System.out.println("1. " + Top[1] + " " +FRUTAS[1]);
            System.out.println("2. " + Top[2] + " " + FRUTAS[2]);
        }else{
                System.out.println("1. " + Top[2] +  " " +FRUTAS[2]);
                 System.out.println("2. " + Top[1] + " " +  FRUTAS[1]);
            }}
            if(PRACTICA1.cont==3){
            if(FRUTAS[1]>FRUTAS[2] && FRUTAS[2]>FRUTAS[3]){
            System.out.println("1. " + Top[1] + " " +FRUTAS[1]);
            System.out.println("2. " + Top[2] + " " + FRUTAS[2]);
            System.out.println("3. " + Top[3] + " " + FRUTAS[3]);
        }else if(FRUTAS[3]>FRUTAS[1] && FRUTAS[2]>FRUTAS[1]){
                System.out.println("1. " + Top[3] +  " " +FRUTAS[3]);
                System.out.println("2. " + Top[2] + " " +  FRUTAS[2]);
                System.out.println("3. " + Top[1] + " " +  FRUTAS[1]);
            }else if(FRUTAS[2]>FRUTAS[1] && FRUTAS[1]>FRUTAS[3]){
                System.out.println("1. " + Top[2] +  " " +FRUTAS[2]);
                System.out.println("2. " + Top[1] + " " +  FRUTAS[1]);
                System.out.println("3. " + Top[3] + " " +  FRUTAS[3]);
        }else if(FRUTAS[2]>FRUTAS[3] && FRUTAS[3]>FRUTAS[1]){
                System.out.println("1. " + Top[2] +  " " +FRUTAS[2]);
                System.out.println("2. " + Top[3] + " " +  FRUTAS[3]);
                System.out.println("3. " + Top[1] + " " +  FRUTAS[1]);
            }else if(FRUTAS[1]>FRUTAS[3] && FRUTAS[3]>FRUTAS[2]){
                 System.out.println("1. " + Top[1] +  " " +FRUTAS[1]);
                System.out.println("2. " + Top[3] + " " +  FRUTAS[3]);
                System.out.println("3. " + Top[2] + " " +  FRUTAS[2]);
            }else if(FRUTAS[3]>FRUTAS[1] && FRUTAS[1]>FRUTAS[2]){
                 System.out.println("1. " + Top[3] +  " " +FRUTAS[3]);
                System.out.println("2. " + Top[1] + " " +  FRUTAS[1]);
                System.out.println("3. " + Top[2] + " " +  FRUTAS[2]);
            } 
            
            
         
            
 
    
        }else if(PRACTICA1.cont>3){
         
           for(int i = 1; i<PRACTICA1.cont; i++){
            for(int j = 1; j<PRACTICA1.cont-1; j++){
               
                
                
                if(FRUTAS[j-1] < FRUTAS[j]){
                    a = FRUTAS[j-1];
                    FRUTAS[j-1] = FRUTAS[j];
                    FRUTAS[j] = a;
                            }
                
                
            }
   
           } 
           int va = 1;
        for(int  i = PRACTICA1.cont; i>=1; i--){
        
     System.out.println(va + ". " + Top[i] +  " - " + FRUTAS[i]);
         
          va++;
     
        }
       System.out.println("--------------");
            System.out.println("");
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

}


    
     
    


 
    

