/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

import java.util.Scanner;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author catom
 */
public class Menu {

    Scanner read = new Scanner(System.in);
    Integer respuesta;

    FabricanteService fabricanteService = new FabricanteService();
    ProductoService productoService = new ProductoService();

    public void menuScreen() throws Exception { 
        System.out.println("------------------------------------ MENÚ ------------------------------------");
        System.out.println("-------------------Seleccione una de las siguientes opciones------------------");
        System.out.println(" ");
        System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto");
        System.out.println("2) Lista los nombres y los precios de todos los productos de la tabla producto.");
        System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202.");
        System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto.");
        System.out.println("5) Listar el nombre y el precio del producto más barato.");
        System.out.println("6) Ingresar un producto a la base de datos.");
        System.out.println("7) Ingresar un fabricante a la base de datos ");
        System.out.println("8) Editar un producto con datos a elección.");
        respuesta = read.nextInt();

        switch (respuesta) {
            case 1:
                productoService.listarProductosNombre();
                        
                break;
                
            case 2:
                productoService.listarProductosPVP();
                break;
            
            case 3:
                productoService.listarProductos120();
                

        }
    }

}
