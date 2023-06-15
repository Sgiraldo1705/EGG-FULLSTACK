/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8ej5;

import Cuenta.Cuenta;

/**
 *
 * @author catom
 */
public class G8EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Cuenta cta1= new Cuenta();
     
     
        cta1.crearCuenta();
        
        System.out.println(cta1.getDni());
    }
    
}
