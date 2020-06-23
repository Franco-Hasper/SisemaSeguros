package escritorios;

import clasesUtilidadGeneral.OperacionesUtiles;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import operacionesEmpresa.ABMEmpresa;
import operacionesEmpresa.TablaEmpresa;
import principal.MaterialButton;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalEmpresa extends javax.swing.JInternalFrame {

    private PrincipalAdministrador principalAdministrador;

    private TablaEmpresa tablaEmpresa;
    public ABMEmpresa abm = new ABMEmpresa();

    public TablaEmpresa getTablaEmpresa() {
        return tablaEmpresa;
    }

    public void setTablaEmpresa(TablaEmpresa tablaEmpresa) {
        this.tablaEmpresa = tablaEmpresa;
    }

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    /**
     * Creates new form PrincipalCliente
     */
    public PrincipalEmpresa() {
        initComponents();

    }

    public JTable getTablaGrafica() {
        return tablaGrafica;
    }

    public void setTablaGrafica(JTable tablaGrafica) {
        this.tablaGrafica = tablaGrafica;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalTop = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrafica = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new principal.MaterialButton();
        txtNombreRegistar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNombreEditar = new javax.swing.JTextField();
        btnGuardarCambios = new principal.MaterialButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnEliminarEmpresa = new principal.MaterialButton();
        jLabel6 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));

        jPanel3.setBackground(new java.awt.Color(187, 187, 187));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));

        tablaGrafica.setBackground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGrafica.setForeground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGrafica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGrafica.setDoubleBuffered(true);
        tablaGrafica.setRowHeight(40);
        tablaGrafica.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGrafica.getTableHeader().setReorderingAllowed(false);
        tablaGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaGraficaMousePressed(evt);
            }
        });
        tablaGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaGraficaComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGrafica);
        if (tablaGrafica.getColumnModel().getColumnCount() > 0) {
            tablaGrafica.getColumnModel().getColumn(0).setResizable(false);
        }

        txtBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar)
                    .addComponent(jScrollPane1))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardar.setMaximumSize(new java.awt.Dimension(170, 35));
        btnGuardar.setMinimumSize(new java.awt.Dimension(170, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(txtNombreRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));

        btnGuardarCambios.setBackground(new java.awt.Color(0, 0, 0,60));
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("GUARDAR CAMBIOS");
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGuardarCambios.setMaximumSize(new java.awt.Dimension(170, 35));
        btnGuardarCambios.setMinimumSize(new java.awt.Dimension(170, 35));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));

        btnEliminarEmpresa.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpresa.setText("ELIMINAR");
        btnEliminarEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarEmpresa.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarEmpresa.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarEmpresa.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarEmpresa.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpresaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(105, 105, 105)
                .addComponent(btnEliminarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnEliminarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa.png"))); // NOI18N

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMPRESA");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(0, 0, 0, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tablaEmpresa.setPrincipalEmpresa(this);
        tablaEmpresa.ejecutarRellenarTabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tablaGraficaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficaComponentHidden

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnEliminarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpresaActionPerformed
        tablaEmpresa.setPrincipalEmpresa(this);
        abm.setPrincipalEmpresa(this);
        if (tablaEmpresa.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                if (abm.ejecutarEliminar()) {
                    tablaEmpresa.setEstadoConsulta(0);
                    tablaEmpresa.ejecutarRellenarTabla();
                }
            }

        }
    }//GEN-LAST:event_btnEliminarEmpresaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        tablaEmpresa.setPrincipalEmpresa(this);
        abm.setPrincipalEmpresa(this);
        if (abm.ejecutarRegistrar()) {
            tablaEmpresa.setEstadoConsulta(0);
            tablaEmpresa.ejecutarRellenarTabla();
            this.getTxtNombreRegistar().setText(null);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        tablaEmpresa.setPrincipalEmpresa(this);
        if (tablaEmpresa.verificarFilaSeleccionada()) {
            abm.setPrincipalEmpresa(this);
            if (abm.ejecutarEditar()) {
                tablaEmpresa.setEstadoConsulta(0);
                tablaEmpresa.ejecutarRellenarTabla();
            }

        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void tablaGraficaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficaMousePressed

        int fila = getTablaGrafica().getSelectedRow();
        String nombre = getTablaGrafica().getValueAt(fila, 0).toString();
        this.txtNombreEditar.setText(nombre);

    }//GEN-LAST:event_tablaGraficaMousePressed

    public List getListaCamposRegistrar() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtNombreRegistar());
        return listCamposTexto;
    }

    public List getListaCamposEditar() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtNombreEditar());
        return listCamposTexto;
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public MaterialButton getBtnEliminarEmpresa() {
        return btnEliminarEmpresa;
    }

    public void setBtnEliminarEmpresa(MaterialButton btnEliminarEmpresa) {
        this.btnEliminarEmpresa = btnEliminarEmpresa;
    }

    public MaterialButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(MaterialButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public MaterialButton getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public void setBtnGuardarCambios(MaterialButton btnGuardarCambios) {
        this.btnGuardarCambios = btnGuardarCambios;
    }

    public JTextField getTxtNombreEditar() {
        return txtNombreEditar;
    }

    public void setTxtNombreEditar(JTextField txtNombreEditar) {
        this.txtNombreEditar = txtNombreEditar;
    }

    public JTextField getTxtNombreRegistar() {
        return txtNombreRegistar;
    }

    public void setTxtNombreRegistar(JTextField txtNombreRegistar) {
        this.txtNombreRegistar = txtNombreRegistar;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnEliminarEmpresa;
    public principal.MaterialButton btnGuardar;
    public principal.MaterialButton btnGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JTable tablaGrafica;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombreRegistar;
    // End of variables declaration//GEN-END:variables
}
