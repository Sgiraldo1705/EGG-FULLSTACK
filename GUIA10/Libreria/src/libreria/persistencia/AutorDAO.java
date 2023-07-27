/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import libreria.entidades.Autor;

public final class AutorDAO extends DAO<Autor> {

    @Override
    public void crear(Autor autor) {
        super.crear(autor);
    }

    public Autor buscarAutor(long codigo) {
        conectar();
        Autor autor = em.find(Autor.class, codigo);
        desconectar();
        return autor;

    }

    public Autor buscarAutorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }

    public void editarAutor(long codigo, String nombre) {
        conectar();
        Autor autor = buscarAutor(codigo);
        autor.setNombre(nombre);
        super.editar(autor);
        desconectar();
    }

    public void eliminarAutor(int codigo) {

        Autor autor = buscarAutor(codigo);
        autor.setAlta(true);
        super.editar(autor);

    }

}
