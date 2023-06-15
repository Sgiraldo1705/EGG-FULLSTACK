/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7ejex17;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class G7EJEX17 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un número entero positivo: ");
    int num = input.nextInt();
    
    
    if (esPrimo(num)) {
      System.out.println(num + " es un número primo.");
    } else {
      System.out.println(num + " no es un número primo.");
    }
  }

  public static boolean esPrimo(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
    

