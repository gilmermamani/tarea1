package EstRepetitivas;

import java.util.Scanner;

public class EjercicioR {

    public static void imprimirN1_10While(){
        int numInit=1;
      while (numInit<=10) {
          System.out.println(numInit);
          numInit=numInit+1;
          
      }  
        
    }
    public static void imprimirN1_10doWhile(){
        int numInit=1;
        do {
            System.out.print(numInit);
            numInit=numInit+1;
        } while (numInit<=10);
        
    }
    public static void imprimirN1_10for() {
        for (int numInit = 1; numInit <=10; numInit++) {
            System.out.println(numInit);
            
        }
        
    }

    public static void imprimirNombreVertical() {
        //DeclararVariables
        String nombre;
        //Datos de entrada
        System.out.println("Ingrese su nombre:");
        Scanner lt=new Scanner(System.in);
        nombre=lt.next();
        //Proceso y salida
        for (int i = 0;  i< nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
            
        }
        
    }



    public static void main(String[] args) {
        /*System.out.println("While");
        imprimirN1_10While();
        System.out.println("Do While");
        imprimirN1_10doWhile();
        System.out.println();
        System.out.println("for");
        imprimirN1_10for();*/
        imprimirNombreVertical();
    }
    
}
