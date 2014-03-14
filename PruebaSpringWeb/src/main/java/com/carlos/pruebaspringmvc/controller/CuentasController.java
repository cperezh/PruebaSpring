/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringmvc.controller;

import com.carlos.pruebaentity.Cuenta;
import com.carlos.pruebaservice.CuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Carlos
 */
@Controller
@RequestMapping("/cuentas")
public class CuentasController {

    @Autowired
    CuentasService cuentasService;

    @RequestMapping(value = "/buscarCuenta")
    public void buscarCuenta(Model model) {

        Cuenta cuenta = new Cuenta();
        model.addAttribute(cuenta);
    }

    @RequestMapping(value = "/mostrarCuenta")
    @ResponseBody
    @Cacheable(value = "cuentas", key = "#cuenta.id")
    public Cuenta mostrarCuentaAjax(@ModelAttribute Cuenta cuenta) {

        System.out.println("NO CACHAEO------------------------");
        return cuenta;
    }

    public void insertarCuenta(@ModelAttribute Cuenta cuentaView, Model model) {
        cuentasService.insertarCuenta(cuentaView);
    }

    @RequestMapping("/movimientos/{idMovimiento}{?petId}")
    public void getCuentas(@PathVariable String idCuenta, @PathVariable String idMovimiento, @RequestParam("petId") int petId, Model model) {

        Cuenta cuenta = cuentasService.getCuenta();

        model.addAttribute("message", cuenta);

        // return "carlos";
    }

}
