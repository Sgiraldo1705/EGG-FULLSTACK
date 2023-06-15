/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g7ejex8;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class OtrosEjercicios {

   /*
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
    */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int contP = 0, contI = 0, contT = 0, num;
        
        do {
            System.out.print("Ingrese un numero mayor que 0: ");
            num = read.nextInt();
            if(num > 0){
                if(num%2 == 0){
                    contP++;
                }else{
                    contI++;
                }
                contT++;
            }
        } while (num % 5 != 0);
        
        System.out.println("Los numero pares ingresados son: " + contP);
        System.out.println("Los numero impares ingresados son: " + contI);
        System.out.println("El total de numeros ingresados son: " + contT);
    }
    
}
