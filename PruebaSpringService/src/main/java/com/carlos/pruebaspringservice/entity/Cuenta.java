/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringservice.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Carlos
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Cuenta implements Serializable {

    private String nombre;
    private String apellido;
    private Movimiento movimiento;

    public Cuenta(String nombre) {
        this.nombre = nombre;
        this.apellido = "perez";
        movimiento = new Movimiento("movimiento de cuentas");
    }

    @Override
    public Cuenta clone(){
        Cuenta clon = new Cuenta();
        clon.nombre = this.nombre;
        clon.apellido = this.apellido;
        clon.movimiento = this.movimiento.clone();
        return this;
    }
}
