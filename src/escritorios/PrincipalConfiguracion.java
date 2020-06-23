package escritorios;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import operacionesConfiguracion.ConfiguracionTxt;
import clasesUtilidadGeneral.OperacionesUtiles;
import operacionesConfiguracion.InterfazGraficaEscritorioConfiguracion;
import principal.MaterialButton;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalConfiguracion extends javax.swing.JInternalFrame {

    /**
     * Creates new form PrincipalConfiguracion
     */
    public PrincipalConfiguracion() {
        initComponents();
        btnGuardar.setEnabled(false);
    }

    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    InterfazGraficaEscritorioConfiguracion i = new InterfazGraficaEscritorioConfiguracion();
    ConfiguracionTxt ct = new ConfiguracionTxt();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalTop = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnColorMarron = new principal.MaterialButton();
        btnColorRojo = new principal.MaterialButton();
        btnPaleta = new principal.MaterialButton();
        btnGuardar = new principal.MaterialButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnColorAzul = new principal.MaterialButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1148, 588));

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/services_80px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONFIGURACION");

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnColorMarron.setBackground(new java.awt.Color(142, 131, 54,90));
        btnColorMarron.setForeground(new java.awt.Color(255, 255, 255));
        btnColorMarron.setText("MARRON CLARO");
        btnColorMarron.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColorMarron.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnColorMarron.setMaximumSize(new java.awt.Dimension(130, 35));
        btnColorMarron.setMinimumSize(new java.awt.Dimension(130, 35));
        btnColorMarron.setPreferredSize(new java.awt.Dimension(130, 35));
        btnColorMarron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorMarronActionPerformed(evt);
            }
        });

        btnColorRojo.setBackground(new java.awt.Color(147, 32, 48,90));
        btnColorRojo.setForeground(new java.awt.Color(255, 255, 255));
        btnColorRojo.setText("ROJO");
        btnColorRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColorRojo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnColorRojo.setMaximumSize(new java.awt.Dimension(130, 35));
        btnColorRojo.setMinimumSize(new java.awt.Dimension(130, 35));
        btnColorRojo.setPreferredSize(new java.awt.Dimension(130, 35));
        btnColorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorRojoActionPerformed(evt);
            }
        });

        btnPaleta.setBackground(new java.awt.Color(0, 0, 0,60));
        btnPaleta.setForeground(new java.awt.Color(255, 255, 255));
        btnPaleta.setText("PALETA");
        btnPaleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPaleta.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnPaleta.setMaximumSize(new java.awt.Dimension(130, 35));
        btnPaleta.setMinimumSize(new java.awt.Dimension(130, 35));
        btnPaleta.setPreferredSize(new java.awt.Dimension(130, 35));
        btnPaleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaletaActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardar.setMaximumSize(new java.awt.Dimension(130, 35));
        btnGuardar.setMinimumSize(new java.awt.Dimension(130, 35));
        btnGuardar.setPreferredSize(new java.awt.Dimension(130, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("COLOR");

        btnColorAzul.setBackground(new java.awt.Color(0, 85, 142,90));
        btnColorAzul.setForeground(new java.awt.Color(255, 255, 255));
        btnColorAzul.setText("AZUL");
        btnColorAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColorAzul.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnColorAzul.setMaximumSize(new java.awt.Dimension(130, 35));
        btnColorAzul.setMinimumSize(new java.awt.Dimension(130, 35));
        btnColorAzul.setPreferredSize(new java.awt.Dimension(130, 35));
        btnColorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorAzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnColorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColorMarron, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnColorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPaleta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColorMarron, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColorMarronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorMarronActionPerformed
        ct.setColor(142, 131, 54, 255, 255, 255);
        ct.setPrincipalAdministrador(principalAdministrador);
        ct.setTema();
        i.setPrincipalAdministrador(principalAdministrador);
        i.colorInterfazEscritorio();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnColorMarronActionPerformed

    private void btnColorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorRojoActionPerformed
        ct.setColor(147, 32, 48, 255, 255, 255);
        ct.setPrincipalAdministrador(principalAdministrador);
        ct.setTema();
        i.setPrincipalAdministrador(principalAdministrador);
        i.colorInterfazEscritorio();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnColorRojoActionPerformed

    private void btnPaletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaletaActionPerformed
        Color color = JColorChooser.showDialog(rootPane, "seleccione un color", this.getBackground());
        try {
            ct.setColor(color.getRed(), color.getGreen(), color.getBlue(), 255, 255, 255);
        } catch (NullPointerException e) {
        }
        ct.setPrincipalAdministrador(principalAdministrador);
        ct.setTema();
        i.setPrincipalAdministrador(principalAdministrador);
        i.colorInterfazEscritorio();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnPaletaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (OperacionesUtiles.mensajeGuardarTema()) {
            ct.guardarColor();
            btnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnColorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorAzulActionPerformed
        ct.setColor(0, 85, 142, 255, 255, 255);
        ct.setPrincipalAdministrador(principalAdministrador);
        ct.setTema();
        i.setPrincipalAdministrador(principalAdministrador);
        i.colorInterfazEscritorio();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnColorAzulActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public MaterialButton getBtnColorAzul() {
        return btnColorAzul;
    }

    public void setBtnColorAzul(MaterialButton btnColorAzul) {
        this.btnColorAzul = btnColorAzul;
    }

    public MaterialButton getBtnColorMarron() {
        return btnColorMarron;
    }

    public void setBtnColorMarron(MaterialButton btnColorMarron) {
        this.btnColorMarron = btnColorMarron;
    }

    public MaterialButton getBtnColorRojo() {
        return btnColorRojo;
    }

    public void setBtnColorRojo(MaterialButton btnColorRojo) {
        this.btnColorRojo = btnColorRojo;
    }

    public MaterialButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(MaterialButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public MaterialButton getBtnPaleta() {
        return btnPaleta;
    }

    public void setBtnPaleta(MaterialButton btnPaleta) {
        this.btnPaleta = btnPaleta;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnColorAzul;
    private principal.MaterialButton btnColorMarron;
    private principal.MaterialButton btnColorRojo;
    private principal.MaterialButton btnGuardar;
    private principal.MaterialButton btnPaleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelPrincipalTop;
    // End of variables declaration//GEN-END:variables
}
