/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda7mo;

import java.util.Enumeration;

/**
 *
 * @author vicec
 */
public class Agenda7mo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda ag = new Agenda();
        Persona p = null;
        String d;

        if (ag.Agregar("123", "Messi", 125893)) {
            System.out.println("Agregado");
        } else {
            System.out.println("Clave repetida");
        }

        if (ag.Agregar("133", "Ronaldo", 126587)) {
            System.out.println("Agregado");
        } else {
            System.out.println("Clave repetida");
        }

        if (ag.Eliminar("1234")) {
            System.out.println("Eliminado");
        } else {
            System.out.println("No existe");
        }
        
        p = ag.Recuperar("123");

        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("No exixte el dni");
        }
        
        Enumeration<String> e = ag.Total();
        
        while(e.hasMoreElements()){
            d=e.nextElement();
            Persona per = ag.Recuperar(d);
            System.out.println(per.toString());
        }
        
        
    }
    
    

}
