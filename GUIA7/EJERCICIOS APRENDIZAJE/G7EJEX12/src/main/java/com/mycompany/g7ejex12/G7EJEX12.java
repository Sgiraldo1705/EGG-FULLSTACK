/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.g7ejex12;



/**
 *
 * @author santiago
 */
public class G7EJEX12 {

    public static void main(String[] args) {
     

        for (int i = 0; i < 10; i++) {
             String numStr = String.valueOf(i);
                    // Reemplazar el '3' por una 'E'
                    numStr = numStr.replace("3", "E");
            for (int j = 0; j < 10; j++) {
                String numStr2 = String.valueOf(j);
                    // Reemplazar el '3' por una 'E'
                    numStr2 = numStr2.replace("3", "E");
                for (int k = 0; k < 10; k++) {
                   
                     String numStr3 = String.valueOf(k);
                    // Reemplazar el '3' por una 'E'
                    numStr3 = numStr3.replace("3", "E");
                    
                    System.out.println(numStr+"-"+numStr2+"-"+numStr3);
                    
                }
                System.out.println("");
                
            }
            System.out.println("");
        }
           System.out.println("");
        
    }

}
