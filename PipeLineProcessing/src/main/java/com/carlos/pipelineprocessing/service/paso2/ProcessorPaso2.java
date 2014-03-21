/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.service.paso2;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.pipeline.Processor;
import com.carlos.pipelineprocessing.pipeline.thread.ProcessorConSleep;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class ProcessorPaso2 extends ProcessorConSleep implements Processor {

    @Override
    public void procesar(Mensaje mensaje) {
        
        mensaje.setTexto(mensaje.getTexto()+"|ProcessorPaso2");
        
        super.procesar(1000);
        
         System.out.println("Procesando 2: "+mensaje.getTexto());
    }
}
