/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.service.Servicio;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Carlos
 */
@Path("/dispacher")
public class Dispacher{

    @EJB(beanName = "ServicioParallelPipelines")
    Servicio servicio;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     */
    @GET
    public void procesar() {

        long tiempoInicio;
        long tiempoFin;
        double tiempoTotal;
        Mensaje[] mensaje;

        mensaje = new Mensaje[10];

        for (int i = 0; i < 10; i++) {
            mensaje[i] = new Mensaje("Inicial "+i);
        }
        tiempoInicio = new Date().getTime();
        
         for (int i = 0; i < 10; i++) {
             servicio.procesarMensaje(mensaje[i]);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Dispacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        tiempoFin = new Date().getTime();

        tiempoTotal = (tiempoFin - tiempoInicio) / 1000.0;
        System.out.println("Tiempo en segundos:" + tiempoTotal);

     
    }

}
