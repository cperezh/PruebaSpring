/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebajax.ws;

import com.carlos.pruebaentity.Movimiento;
import com.carlos.pruebaservice.MovimientoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Carlos
 */
@WebService(endpointInterface = "com.carlos.pruebajax.ws.MovimientosSOAPInterface")
@Stateless
public class MovimientosSOAP implements MovimientosSOAPInterface {

    @EJB(lookup = "java:module/MovimientoServiceImpl!com.carlos.pruebaejbservice.MovimientoServiceLocal")
    MovimientoService movimientoService;

    @Override
    public void insertar(@WebParam(name = "movimiento") @NotNull @Valid Movimiento movimiento) {
        movimientoService.insertar(movimiento);
    }

    @Override
    public @WebResult(name = "movimiento") Movimiento buscar(@WebParam(name = "id") @NotNull Long id) {
        return movimientoService.buscar(id);
    }

    @Override
    public @WebResult(name = "movimiento") List<Movimiento> buscarTodos() {
        return movimientoService.buscarTodos();
    }

}
