/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringserviceremote.entity;

import com.carlos.pruebaspringservice.entity.Cuenta;
import lombok.NoArgsConstructor;

/**
 *
 * @author Carlos
 */
@NoArgsConstructor
public class CuentaRemote extends Cuenta {

    public CuentaRemote(final Cuenta cuenta) {
        this.setNombre(cuenta.getNombre());
        this.setApellido(cuenta.getApellido());
        this.setMovimiento(cuenta.getMovimiento());
    }
}
