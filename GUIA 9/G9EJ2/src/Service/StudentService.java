/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catom
 */
public class StudentService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Student> students;

    public StudentService() {
        this.students = new ArrayList();
    }

    public void crearAlumno() {

        System.out.println("Introduzca el nombre");
        String name = read.next();

        System.out.println("Ingrese las 3 notas");

        ArrayList<Integer> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota" + (i + 1) + ": ");
            notas.add(read.nextInt());

        }
        Student student = new Student(name, notas);
        students.add(student);

    }

    public void notaFinal() {

        System.out.println("ingrese el nomgre del alumno a consultar");
        String nombre = read.next();
        for (Student student : students) {
            if (student.getNombre().equals(nombre)) {
                System.out.println("La nota final de " + nombre + " es de : " + student.finalGrade());
                return;
            }

        }
        System.out.println("El alumno no está en la lista");

    }

}
