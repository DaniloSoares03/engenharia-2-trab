package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    private Connection connection;

    public LivroDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean criarLivro(int codigo) {
        String query = "INSERT INTO livros (codigo) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, codigo);
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
