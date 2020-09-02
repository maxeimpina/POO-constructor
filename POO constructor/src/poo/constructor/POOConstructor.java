/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.constructor;

/**
 *1- Crear una clase Persona que tenga…

1-1 Constructor por defecto.   FALTA

1-2 Constructor que reciba DNI.   FALTA
1- 3 Constructor que reciba DNI, Nombre.  FALTA
1-4 Constructor que reciba DNI, Nombre y Apellido.
1-5 Método que muestre todos los datos de la persona.
*
2- En el main crear 4 personas donde cada una use un constructor distinto.
3- Mostrar los datos de todas.
 * 
 */
public class POOConstructor {

    public static void main(String[] args) {

    String separador="------------------------------------------------------";   
    
    
    identidad persona1, persona2, persona3, persona4,persona5;   
  
                    /*
    se sobrecarga el constructor
    asi de esta manera al instanciarla 
    los objetos de la clase ya estan cargados
                   */
                    
    persona1 = new identidad ();                   
    persona2 = new identidad (22666999);            
    persona3 = new identidad (38999523,"roberto"); 
    persona4 = new identidad (11113369,"mama","cora");
    persona5 = new identidad (2332132,"beto","casela",22);
    
    System.out.println(separador);
    System.out.println("Los datos de la primera persona son:");
    persona1.mostrar();
    System.out.println(separador);
    
    System.out.println("Los datos de la segunda persona son:");
    persona2.mostrar(); 
    System.out.println(separador);

    System.out.println("Los datos de la tercera persona son:");
    persona3.mostrar(); 
    System.out.println(separador);

    System.out.println("Los datos de la cuarta persona son:");
    persona4.mostrar(); 
    System.out.println(separador);

    System.out.println("Los datos de la quinta persona son:");
    persona5.mostrar(); 
    System.out.println(separador);

    }
    
}
