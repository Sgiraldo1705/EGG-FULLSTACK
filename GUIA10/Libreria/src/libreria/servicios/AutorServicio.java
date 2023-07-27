/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private final AutorDAO DAO;

    public AutorServicio() {

        this.DAO = new AutorDAO();
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            DAO.crear(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    
    }
    public Autor buscarAutorNombre(String nombre){

        return DAO.buscarAutorNombre(nombre);

    }

    public Autor buscarAutor(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("ESCRIBA EL CODIGO");
            }
            return DAO.buscarAutor(codigo);
        } catch (Exception e) {
            throw e;
        }
    }
}
