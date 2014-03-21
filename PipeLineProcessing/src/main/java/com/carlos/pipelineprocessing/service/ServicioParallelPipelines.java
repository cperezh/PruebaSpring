/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pipelineprocessing.service;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import com.carlos.pipelineprocessing.pipeline.Redirector;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Carlos
 */
@Stateless
public class ServicioParallelPipelines  implements Servicio{

    @EJB (beanName = "JMSRedirectorInicial")
    Redirector redirector;

    @Override
    public void procesarMensaje(Mensaje mensaje) {
        redirector.enviarAlPasoSiguiente(mensaje);
    }

    
}
