/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.pipeline.thread;

import com.carlos.pipelineprocessing.service.paso1.PipelineMDBPaso1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public abstract class ProcessorConSleep {

    public void procesar(long miliseconds) {

        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(PipelineMDBPaso1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
