package Controller;

import Controller.Helper.LoginHelper;
import Model.Funcionario;
import View.Login;

public class LoginController {

   private final Login view;
   private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void fazerLogin(){     
        //Verifica se usuário existe
        Funcionario funcionario = helper.obterModelo();
        //Valida sessão
        //Dados incorretos
    }
    
    //Botão de login da View Login
    public void fazerTarefa(){
        System.out.println("Buscando no Banco de Dados");  
        this.view.exibeMensagem("Tarefa concluída");
    }
}