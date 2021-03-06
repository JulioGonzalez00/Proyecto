/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import controlMySql.MySqlConn;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

/**
 *
 * @author Julio
 */
public class Menu extends javax.swing.JFrame {

    Clip sonido;
    MySqlConn conn;
    /**
     * Creates new form Prueba
     * @param conn
     * @param sonido
     */
    public Menu(MySqlConn conn, Clip sonido) {
        this.conn = conn;
        this.sonido = sonido;
        initComponents();
    }   
        
    public Menu() {
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
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemAltas = new javax.swing.JMenuItem();
        jMenuItemBajas = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemAltas2 = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemGaleria = new javax.swing.JMenuItem();
        jMenuItemOcupacionP = new javax.swing.JMenuItem();
        jMenuOcup = new javax.swing.JMenu();
        jMenuItemSencilla = new javax.swing.JMenuItem();
        jMenuItemDoble = new javax.swing.JMenuItem();
        jMenuItemTriple = new javax.swing.JMenuItem();
        jMenuHab = new javax.swing.JMenu();
        jMenuItemPiso1 = new javax.swing.JMenuItem();
        jMenuItemPiso2 = new javax.swing.JMenuItem();
        jMenuItemTot = new javax.swing.JMenuItem();
        jMenuItemLista = new javax.swing.JMenuItem();
        jMenuItemNumBus = new javax.swing.JMenuItem();
        jMenuItemNomBus = new javax.swing.JMenuItem();
        jMenuItemCostos = new javax.swing.JMenuItem();
        jMenuItemIngresos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPizarron.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelPizarron.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("CerrarSesion");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        jPanelPizarron.add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 110, 39));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12RosasPeque??o.png"))); // NOI18N
        jPanelPizarron.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12RosasMenu.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        jPanelPizarron.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 730, 470));

        getContentPane().add(jPanelPizarron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 730, 490));

        jMenuClientes.setText("Clientes");

        jMenuItemAltas.setText("Ingreso");
        jMenuItemAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltasActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemAltas);

        jMenuItemBajas.setText("Salida");
        jMenuItemBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBajasActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemBajas);

        jMenuBar1.add(jMenuClientes);

        jMenuAdmin.setText("Administracion");

        jMenuItemAltas2.setText("Registrar Usuario");
        jMenuItemAltas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAltas2ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemAltas2);

        jMenuConsultas.setText("Consultas");

        jMenuItemGaleria.setText("Galeria");
        jMenuItemGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGaleriaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemGaleria);

        jMenuItemOcupacionP.setText("Ocupacion %");
        jMenuItemOcupacionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOcupacionPActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemOcupacionP);

        jMenuOcup.setText("Ocupacion por tipo");

        jMenuItemSencilla.setText("Sencilla");
        jMenuItemSencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSencillaActionPerformed(evt);
            }
        });
        jMenuOcup.add(jMenuItemSencilla);

        jMenuItemDoble.setText("Doble");
        jMenuItemDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDobleActionPerformed(evt);
            }
        });
        jMenuOcup.add(jMenuItemDoble);

        jMenuItemTriple.setText("Triple");
        jMenuItemTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTripleActionPerformed(evt);
            }
        });
        jMenuOcup.add(jMenuItemTriple);

        jMenuConsultas.add(jMenuOcup);

        jMenuHab.setText("Habitaciones por piso");

        jMenuItemPiso1.setText("Piso 1");
        jMenuItemPiso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPiso1ActionPerformed(evt);
            }
        });
        jMenuHab.add(jMenuItemPiso1);

        jMenuItemPiso2.setText("Piso 2");
        jMenuItemPiso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPiso2ActionPerformed(evt);
            }
        });
        jMenuHab.add(jMenuItemPiso2);

        jMenuConsultas.add(jMenuHab);

        jMenuItemTot.setText("Total de habitaciones");
        jMenuItemTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTotActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemTot);

        jMenuItemLista.setText("Lista de Huespedes");
        jMenuItemLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemLista);

        jMenuItemNumBus.setText("Buscar Habitacion");
        jMenuItemNumBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNumBusActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemNumBus);

        jMenuItemNomBus.setText("Buscar Huesped");
        jMenuItemNomBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNomBusActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemNomBus);

        jMenuItemCostos.setText("Costos de habitacion");
        jMenuItemCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCostosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemCostos);

        jMenuItemIngresos.setText("Ingresos");
        jMenuItemIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresosActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemIngresos);

        jMenuAdmin.add(jMenuConsultas);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jMenuItemAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltasActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Altas altas = new Altas(this.conn);
        altas.setVisible(true);
        altas.setLocationRelativeTo(this);
        altas.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemAltasActionPerformed

    private void jMenuItemBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBajasActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Bajas bajas = new Bajas(this.conn);
        bajas.setVisible(true);
        bajas.setLocationRelativeTo(this);
        bajas.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemBajasActionPerformed

    private void jMenuItemGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGaleriaActionPerformed
        // TODO add your handling code here:
        sonido.stop();
        final JFrame aux = this;
        this.setVisible(false);
        Galeria gal = new Galeria();
        gal.setVisible(true);
        gal.setLocationRelativeTo(this);
        gal.addWindowListener(new WindowListener() {
                    @Override
                    public void windowClosed(WindowEvent we) {
                        aux.setVisible(true);
                        sonido.start();
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
    }//GEN-LAST:event_jMenuItemGaleriaActionPerformed

    private void jMenuItemOcupacionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOcupacionPActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        GraficaOcup gOc = new GraficaOcup(this.conn);
        gOc.setVisible(true);
        gOc.setLocationRelativeTo(this);
        gOc.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemOcupacionPActionPerformed

    private void jMenuItemDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDobleActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        OcupTip ocup = new OcupTip(this.conn,2);
        ocup.setVisible(true);
        ocup.setLocationRelativeTo(this);
        ocup.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemDobleActionPerformed

    private void jMenuItemTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTripleActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        OcupTip ocup = new OcupTip(this.conn,3);
        ocup.setVisible(true);
        ocup.setLocationRelativeTo(this);
        ocup.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemTripleActionPerformed

    private void jMenuItemCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCostosActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Costos altas = new Costos();
        altas.setVisible(true);
        altas.setLocationRelativeTo(this);
        altas.addWindowListener(new WindowListener() {
                    @Override
                    public void windowClosed(WindowEvent we) {
                        aux.setVisible(true);
                        sonido.start();
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
    }//GEN-LAST:event_jMenuItemCostosActionPerformed

    private void jMenuItemAltas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAltas2ActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Login2 altas = new Login2();
        altas.setVisible(true);
        altas.setLocationRelativeTo(this);
        altas.addWindowListener(new WindowListener() {
                    @Override
                    public void windowClosed(WindowEvent we) {
                        aux.setVisible(true);
                        sonido.start();
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
    }//GEN-LAST:event_jMenuItemAltas2ActionPerformed

    private void jMenuItemTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTotActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Total tot = new Total(this.conn);
        tot.setVisible(true);
        tot.setLocationRelativeTo(this);
        tot.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemTotActionPerformed

    private void jMenuItemIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresosActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Ingreso ing = new Ingreso(this.conn);
        ing.setVisible(true);
        ing.setLocationRelativeTo(this);
        ing.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemIngresosActionPerformed

    private void jMenuItemNomBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNomBusActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Huesped hues = new Huesped(this.conn);
        hues.setVisible(true);
        hues.setLocationRelativeTo(this);
        hues.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemNomBusActionPerformed

    private void jMenuItemSencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSencillaActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        OcupTip ocup = new OcupTip(this.conn,1);
        ocup.setVisible(true);
        ocup.setLocationRelativeTo(this);
        ocup.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemSencillaActionPerformed

    private void jMenuItemPiso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPiso1ActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Piso1 ti = new Piso1(this.conn,1);
        ti.setVisible(true);
        ti.setLocationRelativeTo(this);
        ti.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemPiso1ActionPerformed

    private void jMenuItemPiso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPiso2ActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Piso1 ti = new Piso1(this.conn,2);
        ti.setVisible(true);
        ti.setLocationRelativeTo(this);
        ti.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemPiso2ActionPerformed

    private void jMenuItemNumBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNumBusActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        BuscarHab BH = new BuscarHab(this.conn);
        BH.setVisible(true);
        BH.setLocationRelativeTo(this);
        BH.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemNumBusActionPerformed

    private void jMenuItemListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaActionPerformed
        // TODO add your handling code here:
        final JFrame aux = this;
        this.setVisible(false);
        Lista lista = new Lista(this.conn);
        lista.setVisible(true);
        lista.setLocationRelativeTo(this);
        lista.addWindowListener(new WindowListener() {
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
    }//GEN-LAST:event_jMenuItemListaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuHab;
    private javax.swing.JMenuItem jMenuItemAltas;
    private javax.swing.JMenuItem jMenuItemAltas2;
    private javax.swing.JMenuItem jMenuItemBajas;
    private javax.swing.JMenuItem jMenuItemCostos;
    private javax.swing.JMenuItem jMenuItemDoble;
    private javax.swing.JMenuItem jMenuItemGaleria;
    private javax.swing.JMenuItem jMenuItemIngresos;
    private javax.swing.JMenuItem jMenuItemLista;
    private javax.swing.JMenuItem jMenuItemNomBus;
    private javax.swing.JMenuItem jMenuItemNumBus;
    private javax.swing.JMenuItem jMenuItemOcupacionP;
    private javax.swing.JMenuItem jMenuItemPiso1;
    private javax.swing.JMenuItem jMenuItemPiso2;
    private javax.swing.JMenuItem jMenuItemSencilla;
    private javax.swing.JMenuItem jMenuItemTot;
    private javax.swing.JMenuItem jMenuItemTriple;
    private javax.swing.JMenu jMenuOcup;
    private javax.swing.JPanel jPanelPizarron;
    // End of variables declaration//GEN-END:variables
}
