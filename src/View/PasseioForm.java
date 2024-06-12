/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author 202101342011
 */
public class PasseioForm extends javax.swing.JFrame {

    /**
     * Creates new form PasseioForm
     */
    public PasseioForm() {
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
        JLabelId1 = new javax.swing.JLabel();
        JTextID1 = new javax.swing.JTextField();
        JLabelDescricao = new javax.swing.JLabel();
        JTextDescricao = new javax.swing.JTextField();
        JLabelDuracao = new javax.swing.JLabel();
        JTextDuracao = new javax.swing.JTextField();
        JLabelValor = new javax.swing.JLabel();
        JTextValor = new javax.swing.JTextField();
        JButtonSalvar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();
        JLabelId2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelCadastro.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        JLabelCadastro.setForeground(new java.awt.Color(1, 51, 112));
        JLabelCadastro.setText("Novo Passeio");
        getContentPane().add(JLabelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        JLabelId1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelId1.setForeground(new java.awt.Color(1, 51, 112));
        JLabelId1.setText("ID:");
        getContentPane().add(JLabelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        JTextID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextID1ActionPerformed(evt);
            }
        });
        getContentPane().add(JTextID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, -1));

        JLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelDescricao.setForeground(new java.awt.Color(1, 51, 112));
        JLabelDescricao.setText("Descrição:");
        getContentPane().add(JLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        JTextDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(JTextDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 230, -1));

        JLabelDuracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelDuracao.setForeground(new java.awt.Color(1, 51, 112));
        JLabelDuracao.setText("Duração:");
        getContentPane().add(JLabelDuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        JTextDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDuracaoActionPerformed(evt);
            }
        });
        getContentPane().add(JTextDuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, -1));

        JLabelValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelValor.setForeground(new java.awt.Color(1, 51, 112));
        JLabelValor.setText("Valor:");
        getContentPane().add(JLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        JTextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextValorActionPerformed(evt);
            }
        });
        getContentPane().add(JTextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 230, -1));

        JButtonSalvar.setBackground(new java.awt.Color(0, 255, 102));
        JButtonSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButtonSalvar.setText("Salvar");
        JButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 130, 40));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/form_background.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 718, 481));

        JLabelId2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabelId2.setForeground(new java.awt.Color(1, 51, 112));
        JLabelId2.setText("Descrição:");
        getContentPane().add(JLabelId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvarActionPerformed

    }//GEN-LAST:event_JButtonSalvarActionPerformed

    private void JTextDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDescricaoActionPerformed

    private void JTextID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextID1ActionPerformed

    private void JTextDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDuracaoActionPerformed

    private void JTextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextValorActionPerformed

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
            java.util.logging.Logger.getLogger(PasseioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasseioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasseioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasseioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasseioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSalvar;
    private javax.swing.JLabel JLabelCadastro;
    private javax.swing.JLabel JLabelDescricao;
    private javax.swing.JLabel JLabelDuracao;
    private javax.swing.JLabel JLabelId1;
    private javax.swing.JLabel JLabelId2;
    private javax.swing.JLabel JLabelValor;
    private javax.swing.JTextField JTextDescricao;
    private javax.swing.JTextField JTextDuracao;
    private javax.swing.JTextField JTextID1;
    private javax.swing.JTextField JTextValor;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
