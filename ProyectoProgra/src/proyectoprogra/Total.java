/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.awt.Color;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Aby
 */
public class Total extends javax.swing.JFrame {

    Habitacion disponibles[];
    MySqlConn conn;
    /**
     * Creates new form Total
     * @param conn
     */
    public Total(MySqlConn conn) {
        this.conn = conn; 
        revisaHab();
        initComponents();
        llenarLabels();
    }
    public Total(){
        initComponents();
    }
    void revisaHab(){
        String query;
        int j = 0;
        disponibles = new Habitacion[30];
        int numero,libre,tipo;
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
    private void llenarLabels(){
        int sencilla=0,doble=0,triple=0;
        for (int i = 0; i < this.disponibles.length; i++) {
            if(this.disponibles[i].tipo == 1){
                sencilla++;
            }else if(this.disponibles[i].tipo == 2){
                doble++;
            }else{
                triple++;
            }
        }
        // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(sencilla, "Sencilla", "Habitaciones");
        dataset.setValue(doble, "Doble", "Habitaciones");
        dataset.setValue(triple, "Triple", "Habitaciones");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Tipos de Habitaciones","Tipo", "Cantidad", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBounds(150,4,300,300);
        chartPanel.setVisible(true);
        this.jPanel1.add(chartPanel);
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
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(508, 288));
        setMinimumSize(new java.awt.Dimension(508, 288));
        setResizable(false);

        jPanel1.setLayout(null);

        jButtonRegresar.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegresar);
        jButtonRegresar.setBounds(20, 271, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Total.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Total().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
