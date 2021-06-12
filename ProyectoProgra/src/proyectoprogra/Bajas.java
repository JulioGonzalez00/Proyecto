/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author IZTROW
 */
public class Bajas extends javax.swing.JFrame {

    MySqlConn conn;
    int tot;
    /**
     * Creates new form Bajas
     * @param conn
     */
    public Bajas(MySqlConn conn) {
        this.conn = conn;
        tot = 0;
        initComponents();
    }
    public Bajas() {
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

        jPanelPizarron = new javax.swing.JPanel();
        jLabelCheckOut = new javax.swing.JLabel();
        jLabelLema = new javax.swing.JLabel();
        jLabelNumeroHab = new javax.swing.JLabel();
        jTextFieldNum = new javax.swing.JTextField();
        jLabelCuenta = new javax.swing.JLabel();
        jLabelDiasEstancia = new javax.swing.JLabel();
        jLabelExtras = new javax.swing.JLabel();
        jCheckBoxHab = new javax.swing.JCheckBox();
        jCheckBoxBar = new javax.swing.JCheckBox();
        jCheckBoxTint = new javax.swing.JCheckBox();
        jCheckBoxNiñera = new javax.swing.JCheckBox();
        jCheckBoxSPA = new javax.swing.JCheckBox();
        jLabelCuenta2 = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jButtonBaja = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPizarron.setPreferredSize(new java.awt.Dimension(490, 526));
        jPanelPizarron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCheckOut.setFont(new java.awt.Font("Sitka Small", 1, 48)); // NOI18N
        jLabelCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCheckOut.setText("Check Out");
        jPanelPizarron.add(jLabelCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 70));

        jLabelLema.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabelLema.setForeground(new java.awt.Color(234, 223, 223));
        jLabelLema.setText("¡Vuelva pronto al Paraiso!");
        jPanelPizarron.add(jLabelLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 60));

        jLabelNumeroHab.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelNumeroHab.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroHab.setText("Numero de Habitación:");
        jPanelPizarron.add(jLabelNumeroHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 310, 50));

        jTextFieldNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNumKeyPressed(evt);
            }
        });
        jPanelPizarron.add(jTextFieldNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 100, 30));

        jLabelCuenta.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuenta.setText("Cuenta:");
        jPanelPizarron.add(jLabelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 30));

        jLabelDiasEstancia.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelDiasEstancia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiasEstancia.setText("Nombre del cliente:");
        jPanelPizarron.add(jLabelDiasEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 30));

        jLabelExtras.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelExtras.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExtras.setText("Cargos Extra:");
        jPanelPizarron.add(jLabelExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 50));

        jCheckBoxHab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBoxHab.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxHab.setText("Servicio a la Habitacion");
        jCheckBoxHab.setContentAreaFilled(false);
        jCheckBoxHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHabActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jCheckBoxHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jCheckBoxBar.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBoxBar.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxBar.setText("Servicio de Bar");
        jCheckBoxBar.setContentAreaFilled(false);
        jCheckBoxBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBarActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jCheckBoxBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jCheckBoxTint.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBoxTint.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxTint.setText("Servicio de Tintoreria");
        jCheckBoxTint.setContentAreaFilled(false);
        jCheckBoxTint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTintActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jCheckBoxTint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, -1));

        jCheckBoxNiñera.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBoxNiñera.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxNiñera.setText("Servicio de Niñera");
        jCheckBoxNiñera.setContentAreaFilled(false);
        jCheckBoxNiñera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNiñeraActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jCheckBoxNiñera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jCheckBoxSPA.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBoxSPA.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSPA.setText("Servicio de SPA");
        jCheckBoxSPA.setContentAreaFilled(false);
        jCheckBoxSPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSPAActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jCheckBoxSPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabelCuenta2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelCuenta2.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPizarron.add(jLabelCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 310, 30));

        jLabelNom.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPizarron.add(jLabelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 270, 30));

        jButtonBaja.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButtonBaja.setText("Realizar la baja");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/47073000_539474563219724_1011172439784161280_n.jpg"))); // NOI18N
        jPanelPizarron.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 770, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumKeyPressed
        // TODO add your handling code here:
        this.tot = 0;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jCheckBoxBar.setSelected(false);
            this.jCheckBoxSPA.setSelected(false);
            this.jCheckBoxHab.setSelected(false);
            this.jCheckBoxNiñera.setSelected(false);
            this.jCheckBoxTint.setSelected(false);
            int hab;
            String query;
            hab = Integer.parseInt(this.jTextFieldNum.getText().trim());
            query = "SELECT * FROM habitaciones WHERE habitaciones.habitacion = '" + hab + "'";
            this.conn.Consult(query);
            try{
                String nombre = this.conn.rs.getString(1);
                this.jLabelNom.setText(nombre);
                System.out.println(nombre);
                switch(this.conn.rs.getString(4)){
                    case "1":
                        this.tot += 600 * Integer.parseInt(this.conn.rs.getString(5));
                        break;
                    case "2":
                        this.tot += 700 * Integer.parseInt(this.conn.rs.getString(5));
                        break;
                    case "3":
                        this.tot += 800 * Integer.parseInt(this.conn.rs.getString(5));
                        break;
                }
                if(Integer.parseInt(this.conn.rs.getString(7)) > Integer.parseInt(this.conn.rs.getString(4))){
                    tot += ((Integer.parseInt(this.conn.rs.getString(7))-Integer.parseInt(this.conn.rs.getString(4)))*150)*Integer.parseInt(this.conn.rs.getString(5));
                }
                this.jLabelCuenta2.setText(""+tot);
            }catch(SQLException ex){
                System.out.println("Habitacion no ocupada");
            }
        }
    }//GEN-LAST:event_jTextFieldNumKeyPressed

    private void jCheckBoxNiñeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNiñeraActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBoxNiñera.isSelected()){
            this.tot += 200;
        }else{
            this.tot -= 200;
        }
        this.jLabelCuenta2.setText(""+tot);
    }//GEN-LAST:event_jCheckBoxNiñeraActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        // TODO add your handling code here:
        String hab = this.jTextFieldNum.getText().trim();
        String query;
        int cuenta = 0;
        if(hab.isEmpty()){
            JOptionPane.showMessageDialog(this,"Numero de Habitacion vacio");
        }else{
            query = "DELETE FROM habitaciones WHERE habitaciones.habitacion = " + hab;
            
            int j = this.conn.Update(query);
            if(j>0){
                JOptionPane.showMessageDialog(this,"Baja realizada");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this,"La baja no se pudo realizar");
                return;
            }
        query = "SELECT * FROM habitaciones WHERE habitaciones.habitacion = '1'";
        this.conn.Consult(query);
            try {
                cuenta = Integer.parseInt(this.conn.rs.getString(7));
            } catch (SQLException ex) {
                Logger.getLogger(Bajas.class.getName()).log(Level.SEVERE, null, ex);
            }
        cuenta+=tot;
        query = "UPDATE `habitaciones` SET `totalOcup` = '"+ cuenta +"' WHERE `habitaciones`.`habitacion` = 1 ";
        this.conn.Update(query);
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jCheckBoxHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHabActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBoxHab.isSelected()){
            this.tot += 300;
        }else{
            this.tot -= 300;
        }
        this.jLabelCuenta2.setText(""+tot);
    }//GEN-LAST:event_jCheckBoxHabActionPerformed

    private void jCheckBoxTintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTintActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBoxTint.isSelected()){
            this.tot += 100;
        }else{
            this.tot -= 100;
        }
        this.jLabelCuenta2.setText(""+tot);
    }//GEN-LAST:event_jCheckBoxTintActionPerformed

    private void jCheckBoxSPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSPAActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBoxSPA.isSelected()){
            this.tot += 300;
        }else{
            this.tot -= 300;
        }
        this.jLabelCuenta2.setText(""+tot);
    }//GEN-LAST:event_jCheckBoxSPAActionPerformed

    private void jCheckBoxBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBarActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBoxBar.isSelected()){
            this.tot += 250;
        }else{
            this.tot -= 250;
        }
        this.jLabelCuenta2.setText(""+tot);
    }//GEN-LAST:event_jCheckBoxBarActionPerformed

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
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JCheckBox jCheckBoxBar;
    private javax.swing.JCheckBox jCheckBoxHab;
    private javax.swing.JCheckBox jCheckBoxNiñera;
    private javax.swing.JCheckBox jCheckBoxSPA;
    private javax.swing.JCheckBox jCheckBoxTint;
    private javax.swing.JLabel jLabelCheckOut;
    private javax.swing.JLabel jLabelCuenta;
    private javax.swing.JLabel jLabelCuenta2;
    private javax.swing.JLabel jLabelDiasEstancia;
    private javax.swing.JLabel jLabelExtras;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLema;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNumeroHab;
    private javax.swing.JPanel jPanelPizarron;
    private javax.swing.JTextField jTextFieldNum;
    // End of variables declaration//GEN-END:variables
}
