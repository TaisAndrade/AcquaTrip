 package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    //Modificador que torna o método acessível fora da classe
    public Connection getConnection() throws SQLException{
        //Declaração de variável local chamada "conexao" que armazena e retorna as informações de cxonexão com o Banco de Dados
        //O nome do banco e a senha, foram removidos do projeto, todas as informações abaixo são padrões do posgresql
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nome_do_banco", "postgres", "senha_do_banco");
        return conexao;
    }
}
