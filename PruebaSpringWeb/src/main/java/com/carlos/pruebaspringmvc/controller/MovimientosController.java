/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringmvc.controller;

import com.carlos.pruebaservice.MovimientoService;
import com.carlos.pruebaentity.Movimiento;
import java.util.List;
import javax.ejb.EJB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Carlos
 */
@Controller
@RequestMapping("/movimientos")
public class MovimientosController {

    @EJB(mappedName = "java:module/MovimientoServiceImpl!com.carlos.pruebaejbservice.MovimientoServiceLocal")
    MovimientoService movimientoService;

    @RequestMapping("/opciones")
    public void opciones(Model model) {
        model.addAttribute(new Movimiento());
    }

    @RequestMapping("/insertarMovimiento")
    @ResponseBody
    public List<Movimiento> insertarMovimiento(@ModelAttribute Movimiento movimiento) {

    
            movimientoService.insertar(movimiento);

            return movimientoService.buscarTodos();
      
    }
}
