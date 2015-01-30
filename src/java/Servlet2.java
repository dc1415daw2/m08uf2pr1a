/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author dc1314daw2@gmail.com
 */
public class Servlet2 extends HttpServlet {

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
        PrintWriter out = response.getWriter();                
                 
        try {
            InetAddress addr = InetAddress.getLocalHost();
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            out.print("<h2> Benvingut " + request.getParameter("nom_usuari") + "</h2>" );
            out.print("<h4> Nom de l'equip: " + addr.getHostName() + "</h4>" );
            out.print("<h4> Sistema operatiu de l'equip: " + System.getProperty("os.name") + "</h4>" );
            out.print("<h4> Versió del sistema operatiu de l'equip: " + System.getProperty("os.version") + "</h4>" );
            out.print("<h4> Versió de l'arquitectura l'equip: " + System.getProperty("os.arch") + "</h4>" );
            out.print("<h4> Versió del java de l'equip: " + System.getProperty("java.version") + "</h4>" );
            out.print("<form action='Servlet3' method='post'><input type='submit' value='Logout' /></form>");                    
        }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
