package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante(nombre)"
                    + "VALUES ('" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricanteXNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM faricante"
                    + "WHERE nombre='" + nombre + "'";
            consultarBase(sql);
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM faricante"
                    + "WHERE codigo=" + codigo;
            consultarBase(sql);
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
