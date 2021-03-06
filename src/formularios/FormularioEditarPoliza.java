package formularios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;
import clasesUtilidadGeneral.OperacionesUtiles;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JComboBox;
import operacionesCliente.InterfazGraficaFormularioRegistrarCliente;
import operacionesCliente.TecladoInterfaz;
import operacionesPoliza.ABMPoliza;
import principal.MaterialButton;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class FormularioEditarPoliza extends javax.swing.JDialog {

    int x, y;
    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }


    /**
     * Creates new form FormularioNuevoCliente
     */
    public FormularioEditarPoliza(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public List getListaCampos() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtNumeroPoliza());
        return listCamposTexto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelPrincipalTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelPrincipalBody = new javax.swing.JPanel();
        txtNumeroPoliza = new javax.swing.JTextField();
        btnGardarCambios = new principal.MaterialButton();
        btnCancelar = new principal.MaterialButton();
        boxEmpresa = new javax.swing.JComboBox<>();
        boxTipoSeguro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), java.awt.Color.gray, new java.awt.Color(102, 102, 102), java.awt.Color.gray));

        panelPrincipalTop.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDITAR POLIZA");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        panelPrincipalBody.setBackground(new java.awt.Color(255, 255, 255));

        txtNumeroPoliza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroPolizaKeyPressed(evt);
            }
        });

        btnGardarCambios.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGardarCambios.setText("GUARDAR CAMBIOS");
        btnGardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGardarCambios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGardarCambios.setMaximumSize(new java.awt.Dimension(170, 35));
        btnGardarCambios.setMinimumSize(new java.awt.Dimension(170, 35));
        btnGardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGardarCambiosActionPerformed(evt);
            }
        });
        btnGardarCambios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGardarCambiosKeyPressed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0,60));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        boxEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxEmpresaKeyPressed(evt);
            }
        });

        boxTipoSeguro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxTipoSeguroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalBodyLayout = new javax.swing.GroupLayout(panelPrincipalBody);
        panelPrincipalBody.setLayout(panelPrincipalBodyLayout);
        panelPrincipalBodyLayout.setHorizontalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalBodyLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalBodyLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroPoliza)
                            .addComponent(boxEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxTipoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalBodyLayout.createSequentialGroup()
                        .addComponent(btnGardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        panelPrincipalBodyLayout.setVerticalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalBodyLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(boxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxTipoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGardarCambiosActionPerformed
        ABMPoliza abm = new ABMPoliza();
        abm.setFormularioEditarPoliza(this);
        abm.setPrincipalCliente(principalAdministrador.getCliente());
        if (abm.ejecutarEditar()) {
            principalAdministrador.getCliente().getTablaPolizaC().setEstadoConsulta(0);
            principalAdministrador.getCliente().getTablaPolizaC().ejecutarRellenarTabla();
            //Al actualizar la tabla cliente se pierde la fila seleccionada, por lo que no se puede obtener la id cliente, ver como resolver esto.
//             principalAdministrador.getCliente().getTablaCliente().setEstadoConsulta(0);
//            principalAdministrador.getCliente().getTablaCliente().ejecutarRellenarTabla();
        }
    }//GEN-LAST:event_btnGardarCambiosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        OperacionesUtiles.mensajeCancelarFormulario(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    private void boxEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEmpresaKeyPressed
          new TecladoInterfaz().desplazarBox(evt, this.boxTipoSeguro);
    }//GEN-LAST:event_boxEmpresaKeyPressed

    private void boxTipoSeguroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTipoSeguroKeyPressed
         new TecladoInterfaz().desplazarBox(evt, this.txtNumeroPoliza);
    }//GEN-LAST:event_boxTipoSeguroKeyPressed

    private void txtNumeroPolizaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPolizaKeyPressed
         new TecladoInterfaz().desplazar(evt,this.btnCancelar, this.btnGardarCambios);
    }//GEN-LAST:event_txtNumeroPolizaKeyPressed

    private void btnGardarCambiosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGardarCambiosKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtNumeroPoliza, this.btnCancelar);
    }//GEN-LAST:event_btnGardarCambiosKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
         new TecladoInterfaz().desplazar(evt, this.btnGardarCambios, this.boxEmpresa);
    }//GEN-LAST:event_btnCancelarKeyPressed

    InterfazGraficaFormularioRegistrarCliente intergazGraficaRegistrarCliente = new InterfazGraficaFormularioRegistrarCliente();

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
            java.util.logging.Logger.getLogger(FormularioEditarPoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarPoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarPoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarPoliza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioEditarPoliza dialog = new FormularioEditarPoliza(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JTextField getTxtNumeroPoliza() {
        return txtNumeroPoliza;
    }

    public void setTxtNumeroPoliza(JTextField txtNumeroPoliza) {
        this.txtNumeroPoliza = txtNumeroPoliza;
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public JComboBox<String> getBoxEmpresa() {
        return boxEmpresa;
    }

    public void setBoxEmpresa(JComboBox<String> boxEmpresa) {
        this.boxEmpresa = boxEmpresa;
    }

    public JComboBox<String> getBoxTipoSeguro() {
        return boxTipoSeguro;
    }

    public void setBoxTipoSeguro(JComboBox<String> boxTipoSeguro) {
        this.boxTipoSeguro = boxTipoSeguro;
    }


    public MaterialButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(MaterialButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public MaterialButton getBtnGardarCambios() {
        return btnGardarCambios;
    }

    public void setBtnGardarCambios(MaterialButton btnGardarCambios) {
        this.btnGardarCambios = btnGardarCambios;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEmpresa;
    private javax.swing.JComboBox<String> boxTipoSeguro;
    private principal.MaterialButton btnCancelar;
    private principal.MaterialButton btnGardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPrincipalBody;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JTextField txtNumeroPoliza;
    // End of variables declaration//GEN-END:variables
}
