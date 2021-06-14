/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Julio
 */
public class GraficaOcup extends javax.swing.JFrame {

    MySqlConn conn;
    Habitacion disponibles[];
    /**
     * Creates new form GraficaOcup
     *
     * @param conn
     */
    public GraficaOcup(MySqlConn conn) {
        this.disponibles = new Habitacion[30];
        this.disponibles[0] = new Habitacion(201, 1, false);
        this.disponibles[1] = new Habitacion(202, 1, false);
        this.disponibles[2] = new Habitacion(203, 1, false);
        this.disponibles[3] = new Habitacion(204, 1, false);
        this.disponibles[4] = new Habitacion(205, 1, false);
        this.disponibles[5] = new Habitacion(206, 1, false);
        this.disponibles[6] = new Habitacion(207, 2, false);
        this.disponibles[7] = new Habitacion(208, 2, false);
        this.disponibles[8] = new Habitacion(209, 2, false);
        this.disponibles[9] = new Habitacion(210, 2, false);
        this.disponibles[10] = new Habitacion(211, 2, false);
        this.disponibles[11] = new Habitacion(212, 3, false);
        this.disponibles[12] = new Habitacion(213, 3, false);
        this.disponibles[13] = new Habitacion(214, 3, false);
        this.disponibles[14] = new Habitacion(215, 3, false);
        this.disponibles[15] = new Habitacion(301, 1, false);
        this.disponibles[16] = new Habitacion(302, 1, false);
        this.disponibles[17] = new Habitacion(303, 1, false);
        this.disponibles[18] = new Habitacion(304, 1, false);
        this.disponibles[19] = new Habitacion(305, 2, false);
        this.disponibles[20] = new Habitacion(306, 2, false);
        this.disponibles[21] = new Habitacion(307, 2, false);
        this.disponibles[22] = new Habitacion(308, 2, false);
        this.disponibles[23] = new Habitacion(309, 2, false);
        this.disponibles[24] = new Habitacion(310, 2, false);
        this.disponibles[25] = new Habitacion(311, 3, false);
        this.disponibles[26] = new Habitacion(312, 3, false);
        this.disponibles[27] = new Habitacion(313, 3, false);
        this.disponibles[28] = new Habitacion(314, 3, false);
        this.disponibles[29] = new Habitacion(315, 3, false);
        this.conn = conn;
        this.revisahab();
        initComponents();
        this.creaGrafica();
    }

    public GraficaOcup() {
        initComponents();
        creaGrafica();
    }

    private void creaGrafica(){
        int lib = 0,ocup =0;
        for (int i = 0; i < this.disponibles.length; i++) {
            if(this.disponibles[i].libre == true){
                lib++;
            }else{
                ocup++;
            }
        }
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Libre", (lib*100)/this.disponibles.length);
        data.setValue("Ocupado", (ocup*100)/this.disponibles.length);

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Porcentaje de ocupacion del hotel.", 
         data);
 
        // Crear el Panel del Grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBounds(50,25,350,350);
        chartPanel.setVisible(true);
        this.jPanelPizarron.add(chartPanel);
    }
    
    private void revisahab() {
        String query;
        for (int i = 0; i < 30; i++) {
            query = "select * from habitaciones where habitacion = " + "'" + this.disponibles[i].numero + "'";
            try {
                this.conn.Consult(query);
                if (!this.conn.rs.getString(1).isEmpty()) {

                }
            } catch (SQLException ex) {
                this.disponibles[i].libre = true;
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
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jButtonVolver.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPizarronLayout = new javax.swing.GroupLayout(jPanelPizarron);
        jPanelPizarron.setLayout(jPanelPizarronLayout);
        jPanelPizarronLayout.setHorizontalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizarronLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanelPizarronLayout.setVerticalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPizarronLayout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(GraficaOcup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaOcup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaOcup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaOcup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaOcup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JPanel jPanelPizarron;
    // End of variables declaration//GEN-END:variables
}