/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

/**
 *
 * @author enzo
 */
public class EmailMainGUI extends javax.swing.JFrame {

    /**
     * Creates new form EmailMainGUI
     */
    public EmailMainGUI() {
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

        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPara = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(630, 450));
        setMinimumSize(new java.awt.Dimension(630, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnviar.setText("Enviar");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEnviarMouseReleased(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 120, 30));

        jLabel1.setText("Para");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(txtPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 570, 40));

        jLabel2.setText("CC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 570, 40));

        jLabel3.setText("Mensaje");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 570, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseReleased
        SendEmail SE = new SendEmail(txtPara.getText(), txtCC.getText(), jTextArea2.getText());
    }//GEN-LAST:event_btnEnviarMouseReleased

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
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailMainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtPara;
    // End of variables declaration//GEN-END:variables
}
