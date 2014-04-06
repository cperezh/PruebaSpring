/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pipelineprocessing.service;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.pipeline.Redirector;
import com.carlos.pipelineprocessing.pipeline.jms.JMSRedirector;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class ServicioParallelPipelines  implements Servicio{
    
    Redirector redirector;
    
    @EJB
    Resources resources;

    @PostConstruct
    public void postConstruct() {
        redirector = new JMSRedirector();

        ((JMSRedirector) redirector).setConnectionFactory(resources.getConnectionFactory());
        ((JMSRedirector) redirector).setQueue(resources.getPaso1InQueue());

    }

    @Override
    public void procesarMensaje(Mensaje mensaje) {
        redirector.enviarAlPasoSiguiente(mensaje);
    }

    
}
