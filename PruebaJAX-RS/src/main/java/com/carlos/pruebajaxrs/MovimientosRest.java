/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebajaxrs;

import com.carlos.pruebaentity.Movimiento;
import com.carlos.pruebaservice.MovimientoService;
import javax.ejb.EJB;
import javax.validation.constraints.Max;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Carlos
 */
@Path("/movimientosRest")
public class MovimientosRest {

    @EJB(lookup = "java:module/MovimientoServiceImpl!com.carlos.pruebaejbservice.MovimientoServiceLocal")
    MovimientoService movimientoService;
    
    @GET
    @Path("/{idMovimiento}")
    public Movimiento getMovimiento(@PathParam(value="idMovimiento") @Max(3) Long id){
        return movimientoService.buscar(id);
    }
}
