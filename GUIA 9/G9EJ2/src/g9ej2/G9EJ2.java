/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9ej2;

import Service.StudentService;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G9EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StudentService sC = new StudentService();
       Scanner read = new Scanner(System.in);
       
       do {
                  
       sC.crearAlumno();
           System.out.println("desea crear otro alumno?");
           
       }while(read.nextLine().equalsIgnoreCase("s"));
        System.out.println("");
     sC.notaFinal();
    }
    
}
