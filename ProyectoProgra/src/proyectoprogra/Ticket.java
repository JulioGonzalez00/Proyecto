/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julio
 */
public class Ticket extends javax.swing.JFrame {

    MySqlConn conn;
    int num;
    /**
     * Creates new form Ticket
     * @param conn
     */
    public Ticket(MySqlConn conn,int num) {
        this.conn = conn;
        this.num = num;
        initComponents();
        imprimeDatos();
    }
    public Ticket() {
        initComponents();
    }

    void imprimeDatos(){
        String query = "select * from habitaciones where habitacion = " + "'" + this.num + "'";
        this.conn.Consult(query);
        String fecha;
        int tipo,ocup;
        try{
            fecha = this.conn.rs.getString(6);
            this.jTextFieldNom.setText(this.conn.rs.getString(1));
            this.jTextFieldCiud.setText(this.conn.rs.getString(3));
            this.jTextFieldNum.setText(this.conn.rs.getString(2));
            this.jTextFieldFechaI.setText(fecha);
            Date ap;
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
            ap = formato.parse(this.conn.rs.getString(6));
            Calendar aux = Calendar.getInstance();
            aux.setTime(ap);
            aux.add(Calendar.DATE,Integer.parseInt(this.conn.rs.getString(5)));
            ap = aux.getTime();
            this.jTextFieldFecha.setText(formato.format(ap));
            this.jTextFieldPiso.setText(""+((Integer.parseInt(this.conn.rs.getString(2))/100)-1));
            ocup = Integer.parseInt(this.conn.rs.getString(7));
            this.jTextFieldTotal.setText(""+ocup);
            query = "select * from tothab where num = " + "'" + this.num + "'";
            this.conn.Consult(query);
            this.jTextFieldTipo.setText(this.conn.rs.getString(2));
            tipo = Integer.parseInt(this.conn.rs.getString(2));
            if(tipo == 1){
                this.jTextFieldLimite.setText("1");
            }else if(tipo == 2){
                this.jTextFieldLimite.setText("2");
            }else if(tipo == 3){
                this.jTextFieldLimite.setText("3");
            }
            switch(ocup-tipo){
                case 1:
                    this.jCheckBox1Ex.setSelected(true);
                    break;
                case 2:
                    this.jCheckBox2Ex.setSelected(true);
                    break;
                default:
                    this.jCheckBox1Ex.setSelected(false);
                    this.jCheckBox2Ex.setSelected(false);
                    break;
            }
        }catch(SQLException ex){
            System.out.println("Error al salir de SQL");
        } catch (ParseException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabelLema = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelFechaI = new javax.swing.JLabel();
        jLabelFechaS = new javax.swing.JLabel();
        jLabelHab = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelOcup = new javax.swing.JLabel();
        jCheckBox1Ex = new javax.swing.JCheckBox();
        jCheckBox2Ex = new javax.swing.JCheckBox();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldCiud = new javax.swing.JTextField();
        jTextFieldFechaI = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldPiso = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldLimite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPizarron.setBackground(new java.awt.Color(255, 255, 190));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12RosasPequeño.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabelTitulo.setText("Hotel 12 Rosas");

        jLabelNombre.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelUbicacion.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabelUbicacion.setText("Centro Merida Yucatan 97000");

        jLabelLema.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        jLabelLema.setText("12 Razones para ser feliz.");

        jLabelCiudad.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelCiudad.setText("Ciudad de Origen:");

        jLabelFechaI.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelFechaI.setText("Fecha de Ingreso:");

        jLabelFechaS.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelFechaS.setText("Fecha de salida:");

        jLabelHab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelHab.setText("Numero de habitación:");

        jLabelTipo.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelTipo.setText("Tipo de habitación:");

        jLabelOcup.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelOcup.setText("Total de ocupantes de la habitación:");

        jCheckBox1Ex.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBox1Ex.setText("1 Persona Extra");
        jCheckBox1Ex.setContentAreaFilled(false);
        jCheckBox1Ex.setFocusable(false);
        jCheckBox1Ex.setOpaque(false);

        jCheckBox2Ex.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jCheckBox2Ex.setText("2 Personas Extra");
        jCheckBox2Ex.setFocusable(false);
        jCheckBox2Ex.setOpaque(false);

        jLabelRegistro.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelRegistro.setText("Registro Completado");

        jLabelPiso.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabelPiso.setText("Piso:");

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Limite de huspedes: ");

        jTextFieldNom.setEditable(false);

        jTextFieldCiud.setEditable(false);

        jTextFieldFechaI.setEditable(false);

        jTextFieldFecha.setEditable(false);
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });

        jTextFieldNum.setEditable(false);

        jTextFieldPiso.setEditable(false);

        jTextFieldTipo.setEditable(false);

        jTextFieldTotal.setEditable(false);

        jTextFieldLimite.setEditable(false);

        javax.swing.GroupLayout jPanelPizarronLayout = new javax.swing.GroupLayout(jPanelPizarron);
        jPanelPizarron.setLayout(jPanelPizarronLayout);
        jPanelPizarronLayout.setHorizontalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizarronLayout.createSequentialGroup()
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPizarronLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelLogo))
                    .addComponent(jLabelUbicacion)
                    .addGroup(jPanelPizarronLayout.createSequentialGroup()
                        .addComponent(jCheckBox1Ex)
                        .addGap(53, 53, 53)
                        .addComponent(jCheckBox2Ex))
                    .addComponent(jLabelRegistro)
                    .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldLimite))
                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabelOcup)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTotal))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPizarronLayout.createSequentialGroup()
                            .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelPizarronLayout.createSequentialGroup()
                                    .addComponent(jLabelTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelPiso))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPizarronLayout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabelLema))
                                        .addComponent(jLabelTitulo))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldPiso))
                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabelHab)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNum))
                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabelFechaS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldFecha))
                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabelFechaI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldFechaI))
                        .addGroup(jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabelCiudad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCiud))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPizarronLayout.createSequentialGroup()
                            .addComponent(jLabelNombre)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelPizarronLayout.setVerticalGroup(
            jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizarronLayout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLema)
                .addGap(20, 20, 20)
                .addComponent(jLabelUbicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCiudad)
                    .addComponent(jTextFieldCiud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaI)
                    .addComponent(jTextFieldFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaS)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHab)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPizarronLayout.createSequentialGroup()
                        .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipo)
                            .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelOcup)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPiso)
                        .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPizarronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1Ex)
                    .addComponent(jCheckBox2Ex))
                .addGap(18, 18, 18)
                .addComponent(jLabelRegistro)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizarron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1Ex;
    private javax.swing.JCheckBox jCheckBox2Ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelFechaI;
    private javax.swing.JLabel jLabelFechaS;
    private javax.swing.JLabel jLabelHab;
    private javax.swing.JLabel jLabelLema;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelOcup;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanelPizarron;
    private javax.swing.JTextField jTextFieldCiud;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldFechaI;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldPiso;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}