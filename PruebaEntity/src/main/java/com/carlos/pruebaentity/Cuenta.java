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
public class Cuenta implements Serializable {

    private String id;
    private String descripcion;
    private Titular titular;

    public Cuenta(String id,String descripcion,String nombreTitular) {
        this.id = id;
        this.descripcion = descripcion;
        titular = new Titular(nombreTitular);
    }

}
