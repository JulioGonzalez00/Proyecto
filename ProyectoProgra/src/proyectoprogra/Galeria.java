/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

/**
 *
 * @author IZTROW
 */
public class Galeria extends javax.swing.JFrame {

    ImageIcon imagenes[];
    int pos;
    Clip sonido;
    /**
     * Creates new form Galeria
     */
    public Galeria() {
        try {
            pos = 0;
            String imagen;
            imagenes = new ImageIcon[6];
            for (int i = 0; i < imagenes.length; i++) {
                imagen = "/ImagenesGaleria/hotel"+(i+1)+".jpg";
                //System.out.println(imagen);
                imagenes[i] = new ImageIcon(getClass().getResource(imagen));
            }
            sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("src/recursos/cancion2.wav").getAbsoluteFile()));
            FloatControl gainControl = (FloatControl) sonido.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f);
            sonido.start();
            sonido.loop(Clip.LOOP_CONTINUOUSLY);
            initComponents();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            System.out.println("Error al inciar la musica");
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
        jButtonSiguiente = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPizarron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 100, 40));

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 100, 40));

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 80, 30));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesGaleria/hotel6.jpg"))); // NOI18N
        jPanelPizarron.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 350));

        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 11)); // NOI18N
        jButton1.setText("Pausar Musica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        this.jLabelImagen.setIcon(this.imagenes[pos]);
        this.pos++;
        if(this.pos == this.imagenes.length){
            pos = 0;
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        this.jLabelImagen.setIcon(this.imagenes[pos]);
        this.pos--;
        if(this.pos == -1){
            pos = this.imagenes.length-1;
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        sonido.stop();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.sonido.isRunning()){
            this.sonido.stop();
        }else{
            this.sonido.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanelPizarron;
    // End of variables declaration//GEN-END:variables
}
