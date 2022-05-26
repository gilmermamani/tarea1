package subprogramas;

public class Persona {
    String nombre="Gilmer";
    String dni="77077378";
    int edad;
    char genero;

    public void comer(String alimento) {
        System.out.println(nombre + " come " + alimento+" y su DNI es:"+dni);
        
    }

    public void estudiar(String curso) {
        System.out.println(nombre+" estudia el curso de"+curso);
        
    }
    
}
