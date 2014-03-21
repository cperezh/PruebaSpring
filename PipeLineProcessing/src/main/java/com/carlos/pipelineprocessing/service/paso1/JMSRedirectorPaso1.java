/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.service.paso1;

import com.carlos.pipelineprocessing.pipeline.Redirector;
import com.carlos.pipelineprocessing.service.Resources;
import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.pipeline.jms.JMSWriter;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class JMSRedirectorPaso1 extends JMSWriter implements Redirector {

    @EJB
    Resources resources;
    
    @PostConstruct
    public void postConstruct() {
        this.connectionFactory = resources.getConnectionFactory();
        this.queue = resources.getPaso2InQueue();
    }

    @Override
    public void enviarAlPasoSiguiente(Mensaje mensaje) {
        write(mensaje);
    }
}
