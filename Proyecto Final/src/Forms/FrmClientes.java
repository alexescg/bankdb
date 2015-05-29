package Forms;

import Logica.Cliente;
import Logica.MetodosSQL;
import Logica.OracleUtils;
import Logica.Referencias;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class FrmClientes extends javax.swing.JFrame {
    
    private Boolean isReady = false;
    private Boolean canAdvance = false;
    private Cliente cliente;
    
    public FrmClientes() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brightPassFilter1 = new org.edisoncor.gui.util.BrightPassFilter();
        pnlPrincipal = new javax.swing.JPanel();
        lblMes = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        pnlSuperior = new javax.swing.JPanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        tabbedPaneHeader1 = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        pnlInferior1 = new javax.swing.JPanel();
        lblNombreRef1 = new javax.swing.JLabel();
        txtNombreRef1 = new javax.swing.JTextField();
        txtApellidosRef1 = new javax.swing.JTextField();
        lblApellidosRef1 = new javax.swing.JLabel();
        lblDireccionRef1 = new javax.swing.JLabel();
        txtDireccionRef1 = new javax.swing.JTextField();
        lblTelefonoRef1 = new javax.swing.JLabel();
        txtTelefonoRef1 = new javax.swing.JTextField();
        agregarUnocmd = new org.edisoncor.gui.button.ButtonAction();
        jLabel4 = new javax.swing.JLabel();
        emailUnotxt = new javax.swing.JTextField();
        btnagregarRef = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        cmdCrearCliente = new org.edisoncor.gui.button.ButtonAction();
        cmdSig = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMes.setText("Mes:");

        txtMes.setToolTipText("");
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblAnio.setText("Año:");

        lblApellidos.setText("Apellidos");

        txtAnio.setToolTipText("");
        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion");

        lblTelefono.setText("Telefono");

        lblFechaNacimiento.setText("Fecha de Nacimiento: Dia");

        txtDia.setToolTipText("");
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidos))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefono)
                                .addGap(9, 9, 9))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblFechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jSeparator2))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMes)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelHeader1.setText("Cliente");

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        lblNombreRef1.setText("Nombre");

        lblApellidosRef1.setText("Apellidos");

        lblDireccionRef1.setText("Direccion");

        txtDireccionRef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionRef1ActionPerformed(evt);
            }
        });

        lblTelefonoRef1.setText("Telefono");

        agregarUnocmd.setText("Agregar");
        agregarUnocmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUnocmdActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        emailUnotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUnotxtActionPerformed(evt);
            }
        });

        btnagregarRef.setText("Agregar Referencia");
        btnagregarRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInferior1Layout = new javax.swing.GroupLayout(pnlInferior1);
        pnlInferior1.setLayout(pnlInferior1Layout);
        pnlInferior1Layout.setHorizontalGroup(
            pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferior1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlInferior1Layout.createSequentialGroup()
                            .addComponent(lblDireccionRef1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDireccionRef1))
                        .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInferior1Layout.createSequentialGroup()
                                .addComponent(lblApellidosRef1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidosRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInferior1Layout.createSequentialGroup()
                                .addComponent(lblNombreRef1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlInferior1Layout.createSequentialGroup()
                        .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefonoRef1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailUnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        pnlInferior1Layout.setVerticalGroup(
            pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferior1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreRef1)
                    .addComponent(txtNombreRef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosRef1)
                    .addComponent(txtApellidosRef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionRef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionRef1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoRef1)
                    .addComponent(txtTelefonoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInferior1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(emailUnotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnagregarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        tabbedPaneHeader1.addTab("Referencia ", pnlInferior1);

        jLabel1.setText("Email");

        cmdCrearCliente.setText("Agregar Cliente");
        cmdCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarClientecmdActionPerformed(evt);
            }
        });

        cmdSig.setText("Siguiente Paso");
        cmdSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSigguardarClientecmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPaneHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(cmdCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdSig, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmdCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabbedPaneHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cmdSig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void txtDireccionRef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionRef1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionRef1ActionPerformed

    private void emailUnotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUnotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailUnotxtActionPerformed

    private void guardarClientecmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarClientecmdActionPerformed

        //Validacion Cliente
        if (OracleUtils.esCadenaValida(txtNombre.getText())
                && OracleUtils.esCadenaValida(txtApellidos.getText())
                && OracleUtils.esCadenaValida(txtDireccion.getText())
                //Fecha
                && OracleUtils.esNumeroValido(txtDia.getText()) && Integer.parseInt(txtDia.getText()) <= 31
                && OracleUtils.esNumeroValido(txtMes.getText()) && Integer.parseInt(txtMes.getText()) <= 12
                && OracleUtils.esNumeroValido(txtAnio.getText()) && Integer.parseInt(txtAnio.getText()) >= 1915
                && OracleUtils.esNumeroValido(txtTelefono.getText())
                && OracleUtils.esCadenaValida(emailtxt.getText())) {
            
            String nombre = txtNombre.getText();
            String apellidos = txtApellidos.getText();
            String direccion = txtDireccion.getText();
            
            String dia = txtDia.getText();
            String mes = txtMes.getText();
            String ano = txtAnio.getText();
            
            String telefono = txtTelefono.getText();
            String correo = emailtxt.getText();
            
            {
                //(TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));
                String sql = String.format("insert into clientes values(%s, '%s', '%s', '%s', (TO_DATE('%s/%s/%s', 'yyyy/mm/dd')), %s, '%s')",
                        OracleUtils.CLIENTE_SEQ, nombre, apellidos, direccion, ano, mes, dia, telefono, correo);
                OracleUtils.executeQuery(OracleUtils.getDBConexion(), sql);
                System.out.println("sql = " + sql);
                JOptionPane.showMessageDialog(rootPane, "Cliente Añadido exitosamente, ahora llene la referencia, la cual se basara en la cuenta de cliente recien creada");
                isReady = true;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hay valores que no cumplen con los requisitos, favor de verificar...");
        }

    }//GEN-LAST:event_guardarClientecmdActionPerformed

    private void agregarUnocmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUnocmdActionPerformed
        

    }//GEN-LAST:event_agregarUnocmdActionPerformed

    private void btnagregarRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarRefActionPerformed
        
        if (isReady) {
            
            if (OracleUtils.esCadenaValida(txtNombreRef1.getText())
                    && OracleUtils.esCadenaValida(txtApellidosRef1.getText())
                    && OracleUtils.esCadenaValida(txtDireccionRef1.getText())
                    && OracleUtils.esNumeroValido(txtTelefonoRef1.getText())
                    && OracleUtils.esCadenaValida(emailUnotxt.getText())) {

                //referencia
                String nombreRef = txtNombreRef1.getText();
                String apellidoRef = txtApellidosRef1.getText();
                String direccionRef = txtDireccionRef1.getText();
                String telefonoRef = txtTelefonoRef1.getText();
                String emailRef = emailUnotxt.getText();

                //Cliente Search
                String nombre = txtNombre.getText();
                String apellidos = txtApellidos.getText();
                String direccion = txtDireccion.getText();
                
                String telefono = txtTelefono.getText();
                String correo = emailtxt.getText();
                
                String sql = String.format("select * from clientes where nombre_cliente like '%s' and apellidos_cliente like '%s' and telefono like '%s'  and direccion_cliente like '%s' and email like '%s'",
                        nombre, apellidos, telefono, direccion, correo);
                
                List<Cliente> clientes = (List<Cliente>) OracleUtils.select(OracleUtils.getDBConexion(), sql, Cliente.class);
                
                String sqlRef = String.format("insert into referencias values(%s, '%s', '%s', '%s', '%s', %s, '%s')", OracleUtils.REFERENCIAS_SEQ, nombreRef,
                        apellidoRef, telefonoRef, direccionRef, clientes.get(0).getId_cliente(), emailRef);
                OracleUtils.executeQuery(OracleUtils.getDBConexion(), sqlRef);
                JOptionPane.showMessageDialog(rootPane, "Referencia Añadida exitosamente.");
                canAdvance = true;
            } else {
                
                JOptionPane.showMessageDialog(rootPane, "Valoress invalidos en los campos de Referencia, favor de verificar");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Referencia aun no esta lista para agregarse, favor de llenar datos de cliente primero");
        }

    }//GEN-LAST:event_btnagregarRefActionPerformed

    private void cmdSigguardarClientecmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSigguardarClientecmdActionPerformed

        if (canAdvance) {
            
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String correo = emailtxt.getText();
        
        String sql = String.format("select * from clientes where nombre_cliente like '%s' and apellidos_cliente like '%s' and telefono like '%s'  and direccion_cliente like '%s' and email like '%s'",
                nombre, apellidos, telefono, direccion, correo);
        
        List<Cliente> clientes = (List<Cliente>) OracleUtils.select(OracleUtils.getDBConexion(), sql, Cliente.class);
        cliente = clientes.get(0);
        FrmTipoCuenta frmTipoCuenta = new FrmTipoCuenta(cliente);
        frmTipoCuenta.setVisible(true);
        } else {
        JOptionPane.showMessageDialog(rootPane, "Debes contar con al menos una referencia");
        }
        
    }//GEN-LAST:event_cmdSigguardarClientecmdActionPerformed
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
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction agregarUnocmd;
    private org.edisoncor.gui.util.BrightPassFilter brightPassFilter1;
    private javax.swing.JButton btnagregarRef;
    private org.edisoncor.gui.button.ButtonAction cmdCrearCliente;
    private org.edisoncor.gui.button.ButtonAction cmdSig;
    private javax.swing.JTextField emailUnotxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidosRef1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionRef1;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreRef1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoRef1;
    private javax.swing.JPanel pnlInferior1;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    private org.edisoncor.gui.tabbedPane.TabbedPaneHeader tabbedPaneHeader1;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosRef1;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionRef1;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreRef1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoRef1;
    // End of variables declaration//GEN-END:variables

}
