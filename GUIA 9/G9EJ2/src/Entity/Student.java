/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author catom
 */
public class Student {
    
    private String nombre;
    private ArrayList<Integer> notas ;

    public Student() {
    }

    public Student(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    
    public double finalGrade(){
        int prom = 0;
        for (Integer nota : notas) {
            prom += nota;
            
        }
            return (double) prom / 3;    
    }
        
    
}
