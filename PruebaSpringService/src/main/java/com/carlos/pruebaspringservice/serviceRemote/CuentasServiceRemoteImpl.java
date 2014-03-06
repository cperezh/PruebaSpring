/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pruebaspringservice.serviceRemote;

import com.carlos.pruebaspringservice.entityRemote.CuentaRemote;
import com.carlos.pruebaspringservice.service.CuentasServiceImpl;

/**
 *
 * @author Carlos
 */
public class CuentasServiceRemoteImpl extends CuentasServiceImpl implements CuentasServiceRemote{

    @Override
    public CuentaRemote getCuenta() {
        return new CuentaRemote(super.getCuenta());
    }
}
