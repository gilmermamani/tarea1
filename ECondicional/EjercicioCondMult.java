package ECondicional;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/**
 * EjercicioCondMult
 */
public class EjercicioCondMult {
    public static void profesor() {
     System.out.println("la funcion del docente es enseñar");   
    }
    public static void estudiante() {
      System.out.println("la funcion del estudiante es aprender");  
    }
    public void maquinaPC() {
      System.out.println("la funcion de la PC es procesar informacion");  
    }
    public static void proyector() {
      System.out.println("proyectar una imagen , informacion");  
    }

    public static void main(String[] args) {
       EjercicioCondMult objx=new EjercicioCondMult();

       Scanner lt=new Scanner(System.in);
       System.out.println("ingrese el algoritmo que desea probar\n1=Profesor"+
       "\n2=Estudiante\n3=Maquina\n4=Proyector");
       int opcMET=lt.nextInt();

       switch (opcMET) {
           case 1:{profesor();} break;
           case 2: estudiante(); break;
           case 3: objx. maquinaPC(); break;
           case 4: objx.proyector(); break;
       
           default: System.err.println( "Opcion no existe"); break;
       }
    }
}