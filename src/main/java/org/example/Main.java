package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM aluno");

            while (resultSet.next()) {
                System.out.println("Coluna: " + resultSet.getString("Nome") + " " + resultSet.getString("Idade"));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}