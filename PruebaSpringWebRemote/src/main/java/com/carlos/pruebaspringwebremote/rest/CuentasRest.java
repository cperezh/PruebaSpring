/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringwebremote.rest;

import com.carlos.pruebaspringserviceremote.entity.CuentaRemote;
import com.carlos.pruebaspringserviceremote.service.CuentasServiceRemote;
import com.carlos.pruebaspringserviceremote.service.CuentasServiceRemoteImpl;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * REST Web Service
 *
 * @author Carlos
 */
@Path("/cuentasRest")
public class CuentasRest {

    final private CuentasServiceRemote cuentasServiceRemote;

    public CuentasRest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/conf/applicationContext.xml");

        cuentasServiceRemote = context.getBean(CuentasServiceRemoteImpl.class);
    }

    /**
     * Retrieves representation of an instance of
     * com.carlos.pruebaspringmvc.rest.CuentasRest
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public CuentaRemote getCuenta() {

        System.out.println("VOY>>>>>>>>>>>>>>>>>>>>>>>>>");
        return cuentasServiceRemote.getCuenta();
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
