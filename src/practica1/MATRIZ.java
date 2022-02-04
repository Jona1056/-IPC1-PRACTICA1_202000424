
package practica1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MATRIZ {
     
     static  int a =0;
     static int b = 0;
     static int c = 0;
     static int fila = 0;
     static int columna =0;
     static String nombre = "";
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
        System.out.println("INGRESE EL TAMAÑO DE SU TABLERO"); 
        System.out.print("numero de filas: ");
        fila = entrada.nextInt();
        System.out.print("numero de columnas: ");
        columna = entrada.nextInt();
        
        do{
        System.out.print("INGRESE CANTIDAD DE COMIDA: " + "[0 - " + formato1.format(((fila*columna)*0.4)-0.5) + "]: ");
        a = entrada.nextInt();
        if(  a >(fila*columna)*0.40){
        System.out.println("ERROR, LIMITE INCORRECTO");
        } }   while(a > (fila*columna)*0.40 );
    
        do{
        System.out.print("INGRESE CANTIDAD DE PAREDES: " + "[0 - " + formato1.format(((fila*columna)*0.2)-0.5) + "]: ");
        b = entrada.nextInt();
        if(  b>(fila*columna)*0.20){
        System.out.println("ERROR, LIMITE INCORRECTO");
        } }while(b>(fila*columna)*0.20);
        
        do{
        System.out.print("INGRESE CANTIDAD DE TRAMPAS: " + "[0 - " + formato1.format(((fila*columna)*0.2)-0.5) + "]: ");
        c = entrada.nextInt();
        if(  c>(fila*columna)*0.20){
        System.out.println("ERROR, LIMITE INCORRECTO");
        }}while(c>(fila*columna)*0.20);
        
        System.out.println("");
     
    
 
           Matrizllena.TABLERO();
          }catch(InputMismatchException e){
        }}}
 