
package Clases;

/**
 *
 * @author Juan José
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 =  new Persona(); 
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegaeinformacion();
     
        Persona persona2 = new Persona();
        
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        
        persona2.desplegaeinformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegaeinformacion();
        
    }
    
}
