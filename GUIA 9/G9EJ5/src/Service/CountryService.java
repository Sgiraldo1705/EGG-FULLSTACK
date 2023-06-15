/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Country;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author catom
 */
public class CountryService {
    Scanner read = new Scanner(System.in);
    
    private Set<Country> countries;
    public CountryService(){
        countries = new HashSet<>();
    }
    
    


public void crearPais(){
    
    System.out.println("Digite el nombre del pais a ingresar");
    String nombre  = read.nextLine();
    Country country = new Country(nombre);
    if (countries.add(country)){
        System.out.println("el país se ha ingresado");
    }else {
        System.out.println("este país ya se encuntra en la lista");
    }
    
      
    
}

public void showCountries(){
    System.out.println("los pises ingresados son:");
    for (Country country : countries) {
        System.out.println(country);
        
    }
}

public void sortCountries(){
    Set<Country> sorted = new TreeSet<>(countries);
    System.out.println("los paises ordenados");
    for(Country country : sorted){
        System.out.println(country);
    }
}


}
