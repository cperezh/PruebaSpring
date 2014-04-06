/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.pipeline;

import lombok.Data;

/**
 *
 * @author Carlos
 */
@Data
public abstract class Pipeline {
    
    protected Processor processor;
    
    protected Redirector redirector;

    /**
     * Cuando llega un nuevo mensaje, lo procesa y lo envía al siguiente paso
     *
     * @param mensaje
     */
    public void llegaMensaje(Mensaje mensaje) {
        processor.procesar(mensaje);
        redirector.enviarAlPasoSiguiente(mensaje);
    }

}
