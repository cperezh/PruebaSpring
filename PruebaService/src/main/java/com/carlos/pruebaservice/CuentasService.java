/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaservice;

import com.carlos.pruebaentity.Cuenta;



/**
 *
 * @author Carlos
 */
public interface CuentasService {

    Cuenta getCuenta();
    
    /**
     * Persiste una cuenta
     * @param cuenta 
     */
    void insertarCuenta(Cuenta cuenta);
}
