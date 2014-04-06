/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pruebaclientejaxws;

import com.carlos.pruebajax.ws.MovimientosSOAP;
import com.carlos.pruebajax.ws.MovimientosSOAPInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Carlos
 */
@WebServlet(name = "Cliente", urlPatterns = {"/Cliente"})
public class Cliente extends HttpServlet {

    
    private static URL urlServicioMovimientosSOAP;
    
    private static QName QNameServicioMovimientodsSOAP;
    
    private static Service servicioWS;
    
    private static MovimientosSOAPInterface movimientosSOAPService;
    
    @Override
    public void init(){
        try {
            urlServicioMovimientosSOAP = new URL("http://Lovinos:8081/MovimientosSOAPService/MovimientosSOAP?wsdl");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        QNameServicioMovimientodsSOAP = new QName("http://ws.pruebajax.carlos.com/","MovimientosSOAPService");
        servicioWS = Service.create(urlServicioMovimientosSOAP,QNameServicioMovimientodsSOAP);
        
        movimientosSOAPService = servicioWS.getPort(MovimientosSOAPInterface.class);
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
}
