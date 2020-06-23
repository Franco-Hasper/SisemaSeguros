package formularios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;
import clasesUtilidadGeneral.OperacionesUtiles;
import escritorios.PrincipalCliente;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import operacionesCliente.InterfazGraficaFormularioRegistrarCliente;
import operacionesCliente.TecladoInterfaz;
import operacionesPoliza.ABMCedula;
import operacionesPoliza.InterfazGraficaFormularioEditarCedula;
import principal.MaterialButton;
import principal.PrincipalAdministrador;
import rojeru_san.componentes.RSDateChooser;

/**
 *
 * @author TELCOM MPC
 */
public class FormularioEditarCedula extends javax.swing.JDialog {

    int x, y;
    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    private PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    /**
     * Creates new form FormularioNuevoCliente
     */
    public FormularioEditarCedula(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public List getListaCampos() {
        List listCamposTexto = new ArrayList();
        listCamposTexto.add(this.getTxtCedula());
        return listCamposTexto;
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelPrincipalTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelPrincipalBody = new javax.swing.JPanel();
        boxUsoVehiculo = new javax.swing.JComboBox<>();
        txtPoliza = new javax.swing.JTextField();
        txtTitular = new javax.swing.JTextField();
        radioUso = new javax.swing.JRadioButton();
        txtCedula = new javax.swing.JTextField();
        txtUso = new javax.swing.JTextField();
        txtDominio = new javax.swing.JTextField();
        txtChasis = new javax.swing.JTextField();
        boxMarcaVehiculo = new javax.swing.JComboBox<>();
        txtMotor = new javax.swing.JTextField();
        radioMarca = new javax.swing.JRadioButton();
        rSDateChooser = new rojeru_san.componentes.RSDateChooser();
        txtMarca = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        boxModeloVehiculo = new javax.swing.JComboBox<>();
        txtNroDireccion = new javax.swing.JTextField();
        radioModelo = new javax.swing.JRadioButton();
        boxProvincia = new javax.swing.JComboBox<>();
        txtModelo = new javax.swing.JTextField();
        boxLocalidad = new javax.swing.JComboBox<>();
        txtDni = new javax.swing.JTextField();
        boxTipoVehiculo = new javax.swing.JComboBox<>();
        radioTipo = new javax.swing.JRadioButton();
        txtTipo = new javax.swing.JTextField();
        btnCancelar = new principal.MaterialButton();
        btnGuardarCambios = new principal.MaterialButton();

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
        jLabel1.setText("EDITAR CEDULA");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panelPrincipalBody.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalBodyLayout = new javax.swing.GroupLayout(panelPrincipalBody);
        panelPrincipalBody.setLayout(panelPrincipalBodyLayout);
        panelPrincipalBodyLayout.setHorizontalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        panelPrincipalBodyLayout.setVerticalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        boxUsoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUsoVehiculoActionPerformed(evt);
            }
        });
        boxUsoVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxUsoVehiculoKeyPressed(evt);
            }
        });

        txtPoliza.setEditable(false);

        txtTitular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTitularKeyPressed(evt);
            }
        });

        radioUso.setText("nuevo");
        radioUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUsoActionPerformed(evt);
            }
        });
        radioUso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioUsoKeyPressed(evt);
            }
        });

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });

        txtUso.setEditable(false);
        txtUso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsoKeyPressed(evt);
            }
        });

        txtDominio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDominioKeyPressed(evt);
            }
        });

        txtChasis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChasisKeyPressed(evt);
            }
        });

        boxMarcaVehiculo.setKeySelectionManager(null);
        boxMarcaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMarcaVehiculoActionPerformed(evt);
            }
        });
        boxMarcaVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxMarcaVehiculoKeyPressed(evt);
            }
        });

        txtMotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMotorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMotorKeyTyped(evt);
            }
        });

        radioMarca.setText("nuevo");
        radioMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarcaActionPerformed(evt);
            }
        });
        radioMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioMarcaKeyPressed(evt);
            }
        });

        rSDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        rSDateChooser.setColorBackground(new java.awt.Color(0, 0, 0));
        rSDateChooser.setColorButtonHover(new java.awt.Color(153, 0, 0));
        rSDateChooser.setColorForeground(new java.awt.Color(0, 0, 0));
        rSDateChooser.setPlaceholder("SELECCIONAR FECHA VENCIMIENTO");
        rSDateChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rSDateChooserKeyPressed(evt);
            }
        });

        txtMarca.setEditable(false);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
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

        boxModeloVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxModeloVehiculoActionPerformed(evt);
            }
        });
        boxModeloVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxModeloVehiculoKeyPressed(evt);
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

        radioModelo.setText("nuevo");
        radioModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioModeloActionPerformed(evt);
            }
        });
        radioModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioModeloKeyPressed(evt);
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

        txtModelo.setEditable(false);
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModeloKeyPressed(evt);
            }
        });

        boxLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxLocalidadKeyPressed(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        boxTipoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoVehiculoActionPerformed(evt);
            }
        });
        boxTipoVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxTipoVehiculoKeyPressed(evt);
            }
        });

        radioTipo.setText("nuevo");
        radioTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoActionPerformed(evt);
            }
        });
        radioTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioTipoKeyPressed(evt);
            }
        });

        txtTipo.setEditable(false);
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
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

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula)
                                    .addComponent(txtDominio)
                                    .addComponent(txtTitular, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(boxMarcaVehiculo, 0, 365, Short.MAX_VALUE)
                                    .addComponent(boxModeloVehiculo, 0, 365, Short.MAX_VALUE)
                                    .addComponent(radioMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(radioModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(radioUso, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtUso, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addComponent(txtPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(boxUsoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelPrincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxUsoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPoliza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDominio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(boxMarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addComponent(radioUso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addComponent(boxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBaseLayout.createSequentialGroup()
                                .addComponent(radioModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        ABMCedula abm = new ABMCedula();
        abm.setFormularioEditarCedula(this);
        abm.setPrincipalCliente(principalAdministrador.getCliente());
        if (abm.ejecutarEditar()) {
            principalAdministrador.getCliente().getTablaCedulaC().setEstadoConsulta(0);
            principalAdministrador.getCliente().getTablaCedulaC().ejecutarRellenarTabla();
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        OperacionesUtiles.mensajeCancelarFormulario(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtMotorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNroDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDireccionKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    InterfazGraficaFormularioEditarCedula InterfazGraficaFormularioEditarCedula = new InterfazGraficaFormularioEditarCedula();

    private void boxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProvinciaActionPerformed

        InterfazGraficaFormularioEditarCedula.setBoxProvincia(boxProvincia);
        InterfazGraficaFormularioEditarCedula.setBoxLocalidad(boxLocalidad);
        InterfazGraficaFormularioEditarCedula.evaluarEstadoConsultaLocalidad();
    }//GEN-LAST:event_boxProvinciaActionPerformed

    private void boxModeloVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxModeloVehiculoActionPerformed

    }//GEN-LAST:event_boxModeloVehiculoActionPerformed

    private void boxUsoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUsoVehiculoActionPerformed

    }//GEN-LAST:event_boxUsoVehiculoActionPerformed

    private void boxTipoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoVehiculoActionPerformed

    }//GEN-LAST:event_boxTipoVehiculoActionPerformed

    private void radioMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarcaActionPerformed
        if (radioMarca.isSelected()) {
            txtMarca.setEnabled(true);
            txtMarca.setEditable(true);
        } else {
            txtMarca.setEnabled(false);
            txtMarca.setEditable(false);
        }
    }//GEN-LAST:event_radioMarcaActionPerformed

    private void radioModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioModeloActionPerformed

        if (radioModelo.isSelected()) {
            txtModelo.setEnabled(true);
            txtModelo.setEditable(true);
        } else {
            txtModelo.setEnabled(false);
            txtModelo.setEditable(false);
        }

    }//GEN-LAST:event_radioModeloActionPerformed

    private void radioTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoActionPerformed
        if (radioTipo.isSelected()) {
            txtTipo.setEnabled(true);
            txtTipo.setEditable(true);
        } else {
            txtTipo.setEnabled(false);
            txtTipo.setEditable(false);
        }
    }//GEN-LAST:event_radioTipoActionPerformed

    private void radioUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUsoActionPerformed
        if (radioUso.isSelected()) {
            txtUso.setEnabled(true);
            txtUso.setEditable(true);
        } else {
            txtUso.setEnabled(false);
            txtUso.setEditable(false);
        }
    }//GEN-LAST:event_radioUsoActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    private void txtTitularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitularKeyPressed
        new TecladoInterfaz().desplazar(evt, this.btnGuardarCambios, this.txtCedula);
    }//GEN-LAST:event_txtTitularKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
         new TecladoInterfaz().desplazar(evt, this.txtTitular, this.txtDominio);
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtDominioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDominioKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtCedula, this.boxMarcaVehiculo);
    }//GEN-LAST:event_txtDominioKeyPressed

    private void radioMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioMarcaKeyPressed
        if (this.radioMarca.isSelected()) {
            new TecladoInterfaz().desplazar(evt, this.txtDominio, this.txtMarca);
        } else {
            new TecladoInterfaz().desplazar(evt, this.txtDominio, this.radioModelo);
        }
    }//GEN-LAST:event_radioMarcaKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed

        new TecladoInterfaz().desplazar(evt, this.radioMarca, this.boxModeloVehiculo);


    }//GEN-LAST:event_txtMarcaKeyPressed

    private void boxModeloVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxModeloVehiculoKeyPressed
        if (this.radioMarca.isSelected()) {
            new TecladoInterfaz().desplazarBox(evt, this.radioModelo);
        } else {
            new TecladoInterfaz().desplazarBox(evt, this.radioModelo);
        }
    }//GEN-LAST:event_boxModeloVehiculoKeyPressed

    private void radioModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioModeloKeyPressed
        if (this.radioModelo.isSelected()) {
            if (this.radioMarca.isSelected()) {
                new TecladoInterfaz().desplazar(evt, this.txtMarca, this.txtModelo);
            } else {
                new TecladoInterfaz().desplazar(evt, this.radioMarca, this.txtModelo);
            }
        } else {
            if (this.radioMarca.isSelected()) {
                new TecladoInterfaz().desplazar(evt, this.txtMarca, this.txtDni);
            } else {
                new TecladoInterfaz().desplazar(evt, this.radioMarca, this.txtDni);
            }
        }
    }//GEN-LAST:event_radioModeloKeyPressed

    private void txtModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyPressed
        new TecladoInterfaz().desplazar(evt, this.radioModelo, this.txtDni);
    }//GEN-LAST:event_txtModeloKeyPressed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        if (this.radioModelo.isSelected()) {
            new TecladoInterfaz().desplazar(evt, this.txtModelo, this.boxUsoVehiculo);
        } else {
            new TecladoInterfaz().desplazar(evt, this.radioModelo, this.boxUsoVehiculo);
        }

    }//GEN-LAST:event_txtDniKeyPressed

    private void btnGuardarCambiosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarCambiosKeyPressed
        new TecladoInterfaz().desplazarBtn(evt, txtDni, btnCancelar, txtTitular, btnCancelar);
    }//GEN-LAST:event_btnGuardarCambiosKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (this.radioTipo.isSelected()) {
            new TecladoInterfaz().desplazarBtn(evt, txtTipo, btnGuardarCambios, boxUsoVehiculo, btnGuardarCambios);
        } else {
            new TecladoInterfaz().desplazarBtn(evt, radioTipo, btnGuardarCambios, boxUsoVehiculo, btnGuardarCambios);
        }
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void txtTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyPressed
        new TecladoInterfaz().desplazar(evt, this.radioTipo, this.btnGuardarCambios);
    }//GEN-LAST:event_txtTipoKeyPressed

    private void radioTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioTipoKeyPressed

        if (radioTipo.isSelected()) {
            new TecladoInterfaz().desplazar(evt, this.txtNroDireccion, this.txtTipo);
        } else {
            new TecladoInterfaz().desplazar(evt, this.txtNroDireccion, this.btnGuardarCambios);
        }


    }//GEN-LAST:event_radioTipoKeyPressed

    private void boxTipoVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxTipoVehiculoKeyPressed
        new TecladoInterfaz().desplazarBox(evt, radioTipo);
    }//GEN-LAST:event_boxTipoVehiculoKeyPressed

    private void boxLocalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxLocalidadKeyPressed
        new TecladoInterfaz().desplazarBox(evt, boxTipoVehiculo);
    }//GEN-LAST:event_boxLocalidadKeyPressed

    private void boxProvinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxProvinciaKeyPressed
        new TecladoInterfaz().desplazarBox(evt, boxLocalidad);
    }//GEN-LAST:event_boxProvinciaKeyPressed

    private void txtNroDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDireccionKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtDireccion, this.boxProvincia);
    }//GEN-LAST:event_txtNroDireccionKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        new TecladoInterfaz().desplazar(evt, this.rSDateChooser, this.txtNroDireccion);
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void rSDateChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rSDateChooserKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtMotor, this.txtDireccion);
    }//GEN-LAST:event_rSDateChooserKeyPressed

    private void txtMotorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotorKeyPressed
        new TecladoInterfaz().desplazar(evt, this.txtChasis, this.rSDateChooser);
    }//GEN-LAST:event_txtMotorKeyPressed

    private void txtChasisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChasisKeyPressed
        if (radioUso.isSelected()) {
            new TecladoInterfaz().desplazar(evt, this.txtUso, this.txtMotor);
        } else {
            new TecladoInterfaz().desplazar(evt, this.radioUso, this.txtMotor);
        }
    }//GEN-LAST:event_txtChasisKeyPressed

    private void txtUsoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsoKeyPressed
        new TecladoInterfaz().desplazar(evt, this.radioUso, this.txtChasis);
    }//GEN-LAST:event_txtUsoKeyPressed

    private void radioUsoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioUsoKeyPressed
        if (radioUso.isSelected()) {
            new TecladoInterfaz().desplazar(evt, this.txtDni, this.txtMotor);
        } else {
            new TecladoInterfaz().desplazar(evt, this.txtDni, this.txtChasis);
        }
    }//GEN-LAST:event_radioUsoKeyPressed

    private void boxUsoVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxUsoVehiculoKeyPressed
        new TecladoInterfaz().desplazarBox(evt, this.radioUso);
    }//GEN-LAST:event_boxUsoVehiculoKeyPressed

    private void boxMarcaVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxMarcaVehiculoKeyPressed
         new TecladoInterfaz().desplazarBox(evt, this.radioMarca);
    }//GEN-LAST:event_boxMarcaVehiculoKeyPressed

    private void boxMarcaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMarcaVehiculoActionPerformed

        InterfazGraficaFormularioEditarCedula.setBoxMarcaVehiculo(boxMarcaVehiculo);
        InterfazGraficaFormularioEditarCedula.setBoxModeloVehiculo(boxModeloVehiculo);
        InterfazGraficaFormularioEditarCedula.evaluarEstadoConsultaModelo();
    }//GEN-LAST:event_boxMarcaVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEditarCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEditarCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                FormularioEditarCedula dialog = new FormularioEditarCedula(new javax.swing.JFrame(), true);
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

    public JComboBox<String> getBoxLocalidad() {
        return boxLocalidad;
    }

    public void setBoxLocalidad(JComboBox<String> boxLocalidad) {
        this.boxLocalidad = boxLocalidad;
    }

    public JComboBox<String> getBoxMarcaVehiculo() {
        return boxMarcaVehiculo;
    }

    public void setBoxMarcaVehiculo(JComboBox<String> boxMarcaVehiculo) {
        this.boxMarcaVehiculo = boxMarcaVehiculo;
    }

    public JComboBox<String> getBoxModeloVehiculo() {
        return boxModeloVehiculo;
    }

    public void setBoxModeloVehiculo(JComboBox<String> boxModeloVehiculo) {
        this.boxModeloVehiculo = boxModeloVehiculo;
    }

    public JComboBox<String> getBoxProvincia() {
        return boxProvincia;
    }

    public void setBoxProvincia(JComboBox<String> boxProvincia) {
        this.boxProvincia = boxProvincia;
    }

    public JComboBox<String> getBoxTipoVehiculo() {
        return boxTipoVehiculo;
    }

    public void setBoxTipoVehiculo(JComboBox<String> boxTipoVehiculo) {
        this.boxTipoVehiculo = boxTipoVehiculo;
    }

    public JComboBox<String> getBoxUsoVehiculo() {
        return boxUsoVehiculo;
    }

    public void setBoxUsoVehiculo(JComboBox<String> boxUsoVehiculo) {
        this.boxUsoVehiculo = boxUsoVehiculo;
    }

    public RSDateChooser getrSDateChooser() {
        return rSDateChooser;
    }

    public void setrSDateChooser(RSDateChooser rSDateChooser) {
        this.rSDateChooser = rSDateChooser;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtChasis() {
        return txtChasis;
    }

    public void setTxtChasis(JTextField txtChasis) {
        this.txtChasis = txtChasis;
    }

    public JTextField getTxtCliente() {
        return txtPoliza;
    }

    public void setTxtCliente(JTextField txtCliente) {
        this.txtPoliza = txtCliente;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public void setTxtDni(JTextField txtDni) {
        this.txtDni = txtDni;
    }

    public JTextField getTxtDominio() {
        return txtDominio;
    }

    public void setTxtDominio(JTextField txtDominio) {
        this.txtDominio = txtDominio;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtMotor() {
        return txtMotor;
    }

    public void setTxtMotor(JTextField txtMotor) {
        this.txtMotor = txtMotor;
    }

    public JTextField getTxtNroDireccion() {
        return txtNroDireccion;
    }

    public void setTxtNroDireccion(JTextField txtNroDireccion) {
        this.txtNroDireccion = txtNroDireccion;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtTitular() {
        return txtTitular;
    }

    public void setTxtTitular(JTextField txtTitular) {
        this.txtTitular = txtTitular;
    }

    public JTextField getTxtUso() {
        return txtUso;
    }

    public void setTxtUso(JTextField txtUso) {
        this.txtUso = txtUso;
    }

    public JRadioButton getRadioMarca() {
        return radioMarca;
    }

    public void setRadioMarca(JRadioButton radioMarca) {
        this.radioMarca = radioMarca;
    }

    public JRadioButton getRadioModelo() {
        return radioModelo;
    }

    public void setRadioModelo(JRadioButton radioModelo) {
        this.radioModelo = radioModelo;
    }

    public JRadioButton getRadioTipo() {
        return radioTipo;
    }

    public void setRadioTipo(JRadioButton radioTipo) {
        this.radioTipo = radioTipo;
    }

    public JRadioButton getRadioUso() {
        return radioUso;
    }

    public void setRadioUso(JRadioButton radioUso) {
        this.radioUso = radioUso;
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

    public JTextField getTxtPoliza() {
        return txtPoliza;
    }

    public void setTxtPoliza(JTextField txtPoliza) {
        this.txtPoliza = txtPoliza;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxLocalidad;
    private javax.swing.JComboBox<String> boxMarcaVehiculo;
    private javax.swing.JComboBox<String> boxModeloVehiculo;
    private javax.swing.JComboBox<String> boxProvincia;
    private javax.swing.JComboBox<String> boxTipoVehiculo;
    private javax.swing.JComboBox<String> boxUsoVehiculo;
    private principal.MaterialButton btnCancelar;
    private principal.MaterialButton btnGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelPrincipalBody;
    private javax.swing.JPanel panelPrincipalTop;
    private rojeru_san.componentes.RSDateChooser rSDateChooser;
    private javax.swing.JRadioButton radioMarca;
    private javax.swing.JRadioButton radioModelo;
    private javax.swing.JRadioButton radioTipo;
    private javax.swing.JRadioButton radioUso;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDominio;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtNroDireccion;
    private javax.swing.JTextField txtPoliza;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTitular;
    private javax.swing.JTextField txtUso;
    // End of variables declaration//GEN-END:variables
}
