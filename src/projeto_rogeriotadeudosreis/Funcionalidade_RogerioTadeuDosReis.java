/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_rogeriotadeudosreis;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roger
 */
public class Funcionalidade_RogerioTadeuDosReis extends javax.swing.JFrame  {

    private static String nome = null;
    private static String telefone = null;
    private static String email = null;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Funcionalidade_RogerioTadeuDosReis.nome = nome;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Funcionalidade_RogerioTadeuDosReis.telefone = telefone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Funcionalidade_RogerioTadeuDosReis.email = email;
    }

    private void salvarcontatonagrid() throws Exception {

        DefaultTableModel model = (DefaultTableModel) jTableCadContato.getModel();
        String[] linha = new String[3];
        linha[0] = "" + nome.toUpperCase();
        linha[1] = "" + telefone;
        linha[2] = "" + email;
        model.addRow(linha);
    }

    private void validacampos() throws Exception {

        if (jTextFieldNome.getText().isEmpty()) {
            jTextFieldNome.requestFocus();
            throw new Exception("O campo nome não pode ser vazio");
        }
        if (jFormattedTextFieldTelefone.getText().equals(" ")) {
           jFormattedTextFieldTelefone .requestFocus();
            throw new Exception("O campo telefone não pode ser vazio");
        }

        if (jTextFieldEmail.getText().isEmpty()) {
            jTextFieldEmail.requestFocus();
            throw new Exception("O campo email não pode ser vazio");
        }
    }

    private void limpacampos() {
        jTextFieldNome.setText("");
        jFormattedTextFieldTelefone.setText("");
        jTextFieldEmail.setText("");
    }

    private void preencherCampos() {
        nome = jTableCadContato.getValueAt(jTableCadContato.getSelectedRow(), 0).toString();
        telefone = jTableCadContato.getValueAt(jTableCadContato.getSelectedRow(), 1).toString();
        email = jTableCadContato.getValueAt(jTableCadContato.getSelectedRow(), 2).toString();
        jTextFieldNome.setText(nome);
        jFormattedTextFieldTelefone.setText(telefone);
        jTextFieldEmail.setText(email);

    }

    /**
     * Creates new form Funcionalidade_RogerioTadeuDosReis
     */
    public Funcionalidade_RogerioTadeuDosReis() {
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

        jPanelEstruturaMonolitica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadContato = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estrutura Monolítica");

        jLabel1.setText("Cadastro de Contatos");

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone");

        jLabel4.setText("Email");

        jTextFieldNome.setText("Rogério Tadeu dos Reis ");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldEmail.setText("rogerio.rtr46@gmail.com");

        jTableCadContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCadContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCadContatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCadContato);
        if (jTableCadContato.getColumnModel().getColumnCount() > 0) {
            jTableCadContato.getColumnModel().getColumn(0).setMinWidth(250);
            jTableCadContato.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTableCadContato.getColumnModel().getColumn(0).setMaxWidth(250);
            jTableCadContato.getColumnModel().getColumn(1).setMinWidth(120);
            jTableCadContato.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTableCadContato.getColumnModel().getColumn(1).setMaxWidth(120);
        }

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## ##### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldTelefoneKeyTyped(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEstruturaMonoliticaLayout = new javax.swing.GroupLayout(jPanelEstruturaMonolitica);
        jPanelEstruturaMonolitica.setLayout(jPanelEstruturaMonoliticaLayout);
        jPanelEstruturaMonoliticaLayout.setHorizontalGroup(
            jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstruturaMonoliticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                        .addComponent(jTextFieldEmail))
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanelEstruturaMonoliticaLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        jPanelEstruturaMonoliticaLayout.setVerticalGroup(
            jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstruturaMonoliticaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonSalvar)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEstruturaMonoliticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEstruturaMonolitica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEstruturaMonolitica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {

            nome = jTextFieldNome.getText().trim();
            telefone = jFormattedTextFieldTelefone.getText().trim();
            email = jTextFieldEmail.getText().trim();
            validacampos();
            salvarcontatonagrid();
            limpacampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            // TODO add your handling code here:
            validacampos();
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este registro ?");
            if (opcao == 0) {
                ((DefaultTableModel) jTableCadContato.getModel()).removeRow(jTableCadContato.getSelectedRow());
            }
            limpacampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "O campo que deseja excluir está vazio\nSelecione um registro");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableCadContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCadContatoMouseClicked
        // TODO add your handling code here:
        preencherCampos();
    }//GEN-LAST:event_jTableCadContatoMouseClicked

    private void jFormattedTextFieldTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jFormattedTextFieldTelefoneKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Funcionalidade_RogerioTadeuDosReis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionalidade_RogerioTadeuDosReis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionalidade_RogerioTadeuDosReis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionalidade_RogerioTadeuDosReis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionalidade_RogerioTadeuDosReis().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelEstruturaMonolitica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadContato;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
