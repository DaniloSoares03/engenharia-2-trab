package modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processarFormulario")
public class ProcessarFormularioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ra = request.getParameter("ra");
        String acao = request.getParameter("acao");

        // Aqui você pode processar o RA e a ação (emprestar ou devolver) conforme necessário

        // Por exemplo, redirecionar para outra página
        if ("emprestar".equals(acao)) {
            response.sendRedirect("emprestar.jsp");
        } else if ("devolver".equals(acao)) {
            response.sendRedirect("devolver.jsp");
        }
    }
}
