
package formularios;

import javax.swing.JOptionPane;

public class segundojuego2 extends javax.swing.JFrame {

    
    public segundojuego2() {
        initComponents();
         pa1.setVisible(false);
        pal2.setVisible(false);
        pal3.setVisible(false);
        pal4.setVisible(false);
        pal5.setVisible(false);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pal2 = new javax.swing.JLabel();
        pal3 = new javax.swing.JLabel();
        pal4 = new javax.swing.JLabel();
        pal5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        pa1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tex = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pal2.setForeground(new java.awt.Color(255, 255, 255));
        pal2.setText("ITSCOGOD");
        jPanel1.add(pal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        pal3.setForeground(new java.awt.Color(255, 255, 255));
        pal3.setText("ITSCOGOD");
        jPanel1.add(pal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        pal4.setForeground(new java.awt.Color(255, 255, 255));
        pal4.setText("ITSCOGOD");
        jPanel1.add(pal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        pal5.setForeground(new java.awt.Color(255, 255, 255));
        pal5.setText("ITSCOGOD");
        jPanel1.add(pal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("verdadero");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("aveces");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 0, 8)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("falso");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("ninguna");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        pa1.setForeground(new java.awt.Color(255, 255, 255));
        pa1.setText("PALABRA CLAVE:");
        jPanel1.add(pa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 30));

        jButton1.setText("ANTERIOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        tex.setBackground(new java.awt.Color(153, 153, 0));
        tex.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        tex.setForeground(new java.awt.Color(255, 255, 255));
        tex.setText("instruir significaa enseñar aa ser y a vivir como personas de sociedad");
        jPanel1.add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/aver2.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 460, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/aver.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int contador=0;
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    if (jCheckBox1.isSelected()){
        JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA");
        contador=+1;
        tex.setVisible(false);
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        pa1.setVisible(true);
        pal2.setVisible(true);
        pal3.setVisible(true);
        pal4.setVisible(true);
        pal5.setVisible(true);
        
       
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()){
           JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()){
           JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox2.isSelected()){
           JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       menu vistamenu = new menu();
       vistamenu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(segundojuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segundojuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segundojuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segundojuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segundojuego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pa1;
    private javax.swing.JLabel pal2;
    private javax.swing.JLabel pal3;
    private javax.swing.JLabel pal4;
    private javax.swing.JLabel pal5;
    private javax.swing.JLabel tex;
    // End of variables declaration//GEN-END:variables

    private void SegundoNivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
