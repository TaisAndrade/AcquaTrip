package Controller.Helper;

import Model.Funcionario;
import View.Login;

public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Funcionario obterModelo(){
        //Capturar usuário da View
        String email = view.getJTextUser().getText();
        String password = view.getJPassword().getText();
        
        Funcionario funcionario = new Funcionario(email, password);
        return funcionario;
    }
    
    public void setModelo(Funcionario funcionario){
        String email = funcionario.getEmail();
        String password = funcionario.getSenha();
        
        view.getJTextUser().setText(email);
        view.getJPassword().setText(password);
    }
    
    public void limparTela(){
        view.getJTextUser().setText("");
        view.getJPassword().setText("");
    }
}
