/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g7ejex2;

/**
 *
 * @author catom
 */
public class G7EJEX2 {

    public static void main(String[] args) {
    
        int a=4, b=8, c=6, d=7, aux;
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
    }
}
