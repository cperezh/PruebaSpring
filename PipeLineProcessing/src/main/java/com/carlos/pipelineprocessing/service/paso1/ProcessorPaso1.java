/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.service.paso1;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.pipeline.Processor;
import com.carlos.pipelineprocessing.pipeline.thread.ProcessorConSleep;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class ProcessorPaso1 extends ProcessorConSleep implements Processor {

    @Override
    public void procesar(Mensaje mensaje) {
        
        mensaje.setTexto(mensaje.getTexto()+"|ProcessorPaso1");
        
        super.procesar(3000);
        
        System.out.println("Procesando 1: "+mensaje.getTexto());
    }
}
