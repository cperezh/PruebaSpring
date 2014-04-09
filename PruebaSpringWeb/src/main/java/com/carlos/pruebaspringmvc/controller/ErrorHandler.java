/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.pruebaspringmvc.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Carlos
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(IOException.class)
    @ResponseBody
    public String handleIOException(Exception ex) {

  
        return "La excepcion ha llegadooooo";
    }
}
