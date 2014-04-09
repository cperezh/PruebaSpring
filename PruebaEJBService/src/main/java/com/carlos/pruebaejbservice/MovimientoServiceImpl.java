/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaejbservice;

import com.carlos.pruebadao.DAOMovimiento;
import com.carlos.pruebaentity.Movimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class MovimientoServiceImpl implements MovimientoServiceLocal {

    @EJB(lookup = "java:module/DAOMovimientoEJBImpl!com.carlos.pruebaejb.dao.DAOMovimientoEJBLocal")
    DAOMovimiento daoMovimiento;

    @Override
    public void insertar(Movimiento movimiento) {

        movimiento.setId(Long.valueOf(1));
        daoMovimiento.insertar(movimiento);
        
        Movimiento movimiento2 = new Movimiento();
        movimiento2.setId(Long.valueOf(1));
        daoMovimiento.insertar(movimiento2);
    }

    @Override
    public Movimiento buscar(Long id) {

        return daoMovimiento.buscar(id);
    }

    @Override
    public List<Movimiento> buscarTodos() {

        return daoMovimiento.buscarTodos();
    }

}
