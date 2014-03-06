/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringservice.service;

import com.carlos.pruebaspringservice.entity.Cuenta;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos
 */
@Service
public class CuentasServiceImpl implements CuentasService {

    @Override
    public Cuenta getCuenta() {
        return new Cuenta("Mamencini");
    }

}
