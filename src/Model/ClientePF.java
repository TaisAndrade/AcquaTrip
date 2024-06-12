package Model;

//Extends: significa que essa classe está herdando atributos de uma classe pai(Cliente)
public class ClientePF extends Cliente{

    public static void add(ClientePF clientePF_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    protected String nome;
    protected String cpf;

    public ClientePF(int id, String nome, String cpf, String email, String telefone, String endereco) {
        super(id, email, telefone, endereco);//Significa que os atributos estão sendo herdados da classe pai
        this.nome = nome;
        this.cpf = cpf;
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

    
}
