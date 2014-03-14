/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaentity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Carlos
 */
@Data
@NoArgsConstructor
public class Titular implements Serializable {

    private String nombre;

    public Titular(String nombreTitular) {
        this.nombre = nombreTitular;
    }

}
