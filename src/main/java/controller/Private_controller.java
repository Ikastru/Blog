package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "private_controller", urlPatterns = {"/private"})
@ServletSecurity( @HttpConstraint(rolesAllowed = {"private"}) )
public class Private_controller extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if ("/private".equals(request.getServletPath())){
            request.setAttribute("name", request.getUserPrincipal().getName());
            request.getRequestDispatcher("WEB-INF/private/private_article.jsp").
                    forward(request, response);
        }else
        if ("/logout".equals(request.getServletPath())){
            HttpSession session = request.getSession(false);
            if (session!= null){
                session.invalidate();
            }
            response.sendRedirect("/");
        }
    }
}
