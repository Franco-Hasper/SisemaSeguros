package formularios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;
import operacionesCliente.ABMCliente;
import clasesUtilidadGeneral.OperacionesUtiles;
import escritorios.PrincipalCliente;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import operacionesCliente.InterfazGraficaFormularioEditarCliente;
import operacionesCliente.TablaCliente;
import operacionesCliente.TecladoInterfaz;
import principal.MaterialButton;
import rojeru_san.componentes.RSDateChooser;

/**
 *
 * @author TELCOM MPC
 */
public class FormularioEditarCliente extends javax.swing.JDialog {

    int x, y;

    PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    /**
     * Creates new form FormularioNuevoCliente
     */
    public FormularioEditarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public List getListaCampos() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtNombre());
        listCamposTexto.add(this.getTxtApellido());
        listCamposTexto.add(this.getTxtTelefono());
        return listCamposTexto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelPrincipalTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelprincipalBody = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardarCambios = new principal.MaterialButton();
        btnCancelar = new principal.MaterialButton();
        txtNroDireccion = new javax.swing.JTextField();
        boxLocalidad = new javax.swing.JComboBox<>();
        boxProvincia = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        txtNroDNI = new javax.swing.JTextField();
        rSDateChooser = new rojeru_san.componentes.RSDateChooser();
        radioBtnFemenino = new javax.swing.JRadioButton();
        radioBtnMasculino = new javax.swing.JRadioButton();
        radioBtnOtros = new javax.swing.JRadioButton();

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
        jLabel1.setText("EDITAR CLIENTE");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        panelprincipalBody.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

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
        btnGuardarCambios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarCambiosKeyPressed(evt);
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

        txtNroDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNroDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDireccionKeyTyped(evt);
            }
        });

        boxLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLocalidadActionPerformed(evt);
            }
        });
        boxLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxLocalidadKeyPressed(evt);
            }
        });

        boxProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProvinciaActionPerformed(evt);
            }
        });
        boxProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxProvinciaKeyPressed(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        txtNroDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNroDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDNIKeyTyped(evt);
            }
        });

        rSDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        rSDateChooser.setColorBackground(new java.awt.Color(153, 0, 0));
        rSDateChooser.setColorButtonHover(new java.awt.Color(153, 0, 0));
        rSDateChooser.setColorForeground(new java.awt.Color(0, 0, 0));
        rSDateChooser.setPlaceholder("FECHA DE NACIMIENTO");
        rSDateChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rSDateChooserKeyPressed(evt);
            }
        });

        radioBtnFemenino.setText("Femenino");
        radioBtnFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemeninoActionPerformed(evt);
            }
        });
        radioBtnFemenino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioBtnFemeninoKeyPressed(evt);
            }
        });

        radioBtnMasculino.setText("Masculino");
        radioBtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMasculinoActionPerformed(evt);
            }
        });
        radioBtnMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioBtnMasculinoKeyPressed(evt);
            }
        });

        radioBtnOtros.setText("Otros");
        radioBtnOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnOtrosActionPerformed(evt);
            }
        });
        radioBtnOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioBtnOtrosKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelprincipalBodyLayout = new javax.swing.GroupLayout(panelprincipalBody);
        panelprincipalBody.setLayout(panelprincipalBodyLayout);
        panelprincipalBodyLayout.setHorizontalGroup(
            panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtTelefono)
                    .addComponent(boxProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxLocalidad, 0, 365, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNroDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                            .addComponent(radioBtnFemenino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioBtnMasculino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioBtnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        panelprincipalBodyLayout.setVerticalGroup(
            panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                        .addComponent(txtNroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnFemenino)
                    .addComponent(radioBtnMasculino)
                    .addComponent(radioBtnOtros))
                .addGap(18, 18, 18)
                .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(boxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(boxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelprincipalBodyLayout.createSequentialGroup()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(panelprincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelprincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelprincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        ABMCliente abm = new ABMCliente();
        abm.setFormularioEditarCliente(this);
        abm.setPrincipalCliente(principalCliente);
        if (abm.ejecutarEditar()) {
            principalCliente.getTablaCliente().setEstadoConsulta(0);
            principalCliente.getTablaCliente().ejecutarRellenarTabla();
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        OperacionesUtiles.mensajeCancelarFormulario(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNroDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDireccionKeyTyped
        if (new OperacionesUtiles().advertenciaNum(evt)) {
            OperacionesUtiles.borrarCampo(txtTelefono);
        }
    }//GEN-LAST:event_txtNroDireccionKeyTyped
    InterfazGraficaFormularioEditarCliente interfazGraficaFormularioEditarCliente = new InterfazGraficaFormularioEditarCliente();
    private void boxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProvinciaActionPerformed
        interfazGraficaFormularioEditarCliente.setBoxProvincia(boxProvincia);
        interfazGraficaFormularioEditarCliente.setBoxLocalidad(boxLocalidad);
        interfazGraficaFormularioEditarCliente.evaluarEstadoConsultaLocalidad();
    }//GEN-LAST:event_boxProvinciaActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void boxLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLocalidadActionPerformed
    }//GEN-LAST:event_boxLocalidadActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    private void txtNroDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDNIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDNIKeyTyped

    private void radioBtnFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemeninoActionPerformed
        if (this.getRadioBtnFemenino().isSelected()) {
            this.getRadioBtnMasculino().setSelected(false);
            this.getRadioBtnOtros().setSelected(false);
        }
    }//GEN-LAST:event_radioBtnFemeninoActionPerformed

    private void radioBtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMasculinoActionPerformed
        if (this.getRadioBtnMasculino().isSelected()) {
            this.getRadioBtnFemenino().setSelected(false);
            this.getRadioBtnOtros().setSelected(false);
        }
    }//GEN-LAST:event_radioBtnMasculinoActionPerformed

    private void radioBtnOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnOtrosActionPerformed
        if (this.getRadioBtnOtros().isSelected()) {
            this.getRadioBtnFemenino().setSelected(false);
            this.getRadioBtnMasculino().setSelected(false);
        }
    }//GEN-LAST:event_radioBtnOtrosActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        new TecladoInterfaz().desplazar(evt, this.btnCancelar, this.txtApellido);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtNombre, this.txtTelefono);
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtApellido, this.boxProvincia);
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void boxProvinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxProvinciaKeyPressed
        new TecladoInterfaz().desplazarBox(evt, this.boxLocalidad);
    }//GEN-LAST:event_boxProvinciaKeyPressed

    private void boxLocalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxLocalidadKeyPressed
        new TecladoInterfaz().desplazarBox(evt, this.txtNroDNI);
    }//GEN-LAST:event_boxLocalidadKeyPressed

    private void txtNroDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDNIKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtTelefono, this.rSDateChooser);
    }//GEN-LAST:event_txtNroDNIKeyPressed

    private void rSDateChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSDateChooserKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtNroDNI, this.radioBtnFemenino);
    }//GEN-LAST:event_rSDateChooserKeyPressed

    private void radioBtnFemeninoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioBtnFemeninoKeyPressed
        new TecladoInterfaz().desplazarBtn(evt, this.rSDateChooser, this.radioBtnMasculino, this.txtDireccion, this.radioBtnOtros);
    }//GEN-LAST:event_radioBtnFemeninoKeyPressed

    private void radioBtnMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioBtnMasculinoKeyPressed
        new TecladoInterfaz().desplazarBtn(evt, this.rSDateChooser, this.radioBtnOtros, this.txtDireccion, this.radioBtnFemenino);
    }//GEN-LAST:event_radioBtnMasculinoKeyPressed

    private void radioBtnOtrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioBtnOtrosKeyPressed
        new TecladoInterfaz().desplazarBtn(evt, this.rSDateChooser, this.radioBtnFemenino, this.txtDireccion, this.radioBtnMasculino);
    }//GEN-LAST:event_radioBtnOtrosKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        new TecladoInterfaz().desplazar(evt, this.radioBtnFemenino, this.txtNroDireccion);
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtNroDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDireccionKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtDireccion, this.btnGuardarCambios);
    }//GEN-LAST:event_txtNroDireccionKeyPressed

    private void btnGuardarCambiosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarCambiosKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtNroDireccion, this.btnCancelar);
    }//GEN-LAST:event_btnGuardarCambiosKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        new TecladoInterfaz().desplazar(evt, this.btnGuardarCambios, this.txtNombre);
    }//GEN-LAST:event_btnCancelarKeyPressed

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
            java.util.logging.Logger.getLogger(FormularioEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioEditarCliente dialog = new FormularioEditarCliente(new javax.swing.JFrame(), true);
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

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public JComboBox<String> getBoxLocalidad() {
        return boxLocalidad;
    }

    public void setBoxLocalidad(JComboBox<String> boxLocalidad) {
        this.boxLocalidad = boxLocalidad;
    }

    public JComboBox<String> getBoxProvincia() {
        return boxProvincia;
    }

    public void setBoxProvincia(JComboBox<String> boxProvincia) {
        this.boxProvincia = boxProvincia;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNroDireccion() {
        return txtNroDireccion;
    }

    public void setTxtNroDireccion(JTextField txtNroDireccion) {
        this.txtNroDireccion = txtNroDireccion;
    }

    public MaterialButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(MaterialButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public MaterialButton getBtnGuardarCambios() {
        return btnGuardarCambios;
    }

    public void setBtnGuardarCambios(MaterialButton btnGuardarCambios) {
        this.btnGuardarCambios = btnGuardarCambios;
    }

    public RSDateChooser getrSDateChooser() {
        return rSDateChooser;
    }

    public void setrSDateChooser(RSDateChooser rSDateChooser) {
        this.rSDateChooser = rSDateChooser;
    }

    public JRadioButton getRadioBtnFemenino() {
        return radioBtnFemenino;
    }

    public void setRadioBtnFemenino(JRadioButton radioBtnFemenino) {
        this.radioBtnFemenino = radioBtnFemenino;
    }

    public JRadioButton getRadioBtnMasculino() {
        return radioBtnMasculino;
    }

    public void setRadioBtnMasculino(JRadioButton radioBtnMasculino) {
        this.radioBtnMasculino = radioBtnMasculino;
    }

    public JRadioButton getRadioBtnOtros() {
        return radioBtnOtros;
    }

    public void setRadioBtnOtros(JRadioButton radioBtnOtros) {
        this.radioBtnOtros = radioBtnOtros;
    }

    public JTextField getTxtNroDNI() {
        return txtNroDNI;
    }

    public void setTxtNroDNI(JTextField txtNroDNI) {
        this.txtNroDNI = txtNroDNI;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxLocalidad;
    private javax.swing.JComboBox<String> boxProvincia;
    private principal.MaterialButton btnCancelar;
    private principal.MaterialButton btnGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JPanel panelprincipalBody;
    private rojeru_san.componentes.RSDateChooser rSDateChooser;
    private javax.swing.JRadioButton radioBtnFemenino;
    private javax.swing.JRadioButton radioBtnMasculino;
    private javax.swing.JRadioButton radioBtnOtros;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroDNI;
    private javax.swing.JTextField txtNroDireccion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
