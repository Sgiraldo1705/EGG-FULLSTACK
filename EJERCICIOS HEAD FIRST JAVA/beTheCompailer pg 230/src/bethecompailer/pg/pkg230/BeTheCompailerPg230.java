/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bethecompailer.pg.pkg230;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class BeTheCompailerPg230 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Books[] myBooks = new Books[3];
     int x= 0;
     
        for (int i = 0; i < 3; i++) {
            myBooks[i]=new Books();
            
            System.out.println("type the title for book " + (i+1));
            myBooks[i].title = read.nextLine();
            
            System.out.println("type book´s " +(i+1)+" author");
            myBooks[i].author=read.nextLine();
            
            
            
        }
        
        for (int j = 0; j <3 ; j++) {
            
            System.out.print(myBooks[j].title);
            System.out.print(" by ");
            System.out.print(myBooks[j].author);
            System.out.println("");
            
        }
    }
    
}
