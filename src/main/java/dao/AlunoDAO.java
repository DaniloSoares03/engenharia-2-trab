package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    private Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean criarAluno(String RA) {
        String query = "INSERT INTO alunos (RA) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, RA);
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
