/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pruebaspringserviceremote.service;

import com.carlos.pruebaspringserviceremote.entity.CuentaRemote;
import com.carlos.pruebaspringservice.service.CuentasServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class CuentasServiceRemoteImpl extends CuentasServiceImpl implements CuentasServiceRemote{
             
    @Override
    public CuentaRemote getCuenta() {
        return new CuentaRemote(super.getCuenta());
    }
}
