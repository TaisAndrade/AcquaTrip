package View;

import Controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {

    private final LoginController controller;


    //Metodo de chamado do login
    public Login() {
        initComponents();
        this.controller = new LoginController(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelUser = new javax.swing.JLabel();
        JTextUser = new javax.swing.JTextField();
        JLabelPassword = new javax.swing.JLabel();
        JPassword = new javax.swing.JPasswordField();
        JButtonLogin1 = new javax.swing.JButton();
        JButtonCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelUser.setForeground(new java.awt.Color(1, 51, 112));
        JLabelUser.setText("Login:");
        getContentPane().add(JLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        JTextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextUserActionPerformed(evt);
            }
        });
        getContentPane().add(JTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 350, 30));

        JLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelPassword.setForeground(new java.awt.Color(1, 51, 112));
        JLabelPassword.setText("Senha:");
        getContentPane().add(JLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));
        getContentPane().add(JPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 350, 30));

        JButtonLogin1.setBackground(new java.awt.Color(0, 255, 102));
        JButtonLogin1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButtonLogin1.setText("Login");
        JButtonLogin1.setBorder(null);
        JButtonLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 120, 40));

        JButtonCadastro.setBackground(new java.awt.Color(0, 255, 102));
        JButtonCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButtonCadastro.setText("Cadastre-se");
        JButtonCadastro.setBorder(null);
        JButtonCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/login_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, 495));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ao clicar em cadastre-se abre-se uma nova tela para o cadastro
    private void JButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastroActionPerformed
        FuncionarioForm cadastroFuncionario = new FuncionarioForm ();
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_JButtonCadastroActionPerformed

    private void JButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLogin1ActionPerformed
        //Executa ação ao clicar em Entrar
        controller.fazerTarefa();
        System.out.println(JTextUser.getText()); //captura de usuário
        System.out.println(JPassword.getText()); //Captura senha
    }//GEN-LAST:event_JButtonLogin1ActionPerformed

    private void JTextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCadastro;
    private javax.swing.JButton JButtonLogin1;
    private javax.swing.JLabel JLabelPassword;
    private javax.swing.JLabel JLabelUser;
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JTextField JTextUser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

public void exibeMensagem(String mensagem) {
     JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getJPassword() {
        return JPassword;
    }

    public void setJPassword(JPasswordField JPassword) {
        this.JPassword = JPassword;
    }

    public JTextField getJTextUser() {
        return JTextUser;
    }

    public void setJTextUser(JTextField JTextUser) {
        this.JTextUser = JTextUser;
    }
    

}
