package Model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Agendamento {
    private int id;
    private ClientePF clientepf;
    private ClientePJ clientepj;
    private Passeio passeio;
    private float valor;
    private Date data;
    private String observacao;

    //Construtor para retornar dados da classe ClientePF
    public Agendamento(int id, ClientePF clientepf, Passeio passeio, float valor, String data) {
        this.id = id;
        this.clientepf = clientepf;
        this.passeio = passeio;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Construtor para retornar dados da classe ClientePJ
    public Agendamento(int id, ClientePJ clientepj, Passeio passeio, float valor, String data) {
        this.id = id;
        this.clientepj = clientepj;
        this.passeio = passeio;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Para armazenamento de data e hora, necessario converter o atributo data de Date para String
    //O uso do try catch e para o tratamento de possiveis falhas dessa conversão

    public Agendamento(int i, ClientePF clientePF_1, Passeio passeio1, int i0, String string, String string0, String cliente_vai_atrasar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Agendamento(int i, ClientePJ clientePJ_4, Passeio passeio1, int i0, String string, String string0, String cliente_vai_atrasar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClientePF getClientepf() {
        return clientepf;
    }

    public void setClientepf(ClientePF clientepf) {
        this.clientepf = clientepf;
    }

    public ClientePJ getClientepj() {
        return clientepj;
    }

    public void setClientepj(ClientePJ clientepj) {
        this.clientepj = clientepj;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}
