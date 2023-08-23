package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDB {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    private Connection conn;

    public static void main(String[] args) {
        new AppDB();

    }

    public AppDB(){
        try(var conn = getConnection()){
            listarEstados(conn);
            localizarEstado(conn,"PR");
        }
        catch (SQLException e) {       
               System.err.println("não foi possivel conectar o banco de dados"+ e.getMessage());
        }
        
    }

    private void localizarEstado(Connection conn, String uf) {
        try {
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            
            System.out.println(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery(sql);
            if (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("não foi possivel executar a consulta ao banco de dados"+ e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    } 

    private void listarEstados(Connection conn){
        try {
            System.out.println("conectado");
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
            System.out.println();
        } catch (Exception e) {
            System.err.println("não foi possivel executar a consulta ao banco de dados"+ e.getMessage());
        }
        
            
            
            
            
    }


    

    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");  
        } catch (ClassNotFoundException e) {
            System.err.println("não foi possivel carregar o banco de dados"+ e.getMessage());
        }
    }
}
