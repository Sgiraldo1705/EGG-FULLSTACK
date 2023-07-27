/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author catom
 */
public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(String nombre, double precio, Fabricante codigoFabricante) throws Exception {
        try {

            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("Debe ingresar el nombre del producto");
            }
            if (precio == 0) {
                throw new Exception("Debe ingresar el precio del producto");

            }
            if (codigoFabricante == null) {
                throw new Exception("Debe ingresar el codigo del fabricante");
            }
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            dao.ingresarProducto(producto);
        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarPrecioProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            if (codigo == 0) {
                throw new Exception("Debe ingresar un código de producto");

            }
            if (nombre == null || nombre.isEmpty()) {
                throw new Exception("Debe ingresar el nombre del producto");
            }
            if (precio == 0) {
                throw new Exception("Debe ingresar el precio del producto");

            }
            if (codigoFabricante == 0) {
                throw new Exception("Debe ingresar el codigo del fabricante");
            }

            Producto producto = buscarProductoPorCodigo(codigo);
            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;

        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe ingresar el código");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            if (producto == null) {
                throw new Exception("No se encontró un producto con ese codigo");
            }
            return producto;
        } catch (Exception e) {
            throw e;
        }

    }

    public Collection<String> listarProductosNombre() throws Exception {
        try {
            Collection<String> productos = dao.listarNombreProductos();
            for (String producto : productos) {
                System.out.println(producto);
            }
            return productos;

        } catch (Exception e) {
            throw e;
        }

    }

    public Collection<Producto> listarProductosPVP() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductosPvp();
            for (Producto producto : productos) {
                System.out.println(producto.getNombre() + "  " + producto.getPrecio());
            }
            return productos;

        } catch (Exception e) {
            throw e;
        }

    }

    public Collection<Producto> listarProductos120() throws Exception {
        try {
            Collection<Producto> productos = dao.buscarProductoPorPrecio();
            for (Producto producto : productos) {
                System.out.println(producto.getNombre() + "  " + producto.getPrecio());

            }
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
}
