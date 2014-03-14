/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringservice;

import com.carlos.pruebaentity.Cuenta;
import com.carlos.pruebaservice.CuentasService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class CuentasServiceImpl implements CuentasService {

    @Override
    public Cuenta getCuenta() {
        return new Cuenta("1","descripcion", "titulo");
    }

    @Override
    public void insertarCuenta(Cuenta cuenta) {
        //cuenta.insertar();
    }

}
