/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcondetournie.elizabeth;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class FalconDeTournieElizabeth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pasajero p1 = new Pasajero("Garcia", "Martin", "12345678", true);
        Pasajero p2 = new Pasajero("Perez", "Silvia", "23456789", false);
        Pasajero p3 = new Pasajero("Arroyo", "German", "3159874", true);
        Pasajero p4 = new Pasajero("Rizzi", "Lucila", "4158873", true);
        Pasajero p5 = new Pasajero("Alvarez", "Juan", "558741", false);
        Pasajero p6 = new Pasajero("Sanchez", "Juan", "587841", false);
         ArrayList<Vuelo> vuelos =new ArrayList<>();
         
        Vuelo v1 = new Vuelo("21-12-2018", "Gol", 2100);
        
        v1.AgregarPasajero(p1);
        v1.AgregarPasajero(p2);
        v1.AgregarPasajero(p3);
        v1.AgregarPasajero(p4);
        v1.AgregarPasajero(p5);   
        v1.AgregarPasajero(p6);
        vuelos.add(v1);
        v1.MostrarVuelo();
        System.out.println("Valorar vuelo= \n");
        System.out.println(Vuelo.ValorarVuelo(v1));
        
        Pasajero.MostrarPasajero(p5);
        System.out.println("Gasto de Pasajero");
      System.out.println( Vuelo.CalcularGastoPasajero(vuelos, p2));
    }
    
}
