/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author catom
 */
public final class EditorialDAO extends DAO<Editorial>{
    @Override
    public void crear(Editorial editorial){
        super.crear(editorial);
    }
    
    public Editorial buscarEditorial(long id){
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
        
    }
    
}
