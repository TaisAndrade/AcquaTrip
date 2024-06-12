package Model;

//Abstract impede que na classe main se crie um objeto Cliente, permitindo apenas a criação dos objetos ClientePF ou ClientePJ
abstract class Cliente {
    
    //Protected torna os atributos acessiveis as classes filhas, enquanto Private apenas dentro da classe
    protected int id;
    protected String email;
    protected String telefone;
    protected String endereco;
    
    public Cliente(int id, String email, String telefone, String endereco){
        this.id =id;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;      
    }
    
    public Cliente(int id, String email, String telefone){
        this.id =id;
        this.email = email;
        this.telefone = telefone;      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
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
    
    
}
