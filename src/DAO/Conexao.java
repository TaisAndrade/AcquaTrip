package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    //Modificador que torna o método acessível fora da classe
    public Connection getConnection() throws SQLException{
        //Declaração de variável local chamada "conexao" que armazena e retorna as informações de cxonexão com o Banco de Dados
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/AcquaTrip", "postgres", "Estacio@123");
        return conexao;
    }
}
