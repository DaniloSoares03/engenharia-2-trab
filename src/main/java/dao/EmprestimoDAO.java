package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import modelo.Livro;
import java.util.List;

public class EmprestimoDAO {
    private Connection connection;

    public EmprestimoDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean registrarEmprestimo(List<Livro> livros, Date dataEmprestimo, Date dataPrevista) {
        String query = "INSERT INTO emprestimos (nome_aluno, data_emprestimo, data_prevista) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDate(2, new java.sql.Date(dataEmprestimo.getTime()));
            preparedStatement.setDate(3, new java.sql.Date(dataPrevista.getTime()));
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
