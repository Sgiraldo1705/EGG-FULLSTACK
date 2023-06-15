/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9ej5;

import Service.CountryService;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G9EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CountryService cS = new CountryService();
        Scanner read = new Scanner(System.in);
        Boolean add = true;
        while (add){
            cS.crearPais();
            System.out.println("desea agregar otro pais?");
            String option =read.nextLine();
            if (option.equalsIgnoreCase("n")){
                add=false;
            }
        }
        cS.showCountries();
        cS.sortCountries();
        
        
        
    }

}
