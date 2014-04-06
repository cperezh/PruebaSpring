/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.pipeline.jms;

import java.io.Serializable;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author Carlos
 */
public abstract class JMSWriter {

    protected ConnectionFactory connectionFactory;

    protected Queue queue;

    public <T extends Serializable> void write(T mensaje) {

        try (JMSContext context = connectionFactory.createContext();) {
            context.createProducer().send(queue, mensaje);
            System.out.println("Mensaje a la cola > "+queue.getQueueName()+"|"+mensaje.toString());
        } catch (Exception e) {
            //TODO: Poner una traza de log
            e.printStackTrace();
        }
    }
}
