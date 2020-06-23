package escritorios;

import clasesUtilidadGeneral.ColorFila;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import operacionesCliente.ABMCliente;
import operacionesCliente.TablaCliente;
import clasesUtilidadGeneral.OperacionesUtiles;
import formularios.FormularioEditarCedula;
import formularios.FormularioEditarCliente;
import formularios.FormularioEditarPoliza;
import formularios.FormularioEditarVencimiento;
import formularios.FormularioRegistrarCedula;
import formularios.FormularioRegistrarCliente;
import formularios.FormularioRegistrarPoliza;
import formularios.FormularioRegistrarVencimiento;
import formularios.MenuDetallesCliente;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import operacionesCliente.DetallesCliente;
import operacionesCliente.InterfazGraficaFormularioEditarCliente;
import operacionesCliente.InterfazGraficaFormularioRegistrarCliente;
import operacionesCliente.TablaCedulaC;
import operacionesCliente.TablaPolizaC;
import operacionesCliente.TablaVencimientoC;
import operacionesPoliza.ABMCedula;
import operacionesPoliza.ABMPoliza;
import operacionesCliente.ABMVencimiento;
import operacionesPoliza.ABMVencimientoCliente;
import operacionesPoliza.InterfazGraficaFormularioEditarCedula;
import operacionesPoliza.InterfazGraficaFormularioEditarPoliza;
import operacionesCliente.InterfazGraficaFormularioEditarVencimiento;
import operacionesPoliza.InterfazGraficaFormularioRegistrarCedula;
import operacionesPoliza.InterfazGraficaFormularioRegistrarPoliza;
import operacionesCliente.InterfazGraficaFormularioRegistrarVencimiento;
import principal.MaterialButton;
import principal.PrincipalAdministrador;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalCliente extends javax.swing.JInternalFrame {

    OperacionesUtiles utlidad = new OperacionesUtiles();
    ABMVencimientoCliente abm = new ABMVencimientoCliente();

    /**
     * Creates new form PrincipalCliente
     */
    public PrincipalCliente() {
        initComponents();
    }

    Integer estado;

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    private TablaCliente tablaCliente;
    private TablaPolizaC tablaPolizaC;
    private TablaCedulaC tablaCedulaC;
    private TablaVencimientoC tablaVencimientoC;
    private FormularioRegistrarCliente registrarCliente;
    private FormularioEditarCliente editarCliente;
    private DetallesCliente detalles;
    private FormularioRegistrarPoliza registrarPoliza;
    private FormularioEditarPoliza editarPoliza;
    private FormularioRegistrarCedula registrarCedula;
    private FormularioEditarCedula editarCedula;
    private FormularioRegistrarVencimiento registrarVencimiento;
    private FormularioEditarVencimiento editarVencimiento;
    private MenuDetallesCliente menuDetallesCliente;

    public MenuDetallesCliente getMenuDetallesCliente() {
        return menuDetallesCliente;
    }

    public void setMenuDetallesCliente(MenuDetallesCliente menuDetallesCliente) {
        this.menuDetallesCliente = menuDetallesCliente;
    }

    public FormularioRegistrarPoliza getRegistrarPoliza() {
        return registrarPoliza;
    }

    public void setRegistrarPoliza(FormularioRegistrarPoliza registrarPoliza) {
        this.registrarPoliza = registrarPoliza;
    }

    public FormularioEditarPoliza getEditarPoliza() {
        return editarPoliza;
    }

    public void setEditarPoliza(FormularioEditarPoliza editarPoliza) {
        this.editarPoliza = editarPoliza;
    }

    public FormularioRegistrarCedula getRegistrarCedula() {
        return registrarCedula;
    }

    public void setRegistrarCedula(FormularioRegistrarCedula registrarCedula) {
        this.registrarCedula = registrarCedula;
    }

    public FormularioEditarCedula getEditarCedula() {
        return editarCedula;
    }

    public void setEditarCedula(FormularioEditarCedula editarCedula) {
        this.editarCedula = editarCedula;
    }

    public FormularioRegistrarVencimiento getRegistrarVencimiento() {
        return registrarVencimiento;
    }

    public void setRegistrarVencimiento(FormularioRegistrarVencimiento registrarVencimiento) {
        this.registrarVencimiento = registrarVencimiento;
    }

    public FormularioEditarVencimiento getEditarVencimiento() {
        return editarVencimiento;
    }

    public void setEditarVencimiento(FormularioEditarVencimiento editarVencimiento) {
        this.editarVencimiento = editarVencimiento;
    }

    public DetallesCliente getDetalles() {
        return detalles;
    }

    public void setDetalles(DetallesCliente detalles) {
        this.detalles = detalles;
    }

    public TablaCliente getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(TablaCliente tablaCliente) {
        this.tablaCliente = tablaCliente;
    }

    public FormularioRegistrarCliente getRegistrarCliente() {
        return registrarCliente;
    }

    public void setRegistrarCliente(FormularioRegistrarCliente registrarCliente) {
        this.registrarCliente = registrarCliente;
    }

    public FormularioEditarCliente getEditarCliente() {
        return editarCliente;
    }

    public void setEditarCliente(FormularioEditarCliente editarCliente) {
        this.editarCliente = editarCliente;
    }

    private PrincipalAdministrador principalAdministrador;

    public InterfazGraficaFormularioRegistrarCliente formularioRegistrar = new InterfazGraficaFormularioRegistrarCliente();

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    public JTable getTablaGrafica() {
        return tablaGrafica;
    }

    public void setTablaGrafica(JTable tablaGrafica) {
        this.tablaGrafica = tablaGrafica;
    }

    public TablaPolizaC getTablaPolizaC() {
        return tablaPolizaC;
    }

    public void setTablaPolizaC(TablaPolizaC tablaPolizaC) {
        this.tablaPolizaC = tablaPolizaC;
    }

    public TablaCedulaC getTablaCedulaC() {
        return tablaCedulaC;
    }

    public void setTablaCedulaC(TablaCedulaC tablaCedulaC) {
        this.tablaCedulaC = tablaCedulaC;
    }

    public TablaVencimientoC getTablaVencimientoC() {
        return tablaVencimientoC;
    }

    public void setTablaVencimientoC(TablaVencimientoC tablaVencimientoC) {
        this.tablaVencimientoC = tablaVencimientoC;
    }

    public JTable getTablaGraficaPolizas() {
        return tablaGraficaPolizas;
    }

    public void setTablaGraficaPolizas(JTable tablaGraficaPolizas) {
        this.tablaGraficaPolizas = tablaGraficaPolizas;
    }

    public JTable getTablaGraficaVencimiento() {
        return tablaGraficaVencimiento;
    }

    public void setTablaGraficaVencimiento(JTable tablaGraficaVencimiento) {
        this.tablaGraficaVencimiento = tablaGraficaVencimiento;
    }

    public JTable getTablaGraficacedula() {
        return tablaGraficacedula;
    }

    public void setTablaGraficacedula(JTable tablaGraficacedula) {
        this.tablaGraficacedula = tablaGraficacedula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuVencimiento = new javax.swing.JPanel();
        btnPendiente = new principal.MaterialButton();
        btnPagado = new principal.MaterialButton();
        btnVencido = new principal.MaterialButton();
        btnnEditarVencimiento = new principal.MaterialButton();
        btnEliminarVEncimiento = new principal.MaterialButton();
        popMenu = new javax.swing.JPopupMenu();
        menuPoliza = new javax.swing.JPanel();
        btnnEditarPoliza = new principal.MaterialButton();
        btnEliminarPoliza = new principal.MaterialButton();
        menuCedula = new javax.swing.JPanel();
        btnnEditarCedula = new principal.MaterialButton();
        btnEliminarCedula = new principal.MaterialButton();
        menuCliente = new javax.swing.JPanel();
        btnnEditarCliente = new principal.MaterialButton();
        btnEliminarCli = new principal.MaterialButton();
        btnnDetalles = new principal.MaterialButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panelPrincipalTop = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnnuevoCliente = new principal.MaterialButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrafica = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGraficaPolizas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGraficaVencimiento = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaGraficacedula = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        btnnuevoPoliza = new principal.MaterialButton();
        btnnuevoVencimiento = new principal.MaterialButton();
        btnEliminarTodoVEncimiento = new principal.MaterialButton();
        btnnuevoCedula = new principal.MaterialButton();
        btnEliminarTodoVEncimiento1 = new principal.MaterialButton();

        btnPendiente.setBackground(new java.awt.Color(0, 0, 0,60));
        btnPendiente.setForeground(new java.awt.Color(255, 255, 255));
        btnPendiente.setText("PENDIENTE");
        btnPendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPendiente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnPendiente.setMaximumSize(new java.awt.Dimension(170, 35));
        btnPendiente.setMinimumSize(new java.awt.Dimension(170, 35));
        btnPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteActionPerformed(evt);
            }
        });

        btnPagado.setBackground(new java.awt.Color(0, 0, 0,60));
        btnPagado.setForeground(new java.awt.Color(255, 255, 255));
        btnPagado.setText("PAGADO");
        btnPagado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagado.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnPagado.setMaximumSize(new java.awt.Dimension(170, 35));
        btnPagado.setMinimumSize(new java.awt.Dimension(170, 35));
        btnPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagadoActionPerformed(evt);
            }
        });

        btnVencido.setBackground(new java.awt.Color(0, 0, 0,60));
        btnVencido.setForeground(new java.awt.Color(255, 255, 255));
        btnVencido.setText("VENCIDO");
        btnVencido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVencido.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVencido.setMaximumSize(new java.awt.Dimension(170, 35));
        btnVencido.setMinimumSize(new java.awt.Dimension(170, 35));
        btnVencido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVencidoActionPerformed(evt);
            }
        });

        btnnEditarVencimiento.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarVencimiento.setText("EDITAR");
        btnnEditarVencimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarVencimiento.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarVencimiento.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnEditarVencimiento.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnEditarVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarVencimientoActionPerformed(evt);
            }
        });

        btnEliminarVEncimiento.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarVEncimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVEncimiento.setText("ELIMINAR");
        btnEliminarVEncimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarVEncimiento.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarVEncimiento.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarVEncimiento.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarVEncimiento.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarVEncimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVEncimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuVencimientoLayout = new javax.swing.GroupLayout(menuVencimiento);
        menuVencimiento.setLayout(menuVencimientoLayout);
        menuVencimientoLayout.setHorizontalGroup(
            menuVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVencido, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(btnPagado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnnEditarVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminarVEncimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPendiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuVencimientoLayout.setVerticalGroup(
            menuVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuVencimientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVencido, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnEditarVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarVEncimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnnEditarPoliza.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarPoliza.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarPoliza.setText("EDITAR");
        btnnEditarPoliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarPoliza.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarPoliza.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnEditarPoliza.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnEditarPoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarPolizaActionPerformed(evt);
            }
        });

        btnEliminarPoliza.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarPoliza.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPoliza.setText("ELIMINAR");
        btnEliminarPoliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPoliza.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarPoliza.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarPoliza.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarPoliza.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarPoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPolizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPolizaLayout = new javax.swing.GroupLayout(menuPoliza);
        menuPoliza.setLayout(menuPolizaLayout);
        menuPolizaLayout.setHorizontalGroup(
            menuPolizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnEditarPoliza, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addComponent(btnEliminarPoliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPolizaLayout.setVerticalGroup(
            menuPolizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPolizaLayout.createSequentialGroup()
                .addComponent(btnnEditarPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnnEditarCedula.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarCedula.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarCedula.setText("EDITAR");
        btnnEditarCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarCedula.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarCedula.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnEditarCedula.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnEditarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarCedulaActionPerformed(evt);
            }
        });

        btnEliminarCedula.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarCedula.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCedula.setText("ELIMINAR");
        btnEliminarCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCedula.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarCedula.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarCedula.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarCedula.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuCedulaLayout = new javax.swing.GroupLayout(menuCedula);
        menuCedula.setLayout(menuCedulaLayout);
        menuCedulaLayout.setHorizontalGroup(
            menuCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnEditarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addComponent(btnEliminarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuCedulaLayout.setVerticalGroup(
            menuCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCedulaLayout.createSequentialGroup()
                .addComponent(btnnEditarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnEliminarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnnEditarCliente.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnnEditarCliente.setText("EDITAR");
        btnnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnEditarCliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnEditarCliente.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnEditarCliente.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCli.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarCli.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCli.setText("ELIMINAR");
        btnEliminarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCli.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarCli.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarCli.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarCli.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        btnnDetalles.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnnDetalles.setText("DETALLES");
        btnnDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnDetalles.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnDetalles.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnDetalles.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnDetallesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuClienteLayout = new javax.swing.GroupLayout(menuCliente);
        menuCliente.setLayout(menuClienteLayout);
        menuClienteLayout.setHorizontalGroup(
            menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(btnEliminarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnnDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuClienteLayout.setVerticalGroup(
            menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuClienteLayout.createSequentialGroup()
                .addComponent(btnnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(1366, 768));

        panelPrincipalTop.setBackground(new java.awt.Color(204, 0, 0));

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
        });

        btnnuevoCliente.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevoCliente.setText("+ CLIENTE");
        btnnuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoCliente.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnuevoCliente.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnuevoCliente.setMinimumSize(new java.awt.Dimension(130, 35));
        btnnuevoCliente.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoClienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        tablaGrafica.setBackground(new java.awt.Color(255, 255, 255));
        tablaGrafica.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGrafica.setForeground(new java.awt.Color(102, 0, 0));
        tablaGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGrafica.setComponentPopupMenu(popMenu);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        tablaGraficaPolizas.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficaPolizas.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficaPolizas.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficaPolizas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° DE POLIZA", "EMPRESA", "TIPO DE SEGURO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGraficaPolizas.setComponentPopupMenu(popMenu);
        tablaGraficaPolizas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficaPolizas.setDoubleBuffered(true);
        tablaGraficaPolizas.setRowHeight(40);
        tablaGraficaPolizas.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaGraficaPolizas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficaPolizas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficaPolizas.getTableHeader().setReorderingAllowed(false);
        tablaGraficaPolizas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaGraficaPolizasMousePressed(evt);
            }
        });
        tablaGraficaPolizas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaGraficaPolizasComponentHidden(evt);
            }
        });
        jScrollPane2.setViewportView(tablaGraficaPolizas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        tablaGraficaVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficaVencimiento.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficaVencimiento.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficaVencimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COTA N°", "ESTADO DE CUOTA", "VENCIMIENTO", "DIAS RESTANTES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGraficaVencimiento.setComponentPopupMenu(popMenu);
        tablaGraficaVencimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficaVencimiento.setDoubleBuffered(true);
        tablaGraficaVencimiento.setRowHeight(40);
        tablaGraficaVencimiento.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaGraficaVencimiento.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficaVencimiento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficaVencimiento.getTableHeader().setReorderingAllowed(false);
        tablaGraficaVencimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGraficaVencimientoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaGraficaVencimientoMousePressed(evt);
            }
        });
        tablaGraficaVencimiento.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaGraficaVencimientoComponentHidden(evt);
            }
        });
        jScrollPane3.setViewportView(tablaGraficaVencimiento);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));

        tablaGraficacedula.setBackground(new java.awt.Color(255, 255, 255));
        tablaGraficacedula.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablaGraficacedula.setForeground(new java.awt.Color(102, 0, 0));
        tablaGraficacedula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO", "TITULAR", "DNI", "DOMICILIO", "DOMINIO", "MARCA", "MODELO", "TIPO", "USO", "CHASIS", "MOTOR", "VENCIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaGraficacedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGraficacedula.setDoubleBuffered(true);
        tablaGraficacedula.setRowHeight(40);
        tablaGraficacedula.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaGraficacedula.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaGraficacedula.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaGraficacedula.getTableHeader().setReorderingAllowed(false);
        tablaGraficacedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaGraficacedulaMousePressed(evt);
            }
        });
        tablaGraficacedula.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaGraficacedulaComponentHidden(evt);
            }
        });
        jScrollPane4.setViewportView(tablaGraficacedula);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLIENTES");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_group_man_man_80px.png"))); // NOI18N

        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel_60px.png"))); // NOI18N
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnnuevoPoliza.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnuevoPoliza.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevoPoliza.setText("+ POLIZA");
        btnnuevoPoliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoPoliza.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnuevoPoliza.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnuevoPoliza.setMinimumSize(new java.awt.Dimension(130, 35));
        btnnuevoPoliza.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnuevoPoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoPolizaActionPerformed(evt);
            }
        });

        btnnuevoVencimiento.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnuevoVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevoVencimiento.setText("+ VENCIMIENTO");
        btnnuevoVencimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoVencimiento.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnuevoVencimiento.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnuevoVencimiento.setMinimumSize(new java.awt.Dimension(130, 35));
        btnnuevoVencimiento.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnuevoVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoVencimientoActionPerformed(evt);
            }
        });

        btnEliminarTodoVEncimiento.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarTodoVEncimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTodoVEncimiento.setText("- VENCIMIENTO");
        btnEliminarTodoVEncimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTodoVEncimiento.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarTodoVEncimiento.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarTodoVEncimiento.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarTodoVEncimiento.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarTodoVEncimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoVEncimientoActionPerformed(evt);
            }
        });

        btnnuevoCedula.setBackground(new java.awt.Color(0, 0, 0,60));
        btnnuevoCedula.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevoCedula.setText("+ CEDULA");
        btnnuevoCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevoCedula.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnnuevoCedula.setMaximumSize(new java.awt.Dimension(130, 35));
        btnnuevoCedula.setMinimumSize(new java.awt.Dimension(130, 35));
        btnnuevoCedula.setPreferredSize(new java.awt.Dimension(130, 35));
        btnnuevoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoCedulaActionPerformed(evt);
            }
        });

        btnEliminarTodoVEncimiento1.setBackground(new java.awt.Color(0, 0, 0,60));
        btnEliminarTodoVEncimiento1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTodoVEncimiento1.setText("TODOS V. PGDO.");
        btnEliminarTodoVEncimiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTodoVEncimiento1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnEliminarTodoVEncimiento1.setMaximumSize(new java.awt.Dimension(130, 35));
        btnEliminarTodoVEncimiento1.setMinimumSize(new java.awt.Dimension(130, 35));
        btnEliminarTodoVEncimiento1.setPreferredSize(new java.awt.Dimension(130, 35));
        btnEliminarTodoVEncimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoVEncimiento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevoPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTodoVEncimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarTodoVEncimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalTopLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTodoVEncimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTodoVEncimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevoPoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tablaCliente.setPrincipalCliente(this);
        tablaCliente.ejecutarRellenarTabla();
        tablaPolizaC.vaciarTabla();
        tablaVencimientoC.vaciarTabla();
        tablaCedulaC.vaciarTabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tablaGraficaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficaComponentHidden

    private void btnnuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoClienteActionPerformed
        // TODO add your handling code here:
        formularioRegistrar.setPrincipalCliente(this);
        formularioRegistrar.nuevoFormularioRegistrar();
    }//GEN-LAST:event_btnnuevoClienteActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked


    private void tablaGraficaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficaMousePressed

        this.btnnuevoPoliza.setEnabled(true);

        tablaVencimientoC.vaciarTabla();
        tablaCedulaC.vaciarTabla();
        tablaPolizaC.ejecutarRellenarTabla();

        popMenu.remove(this.menuPoliza);
        popMenu.remove(menuVencimiento);
        popMenu.remove(this.menuCedula);
        popMenu.add(menuCliente);

        //seccion autoseleccion tabllas secundarias
        utlidad.selectRows(this.tablaGraficaPolizas, 0, 1);
        tablaVencimientoC.ejecutarRellenarTabla();
        tablaCedulaC.ejecutarRellenarTabla();
        //cambiar color filas
        ColorFila colorFila = new ColorFila(principalAdministrador.getPanelPrincipalTop().getBackground());
        getTablaGraficaVencimiento().setDefaultRenderer(Object.class, colorFila);
    }//GEN-LAST:event_tablaGraficaMousePressed


    private void btnPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagadoActionPerformed
        this.setEstado(4);
        tablaCliente.setPrincipalCliente(this);
        abm.setPrincipalCliente(this);
        abm.ejecutarCambiarEstado();
        tablaVencimientoC.setEstadoConsulta(0);
        tablaVencimientoC.ejecutarRellenarTabla();
        popMenu.setVisible(false);
    }//GEN-LAST:event_btnPagadoActionPerformed


    private void btnPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteActionPerformed
        this.setEstado(3);
        abm.setPrincipalCliente(this);
        abm.ejecutarCambiarEstado();
        tablaVencimientoC.setEstadoConsulta(0);
        tablaVencimientoC.ejecutarRellenarTabla();
        popMenu.setVisible(false);
    }//GEN-LAST:event_btnPendienteActionPerformed

    private void btnVencidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVencidoActionPerformed
        this.setEstado(5);
        abm.setPrincipalCliente(this);
        abm.ejecutarCambiarEstado();
        tablaVencimientoC.setEstadoConsulta(0);
        tablaVencimientoC.ejecutarRellenarTabla();
        popMenu.setVisible(false);
    }//GEN-LAST:event_btnVencidoActionPerformed

    private void tablaGraficaPolizasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficaPolizasMousePressed
        popMenu.remove(menuVencimiento);
        popMenu.remove(this.menuCedula);
        popMenu.remove(this.menuCliente);
        popMenu.add(this.menuPoliza);
        this.getTablaGraficaPolizas().setComponentPopupMenu(popMenu);
        this.btnnuevoVencimiento.setEnabled(true);
        this.btnnuevoCedula.setEnabled(true);
        tablaVencimientoC.setPrincipalCliente(this);
        tablaCedulaC.setPrincipalCliente(this);
        tablaVencimientoC.ejecutarRellenarTabla();
        tablaCedulaC.ejecutarRellenarTabla();
        //  tablaVencimientoC.setEstadoConsulta(0);
        //  tablaCedulaC.setEstadoConsulta(0);

        //cambiar color filas
        ColorFila colorFila = new ColorFila(principalAdministrador.getPanelPrincipalTop().getBackground());
        getTablaGraficaVencimiento().setDefaultRenderer(Object.class, colorFila);

        int fila = this.tablaGraficaPolizas.getSelectedRow();
        if (this.tablaGraficaPolizas.getValueAt(fila, 2).equals("Automóvil") || this.tablaGraficaPolizas.getValueAt(fila, 2).equals("Motos")
                || this.tablaGraficaPolizas.getValueAt(fila, 2).equals("Camion") || this.tablaGraficaPolizas.getValueAt(fila, 2).equals("Camioneta")) {
            this.btnnuevoCedula.setEnabled(true);
        } else {
            this.btnnuevoCedula.setEnabled(false);
        }
    }//GEN-LAST:event_tablaGraficaPolizasMousePressed

    private void tablaGraficaPolizasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaPolizasComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficaPolizasComponentHidden

    private void tablaGraficaVencimientoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficaVencimientoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficaVencimientoComponentHidden

    private void tablaGraficacedulaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaGraficacedulaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaGraficacedulaComponentHidden

    private void tablaGraficaVencimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficaVencimientoMouseClicked

    }//GEN-LAST:event_tablaGraficaVencimientoMouseClicked

    private void tablaGraficaVencimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficaVencimientoMousePressed
        popMenu.remove(this.menuPoliza);
        popMenu.remove(this.menuCedula);
        popMenu.remove(this.menuCliente);
        popMenu.add(menuVencimiento);
        this.getTablaGraficaVencimiento().setComponentPopupMenu(popMenu);
    }//GEN-LAST:event_tablaGraficaVencimientoMousePressed

    private void btnnuevoVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoVencimientoActionPerformed
        InterfazGraficaFormularioRegistrarVencimiento formularioRegistrarVencimiento = new InterfazGraficaFormularioRegistrarVencimiento();
        formularioRegistrarVencimiento.setPrincipalAdministrador(principalAdministrador);
        formularioRegistrarVencimiento.nuevoFormularioRegistrar();
    }//GEN-LAST:event_btnnuevoVencimientoActionPerformed

    private void btnnuevoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoCedulaActionPerformed

        InterfazGraficaFormularioRegistrarCedula formularioRegistrarCedula = new InterfazGraficaFormularioRegistrarCedula();
        formularioRegistrarCedula.setPrincipalAdministrador(principalAdministrador);
        formularioRegistrarCedula.nuevoFormularioRegistrar();
    }//GEN-LAST:event_btnnuevoCedulaActionPerformed

    private void btnEliminarTodoVEncimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoVEncimientoActionPerformed
        if (OperacionesUtiles.mensajeEliminarRegistro()) {
            ABMVencimiento abm = new ABMVencimiento();
            abm.setPrincipalCliente(this);
            if (abm.ejecutarEliminarTodo()) {
                tablaVencimientoC.setPrincipalCliente(this);
                tablaVencimientoC.setEstadoConsulta(0);
                tablaVencimientoC.ejecutarRellenarTabla();
            }
        }
    }//GEN-LAST:event_btnEliminarTodoVEncimientoActionPerformed

    private void btnnuevoPolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoPolizaActionPerformed
        InterfazGraficaFormularioRegistrarPoliza formularioRegistrarPoliza = new InterfazGraficaFormularioRegistrarPoliza();
        formularioRegistrarPoliza.setPrincipalAdministrador(principalAdministrador);
        formularioRegistrarPoliza.nuevoFormularioRegistrar();
    }//GEN-LAST:event_btnnuevoPolizaActionPerformed

    private void btnnEditarPolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarPolizaActionPerformed
        tablaPolizaC.setPrincipalCliente(this);
        if (tablaPolizaC.verificarFilaSeleccionada()) {
            InterfazGraficaFormularioEditarPoliza formularioEditarPoliza = new InterfazGraficaFormularioEditarPoliza();
            formularioEditarPoliza.setPrincipalAdministrador(principalAdministrador);
            formularioEditarPoliza.nuevoFormularioEditar();
        }
    }//GEN-LAST:event_btnnEditarPolizaActionPerformed

    private void btnEliminarPolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPolizaActionPerformed

        ABMPoliza abm = new ABMPoliza();
        abm.setPrincipalCliente(this);
        tablaPolizaC.setPrincipalCliente(this);
        if (tablaPolizaC.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                if (abm.ejecutarEliminar()) {
                    tablaPolizaC.setEstadoConsulta(0);
                    tablaPolizaC.ejecutarRellenarTabla();
                    tablaVencimientoC.vaciarTabla();
                    tablaCedulaC.vaciarTabla();
                }
            }

        }
    }//GEN-LAST:event_btnEliminarPolizaActionPerformed

    private void btnnEditarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarCedulaActionPerformed

        tablaCedulaC.setPrincipalCliente(this);
        if (tablaCedulaC.verificarFilaSeleccionada()) {
            InterfazGraficaFormularioEditarCedula formularioEditarCedula = new InterfazGraficaFormularioEditarCedula();
            formularioEditarCedula.setPrincipalAdministrador(principalAdministrador);
            formularioEditarCedula.nuevoFormularioEditar();
        }

    }//GEN-LAST:event_btnnEditarCedulaActionPerformed

    private void btnEliminarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCedulaActionPerformed
        tablaCedulaC.setPrincipalCliente(this);
        if (tablaCedulaC.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                ABMCedula abm = new ABMCedula();
                abm.setPrincipalCliente(this);
                if (abm.ejecutarEliminar()) {
                    tablaCedulaC.setEstadoConsulta(0);
                    tablaCedulaC.ejecutarRellenarTabla();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarCedulaActionPerformed

    private void tablaGraficacedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGraficacedulaMousePressed
        popMenu.remove(this.menuPoliza);
        popMenu.remove(menuVencimiento);
        popMenu.remove(this.menuCliente);
        popMenu.add(this.menuCedula);
        this.getTablaGraficacedula().setComponentPopupMenu(popMenu);
    }//GEN-LAST:event_tablaGraficacedulaMousePressed

    private void btnnEditarVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarVencimientoActionPerformed
        tablaVencimientoC.setPrincipalCliente(this);
        if (tablaVencimientoC.verificarFilaSeleccionada()) {
            InterfazGraficaFormularioEditarVencimiento formularioEditarVencimiento = new InterfazGraficaFormularioEditarVencimiento();
            formularioEditarVencimiento.setPrincipalAdministrador(principalAdministrador);
            formularioEditarVencimiento.nuevoFormularioEditar();
        }
    }//GEN-LAST:event_btnnEditarVencimientoActionPerformed

    private void btnEliminarVEncimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVEncimientoActionPerformed
        tablaVencimientoC.setPrincipalCliente(this);
        if (tablaVencimientoC.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                ABMVencimiento abm = new ABMVencimiento();
                abm.setPrincipalCliente(this);
                if (abm.ejecutarEliminar()) {
                    tablaVencimientoC.setEstadoConsulta(0);
                    tablaVencimientoC.ejecutarRellenarTabla();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarVEncimientoActionPerformed

    private void btnnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnEditarClienteActionPerformed
        tablaCliente.setPrincipalCliente(this);
        if (tablaCliente.verificarFilaSeleccionada()) {
            InterfazGraficaFormularioEditarCliente formularioEditar = new InterfazGraficaFormularioEditarCliente();
            formularioEditar.setPrincipalCliente(this);
            formularioEditar.nuevoFormularioEditar();

        }
    }//GEN-LAST:event_btnnEditarClienteActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        ABMCliente abm = new ABMCliente();
        abm.setPrincipalCliente(this);
        tablaCliente.setPrincipalCliente(this);
        if (tablaCliente.verificarFilaSeleccionada()) {
            if (OperacionesUtiles.mensajeEliminarRegistro()) {
                if (abm.ejecutarEliminar()) {
                    tablaCliente.setEstadoConsulta(0);
                    tablaCliente.ejecutarRellenarTabla();
                    tablaPolizaC.vaciarTabla();
                    tablaVencimientoC.vaciarTabla();
                    tablaCedulaC.vaciarTabla();
                }
            }

        }
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnDetallesActionPerformed
        detalles.setPrincipalCliente(this);
        detalles.ejecutarRellenarDatosMenu();
    }//GEN-LAST:event_btnnDetallesActionPerformed

    private void btnEliminarTodoVEncimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoVEncimiento1ActionPerformed
         if (OperacionesUtiles.mensajeTodosPagados()) {
            ABMVencimiento abm = new ABMVencimiento();
            abm.setPrincipalCliente(this);
            if (abm.ejecutarPagarTodo()) {
                tablaVencimientoC.setPrincipalCliente(this);
                tablaVencimientoC.setEstadoConsulta(0);
                tablaVencimientoC.ejecutarRellenarTabla();
            }
        }
    }//GEN-LAST:event_btnEliminarTodoVEncimiento1ActionPerformed

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public MaterialButton getBtnnuevocliente() {
        return btnnuevoCliente;
    }

    public void setBtnnuevocliente(MaterialButton btnnuevocliente) {
        this.btnnuevoCliente = btnnuevocliente;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public MaterialButton getBtnEliminarCli() {
        return btnEliminarCli;
    }

    public void setBtnEliminarCli(MaterialButton btnEliminarCli) {
        this.btnEliminarCli = btnEliminarCli;
    }

    public MaterialButton getBtnnEditarCl() {
        return btnnDetalles;
    }

    public void setBtnnEditarCl(MaterialButton btnnEditarCl) {
        this.btnnDetalles = btnnEditarCl;
    }

    public MaterialButton getBtnPagado() {
        return btnPagado;
    }

    public void setBtnPagado(MaterialButton btnPagado) {
        this.btnPagado = btnPagado;
    }

    public MaterialButton getBtnPendiente() {
        return btnPendiente;
    }

    public void setBtnPendiente(MaterialButton btnPendiente) {
        this.btnPendiente = btnPendiente;
    }

    public MaterialButton getBtnVencido() {
        return btnVencido;
    }

    public void setBtnVencido(MaterialButton btnVencido) {
        this.btnVencido = btnVencido;
    }

    public MaterialButton getBtnEliminarCedula() {
        return btnEliminarCedula;
    }

    public void setBtnEliminarCedula(MaterialButton btnEliminarCedula) {
        this.btnEliminarCedula = btnEliminarCedula;
    }

    public MaterialButton getBtnEliminarPoliza() {
        return btnEliminarPoliza;
    }

    public void setBtnEliminarPoliza(MaterialButton btnEliminarPoliza) {
        this.btnEliminarPoliza = btnEliminarPoliza;
    }

    public MaterialButton getBtnEliminarVEncimiento() {
        return btnEliminarVEncimiento;
    }

    public void setBtnEliminarVEncimiento(MaterialButton btnEliminarVEncimiento) {
        this.btnEliminarVEncimiento = btnEliminarVEncimiento;
    }

    public MaterialButton getBtnnDetalles() {
        return btnnDetalles;
    }

    public void setBtnnDetalles(MaterialButton btnnDetalles) {
        this.btnnDetalles = btnnDetalles;
    }

    public MaterialButton getBtnnEditarCedula() {
        return btnnEditarCedula;
    }

    public void setBtnnEditarCedula(MaterialButton btnnEditarCedula) {
        this.btnnEditarCedula = btnnEditarCedula;
    }

    public MaterialButton getBtnnEditarCliente() {
        return btnnEditarCliente;
    }

    public void setBtnnEditarCliente(MaterialButton btnnEditarCliente) {
        this.btnnEditarCliente = btnnEditarCliente;
    }

    public MaterialButton getBtnnEditarPoliza() {
        return btnnEditarPoliza;
    }

    public void setBtnnEditarPoliza(MaterialButton btnnEditarPoliza) {
        this.btnnEditarPoliza = btnnEditarPoliza;
    }

    public MaterialButton getBtnnEditarVencimiento() {
        return btnnEditarVencimiento;
    }

    public void setBtnnEditarVencimiento(MaterialButton btnnEditarVencimiento) {
        this.btnnEditarVencimiento = btnnEditarVencimiento;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnEliminarCedula;
    private principal.MaterialButton btnEliminarCli;
    private principal.MaterialButton btnEliminarPoliza;
    private principal.MaterialButton btnEliminarTodoVEncimiento;
    private principal.MaterialButton btnEliminarTodoVEncimiento1;
    private principal.MaterialButton btnEliminarVEncimiento;
    private principal.MaterialButton btnPagado;
    private principal.MaterialButton btnPendiente;
    private principal.MaterialButton btnVencido;
    private principal.MaterialButton btnnDetalles;
    private principal.MaterialButton btnnEditarCedula;
    private principal.MaterialButton btnnEditarCliente;
    private principal.MaterialButton btnnEditarPoliza;
    private principal.MaterialButton btnnEditarVencimiento;
    private principal.MaterialButton btnnuevoCedula;
    private principal.MaterialButton btnnuevoCliente;
    private principal.MaterialButton btnnuevoPoliza;
    private principal.MaterialButton btnnuevoVencimiento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel menuCedula;
    private javax.swing.JPanel menuCliente;
    private javax.swing.JPanel menuPoliza;
    private javax.swing.JPanel menuVencimiento;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelPrincipalTop;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTable tablaGrafica;
    private javax.swing.JTable tablaGraficaPolizas;
    private javax.swing.JTable tablaGraficaVencimiento;
    private javax.swing.JTable tablaGraficacedula;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
