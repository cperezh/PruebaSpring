/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.service.paso2;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.pipeline.Pipeline;
import com.carlos.pipelineprocessing.pipeline.jms.JMSRedirector;
import com.carlos.pipelineprocessing.service.Resources;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author Carlos
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/Paso2InQueue")
})
public class PipelineMDBPaso2 extends Pipeline implements MessageListener {

   
    @EJB
    Resources resources;
    
    @PostConstruct
    public void postConstruct() {
        redirector = new JMSRedirector();

        ((JMSRedirector) redirector).setConnectionFactory(resources.getConnectionFactory());
        ((JMSRedirector) redirector).setQueue(resources.getPaso3InQueue());

        processor = new ProcessorPaso2();
    }
    
     @Override
    public void onMessage(Message message) {

        Mensaje mensaje;
        
        try {
            
            mensaje = message.getBody(Mensaje.class);
            
            llegaMensaje(mensaje);
            
        } catch (JMSException ex) {
            Logger.getLogger(PipelineMDBPaso2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
