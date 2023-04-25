package vistas.socios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Socios;
import servicios.SociosServicios;
import vistas.App;

/**
 *
 * @author Nico
 */
public class ListaSocios extends javax.swing.JFrame {

    /**
     * Creates new form ListaSocios
     */
    
    private final SociosServicios sociosServicios;
    private char estado;
    
    public ListaSocios() {
        initComponents();
        sociosServicios = new SociosServicios();
        tbsSocios.setEnabledAt(1,false);
        obtenerDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbsSocios = new javax.swing.JTabbedPane();
        tbsSocio1 = new javax.swing.JPanel();
        pnlInferiorSocio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosSocios = new javax.swing.JTable();
        pnlSupSocio = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbsSocios.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N

        pnlInferiorSocio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)), "Socios Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 0, 16))); // NOI18N

        tblDatosSocios.setBackground(new java.awt.Color(249, 243, 243));
        tblDatosSocios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));
        tblDatosSocios.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        tblDatosSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatosSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosSociosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosSocios);

        javax.swing.GroupLayout pnlInferiorSocioLayout = new javax.swing.GroupLayout(pnlInferiorSocio);
        pnlInferiorSocio.setLayout(pnlInferiorSocioLayout);
        pnlInferiorSocioLayout.setHorizontalGroup(
            pnlInferiorSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInferiorSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlInferiorSocioLayout.setVerticalGroup(
            pnlInferiorSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferiorSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSupSocio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));

        txtBuscar.setBackground(new java.awt.Color(249, 243, 243));
        txtBuscar.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(249, 243, 243));
        btnBuscar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar (3).png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(249, 243, 243));
        btnNuevo.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSupSocioLayout = new javax.swing.GroupLayout(pnlSupSocio);
        pnlSupSocio.setLayout(pnlSupSocioLayout);
        pnlSupSocioLayout.setHorizontalGroup(
            pnlSupSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        pnlSupSocioLayout.setVerticalGroup(
            pnlSupSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        btnInicio.setBackground(new java.awt.Color(249, 243, 243));
        btnInicio.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbsSocio1Layout = new javax.swing.GroupLayout(tbsSocio1);
        tbsSocio1.setLayout(tbsSocio1Layout);
        tbsSocio1Layout.setHorizontalGroup(
            tbsSocio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbsSocio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbsSocio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSupSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInferiorSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbsSocio1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInicio)))
                .addContainerGap())
            .addGroup(tbsSocio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tbsSocio1Layout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        tbsSocio1Layout.setVerticalGroup(
            tbsSocio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbsSocio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSupSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInferiorSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tbsSocio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tbsSocio1Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        tbsSocios.addTab("Socios", tbsSocio1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)), "Ingrese los siguientes datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 0, 16))); // NOI18N

        lblID.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblID.setText("Id:");

        txtId.setBackground(new java.awt.Color(249, 243, 243));
        txtId.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(249, 243, 243));
        txtNombre.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblDNI.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblDNI.setText("DNI:");

        txtDNI.setBackground(new java.awt.Color(249, 243, 243));
        txtDNI.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        lblDireccion.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblDireccion.setText("Dirección:");

        txtDireccion.setBackground(new java.awt.Color(249, 243, 243));
        txtDireccion.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        lblTel.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblTel.setText("Telefono:");

        txtTel.setBackground(new java.awt.Color(249, 243, 243));
        txtTel.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblEmail.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(249, 243, 243));
        txtEmail.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(249, 243, 243));
        btnCancelar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(249, 243, 243));
        btnGuardar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disco-flexible.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(249, 243, 243));
        btnEliminar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEmail))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblDireccion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDNI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTel)
                            .addGap(18, 18, 18)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        tbsSocios.addTab("Mantenimiento", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbsSocios)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbsSocios, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBack(){
        tbsSocios.setSelectedIndex(0);
        tbsSocios.setEnabledAt(1, false);
        tbsSocios.setTitleAt(1, "Mantenimiento");
        
        txtBuscar.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        
        obtenerDatos();
    }
    
    private void obtenerDatos(){
        DefaultTableModel modelo = new DefaultTableModel(){
          @Override
          public boolean isCellEditable(int row, int column){
              return false;
          }
        };
        modelo.setColumnIdentifiers(sociosServicios.columnasNombres);
        
        Object[] fila = new Object[modelo.getColumnCount()];
        
        for(Socios c : this.sociosServicios.mostrarSocios(txtBuscar.getText())){
            fila[0]=c.getId();
            fila[1]=c.getNombre();
            fila[2]=c.getDni();
            fila[3]=c.getDireccion();
            fila[4]=c.getTel();
            fila[5]=c.getEmail();
            
            modelo.addRow(fila);
        }
        
        tblDatosSocios.setModel(modelo);
    
    }
    
    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key <=57;
        
        if(!numeros){
            evt.consume();
        }
        
        if(txtId.getText().trim().length()==100){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key <=57;
        
        if(!numeros){
            evt.consume();
        }
        
        if(txtBuscar.getText().trim().length()==100){
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key <=57;
        
        if(!numeros){
            evt.consume();
        }
        
        if(txtDNI.getText().trim().length()==50){
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if(txtDireccion.getText().length()>=200){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key <=57;
        
        if(!numeros){
            evt.consume();
        }
        
        if(txtTel.getText().trim().length()==8){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if(txtEmail.getText().length()>=25){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtId.getText().isEmpty() || txtNombre.getText().isEmpty() 
            || txtDNI.getText().isEmpty() || txtDireccion.getText().isEmpty() 
                || txtTel.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                    "Llenar todos los valores");
        } else {
            Socios socio = new Socios();
            socio.setId(Integer.parseInt(txtId.getText()));
            socio.setNombre(txtNombre.getText());
            socio.setDni(txtDNI.getText());
            socio.setDireccion(txtDireccion.getText());
            socio.setTel(txtTel.getText());
            socio.setEmail(txtEmail.getText());
            
            switch (estado) {
                case 'C':
                    sociosServicios.agregarSocio(socio);
                    JOptionPane.showMessageDialog(null, 
                            "El socio se ha agregado correctamente");
                    break;
                case 'E':
                    sociosServicios.actualizarSocios(socio);
                    JOptionPane.showMessageDialog(null, 
                            "El socio se ha actuualizado correctamente");
                    break;
                default:
                    throw new AssertionError();
            }
            
            goBack();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        sociosServicios.eliminarSocio(txtId.getText());
        JOptionPane.showMessageDialog(null, 
                "El socio se ha eliminado correctamente");
        goBack();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        goBack();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        tbsSocios.setSelectedIndex(1);
        tbsSocios.setEnabledAt(1, true);
        tbsSocios.setTitleAt(1, "Nuevo Socio");
        estado= 'C';
        btnGuardar.setText("Guardar");
        btnEliminar.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        obtenerDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblDatosSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosSociosMouseClicked
        estado = 'E';
        btnGuardar.setText("Actualizar");
        btnEliminar.setVisible(true);
        
        DefaultTableModel modelo = (DefaultTableModel) tblDatosSocios.getModel();
        int indiceTabla = tblDatosSocios.getSelectedRow();
        
        Object valor = modelo.getValueAt(indiceTabla, 0);
        System.out.println(valor);
        Socios sociosEditar =
                sociosServicios.getSocios(valor.toString());
        
        txtId.setText(Integer.toString(sociosEditar.getId()));
        txtNombre.setText(sociosEditar.getNombre());
        txtDNI.setText(sociosEditar.getDni());
        txtDireccion.setText(sociosEditar.getDireccion());
        txtTel.setText(sociosEditar.getTel());
        txtEmail.setText(sociosEditar.getEmail());
        
        tbsSocios.setSelectedIndex(1);
        tbsSocios.setEnabledAt(1, true);
        tbsSocios.setTitleAt(1, "Editar Socios");
    }//GEN-LAST:event_tblDatosSociosMouseClicked

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        App app = new App();
        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSocios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pnlInferiorSocio;
    private javax.swing.JPanel pnlSupSocio;
    private javax.swing.JTable tblDatosSocios;
    private javax.swing.JPanel tbsSocio1;
    private javax.swing.JTabbedPane tbsSocios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
