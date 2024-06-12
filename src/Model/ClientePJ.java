package Model;

public class ClientePJ extends Cliente{

    public static void add(ClientePJ clientePJ_4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    protected String razaoSocial;
    protected String cnpj;

    public ClientePJ(int id, String razaoSocial, String cnpj, String email, String telefone, String endereco) {
        super(id, email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
        

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
     
    
}
