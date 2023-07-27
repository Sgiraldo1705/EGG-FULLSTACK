package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;

public final class ProductoDAO extends DAO {

    private final FabricanteService fabricanteService;

    public ProductoDAO() {
        this.fabricanteService = new FabricanteService();
    }

    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto(nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "UPDATE Producto SET"
                    + " nombre = '" + producto.getNombre() + "' , precio = '" + producto.getPrecio()
                    + "WHERE codigo = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo=" + codigo;
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCodigo(codigoFabricante);
                producto.setCodigoFabricante(fabricante);
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> buscarProductoPorPrecio() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202 ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
           
                productos.add(producto);

            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<String> listarNombreProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<String> productos = new ArrayList();
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
              
                productos.add(nombre);

            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductosPvp() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
             
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
                
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarPotatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE 'por%' ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCodigo(codigoFabricante);
                productos.add(producto);

            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto productoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto"
                    + "WHERE precio = (SELECT MIN(precio) FROM producto)";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
