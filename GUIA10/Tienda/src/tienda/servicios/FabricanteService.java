/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author catom
 */
public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("debe ingresar el nombre");

            }
            if (buscarFabricanteXNombre(nombre) != null) {
                throw new Exception("Ya existe este fabricante");

            }

            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricanteXNombre(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre del fabricante");
            }

            Fabricante fabricante = dao.buscarFabricanteXNombre(nombre);

            return fabricante;

        } catch (Exception e) {
            throw e;

        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el código");

            }
            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
}
