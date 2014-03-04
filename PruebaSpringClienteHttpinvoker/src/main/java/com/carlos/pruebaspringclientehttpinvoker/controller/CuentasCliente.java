/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pruebaspringclientehttpinvoker.controller;

import com.carlos.pruebaspringservice.service.CuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Carlos
 */
@Controller
public class CuentasCliente {
    
    @Autowired
    CuentasService cuentasService;
    
    @RequestMapping("/pruebaCliente")
    public void prueba(Model model){
        
       model.addAttribute(cuentasService.getCuenta());
    }
}
