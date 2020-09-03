/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda7mo;

import java.util.*;

/**
 *
 * @author vicec
 */
public class Agenda7mo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //leer del teclado
        int opc;
        Agenda ag = new Agenda();
        Persona p = null;
        String nom, dni;
        long tel;
        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Mostrar todas personas");
            System.out.println("5. Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    nom = sc.next();
                    System.out.println("Ingrese el DNI: ");
                    dni = sc.next();
                    System.out.println("Ingrese el telefono: ");
                    tel = sc.nextLong();

                    if (ag.Agregar(dni, nom, tel)) {
                        System.out.println("La persona se agrego correctamente");
                    } else {
                        System.out.println("La persona no se agrego DNI repetido");
                    }

                    break;
                case 2:
                    System.out.println("Ingrese el DNI: ");
                    dni = sc.next();
                    p = ag.Recuperar(dni);

                    if (p != null) {
                        System.out.println(p.getNombre());
                        System.out.println(p.getDni());
                        System.out.println(p.getTel());
                        System.out.println(p.toString());
                    } else {
                        System.out.println("El DNI no existe");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el DNI: ");
                    dni = sc.next();
                    if (ag.Eliminar(dni)) {
                        System.out.println("La persona h sido eliminada");
                    } else {
                        System.out.println("El DNI no existe");
                    }
                    break;
                case 4:
                    Enumeration<String> e = ag.Total();
                    while (e.hasMoreElements()) {
                        String d = e.nextElement();
                        Persona per = ag.Recuperar(d);
                        System.out.println(per.toString());
                    }

                    break;
            }

        } while (opc != 5);

    }

}
