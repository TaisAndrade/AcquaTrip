package View;


public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel2Decoration = new javax.swing.JLabel();
        JLabel1Decoration = new javax.swing.JLabel();
        JLabelFundo = new javax.swing.JLabel();
        JMenuBar = new javax.swing.JMenuBar();
        JMenu1 = new javax.swing.JMenu();
        JMenuItemClientePF = new javax.swing.JMenuItem();
        jMenuItemClientePJ = new javax.swing.JMenuItem();
        jMenuItemPasseio = new javax.swing.JMenuItem();
        JMenu2 = new javax.swing.JMenu();
        JMenuItemAgendamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel2Decoration.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JLabel2Decoration.setForeground(new java.awt.Color(242, 143, 0));
        JLabel2Decoration.setText("SUA MELHOR EXPERIÊNCIA");
        getContentPane().add(JLabel2Decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 20));

        JLabel1Decoration.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JLabel1Decoration.setForeground(new java.awt.Color(1, 51, 112));
        JLabel1Decoration.setText("COMEÇA AQUI");
        getContentPane().add(JLabel1Decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, 20));

        JLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/menu_background.jpg"))); // NOI18N
        getContentPane().add(JLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 421));

        JMenu1.setBorder(null);
        JMenu1.setText("Cadastrar");
        JMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JMenuItemClientePF.setText("Cadastrar Cliente PF");
        JMenuItemClientePF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenuItemClientePF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemClientePFActionPerformed(evt);
            }
        });
        JMenu1.add(JMenuItemClientePF);

        jMenuItemClientePJ.setText("Cadastrar Cliente PJ");
        jMenuItemClientePJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemClientePJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientePJActionPerformed(evt);
            }
        });
        JMenu1.add(jMenuItemClientePJ);

        jMenuItemPasseio.setText("Cadastrar Passeio");
        jMenuItemPasseio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPasseioActionPerformed(evt);
            }
        });
        JMenu1.add(jMenuItemPasseio);

        JMenuBar.add(JMenu1);

        JMenu2.setText("Operações");
        JMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JMenuItemAgendamento.setText("Realizar Agendamento");
        JMenuItemAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenuItemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAgendamentoActionPerformed(evt);
            }
        });
        JMenu2.add(JMenuItemAgendamento);

        JMenuBar.add(JMenu2);

        setJMenuBar(JMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ao clicar em Agendamento redirecionara para a View Agenda
    private void JMenuItemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAgendamentoActionPerformed
        Agenda cadastroAgenda = new Agenda ();
        cadastroAgenda.setVisible(true);
    }//GEN-LAST:event_JMenuItemAgendamentoActionPerformed

    private void JMenuItemClientePFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClientePFActionPerformed
        PessoaFisicaForm cadastroPF = new PessoaFisicaForm ();
        cadastroPF.setVisible(true);                                    
    }//GEN-LAST:event_JMenuItemClientePFActionPerformed

    private void jMenuItemClientePJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientePJActionPerformed
       PessoaJuridicaForm cadastroPJ = new PessoaJuridicaForm ();
        cadastroPJ.setVisible(true); 
    }//GEN-LAST:event_jMenuItemClientePJActionPerformed

    private void jMenuItemPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPasseioActionPerformed
        PasseioForm passeio = new PasseioForm ();
        passeio.setVisible(true); 
    }//GEN-LAST:event_jMenuItemPasseioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1Decoration;
    private javax.swing.JLabel JLabel2Decoration;
    private javax.swing.JLabel JLabelFundo;
    private javax.swing.JMenu JMenu1;
    private javax.swing.JMenu JMenu2;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenuItem JMenuItemAgendamento;
    private javax.swing.JMenuItem JMenuItemClientePF;
    private javax.swing.JMenuItem jMenuItemClientePJ;
    private javax.swing.JMenuItem jMenuItemPasseio;
    // End of variables declaration//GEN-END:variables
}
