
package practica1;

/**
 *
 * @author Jonatan Garcia
 */
public class POSICIONES {
    
  static String Top [] = new String [10];
    static int nombres = 0;
    public static void Tabla (){
      System.out.println("--------------");
      System.out.println("TOP 10 PUNTEOS");
       Top[nombres] = MATRIZ.nombre;
        
        for(int i = 1; i <nombres; i++){
             
            System.out.println(i +  ". " + Top[nombres]);
            nombres++;
           
        }
        System.out.println("-------------");
    }
    
}
