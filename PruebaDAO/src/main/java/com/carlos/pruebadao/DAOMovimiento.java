/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebadao;

import com.carlos.pruebaentity.Movimiento;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface DAOMovimiento {

    public void insertar(Movimiento movimiento);

    public Movimiento buscar(Long id);

    public List<Movimiento> buscarTodos();
}
