package Model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;//para manipular datas
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String nivelAcesso;
    private String senha;
    private String telefone;
    private String endereco;
    private Date dataNascimento;
    
    
    public Funcionario(int id, String nome, String cpf, String email, String nivelAcesso, String senha, String telefone, String endereco, String dataNascimento){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //E possivel criar outros construtores com menos atributos requeridos
    public Funcionario(int id, String nome, String email, String nivelAcesso, String senha){
        this.id = id;
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
        this.email = email;
        this.senha = senha;    
    }

    //Construtor de acesso ao sistema
    public Funcionario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Funcionario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    

    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

}
