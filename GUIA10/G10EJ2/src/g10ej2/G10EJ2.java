/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10ej2;

import Services.RevolverService;

/**
 *
 * @author catom
 */
public class G10EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RevolverService revServ =new RevolverService();
        revServ.llenarRevolver();
        System.out.println(revServ.toString()); 
    }
    
}
