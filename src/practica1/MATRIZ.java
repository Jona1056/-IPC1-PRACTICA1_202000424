
package practica1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MATRIZ {
     
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
        System.out.println("INGRESE SU NOMBRE");
        nombre = entrada.nextLine();  
        if(nombre == ""   ){
            System.out.print("POR FAVOR, ");
        }}while(nombre == ""   );
   
        System.out.println("--------------------------------");
        System.out.println("******BIENVENIDO "+nombre+"*****");
        System.out.println("************PACMAN**************");
        System.out.print("INGRESE EL TAMAÑO DE SU TABLERO; (FILAS, COLUMNAS): "); 
        String Pos = entrada.next();
         String []datos = Pos.split(",");
          fila = Integer.parseInt(datos[0]);
         columna = Integer.parseInt(datos[1]);
            
        
        do{
        System.out.print("INGRESE CANTIDAD DE COMIDA: " + "[0 - " + formato1.format(((fila*columna)*0.4)-0.5) + "]: ");
        frutas = entrada.nextInt();
        if(  frutas >(fila*columna)*0.40){
        System.out.println("ERROR, LIMITE INCORRECTO");
        } }   while(frutas > (fila*columna)*0.40 );
    
        do{
        System.out.print("INGRESE CANTIDAD DE PAREDES: " + "[0 - " + formato1.format(((fila*columna)*0.2)-0.5) + "]: ");
        paredes = entrada.nextInt();
        if(  paredes>(fila*columna)*0.20){
        System.out.println("ERROR, LIMITE INCORRECTO");
        } }while(paredes>(fila*columna)*0.20);
        
        do{
        System.out.print("INGRESE CANTIDAD DE TRAMPAS: " + "[0 - " + formato1.format(((fila*columna)*0.2)-0.5) + "]: ");
        trampas = entrada.nextInt();
        if(  trampas>(fila*columna)*0.20){
        System.out.println("ERROR, LIMITE INCORRECTO");
        }}while(trampas>(fila*columna)*0.20);
        
        System.out.println("");
     
    
 
           Matrizllena.TABLERO();
           
          }catch(InputMismatchException e){
        }}}
 