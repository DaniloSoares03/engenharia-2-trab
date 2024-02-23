package modelo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gravarDados")
public class GravarDadosServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ra = request.getParameter("ra");
        String nome = request.getParameter("nome");
        // Obtenha outros parâmetros do formulário conforme necessário

        // Configuração da conexão com o banco de dados
        String url = "/var/lib/postgresql/16/main";
        String usuario = "postgres";
        String senha = "senha";

        try {
            // Conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Instrução SQL para inserir dados
            String sql = "INSERT INTO aluno (ra, nome) VALUES (?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, ra);
            statement.setString(2, nome);
            // Defina outros parâmetros da instrução SQL conforme necessário

            // Executar a instrução SQL
            int linhasAfetadas = statement.executeUpdate();
            if (linhasAfetadas > 0) {
                response.getWriter().println("Dados gravados com sucesso!");
            } else {
                response.getWriter().println("Erro ao gravar dados!");
            }

            // Fechar conexão com o banco de dados
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
