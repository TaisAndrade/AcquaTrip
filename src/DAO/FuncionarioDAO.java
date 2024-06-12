package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Funcionario;
import View.FuncionarioForm;

public class FuncionarioDAO {
    private final Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    //Método de parâmetro para conexão
    public void insert(Funcionario funcionario) throws SQLException{

            // Define a consulta SQL para inserir dados na tabela 'funcionario'
            String sql = "insert into funcionario (nome, cpf, email, nivel_acesso, senha, telefone, endereco, data_nascimento) values ('"+funcionario.getNome()+"', '"+funcionario.getCpf()+"', '"+funcionario.getEmail()+"', '"+funcionario.getNivelAcesso()+"', '"+funcionario.getSenha()+"', '"+funcionario.getTelefone()+"', '"+funcionario.getEndereco()+"', '"+funcionario.getDataNascimento()+"')";
            
            // Prepara a consulta SQL para execução
            PreparedStatement statement = connection.prepareStatement(sql);
            
            // Prepara a consulta SQL para execução
            statement.execute();
            
            // Fecha a conexão com o banco de dados
            connection.close();     
    }
    
    
}
