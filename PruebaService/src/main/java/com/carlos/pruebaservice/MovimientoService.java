/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaservice;


import com.carlos.pruebaentity.Movimiento;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface MovimientoService {

    /**
     * Persiste un movimiento
     * @param movimiento 
     */
    void insertar(Movimiento movimiento);
    
    /**
     * Busca un movimiento por su id
     * @param id
     * @return 
     */
    Movimiento buscar(Long id);
    
    /**
     * Busca todos los movimientos
     * @return 
     */
    List<Movimiento> buscarTodos();
}
