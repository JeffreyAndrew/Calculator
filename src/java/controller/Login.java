
package controller;

import dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrew
 */
@WebServlet(name = "login", urlPatterns = {"/log"})
public class Login extends HttpServlet {
    
    ClienteDAO cliente = new ClienteDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        String us, ps, pagina;
        us = request.getParameter("user");
        ps = request.getParameter("pass");
        if (!us.equals("") && !ps.equals("")) {
            if (cliente.validate(us, ps)) {
                pagina = "/index.html";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
            } else {
                pagina = "/login.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
            }
        } else {
            pagina = "/login.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
