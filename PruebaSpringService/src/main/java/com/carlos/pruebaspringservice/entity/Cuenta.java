/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringservice.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Carlos
 */
@Data
@NoArgsConstructor
public class Cuenta implements Serializable{

    private String nombre;
    private Movimiento movimiento;
    
    public Cuenta(String nombre){
        this.nombre = nombre;
        movimiento = new Movimiento("movimiento de cuentas");
    }
}
