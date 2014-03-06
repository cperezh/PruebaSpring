/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pruebaspringservice.entityRemote;

import com.carlos.pruebaspringservice.entity.Cuenta;

/**
 *
 * @author Carlos
 */
public class CuentaRemote extends Cuenta {
    public CuentaRemote(Cuenta cuenta){
        this.setNombre(cuenta.getNombre());
        this.setApellido(cuenta.getApellido());
        this.setMovimiento(cuenta.getMovimiento());
    }
    
    public static void main(String args[]){
        Cuenta cuenta = new Cuenta();
        cuenta.setApellido("antes");
        CuentaRemote cuentaRemote = new CuentaRemote(cuenta);
        System.out.println("antes: "+cuentaRemote.getApellido());
        cuenta.setApellido("despues");
        System.out.println("despues :"+cuentaRemote.getApellido());
        
    }
}
