/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebajax.ws;

import com.carlos.pruebaentity.Movimiento;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Carlos
 */
@WebService
public interface MovimientosSOAPInterface {

    void insertar(@WebParam(name = "movimiento") @NotNull @Valid Movimiento movimiento);

    Movimiento buscar(@WebParam(name = "id") @NotNull Long id);

    List<Movimiento> buscarTodos();
}
