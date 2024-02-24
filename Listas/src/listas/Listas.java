package listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAFS
 */
public class Listas {

    public static void main(String[] args) {

        // Crear una lista de Paises
        List<String> Paises = new ArrayList<>();
        Paises.add("Colombia");
        Paises.add("Francia");
        Paises.add("Japon");
        Paises.add("Marruecos");
        
        // Mostrar el contenido de la Lista recorriendola con un ciclo for
      System.out.println("Paises de manera original");
        for (String n: Paises) {            
            System.out.println("PAIS: " +n);
            
        }
       System.out.println("///");
        //Eliminar el pais en la posicion 3
        Paises.remove(3);
        // Mostrar el contenido de la Lista ahora que se elimina un pais.
         System.out.println("Paises luego de la eliminacion");
        for (String n: Paises) {
            
            System.out.println("PAIS: " +n);
        }
        
         System.out.println("///");
        //Modificar un pais
         String NuevoPais = "USA";
         Paises.set(2, NuevoPais);
         
         //Mostrar el contenido de la Lista ahora con la modificacion
         System.out.println("Paises luego de la modificacion");
         for (String n : Paises) {
            
             System.out.println("PAIS:" +n);
        }
         
    }
    
}
