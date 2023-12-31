/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laundry;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Page extends javax.swing.JFrame {

    /**
     * Creates new form Page
     */
    public Page() {
        initComponents();
    }
    
    public float Total_Harga;
    
    public void reset(){
        dropdown.setSelectedItem("Pilih Jenis");
        harga.setText("");
        berat.setText("");
        totalharga.setText("");
        bayar.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dropdown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        totalharga = new javax.swing.JTextField();
        transaksi = new javax.swing.JButton();
        batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LAUNDRY HEHEHE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 50));

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bayar :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, 30));

        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis", "Cuci Basah", "Cuci Kering", "Cuci Setrika" }));
        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });
        jPanel1.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 30));

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jenis Cuci :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, 30));

        jLabel4.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Harga :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 30));

        jLabel5.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Berat :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 70, 30));

        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Harga :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 30));

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        jPanel1.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 200, 30));

        harga.setEditable(false);
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        jPanel1.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 30));

        berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratActionPerformed(evt);
            }
        });
        berat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                beratKeyReleased(evt);
            }
        });
        jPanel1.add(berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, 30));

        totalharga.setEditable(false);
        totalharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalhargaActionPerformed(evt);
            }
        });
        jPanel1.add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 200, 30));

        transaksi.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        transaksi.setText("TRANSAKSI");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, 40));

        batal.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel1.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        setSize(new java.awt.Dimension(416, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void beratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratActionPerformed

    private void totalhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalhargaActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        if (bayar.getText().isEmpty() || harga.getText().isEmpty() || berat.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
        } else {
            float pembayaran = Float.parseFloat(bayar.getText());
                    float kembalian = pembayaran-Total_Harga;
                    double kembalianformat = Double.parseDouble(String.valueOf(kembalian));
                    if (pembayaran >= Total_Harga) {
                JOptionPane.showMessageDialog(null, "Kembalian Anda : \n" + kembalianformat);
            } else {
                        JOptionPane.showMessageDialog(null, "Uang Anda Kurang : \n" + kembalianformat);
            }
                    
                    reset();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
    reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_batalActionPerformed

    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        if (dropdown.getSelectedItem().equals("Pilih Jenis")) {
            harga.setText("0");
        } else if(dropdown.getSelectedItem().equals("Cuci Basah")) {
            harga.setText("3000");
        }else if(dropdown.getSelectedItem().equals("Cuci Kering")){
            harga.setText("4000");
        }else if(dropdown.getSelectedItem().equals("Cuci Setrika")){
            harga.setText("5000");
        } 
       // TODO add your handling code here:
    }//GEN-LAST:event_dropdownActionPerformed

    private void beratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beratKeyReleased
        if (berat.getText().equals("")) {
            totalharga.setText("0");
        } else {
            float harga1 = Float.parseFloat(harga.getText());
            float berat1 = Float.parseFloat(berat.getText());
            Total_Harga = harga1*berat1;
            double totalformat = Double.parseDouble(String.valueOf(Total_Harga));
            totalharga.setText(String.valueOf(totalformat));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_beratKeyReleased

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
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField berat;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField totalharga;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
