/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pipelineprocessing.pipeline.jms;

import com.carlos.pipelineprocessing.pipeline.Redirector;
import com.carlos.pipelineprocessing.pipeline.Mensaje;

/**
 *
 * @author Carlos
 */
public class JMSRedirector extends JMSWriter implements Redirector {

    @Override
    public void enviarAlPasoSiguiente(Mensaje mensaje) {
        write(mensaje);
    }
}
