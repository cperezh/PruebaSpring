/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebajaxrs;

import com.carlos.pruebaentity.Cuenta;
import com.carlos.pruebaservice.CuentasService;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * REST Web Service
 *
 * @author Carlos
 */
@Path("/cuentasRest")
public class CuentasRest {

    final private CuentasService cuentasService;

    public CuentasRest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/conf/applicationContext.xml");

        cuentasService = context.getBean(CuentasService.class);
    }

    /**
     * Retrieves representation of an instance of
     * com.carlos.pruebaspringmvc.rest.CuentasRest
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public Cuenta getCuenta() {

        return cuentasService.getCuenta();
    }

    /**
     * PUT method for updating or creating an instance of CuentasRest
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes("application/json")
    public void putCuenta(String content) {
    }
}
