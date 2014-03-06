/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pruebaspringserviceremote.service;

import com.carlos.pruebaspringserviceremote.entity.CuentaRemote;
import com.carlos.pruebaspringservice.service.CuentasService;

/**
 *
 * @author Carlos
 */
public interface CuentasServiceRemote extends CuentasService {
    
    @Override
    CuentaRemote getCuenta();
}
