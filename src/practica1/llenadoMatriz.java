
package practica1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static practica1.MATRIZ.columna;
import static practica1.MATRIZ.fila;
import static practica1.MATRIZ.num;
import static practica1.POSICIONES.Top;
import static practica1.PRACTICA1.cont;

/**
 *
 * @author Jonatan Garcia
 */

public class llenadoMatriz {
    static  String nombretop = "";
    boolean salir = false; //dato para guardar el metodo de salir, lo ponemos false
    static int filanueva = 0;
    static int columnanueva = 0;
    static int punto = 0;
    static int puntos = 0;
    static int vidas = 3;
    static int topfrutas = 1;
    static int seleccion=0;
    static int REPTRAMPA=0;
    static int marcofila = 0;
    static int filapacman= 0;
    static int columnapacman =0;
    static String posPacman = "";
    static String Matriz[][] = new String[marcofila][filapacman];
    public String[][] TABLERO(){
          
     
       Random random = new Random();
       try{ 
       //LLENADO DE MATRIZ
       Scanner entrada = new Scanner(System.in);
    
       int contadorfrutas = 0;
       int contadorparedes= 0;
       int contadortrampas = 0;
       int marcofila = fila + 2;//le agregamos 2 para el marco, 1 que es la primera fila y la ultima y asi no se altera el numero de filas y columnas que pidio el usuario
       int marcocolumna = columna + 2;
       String Matriz[][] = new String[marcofila][marcocolumna];
         
           //llenado de Matriz sin imprimir//
           for(int i = 0; i<marcofila; i++){
           for(int j = 0; j <marcocolumna; j++){
           if(i == 0 || i== fila+1){//delimita las columnas para el marco
           Matriz[i][j] = "-";
           }else if (j == 0 || j == columna+1){
           Matriz[i][j]= "|";
           }else
           Matriz[i][j]= " ";
           if((i ==fila && (j==columna))){//condicion para que cuando ya esten las filas y columnas creadas, empieze a llenar con las frutas, paredes y trmampas;
               
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
                      int x = random.nextInt(fila+1); // guardamos valores random
                   int y = random.nextInt(columna+1);
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
               if(MATRIZ.paredes == 0){// SI PAREDES SON 0 NO HACE NADA
               }else{
               do{// repetimos el proceso pero ahora para paredes
                   int x = random.nextInt(fila+1);
                   int y = random.nextInt(columna+1);
                   if(Matriz[x][y] != " " ){                       
                   }else if(Matriz[x][y] == "@" || Matriz[x][y] == "?"){                                           
                   }else{
                       Matriz[x][y] = "#";
                       contadorparedes++;
                   }               
               }while(contadorparedes<MATRIZ.paredes);
           }
               //IMPRESION DE TRAMPAS
           if(MATRIZ.trampas == 0){
               
           }else{
               do{
                   int x = random.nextInt(fila+1);
                   int y = random.nextInt(columna+1);
                   if(Matriz[x][y] != " "){
                       
                   }else if (Matriz[x][y] == "@" || Matriz[x][y] == "?" || Matriz[x][y] == "#" ){
                       
                   }else{
                       Matriz[x][y] = "X";
                   contadortrampas++;
                   }
           }while(contadortrampas < MATRIZ.trampas);
           }
           }
       }
       }
            
     
   
    //imprimir matriz solo con las parredes frutas y trmpas  
    System.out.println("JUGADOR: "+ MATRIZ.nombre);
        
           for(int i = 0; i<marcofila; i++){
           for(int j = 0; j <marcocolumna; j++){
           System.out.print(Matriz[i][j] +"   ");
           }
           System.out.println("  ");
           }
           System.out.println("");
  
POSICIONES POS = new POSICIONES(); 

 do{
        //que se repita el pos validar hasta que nos de un true//
           
       }while(POS.VALIDAR() == false);

 if(Matriz[filapacman][columnapacman] == "@" || Matriz[filapacman][columnapacman] == "?" || Matriz[filapacman][columnapacman] == "#" || Matriz[filapacman][columnapacman] == "X" ){
   System.out.println("La posicion que eligio ya esta ocupada");
     do{
        //que se repita el metodo validar si nos da una posicion que ya este ocupada//
           
       }while(POS.VALIDAR() == false);
 }else{
     
 }

    
  Matriz[filapacman][columnapacman] = MATRIZ.ficha ;
     
   System.out.println("");
    System.out.println("JUGADOR: "+ MATRIZ.nombre + "," +  " vidas: " +vidas + ", " + "Puntos: " + puntos   );
        
         for(int i = 0; i<marcofila; i++){
           for(int j = 0; j <marcocolumna; j++){
         System.out.print(Matriz[i][j] +"   ");
           }
           System.out.println("  ");
           }
             System.out.println("");
    
      
  do{    
 System.out.println("W = subir  S = Bajar  A = Izquierda  D = derecha");
 System.out.println("E = finalizar juego M= pausar juego");
           String movimiento = entrada.next();
     
switch(movimiento){
     // MOVIMIENTO DE PACMAN
        //Movimiento hacia arriba
  
        case "W" :
       
    if(REPTRAMPA ==1){//metodo para generar una trampa de nuevo, AL PRINCIPIO NO VA A ENTRAR A ESTE IF PERO SI CAE EN UNA X LA VARIABLE REPTRAPMA SE CONVERTIRA EN 1 Y HARA TODO LO SIGUIENTE
    REPTRAMPA = 0;
    if(Matriz[filapacman-1][columnapacman] == "@"){
              Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
               
              puntos = puntos +5;
             
               filapacman = filapacman-1;
              MATRIZ.frutas--;
           }
             else if(Matriz[filapacman-1][columnapacman]=="?"){
                 Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
               
               filapacman = filapacman-1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman-1][columnapacman] == " "){
               Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
               
               filapacman = filapacman-1;
          }else if(Matriz[filapacman-1][columnapacman] == "#"){
              
          }
       
          else if(Matriz[filapacman-1][columnapacman] == "X"){
              Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
             
              
               filapacman = filapacman-1;
            
              vidas--;
              REPTRAMPA = 1;
             
          
           
      } //MOVIMINETO DESDE ARRIBA HACIA LA PARTE DE ABAJO
          else if(Matriz[0][columnapacman]== "-"){
       if(Matriz[fila][columnapacman]== " "){
           Matriz[1][columnapacman] = "X";
              Matriz[fila][columnapacman] = MATRIZ.ficha;
              filapacman = fila;
                }
       
       else if(Matriz[fila][columnapacman] == "@"){
            Matriz[1][columnapacman] = "X";
             Matriz[fila][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = fila;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[fila][columnapacman]=="?"){
           Matriz[1][columnapacman] = "X";
             Matriz[fila][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = fila;
                puntos = puntos +10;
      }
      
       else  if(Matriz[fila][columnapacman]== "#"){
        }
       
     
       else  if(Matriz[fila][columnapacman]== "X"){
           Matriz[1][columnapacman] = "X";
           Matriz[fila][columnapacman] = MATRIZ.ficha;
           filapacman = fila;
            vidas--;
           REPTRAMPA = 1;
       }
          }     
        else {
              
          }
}else{
            
             if(Matriz[filapacman-1][columnapacman] == "@"){
              Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
               
              puntos = puntos +5;
             
               filapacman = filapacman-1;
              MATRIZ.frutas--;
           }
             
             
             else if(Matriz[filapacman-1][columnapacman]=="?"){
                 Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
               
               filapacman = filapacman-1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman-1][columnapacman] == " "){
               Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
               
               filapacman = filapacman-1;
          }else if(Matriz[filapacman-1][columnapacman] == "#"){
              
          }
          
          
       
          else if(Matriz[filapacman-1][columnapacman] == "X"){
              Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman-1][columnapacman] = MATRIZ.ficha;
             
              
               filapacman = filapacman-1;
            
              vidas--;
              REPTRAMPA = 1;
             
          
             
           
      } //MOVIMINETO DESDE ARRIBA HACIA LA PARTE DE ABAJO
          else if(Matriz[0][columnapacman]== "-"){
       if(Matriz[fila][columnapacman]== " "){
           Matriz[1][columnapacman] = " ";
              Matriz[fila][columnapacman] = MATRIZ.ficha;
              filapacman = fila;
                }
       
       else if(Matriz[fila][columnapacman] == "@"){
            Matriz[1][columnapacman] = " ";
             Matriz[fila][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = fila;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[fila][columnapacman]=="?"){
           Matriz[1][columnapacman] = " ";
             Matriz[fila][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = fila;
                puntos = puntos +10;
      }
      
       else  if(Matriz[fila][columnapacman]== "#"){
        }
       
     
       else  if(Matriz[fila][columnapacman]== "X"){
           Matriz[1][columnapacman] = " ";
           Matriz[fila][columnapacman] = MATRIZ.ficha;
           filapacman = fila;
            vidas--;
           REPTRAMPA = 1;
       }
          }     
        else {
              
          }
            
}
       
        break;
        
    //MOVIMIENTO HACIA ABAJO
        
    case "S":
        
        if(REPTRAMPA == 1){
            REPTRAMPA = 0;
            
             if(Matriz[filapacman+1][columnapacman] == "@"){
              Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
               
              puntos = puntos +5;
               
               filapacman = filapacman+1;
              MATRIZ.frutas--;
          }else if(Matriz[filapacman+1][columnapacman]=="?"){
                 Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
              
               filapacman = filapacman+1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman+1][columnapacman] == " "){
               Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
            
               filapacman = filapacman+1;
          }else if(Matriz[filapacman+1][columnapacman] == "#"){
              
          }
          
          
      
          else if(Matriz[filapacman+1][columnapacman] == "X"){
              Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
            
            REPTRAMPA = 1;
               filapacman = filapacman+1;
            vidas--;
           
      }
          
          //METODO MOVIMIENTO DE ABAJO PARA ARRIBA
          else if (Matriz[fila+1][columnapacman]=="-"){
              if(Matriz[1][columnapacman]== " "){
              Matriz[fila][columnapacman] = "X";
              Matriz[1][columnapacman] = MATRIZ.ficha;
              filapacman = 1;
          }
              
              else if(Matriz[1][columnapacman] == "@"){
            Matriz[fila][columnapacman] = "X";
             Matriz[1][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = 1;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[1][columnapacman]=="?"){
           Matriz[fila][columnapacman] = "X";
             Matriz[1][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = 1;
                puntos = puntos +10;
      }
      
       else  if(Matriz[1][columnapacman]== "#"){
        }
       
     
       else  if(Matriz[1][columnapacman]== "X"){
           Matriz[fila][columnapacman] = "X";
           Matriz[1][columnapacman] = MATRIZ.ficha;
           filapacman = 1;
  REPTRAMPA = 1;
            vidas--;
            
       }
              
          }
            
        }else{
        
        
          if(Matriz[filapacman+1][columnapacman] == "@"){
              Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
               
              puntos = puntos +5;
               
               filapacman = filapacman+1;
              MATRIZ.frutas--;
          }else if(Matriz[filapacman+1][columnapacman]=="?"){
                 Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
              
               filapacman = filapacman+1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman+1][columnapacman] == " "){
               Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
            
               filapacman = filapacman+1;
          }else if(Matriz[filapacman+1][columnapacman] == "#"){
              
          }
          
          
      
          else if(Matriz[filapacman+1][columnapacman] == "X"){
              Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman+1][columnapacman] = MATRIZ.ficha;
            
            REPTRAMPA = 1;
               filapacman = filapacman+1;
            vidas--;
           
      }
          
          //METODO MOVIMIENTO DE ABAJO PARA ARRIBA
          else if (Matriz[fila+1][columnapacman]=="-"){
              if(Matriz[1][columnapacman]== " "){
              Matriz[fila][columnapacman] = " ";
              Matriz[1][columnapacman] = MATRIZ.ficha;
              filapacman = 1;
          }
              
              else if(Matriz[1][columnapacman] == "@"){
            Matriz[fila][columnapacman] = " ";
             Matriz[1][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = 1;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[1][columnapacman]=="?"){
           Matriz[fila][columnapacman] = " ";
             Matriz[1][columnapacman] = MATRIZ.ficha;
               MATRIZ.frutas--;
               filapacman = 1;
                puntos = puntos +10;
      }
      
       else  if(Matriz[1][columnapacman]== "#"){
        }
       
     
       else  if(Matriz[1][columnapacman]== "X"){
           Matriz[fila][columnapacman] = " ";
           Matriz[1][columnapacman] = MATRIZ.ficha;
           filapacman = 1;
  REPTRAMPA = 1;
            vidas--;
            
       }    
          }
          
        }
      
        break;
    case "A":
        
        
        if(REPTRAMPA== 1){
              REPTRAMPA = 0;   
            if(Matriz[filapacman][columnapacman-1] == "@"){
              Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
               
              puntos = puntos +5;
           
               columnapacman = columnapacman-1;
              MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman-1]=="?"){
                 Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
            
               columnapacman= columnapacman-1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman-1] == " "){
               Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
           
               columnapacman = columnapacman-1;
          }else if(Matriz[filapacman][columnapacman-1] == "#"){
              
          }
          
   
          else if(Matriz[filapacman][columnapacman-1] == "X"){
              Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
            
         REPTRAMPA = 1;
               columnapacman = columnapacman-1;
           vidas--;
           //METODO PARA QUE SE VAYA DE IZQUIERDA A DERECHA SI HAY UNA X AHI
          }else if(Matriz[filapacman][0]=="|"){
          if(Matriz[filapacman][columna]== " "){
           Matriz[filapacman][1] = "X";
              Matriz[filapacman][columna] = MATRIZ.ficha;
              columnapacman = columna;
                }
       
       else if(Matriz[filapacman][columna] == "@"){
            Matriz[filapacman][1] = "X";
             Matriz[filapacman][columna] = MATRIZ.ficha;
               MATRIZ.frutas--;
              columnapacman = columna;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[filapacman][columna]=="?"){
           Matriz[filapacman][1] = "X";
             Matriz[filapacman][columna] = MATRIZ.ficha;
               MATRIZ.frutas--;
               columnapacman = columna;
                puntos = puntos +10;
      }
      
       else  if(Matriz[filapacman][columna]== "#"){
        }
       
     
       else  if(Matriz[filapacman][columna]== "X"){
           Matriz[filapacman][1] = "X";
           Matriz[filapacman][columna] = MATRIZ.ficha;
         columnapacman = columna;
            vidas--;
           REPTRAMPA = 1;
       }
          
            
       
          }else{
          
      }
   }   
        else{
        
    
         if(Matriz[filapacman][columnapacman-1] == "@"){
              Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
               
              puntos = puntos +5;
           
               columnapacman = columnapacman-1;
              MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman-1]=="?"){
                 Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
            
               columnapacman= columnapacman-1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman-1] == " "){
               Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
           
               columnapacman = columnapacman-1;
          }else if(Matriz[filapacman][columnapacman-1] == "#"){
              
          }
          
   
          else if(Matriz[filapacman][columnapacman-1] == "X"){
              Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman][columnapacman-1] = MATRIZ.ficha;
            
         REPTRAMPA = 1;
               columnapacman = columnapacman-1;
           vidas--;
           //METODO DE IZQUIERDA A DERECHA CON ESPACIOS VACIOS
          }else if(Matriz[filapacman][0]=="|"){
              
              if(Matriz[filapacman][columna]== " "){
           Matriz[filapacman][1] = " ";
              Matriz[filapacman][columna] = MATRIZ.ficha;
              columnapacman = columna;
                }
       
       else if(Matriz[filapacman][columna] == "@"){
            Matriz[filapacman][1] = " ";
             Matriz[filapacman][columna] = MATRIZ.ficha;
               MATRIZ.frutas--;
              columnapacman = columna;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[filapacman][columna]=="?"){
           Matriz[filapacman][1] = " ";
             Matriz[filapacman][columna] = MATRIZ.ficha;
               MATRIZ.frutas--;
               columnapacman = columna;
                puntos = puntos +10;
      }
      
       else  if(Matriz[filapacman][columna]== "#"){
        }
       
     
       else  if(Matriz[filapacman][columna]== "X"){
           Matriz[filapacman][1] = " ";
           Matriz[filapacman][columna] = MATRIZ.ficha;
         columnapacman = columna;
            vidas--;
           REPTRAMPA = 1;
       }
          
            
       
          }else{
          
      }
              
              
      
        }
        break;
    case "D":
        if (REPTRAMPA == 1){
            REPTRAMPA =0;
             if(Matriz[filapacman][columnapacman+1] == "@"){
              Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
               
              puntos = puntos +5;
            
               columnapacman = columnapacman+1;
              MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman+1]=="?"){
                 Matriz[filapacman][columnapacman] = "X";
               Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
          
               columnapacman= columnapacman+1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman+1] == " "){
               Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
           
               columnapacman = columnapacman+1;
          }else if(Matriz[filapacman][columnapacman+1] == "#"){
              
          }
          
          
    
          else if(Matriz[filapacman][columnapacman+1] == "X"){
              Matriz[filapacman][columnapacman] = "X";
              Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
            
            REPTRAMPA = 1;
               columnapacman = columnapacman+1;
               vidas--;
           
      }
          
          
          //METODO DE DERECHA A IZQUIERDA CON TRAMMPAS
          else if (Matriz[filapacman][columna+1]== "|"){
                if(Matriz[filapacman][1]== " "){
              Matriz[filapacman][columna] = "X";
              Matriz[filapacman][1] = MATRIZ.ficha;
              columnapacman = 1;
          }
              
              else if(Matriz[filapacman][1] == "@"){
            Matriz[filapacman][columna] = "X";
             Matriz[filapacman][1] = MATRIZ.ficha;
               MATRIZ.frutas--;
                columnapacman = 1;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[filapacman][1]=="?"){
           Matriz[filapacman][columna] = "X";
             Matriz[filapacman][1] = MATRIZ.ficha;
               MATRIZ.frutas--;
              columnapacman = 1;
                puntos = puntos +10;
      }
      
       else  if(Matriz[filapacman][1]== "#"){
        }
       
     
       else  if(Matriz[filapacman][1]== "X"){
           Matriz[filapacman][columna] = "X";
           Matriz[filapacman][1] = MATRIZ.ficha;
           columnapacman = 1;
  REPTRAMPA = 1;
            vidas--;
            
       }
          }else{
          
      }
        }else{
        
        
        
        
        
         if(Matriz[filapacman][columnapacman+1] == "@"){
              Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
               
              puntos = puntos +5;
            
               columnapacman = columnapacman+1;
              MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman+1]=="?"){
                 Matriz[filapacman][columnapacman] = " ";
               Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
          
               columnapacman= columnapacman+1;
               puntos = puntos+10;
                 MATRIZ.frutas--;
          }else if(Matriz[filapacman][columnapacman+1] == " "){
               Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
           
               columnapacman = columnapacman+1;
          }else if(Matriz[filapacman][columnapacman+1] == "#"){
              
          }
          
          
          //metodo para que aparezca de nuevo una trampa//
          else if(Matriz[filapacman][columnapacman+1] == "X"){
              Matriz[filapacman][columnapacman] = " ";
              Matriz[filapacman][columnapacman+1] = MATRIZ.ficha;
            
            REPTRAMPA = 1;
               columnapacman = columnapacman+1;
               vidas--;
           
      }
          
          //metodo de derecha a izquierda con espacios vacios
          
          else if (Matriz[filapacman][columna+1]== "|"){
               if(Matriz[filapacman][1]== " "){
              Matriz[filapacman][columna] = " ";
              Matriz[filapacman][1] = MATRIZ.ficha;
              columnapacman = 1;
          }
              
              else if(Matriz[filapacman][1] == "@"){
            Matriz[filapacman][columna] = " ";
             Matriz[filapacman][1] = MATRIZ.ficha;
               MATRIZ.frutas--;
                columnapacman = 1;
                puntos = puntos +5;
    }        
       
      
       else if(Matriz[filapacman][1]=="?"){
           Matriz[filapacman][columna] = " ";
             Matriz[filapacman][1] = MATRIZ.ficha;
               MATRIZ.frutas--;
              columnapacman = 1;
                puntos = puntos +10;
      }
      
       else  if(Matriz[filapacman][1]== "#"){
        }
       
     
       else  if(Matriz[filapacman][1]== "X"){
           Matriz[filapacman][columna] = " ";
           Matriz[filapacman][1] = MATRIZ.ficha;
           columnapacman = 1;
  REPTRAMPA = 1;
            vidas--;
            
       }
              
              
              
              
              
              
          }else{
          
      }
        
        }
        break;
        
    case "E":
     
        salir = true;
    
        break;
        
    case "M":
 
     do{
       System.out.println(""); //hacer que se repita el mensaje 
       System.out.println("   JUEGO PAUSADO   ");
       System.out.println("-------------------");
       System.out.println("1.   Reanudar Juego");
       System.out.println("2. TABLA POSICIONES");
       System.out.println("3.    SALIR PARTIDA");
       System.out.println("-------------------");
       System.out.print  ("ELIGA UNA OPCION...");
       System.out.println("");
        try{
      seleccion= entrada.nextInt();// //GUARDAR LA VARIABLE OPCION 
     if(seleccion == 1){
         
      }else if(seleccion ==2){
        POSICIONES pos = new POSICIONES();
      pos.Tabla();
          
      }else if (seleccion == 3){
          salir = true;
      }else{
          
      }
       
    }catch(InputMismatchException e){
    }
     }while(seleccion !=1 && seleccion !=3);
      
      
        break;
}
     
      System.out.println("");
    System.out.println("JUGADOR: "+ MATRIZ.nombre + "," +  " vidas: " +vidas + ", " + "Puntos: " + puntos + " " + "FRUTAS: " + MATRIZ.frutas   );
        
  for(int i = 0; i<marcofila; i++){
           for(int j = 0; j <marcocolumna; j++){
         System.out.print(Matriz[i][j] +"   ");
           }
           System.out.println("  ");
           }
  System.out.println("");
  
   
  
  } while(MATRIZ.frutas>0 && vidas>0 && !salir );

   System.out.println("------------------------------------------------");
   System.out.println("Sus Datos obtenidos fueron:");
   System.out.println("JUGADOR: "+ MATRIZ.nombre + "," +  " vidas: " +vidas + ", " + "Puntos: " + puntos   );
   System.out.println("------------------------------------------------");
   cont++;
   if(topfrutas <11){

   POSICIONES.FRUTAS[topfrutas] = puntos;
    topfrutas++;}else{
       
   }if(num <11){
      nombretop = MATRIZ.nombre;
      Top[num]= MATRIZ.nombre;
        num++;}else{
       
   }
   }catch(InputMismatchException e){

   }
   return null;// indicar que salimos del metodo
      } 
}