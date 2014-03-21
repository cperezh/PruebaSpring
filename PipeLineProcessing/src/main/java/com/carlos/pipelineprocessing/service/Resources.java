/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.service;

import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;

/**
 *
 * @author Carlos
 */
@Singleton
@Startup
public class Resources {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "jms/Paso1InQueue")
    private Queue paso1InQueue;
    
    @Resource(lookup = "jms/Paso2InQueue")
    private Queue paso2InQueue;
    
    @Resource(lookup = "jms/Paso3InQueue")
    private Queue paso3InQueue;

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Queue getPaso1InQueue() {
        return paso1InQueue;
    }

    public void setPaso1InQueue(Queue paso1InQueue) {
        this.paso1InQueue = paso1InQueue;
    }

    public Queue getPaso2InQueue() {
        return paso2InQueue;
    }

    public void setPaso2InQueue(Queue paso2InQueue) {
        this.paso2InQueue = paso2InQueue;
    }

    public Queue getPaso3InQueue() {
        return paso3InQueue;
    }

    public void setPaso3InQueue(Queue paso3InQueue) {
        this.paso3InQueue = paso3InQueue;
    }

    
}
