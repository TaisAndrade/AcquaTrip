package Model;

public class Passeio {
    private int id;
    private String descricao;
    private float duracao;
    private float valor;
    
    //Construtores tornam os elementos acessiveis fora da classe atraves do envio de mensagens de requisição
    public Passeio(int id, String descricao, float duracao, float valor){
        this.id = id;
        this.descricao = descricao;
        this.duracao = duracao;
        this.valor = valor;
    }

    //Metodo GET(captura valor) e SET(manipula valor)
    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getDuracao() {
        return duracao;
    }


    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getValor() {
        return valor;
    }


    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

