/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringmvc.controller;

import com.carlos.pruebaspringservice.entity.Cuenta;
import com.carlos.pruebaspringservice.service.CuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Carlos
 */
@Controller
@RequestMapping("/cuentas/{idCuenta}")
public class CuentasController {
    
    @Autowired
    CuentasService cuentasService;

    @RequestMapping("/movimientos/{idMovimiento}{?petId}")
    public String getCuentas(@PathVariable String idCuenta, @PathVariable String idMovimiento, @RequestParam("petId") int petId, Model model) {
       
        Cuenta cuenta = cuentasService.getCuenta();
        
        model.addAttribute("message", cuenta);
        
        return "carlos";
    }
    
 
}
