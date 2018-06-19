/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopublicacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
    
    //private final ArrayList <clsTipoFato> TipoFato = new ArrayList <clsTipoFato> ();
    private final ArrayList <String> TipoFato = new ArrayList <String> ();

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        listarFatosRelevantes = new javax.swing.JButton();
        cadastrarFato = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listarFatosRelevantes.setText("Listar fatos relevantes");
        listarFatosRelevantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFatosRelevantesActionPerformed(evt);
            }
        });

        cadastrarFato.setText("Cadastrar fato");
        cadastrarFato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFatoActionPerformed(evt);
            }
        });

        sair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(listarFatosRelevantes)
                .addGap(27, 27, 27)
                .addComponent(cadastrarFato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarFato)
                    .addComponent(sair)
                    .addComponent(listarFatosRelevantes))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarFatosRelevantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFatosRelevantesActionPerformed
        // TODO add your handling code here:
        int cont = 0;
        String show = "";
        while(TipoFato.get(cont).){
            show = show + "\nDado " + cont + ": " + TipoFato.get(cont);
            cont++;
        }
        JOptionPane.showMessageDialog(null, show);
    }//GEN-LAST:event_listarFatosRelevantesActionPerformed

    private void cadastrarFatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFatoActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showInputDialog("Insira o texto");
        String ade = JOptionPane.showInputDialog(rootPane, "Insira o texto: ", "Inserir texto", HEIGHT);
        TipoFato.add(ade);
    }//GEN-LAST:event_cadastrarFatoActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarFato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listarFatosRelevantes;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}