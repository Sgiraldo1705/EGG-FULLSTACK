/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8ej8;

import CadenaPkg.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author catom
 */
public class G8EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        CadenaServicio cs = new CadenaServicio();
        
        Cadena c1 = cs.fase1();
        
        cs.mostrarVocales(c1);
        System.out.println("------------------------------");
        cs.invertirFrase(c1);
        System.out.println("------------------------------");
        cs.vecesRepetido(c1);
        System.out.println("------------------------------");
        cs.compararLongitud(c1);
        
    }
    
}
