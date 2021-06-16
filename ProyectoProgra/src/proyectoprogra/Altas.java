/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author IZTROW
 */
public class Altas extends javax.swing.JFrame {

    MySqlConn conn;
    Habitacion disponibles[];
    
    public Altas(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        this.revisahab();
    }
    /**
     * Creates new form Altas
     */
            
    public Altas() {
        initComponents();
    }
    private void revisahab(){
        String query;
        int j = 0;
        disponibles = new Habitacion[30];
        int numero,tipo,libre;
        for (int i = 201; i < 216; i++) {
            query = "select * from tothab where num = " + "'" + i + "'";
            try{
                this.conn.Consult(query);
                numero =Integer.parseInt(this.conn.rs.getString(1));
                tipo = Integer.parseInt(this.conn.rs.getString(2));
                libre = Integer.parseInt(this.conn.rs.getString(3));
                this.disponibles[j] = new Habitacion(numero,tipo,libre);
                j++;
            }catch(SQLException ex){
                System.out.println("Error al abrir SQL");
            }
        }
        for (int i = 301; i < 316; i++) {
            query = "select * from tothab where num = " + "'" + i + "'";
            try{
                this.conn.Consult(query);
                numero =Integer.parseInt(this.conn.rs.getString(1));
                tipo = Integer.parseInt(this.conn.rs.getString(2));
                libre = Integer.parseInt(this.conn.rs.getString(3));
                this.disponibles[j] = new Habitacion(numero,tipo,libre);
                j++;
            }catch(SQLException ex){
                System.out.println("Error al abrir SQL");
            }
        }
        
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelCuidadOr = new javax.swing.JLabel();
        jLabelTotHuespedes = new javax.swing.JLabel();
        jLabelDias = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jSpinnerDias = new javax.swing.JSpinner();
        jSpinnerHuespedes = new javax.swing.JSpinner();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelLema = new javax.swing.JLabel();
        jLabelIngreso = new javax.swing.JLabel();
        jDateChooserIngreso = new com.toedter.calendar.JDateChooser();
        jButtonConfirmar = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox();
        jLabelTipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHab = new javax.swing.JList();
        jLabelHuespedes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPizarron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPizarron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Sitka Small", 0, 60)); // NOI18N
        jLabelTitulo.setText("Registro");
        jPanelPizarron.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 260, 60));

        jLabelCliente.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente:");
        jPanelPizarron.add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 60));

        jLabelCuidadOr.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelCuidadOr.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuidadOr.setText("Cuidad de Origen: ");
        jPanelPizarron.add(jLabelCuidadOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 240, 30));

        jLabelTotHuespedes.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelTotHuespedes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTotHuespedes.setText("Total de Húespedes:");
        jPanelPizarron.add(jLabelTotHuespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, 40));

        jLabelDias.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelDias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDias.setText("Días de estancia:");
        jPanelPizarron.add(jLabelDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 270, 30));
        jPanelPizarron.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 30));
        jPanelPizarron.add(jSpinnerDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 100, 30));
        jPanelPizarron.add(jSpinnerHuespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 30));
        jPanelPizarron.add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 130, 30));

        jLabelLema.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabelLema.setText("¡Sonria con nosotros!");
        jPanelPizarron.add(jLabelLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 340, 40));

        jLabelIngreso.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIngreso.setText("Fecha de Ingreso:");
        jPanelPizarron.add(jLabelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, 50));
        jPanelPizarron.add(jDateChooserIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 150, 30));

        jButtonConfirmar.setText("Registrar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 140, 40));

        jComboBoxTipo.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sencilla", "Doble ", "Triple" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabelTipo.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo de Habitacion:");
        jPanelPizarron.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Habitacion");
        jPanelPizarron.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jScrollPane1.setViewportView(jListHab);

        jPanelPizarron.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 140, 70));

        jLabelHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/47093733_539474476553066_5090645292215173120_n.jpg"))); // NOI18N
        jPanelPizarron.add(jLabelHuespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 830, 526));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        String nom,origen,query;
        String parte1, parte2;
        Date fecha;
        long mil;
        int huespedes,dias,tipo=1,habitacion;
        nom = this.jTextFieldCliente.getText().trim();
        origen = this.jTextFieldCiudad.getText().trim();
        fecha = this.jDateChooserIngreso.getDate();
        mil = fecha.getTime();
        java.sql.Date fecha2 = new java.sql.Date(mil);
        huespedes = Integer.parseInt(this.jSpinnerHuespedes.getValue().toString().trim());
        dias = Integer.parseInt(this.jSpinnerDias.getValue().toString().trim());
        switch(this.jComboBoxTipo.getSelectedIndex()){
            case 0:
                tipo = 1;
                break;
            case 1:
                tipo = 2;
                break;
            case 2:
                tipo = 3;
                break;
        }
        habitacion = Integer.parseInt(this.jListHab.getSelectedValue().toString());
        if(huespedes <= tipo+2){
            parte1 = "Insert into habitaciones (nom,habitacion,origen,tipohab,dias,fecha,totalOcup) values (";
            parte2 = "'"+nom+"','"+habitacion+"','"+origen+"','"+tipo+"','"+dias+"','"+fecha2+"','"+huespedes+"')";
            query = parte1+parte2;
            this.conn.Update(query);
            query = "UPDATE `tothab` SET `libre` = '0' WHERE `tothab`.`num` = "+ habitacion;
            this.conn.Update(query);
            Ticket tic = new Ticket(this.conn,habitacion);
            tic.setVisible(true);
            tic.setLocationRelativeTo(null);
            this.dispose();
        }else{ 
            JOptionPane.showMessageDialog(this,"El numero de huespedes extra puede exceder solo en 2 al tipo de habitacion.");
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
        DefaultListModel <String> lista = new DefaultListModel<>();
        switch(this.jComboBoxTipo.getSelectedIndex()){
            case 0:
                for (int i=0; i < this.disponibles.length; i++) {
                    if(this.disponibles[i].tipo == 1 && this.disponibles[i].libre == 1){
                        lista.addElement(""+this.disponibles[i].numero);
                    }
                }
                this.jListHab.setModel(lista);
                break;
            case 1:
                for (int i=0; i < this.disponibles.length; i++) {
                    if(this.disponibles[i].tipo == 2 && this.disponibles[i].libre == 1){
                        lista.addElement(""+this.disponibles[i].numero);
                    }
                }
                this.jListHab.setModel(lista);
                break;
            case 2:
                for (int i=0; i < this.disponibles.length; i++) {
                    if(this.disponibles[i].tipo == 3 && this.disponibles[i].libre == 1){
                        lista.addElement(""+this.disponibles[i].numero);
                    }
                }
                this.jListHab.setModel(lista);
                break;
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox jComboBoxTipo;
    private com.toedter.calendar.JDateChooser jDateChooserIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCuidadOr;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelHuespedes;
    private javax.swing.JLabel jLabelIngreso;
    private javax.swing.JLabel jLabelLema;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotHuespedes;
    private javax.swing.JList jListHab;
    private javax.swing.JPanel jPanelPizarron;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDias;
    private javax.swing.JSpinner jSpinnerHuespedes;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCliente;
    // End of variables declaration//GEN-END:variables
}
