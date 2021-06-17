/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author IZTROW
 */
public class PruebaInterfazGrafica extends javax.swing.JFrame {

    Clip sonido;
    MySqlConn conn;
    /**
     * Creates new form PruebaInterfazGrafica
     * @param conn
     */
    public PruebaInterfazGrafica(MySqlConn conn) {
        this.conn = conn;
        try{
            sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("src/recursos/cancion.wav").getAbsoluteFile()));
            FloatControl gainControl = (FloatControl) sonido.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-30.0f);
            sonido.start();
            sonido.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException ex) {
            System.out.println("1");
        } catch (IOException ex) {
            System.out.println("2");
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("3");
        }
        initComponents();
    }

    public PruebaInterfazGrafica() {
        initComponents();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        super.paint(g);
        //Borde
        g.drawLine(200, 300, 500, 300);
        g.drawLine(200, 270, 500, 270);
       
        
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
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jButtonLOGIN = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelLema = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPizarron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPassword.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabelPassword.setText("Password:");
        jPanelPizarron.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 230, 40));

        jTextFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoginKeyPressed(evt);
            }
        });
        jPanelPizarron.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 190, 30));

        jLabelLogin.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabelLogin.setText("Login:");
        jPanelPizarron.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 160, 40));

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });
        jPanelPizarron.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 190, 30));

        jButtonLOGIN.setText("LOGIN");
        jButtonLOGIN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLOGINActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 110, 50));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabelTitulo.setText("     Hotel  Las Doce Rosas");
        jPanelPizarron.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 490, 60));

        jLabelBienvenido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelBienvenido.setText("¡Bienvenido!");
        jPanelPizarron.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 170, 60));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12RosasPequeño.png"))); // NOI18N
        jPanelPizarron.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 300, 130));

        jLabelLema.setFont(new java.awt.Font("Thames", 1, 18)); // NOI18N
        jLabelLema.setText("DOCE RAZONES PARA SER FELIZ");
        jPanelPizarron.add(jLabelLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 320, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/46958002_539474346553079_371541282721366016_n.jpg"))); // NOI18N
        jPanelPizarron.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 530));

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

    private void jButtonLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGINActionPerformed
        // TODO add your handling code here:
        String nom, nom2, query, password;
        char[] pass;
        final JFrame aux = this;
        nom = this.jTextFieldLogin.getText().trim();
        pass = this.jPassword.getPassword();
        query = "select * from usuarios where nom = " + "'" + nom + "'";
        this.conn.Consult(query);
        try {
            String password2 = this.conn.rs.getString(2);
            password = new String(pass);
            String contraseña = DigestUtils.md5Hex(password);
            if (password2.equals(contraseña)) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Bienvenido " + this.conn.rs.getString(1) + ".");
                Menu menu = new Menu(this.conn,sonido);
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                menu.addWindowListener(new WindowListener() {
                    @Override
                    public void windowClosed(WindowEvent we) {
                        aux.setVisible(true);
                    }

                    @Override
                    public void windowOpened(WindowEvent we) {
                    }

                    @Override
                    public void windowClosing(WindowEvent we) {
                    }

                    @Override
                    public void windowIconified(WindowEvent we) {
                    }

                    @Override
                    public void windowDeiconified(WindowEvent we) {
                    }

                    @Override
                    public void windowActivated(WindowEvent we) {
                    }

                    @Override
                    public void windowDeactivated(WindowEvent we) {
                    }
                });
            } else {
                JOptionPane.showMessageDialog(this, "Error en la contraseña");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe la cuenta");
        }
        this.jTextFieldLogin.setText("");
        this.jPassword.setText("");
        this.jTextFieldLogin.grabFocus();
    }//GEN-LAST:event_jButtonLOGINActionPerformed

    private void jTextFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jPassword.grabFocus();
        }
    }//GEN-LAST:event_jTextFieldLoginKeyPressed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jButtonLOGINActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaInterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PruebaInterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLOGIN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelLema;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPizarron;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
