/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7ej14;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJ14 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            
    }
    
    
    public static void conver(double euro, int moneda){
        double cambio;
        switch(moneda){
            
            case 1:
                cambio=euro*1.28611;
                System.out.println("En total serían " + cambio + " Dólares");
            break;
            case 2:
                cambio=euro*129.852;
                System.out.println("En total serían " + cambio + " Yenes");
                break;
                case 3:
                cambio=euro*0.86;
                System.out.println("En total serían " + cambio + " Libras");
            break;
        }
    }
    
}
