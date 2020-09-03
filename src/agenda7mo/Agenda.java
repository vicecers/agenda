/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda7mo;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author vicec
 */
public class Agenda {

    private Hashtable<String, Persona> tb = new Hashtable<String, Persona>();

    public boolean Agregar(String dni, String nom, long tel) {
        if (!tb.containsKey(dni)) {
            Persona p = new Persona();
            p.setDni(dni);
            p.setNombre(nom);
            p.setTel(tel);
            tb.put(dni, p);
            return true;
        } else {
            return false;
        }
    }

    public boolean Eliminar(String dni) {
        if (tb.containsKey(dni)) {
            tb.remove(dni);
            return true;
        } else {
            return false;
        }
    }

    Persona Recuperar(String dni) {
        if (tb.containsKey(dni)) {
            return tb.get(dni);
        } else {
            return null;
        }
    }
    
    
    public Enumeration<String> Total(){
        return tb.keys();
    } 

}
