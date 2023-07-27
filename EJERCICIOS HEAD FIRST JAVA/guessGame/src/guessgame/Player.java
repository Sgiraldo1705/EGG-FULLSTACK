/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessgame;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class Player {
Scanner scn = new Scanner(System.in);
    int number;
    
    void guess(){
        
        System.out.println("what's your answer?");
        number= scn.nextInt();
        
    }
    }

