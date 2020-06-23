package principal;

import complementos.Cargar;
import escritorios.PrincipalCliente;
import escritorios.PrincipalConfiguracion;
import escritorios.PrincipalEmpresa;
import javax.swing.JPanel;
import operacionesCliente.InterfazGraficaEscritorioCliente;
import operacionesConfiguracion.InterfazGraficaEscritorioConfiguracion;
import operacionesEmpresa.InterfazGraficaEscritorioEmpresa;

/**
 *
 * @author TELCOM MPC
 */
public class PrincipalAdministrador extends javax.swing.JFrame {

    private PrincipalCliente cliente;
    private Cargar cargar;
    private PrincipalEmpresa empresa;
    private PrincipalConfiguracion configuracion;

    
    private InterfazGraficaEscritorioCliente interfazGraficaCliente = new InterfazGraficaEscritorioCliente();
    private InterfazGraficaEscritorioEmpresa interfazGraficaEmpresa = new InterfazGraficaEscritorioEmpresa();
    private InterfazGraficaEscritorioConfiguracion interfazGraficaConfiguracion = new InterfazGraficaEscritorioConfiguracion();
    
    
    public PrincipalConfiguracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(PrincipalConfiguracion configuracion) {
        this.configuracion = configuracion;
    }

    public PrincipalCliente getCliente() {
        return cliente;
    }

    public void setCliente(PrincipalCliente cliente) {
        this.cliente = cliente;
    }

    public Cargar getCargar() {
        return cargar;
    }

    public void setCargar(Cargar cargar) {
        this.cargar = cargar;
    }

    public PrincipalEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(PrincipalEmpresa empresa) {
        this.empresa = empresa;
    }


    public PrincipalAdministrador() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.cliente = null;
        this.cargar = null;
        this.empresa = null;
        //ejecutar la venta cliente al iniciarse la aplicacion
        interfazGraficaCliente.setPrincipalAdministrador(this);
        interfazGraficaCliente.ejecutarNuevaVentana();
    }

    

    public Escritorio getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(Escritorio escritorio) {
        this.escritorio = escritorio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        panelPrincipalTop = new javax.swing.JPanel();
        panelPrincipalBody = new javax.swing.JPanel();
        btnEmpresas = new principal.MaterialButtomRectangle();
        btnClientes = new principal.MaterialButtomRectangle();
        btnConfiguracion = new principal.MaterialButtomRectangle();
        escritorio = new principal.Escritorio();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipalTop.setBackground(new java.awt.Color(142, 131, 54));

        javax.swing.GroupLayout panelPrincipalTopLayout = new javax.swing.GroupLayout(panelPrincipalTop);
        panelPrincipalTop.setLayout(panelPrincipalTopLayout);
        panelPrincipalTopLayout.setHorizontalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        panelPrincipalTopLayout.setVerticalGroup(
            panelPrincipalTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        panelPrincipalBody.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipalBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray));
        panelPrincipalBody.setMaximumSize(new java.awt.Dimension(200, 700));
        panelPrincipalBody.setPreferredSize(new java.awt.Dimension(200, 692));

        btnEmpresas.setBackground(new java.awt.Color(177, 159, 65));
        btnEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpresas.setText("EMPRESAS");
        btnEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(177, 159, 65));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnConfiguracion.setBackground(new java.awt.Color(177, 159, 65));
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("CONFIGURACION");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalBodyLayout = new javax.swing.GroupLayout(panelPrincipalBody);
        panelPrincipalBody.setLayout(panelPrincipalBodyLayout);
        panelPrincipalBodyLayout.setHorizontalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        panelPrincipalBodyLayout.setVerticalGroup(
            panelPrincipalBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalBodyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(489, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipalTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipalBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        interfazGraficaCliente.setPrincipalAdministrador(this);
        interfazGraficaCliente.ejecutarNuevaVentana();

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        interfazGraficaConfiguracion.setPrincipalAdministrador(this);
        interfazGraficaConfiguracion.ejecutarNuevaVentana();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresasActionPerformed
        interfazGraficaEmpresa.setPrincipalAdministrador(this);
        interfazGraficaEmpresa.ejecutarNuevaVentana();
    }//GEN-LAST:event_btnEmpresasActionPerformed

    public JPanel getPanelPrincipalBody() {
        return panelPrincipalBody;
    }

    public void setPanelPrincipalBody(JPanel panelPrincipalBody) {
        this.panelPrincipalBody = panelPrincipalBody;
    }

    public JPanel getPanelPrincipalTop() {
        return panelPrincipalTop;
    }

    public void setPanelPrincipalTop(JPanel panelPrincipalTop) {
        this.panelPrincipalTop = panelPrincipalTop;
    }

    public MaterialButtomRectangle getBtnConfiguracion() {
        return btnConfiguracion;
    }

    public void setBtnConfiguracion(MaterialButtomRectangle btnConfiguracion) {
        this.btnConfiguracion = btnConfiguracion;
    }

    public MaterialButtomRectangle getBtnClientes() {
        return btnClientes;
    }

    public void setBtnClientes(MaterialButtomRectangle btnClientes) {
        this.btnClientes = btnClientes;
    }

    public MaterialButtomRectangle getBtnEmpresas() {
        return btnEmpresas;
    }

    public void setBtnEmpresas(MaterialButtomRectangle btnEmpresas) {
        this.btnEmpresas = btnEmpresas;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButtomRectangle btnClientes;
    private principal.MaterialButtomRectangle btnConfiguracion;
    private principal.MaterialButtomRectangle btnEmpresas;
    private principal.Escritorio escritorio;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel panelPrincipalBody;
    private javax.swing.JPanel panelPrincipalTop;
    // End of variables declaration//GEN-END:variables
}
