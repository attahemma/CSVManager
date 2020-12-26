/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvmanager;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GCONAM
 */
public class CSVManager extends javax.swing.JFrame {

    /**
     * Creates new form CSVManager
     */
    public CSVManager() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        file1 = new javax.swing.JButton();
        file2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        column1 = new javax.swing.JTextField();
        column2 = new javax.swing.JTextField();
        column3 = new javax.swing.JTextField();
        column4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CSV MANAGER");
        setPreferredSize(new java.awt.Dimension(450, 320));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to CSV Manager");
        jPanel2.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please Select the CSV files and Indidcate the columns for comparisons");
        jPanel3.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 260));

        file1.setBackground(new java.awt.Color(114, 8, 8));
        file1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        file1.setForeground(new java.awt.Color(255, 255, 255));
        file1.setText("Select File 1");
        file1.setPreferredSize(new java.awt.Dimension(300, 30));
        file1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file1ActionPerformed(evt);
            }
        });
        jPanel4.add(file1);

        file2.setBackground(new java.awt.Color(114, 8, 8));
        file2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        file2.setForeground(new java.awt.Color(255, 255, 255));
        file2.setText("Select File 2");
        file2.setPreferredSize(new java.awt.Dimension(300, 30));
        file2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file2ActionPerformed(evt);
            }
        });
        jPanel4.add(file2);

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(65, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Column 1");
        jPanel5.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Column 2");
        jPanel5.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Column 3");
        jPanel5.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Column 4");
        jPanel5.add(jLabel6);

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 100));

        column1.setToolTipText("Please make sure to write out the column name as exact as it is in the csv file");
        column1.setPreferredSize(new java.awt.Dimension(210, 20));
        column1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column1ActionPerformed(evt);
            }
        });
        jPanel6.add(column1);

        column2.setToolTipText("Please make sure to write out the column name as exact as it is in the csv file");
        column2.setPreferredSize(new java.awt.Dimension(210, 20));
        column2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column2ActionPerformed(evt);
            }
        });
        jPanel6.add(column2);

        column3.setToolTipText("Please make sure to write out the column name as exact as it is in the csv file");
        column3.setPreferredSize(new java.awt.Dimension(210, 20));
        column3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column3ActionPerformed(evt);
            }
        });
        jPanel6.add(column3);

        column4.setToolTipText("Please make sure to write out the column name as exact as it is in the csv file");
        column4.setPreferredSize(new java.awt.Dimension(210, 20));
        column4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column4ActionPerformed(evt);
            }
        });
        jPanel6.add(column4);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel1);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Process");
        jPanel3.add(jButton1, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void column1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column1ActionPerformed

    private void column2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column2ActionPerformed

    private void column3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column3ActionPerformed

    private void column4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_column4ActionPerformed

    private void file2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file2ActionPerformed

    private void file1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file1ActionPerformed
        try{
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        String filename = fileChooser.getSelectedFile().getAbsolutePath();
        System.out.println("file name is: "+ filename);
        System.out.println("about to pass it to Reader");
        }catch(NullPointerException npe){
            System.err.println("An NPE occured");
        }
    }//GEN-LAST:event_file1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CSVManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSVManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSVManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSVManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSVManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField column1;
    private javax.swing.JTextField column2;
    private javax.swing.JTextField column3;
    private javax.swing.JTextField column4;
    private javax.swing.JButton file1;
    private javax.swing.JButton file2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
