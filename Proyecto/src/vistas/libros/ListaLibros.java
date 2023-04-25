package vistas.libros;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Libros;
import servicios.LibrosServicios;
import vistas.App;

/**
 *
 * @author Nico
 */
public class ListaLibros extends javax.swing.JFrame {

    /**
     * Creates new form ListaLibros
     */
    
    private final LibrosServicios librosServicios;
    private char estado;
    
    public ListaLibros() {
        initComponents();
        librosServicios = new LibrosServicios();
        
        tbs.setEnabledAt(1, false);
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

        pnlSuperior = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        tbs = new javax.swing.JTabbedPane();
        tbs1 = new javax.swing.JPanel();
        pnlinf = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosLibros = new javax.swing.JTable();
        pnlSup = new javax.swing.JPanel();
        txtBuscr = new javax.swing.JTextField();
        btnBuscr = new javax.swing.JButton();
        btnNuev = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        tbs2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lblDispo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbDispo = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();

        pnlSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        tbs.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N

        tbs1.setBackground(new java.awt.Color(241, 238, 238));

        pnlinf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)), "Libros Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 0, 16))); // NOI18N

        tblDatosLibros.setBackground(new java.awt.Color(249, 243, 243));
        tblDatosLibros.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));
        tblDatosLibros.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        tblDatosLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatosLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosLibros);

        javax.swing.GroupLayout pnlinfLayout = new javax.swing.GroupLayout(pnlinf);
        pnlinf.setLayout(pnlinfLayout);
        pnlinfLayout.setHorizontalGroup(
            pnlinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlinfLayout.setVerticalGroup(
            pnlinfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSup.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));

        txtBuscr.setBackground(new java.awt.Color(249, 243, 243));
        txtBuscr.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtBuscr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscrKeyTyped(evt);
            }
        });

        btnBuscr.setBackground(new java.awt.Color(249, 243, 243));
        btnBuscr.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnBuscr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar (1).png"))); // NOI18N
        btnBuscr.setText("Buscar");
        btnBuscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscrActionPerformed(evt);
            }
        });

        btnNuev.setBackground(new java.awt.Color(249, 243, 243));
        btnNuev.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnNuev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-archivo (1).png"))); // NOI18N
        btnNuev.setText("Nuevo");
        btnNuev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSupLayout = new javax.swing.GroupLayout(pnlSup);
        pnlSup.setLayout(pnlSupLayout);
        pnlSupLayout.setHorizontalGroup(
            pnlSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscr, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuev)
                .addGap(48, 48, 48))
        );
        pnlSupLayout.setVerticalGroup(
            pnlSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscr, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(txtBuscr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addContainerGap())
        );

        javax.swing.GroupLayout tbs1Layout = new javax.swing.GroupLayout(tbs1);
        tbs1.setLayout(tbs1Layout);
        tbs1Layout.setHorizontalGroup(
            tbs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbs1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlinf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbs1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tbs1Layout.setVerticalGroup(
            tbs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbs1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlinf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbs.addTab("Libros", tbs1);

        tbs2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)), "Ingrese los siguientes datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 0, 16))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblCodigo.setText("Codigo:");

        txtCod.setBackground(new java.awt.Color(249, 243, 243));
        txtCod.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblTitulo.setText("Titulo:");

        txtTitulo.setBackground(new java.awt.Color(249, 243, 243));
        txtTitulo.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });

        lblAutor.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblAutor.setText("Autor:");

        txtAutor.setBackground(new java.awt.Color(249, 243, 243));
        txtAutor.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });

        lblGenero.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblGenero.setText("Genero:");

        txtGenero.setBackground(new java.awt.Color(249, 243, 243));
        txtGenero.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGeneroKeyTyped(evt);
            }
        });

        lblDispo.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        lblDispo.setText("Disponible:");

        btnGuardar.setBackground(new java.awt.Color(249, 243, 243));
        btnGuardar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disco-flexible.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        cmbDispo.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        cmbDispo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", " " }));

        btnEliminar.setBackground(new java.awt.Color(249, 243, 243));
        btnEliminar.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbs2Layout = new javax.swing.GroupLayout(tbs2);
        tbs2.setLayout(tbs2Layout);
        tbs2Layout.setHorizontalGroup(
            tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbs2Layout.createSequentialGroup()
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbs2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDispo)
                            .addComponent(lblCodigo)
                            .addComponent(lblTitulo)
                            .addComponent(lblGenero)
                            .addComponent(lblAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtCod, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(cmbDispo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tbs2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        tbs2Layout.setVerticalGroup(
            tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbs2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDispo)
                    .addComponent(cmbDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tbs2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        tbs.addTab("Mantenimiento", tbs2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBack(){
        tbs.setSelectedIndex(0);
        tbs.setEnabledAt(1, false);
        tbs.setTitleAt(1, "Mantenimiento");
        
        txtBuscar.setText("");
        txtCod.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtGenero.setText("");
        
        obtenerDatos();
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void obtenerDatos(){
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        modelo.setColumnIdentifiers(librosServicios.columnasNombres);
        
        Object[] fila = new Object[modelo.getColumnCount()];
        
        for (Libros c : this.librosServicios.mostrarLibros(txtBuscar.getText())){
            fila[0] = c.getCodigo();
            fila[1] = c.getTitulo();
            fila[2] = c.getAutor();
            fila[3] = c.getGenero();
            fila[4] = c.isDisponible();
            
            modelo.addRow(fila);
        }
        
        tblDatosLibros.setModel(modelo);
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        tbs.setSelectedIndex(1);
        tbs.setEnabledAt(1, true);
        tbs.setTitleAt(1, "Nuevo Libro");
        btnGuardar.setText("Guardar");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        goBack();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscrKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key <=57;
        
        if(!numeros){
            evt.consume();
        }
        
        if(txtBuscr.getText().trim().length()==100){
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscrKeyTyped

    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key <=57;
        
        if(!numeros){
            evt.consume();
        }
        
        if(txtCod.getText().trim().length()==100){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodKeyTyped

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
       if(txtTitulo.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        if(txtAutor.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneroKeyTyped
        if(txtGenero.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtGeneroKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        cmbDispo.getSelectedItem();
        
        if (txtCod.getText().isEmpty() || txtTitulo.getText().isEmpty()
                || txtAutor.getText().isEmpty() || txtGenero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Llenar todos los valores");
        } else {
            Libros libros = new Libros();
            libros.setCodigo(Integer.parseInt(txtCod.getText()));
            libros.setTitulo(txtTitulo.getText());
            libros.setAutor(txtAutor.getText());
            libros.setGenero(txtGenero.getText());
            libros.setDisponible((String) cmbDispo.getSelectedItem());
            
            switch (estado) {
                case 'C':
                    librosServicios.agregarLibro(libros);
                    JOptionPane.showMessageDialog(null, 
                            "Libro agreado con exito");
                    break;
                case 'E':
                    librosServicios.actualizarLibros(libros);
                    JOptionPane.showMessageDialog(null, 
                            "Libro actualizado con exito");
                    break;
                default:
                    throw new AssertionError();
            }
            
            goBack();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevActionPerformed
        tbs.setSelectedIndex(1);
        tbs.setEnabledAt(1, true);
        tbs.setTitleAt(1, "Nuevo Libro");
        estado = 'C';
        btnGuardar.setText("Guardar");
        btnEliminar.setVisible(false);
    }//GEN-LAST:event_btnNuevActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        librosServicios.eliminarLibro(txtCod.getText());
        JOptionPane.showMessageDialog(null, 
                "Libro eliminado con exito");
        goBack();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscrActionPerformed
        obtenerDatos();
    }//GEN-LAST:event_btnBuscrActionPerformed

    private void tblDatosLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosLibrosMouseClicked
        estado = 'E';
        btnGuardar.setText("Actualizar");
        btnEliminar.setVisible(true);
        
        DefaultTableModel modelo = (DefaultTableModel) tblDatosLibros.getModel();
        int indiceTabla = tblDatosLibros.getSelectedRow();
        
        Object valor = modelo.getValueAt(indiceTabla, 0);
        System.out.println(valor);
        Libros libroEditar = librosServicios.getLibros(valor.toString());
        
        txtCod.setText(Integer.toString(libroEditar.getCodigo()));
        txtTitulo.setText(libroEditar.getTitulo());
        txtAutor.setText(libroEditar.getAutor());
        txtGenero.setText(libroEditar.getGenero());
        cmbDispo.setSelectedItem(libroEditar.isDisponible());
        
        tbs.setSelectedIndex(1);
        tbs.setEnabledAt(1, true);
        tbs.setTitleAt(1, "Editar Libros");
    }//GEN-LAST:event_tblDatosLibrosMouseClicked

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

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
            java.util.logging.Logger.getLogger(ListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscr;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNuev;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbDispo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDispo;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlSup;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JPanel pnlinf;
    private javax.swing.JTable tblDatosLibros;
    private javax.swing.JTabbedPane tbs;
    private javax.swing.JPanel tbs1;
    private javax.swing.JPanel tbs2;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscr;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}