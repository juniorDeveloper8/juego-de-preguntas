package formularios;

import javax.swing.JOptionPane;

public class segundojuego22 extends javax.swing.JFrame {

    public segundojuego22() {
        initComponents();
        pa1.setVisible(false);
        pa2.setVisible(false);
        pa3.setVisible(false);
        pa4.setVisible(false);
        pa5.setVisible(false);
        pe.setVisible(false);

        rsscalelabel.RSScaleLabel.setScaleLabel(giflb, "src/imagen2/aver.gif");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/imagen2/aver2.PNG");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        pa3 = new javax.swing.JLabel();
        pa2 = new javax.swing.JLabel();
        pe = new javax.swing.JLabel();
        pa1 = new javax.swing.JLabel();
        pa4 = new javax.swing.JLabel();
        pa5 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        tex = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        giflb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox4.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("ninguna");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, 20));

        pa3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pa3.setForeground(new java.awt.Color(255, 255, 255));
        pa3.setText("ITSCOGOD");
        jPanel1.add(pa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 110, 30));

        pa2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pa2.setForeground(new java.awt.Color(255, 255, 255));
        pa2.setText("ITSCOGOD");
        jPanel1.add(pa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, 30));

        pe.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pe.setForeground(new java.awt.Color(255, 255, 255));
        pe.setText("PALABRA SECRETA:");
        jPanel1.add(pe, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 310, 140, -1));

        pa1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pa1.setForeground(new java.awt.Color(255, 255, 255));
        pa1.setText("ITSCOGOD");
        jPanel1.add(pa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 110, 30));

        pa4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pa4.setForeground(new java.awt.Color(255, 255, 255));
        pa4.setText("ITSCOGOD");
        jPanel1.add(pa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 110, 30));

        pa5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        pa5.setForeground(new java.awt.Color(255, 255, 255));
        pa5.setText("ITSCOGOD");
        jPanel1.add(pa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 110, 30));

        jCheckBox3.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("aveces");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("verdadero");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("falso");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("VUELVE AL MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        tex.setBackground(new java.awt.Color(153, 153, 0));
        tex.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tex.setForeground(new java.awt.Color(255, 255, 255));
        tex.setText("En la pedagogiaa del amor es un proceso docente orientado a resultados");
        jPanel1.add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 30));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 280, 920, 170));

        giflb.setBackground(new java.awt.Color(153, 255, 51));
        jPanel1.add(giflb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 920, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int contador = 0;
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA");
            contador = +1;
            tex.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);
            pa1.setVisible(true);
            pa2.setVisible(true);
            pa3.setVisible(true);
            pa4.setVisible(true);
            pa5.setVisible(true);
            pe.setVisible(true);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()) {
            JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox2.isSelected()) {
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
            java.util.logging.Logger.getLogger(segundojuego22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segundojuego22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segundojuego22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segundojuego22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segundojuego22().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel giflb;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pa1;
    private javax.swing.JLabel pa2;
    private javax.swing.JLabel pa3;
    private javax.swing.JLabel pa4;
    private javax.swing.JLabel pa5;
    private javax.swing.JLabel pe;
    private javax.swing.JLabel tex;
    // End of variables declaration//GEN-END:variables

    private void SegundoNivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
