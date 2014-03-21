/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pipelineprocessing.pipeline;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Carlos
 */
@Data
@NoArgsConstructor
public class Mensaje implements Serializable{
    
    private String texto;
    
    public Mensaje(String _texto){
        this.texto = _texto;
    }
    
}
