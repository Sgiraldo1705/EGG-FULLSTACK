/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import CadenaPkg.Cadena;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class CadenaServicio {

    Scanner read = new Scanner(System.in);

    public Cadena fase1() {
        Cadena c1 = new Cadena();

        System.out.println("ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        c1.setFrase(read.nextLine());

        c1.setLongitud(c1.getFrase().length());

        return c1;
    }
    
    public void mostrarVocales(Cadena c1){
        int cont = 0;
        int longi = c1.getLongitud();
     String frase = c1.getFrase();
        String vocales= "";
        
        for (int i = 0; i < longi; i++) {
            char letra =frase.charAt(i);
            if( letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' ){
                vocales = vocales.concat(Character.toString(letra));
                cont++;
            }else if(letra==' '){
                vocales=vocales.concat(" ");
            }else{
                vocales=vocales.concat("_");
            }
            
        }
       
        System.out.println(vocales);
        System.out.println("estas son las vocales de la frase y eb total hay: "+ cont);
       
    }
    
    public void invertirFrase(Cadena c1){
    StringBuilder sb = new StringBuilder(c1.getFrase());
    
    sb.reverse();
    
        System.out.println("La frase al revés es: " + sb.toString());
    
    }
   public void vecesRepetido(Cadena c1){
       
       int cont=0;
       String frase = c1.getFrase();
       
       
       System.out.println("ingrese la letra que quiere buscar");
       String letra = read.next();
       
       int longi = c1.getLongitud();
       for (int i = 0; i < longi; i++) {
       String var =Character.toString(frase.charAt(i));
       
       if (var.equals(letra)){
           cont++;
           
       }
           
       }
       System.out.println("el carater " + letra + " se repite " + cont + " veces");
   }
   
   public void compararLongitud(Cadena c1){
       
       int long1 = c1.getLongitud();
       
       int long2;
       
       System.out.println("ingrese una nueva frase");
       String frase2 = read.nextLine();
       
       long2= frase2.length();
       
       if (long1>long2) {
           System.out.println("la frase original es más larga");
                      
       } else if (long1<long2) {
           System.out.println("la frase ingresada  es más larga");
          
       }else{
           System.out.println("tienen la misma longitud");
       }
       
       
}
}
