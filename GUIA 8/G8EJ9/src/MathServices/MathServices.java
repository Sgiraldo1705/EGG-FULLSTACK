/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathServices;

import Math1.Math1;

/**
 *
 * @author catom
 */
public class MathServices {
    Math1 mt = new Math1();
    
    
    @SuppressWarnings("MathRandomCastToInt")
    public Math1 asignValue(Math1 mt){
        mt.setA((int) Math.floor(Math.random()*99+1));
        mt.setB((int) Math.floor(Math.random()*99+1));
        
        return mt;
    }
 public void devolverMayor(Math1 mt) {
     
     int var = mt.getA();
     int var2 = mt.getB();
     
     int mayor = Math.max(var, var2);
     
     System.out.println("El número mayor es: " + mayor);
     
     
 }
 
 public void calcularPotencia(Math1 mt){
     int var = mt.getA();
     int var2 = mt.getB();
     
     int potencia = (int) Math.pow(Math.max(var,var2 ), Math.min(var, var2));
 
     System.out.println("El valor de "+ Math.max(var,var2 )+ " elevado a la potencia " + Math.min(mt.getA(), mt.getB()) + " es igual a: " + potencia);
 
 }
 
 public void sqrt(Math1 mt){
     double var = Math.min(mt.getA(),mt.getB());
     
     double sqr1 = Math.sqrt(var);
     
     System.out.println("el número mínimo es: " + var + " y su raíz cuadra es : " + sqr1);
     
 }
}
