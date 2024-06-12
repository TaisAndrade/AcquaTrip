/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author 202101342011
 */
public class PessoaJuridicaForm extends javax.swing.JFrame {

    /**
     * Creates new form PessoaJuridicaForm
     */
    public PessoaJuridicaForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabelCadastro = new javax.swing.JLabel();
        JLabelId = new javax.swing.JLabel();
        JTextID = new javax.swing.JTextField();
        JLabelRazaoSocial = new javax.swing.JLabel();
        JTextRazaoSocial = new javax.swing.JTextField();
        JLabelCnpj = new javax.swing.JLabel();
        JTextCnpj = new javax.swing.JTextField();
        JLabelEmail = new javax.swing.JLabel();
        JTextEmail = new javax.swing.JTextField();
        JLabelTelefone = new javax.swing.JLabel();
        JTextTelefone = new javax.swing.JTextField();
        JLabelEndereco = new javax.swing.JLabel();
        JTextEndereco = new javax.swing.JTextField();
        JButtonSalvar1 = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelCadastro.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        JLabelCadastro.setForeground(new java.awt.Color(1, 51, 112));
        JLabelCadastro.setText("Cadastro de Pessoa Jurídica");
        getContentPane().add(JLabelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 300, -1));

        JLabelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelId.setForeground(new java.awt.Color(1, 51, 112));
        JLabelId.setText("ID:");
        getContentPane().add(JLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        JTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextIDActionPerformed(evt);
            }
        });
        getContentPane().add(JTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, -1));

        JLabelRazaoSocial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelRazaoSocial.setForeground(new java.awt.Color(1, 51, 112));
        JLabelRazaoSocial.setText("Razão Social:");
        getContentPane().add(JLabelRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));
        getContentPane().add(JTextRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 180, -1));

        JLabelCnpj.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelCnpj.setForeground(new java.awt.Color(1, 51, 112));
        JLabelCnpj.setText("CNPJ:");
        getContentPane().add(JLabelCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        JTextCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(JTextCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 220, -1));

        JLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelEmail.setForeground(new java.awt.Color(1, 51, 112));
        JLabelEmail.setText("Email:");
        getContentPane().add(JLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));
        getContentPane().add(JTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 180, -1));

        JLabelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelTelefone.setForeground(new java.awt.Color(1, 51, 112));
        JLabelTelefone.setText("Telefone:");
        getContentPane().add(JLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        getContentPane().add(JTextTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 220, -1));

        JLabelEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelEndereco.setForeground(new java.awt.Color(1, 51, 112));
        JLabelEndereco.setText("Endereço:");
        getContentPane().add(JLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));
        getContentPane().add(JTextEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 180, -1));

        JButtonSalvar1.setBackground(new java.awt.Color(0, 255, 102));
        JButtonSalvar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButtonSalvar1.setText("Salvar");
        JButtonSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvar1ActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, 40));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/form_background.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 549));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextIDActionPerformed

    private void JTextCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCnpjActionPerformed

    private void JButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonSalvar1ActionPerformed

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
            java.util.logging.Logger.getLogger(PessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaJuridicaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSalvar1;
    private javax.swing.JLabel JLabelCadastro;
    private javax.swing.JLabel JLabelCnpj;
    private javax.swing.JLabel JLabelEmail;
    private javax.swing.JLabel JLabelEndereco;
    private javax.swing.JLabel JLabelId;
    private javax.swing.JLabel JLabelRazaoSocial;
    private javax.swing.JLabel JLabelTelefone;
    private javax.swing.JTextField JTextCnpj;
    private javax.swing.JTextField JTextEmail;
    private javax.swing.JTextField JTextEndereco;
    private javax.swing.JTextField JTextID;
    private javax.swing.JTextField JTextRazaoSocial;
    private javax.swing.JTextField JTextTelefone;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
