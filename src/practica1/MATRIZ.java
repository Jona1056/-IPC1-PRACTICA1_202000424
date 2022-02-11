
package practica1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MATRIZ {
  
   static int num = 1;
   static     int selecjugador = 0;
   static  String []datos = new String[1];
              
     static String ficha = "";
     static  int frutas =0;
     static int paredes = 0;
     static int trampas = 0;
     static int fila = 0;
     static int columna =0;
     static String nombre = "";
     static String Pos="";
     public static void Matriz(){
         DecimalFormat formato1 = new DecimalFormat("#");
        llenadoMatriz Matrizllena = new llenadoMatriz();
        Scanner entrada = new Scanner(System.in);
     try{
        do{
         System.out.println("");
        System.out.print("INGRESE SU NOMBRE: ");
        nombre = entrada.nextLine(); 
      
       
        if(nombre == ""   ){
            System.out.print("POR FAVOR, ");
        }}while(nombre == ""   );
        
      
        System.out.println("");
        System.out.println("------------------");
        System.out.println("BIENVENIDO "+nombre );
        System.out.println("PACMAN............");
        
        
        
        POSICIONES VAL = new POSICIONES(); //mandamos a llamar el metodo booleano que nos ayuda a que el programa no compile si el usuario ingresa un dato mal
        
       do{
        
           
       }while(VAL.validacion() == false);// si la validacion es falsa, se repetira hasta que se vuelva verdadera
     
       
    
         do{
         System.out.print("SELECCIONE JUGADOR " + "[0 - 9]" + "[♥,♦,◙,♣,◘,♠,▼,♪,♫,☺]");
      
         selecjugador = entrada.nextInt();
         if(selecjugador == 0){
         ficha = "♥";
         }else if(selecjugador == 1){
         ficha = "♦";
         }else if(selecjugador == 2){
         ficha = "◙";
         }else if(selecjugador == 3){
         ficha = "♣";
         }else if(selecjugador == 4){
         ficha = "◘";
         }else if(selecjugador ==5){
         ficha = "♠";
         }else if(selecjugador ==6){
          ficha = "▼";
         }else if (selecjugador == 7){
           ficha = "♪";
         }else if (selecjugador ==8){
          ficha = "♫";
         }else if (selecjugador == 9){
             ficha = "☺";
         }else{
             System.out.println("eliga una opcion correcta");
         }
         }while(selecjugador > 9);
        int limitedefrutas = (int) ((fila*columna)*0.4);
        int limiteparedes = (int) ((fila*columna*0.2));
        int limitetrampas = (int)  ((fila*columna)*0.2);
        do{
        System.out.print("INGRESE CANTIDAD DE COMIDA: " + "[1 - " + limitedefrutas + "]: ");
        frutas = entrada.nextInt();
        if(  frutas > limitedefrutas){
        System.out.println("ERROR, LIMITE INCORRECTO");
        }else if (frutas == 0){
            System.out.println("No se permite 0 Frutas en el tablero");
        }  }   while(frutas > limitedefrutas || frutas == 0);
    
        do{
        System.out.print("INGRESE CANTIDAD DE PAREDES: " + "[1 - " + limiteparedes + "]: ");
        paredes = entrada.nextInt();
        if(  paredes> limiteparedes){
        System.out.println("ERROR, LIMITE INCORRECTO");
        } else if (paredes == 0){
            System.out.println("No se permite 0 Paredes en el tablero");
        }
        }while(paredes>limiteparedes || paredes ==0);
        
        do{
        System.out.print("INGRESE CANTIDAD DE TRAMPAS: " + "[1 - " + limitetrampas + "]: ");
        trampas = entrada.nextInt();
        if(  trampas> limitetrampas ){
        System.out.println("ERROR, LIMITE INCORRECTO");
        }else if (trampas == 0){
            System.out.println("No se permite 0 Trampas en el tablero");
        }
        }while(trampas>limitetrampas || trampas == 0);
        
        System.out.println("");
     
           Matrizllena.TABLERO();
     }catch(InputMismatchException e){

   }
   
          }}
 