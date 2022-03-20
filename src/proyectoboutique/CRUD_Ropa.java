/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoboutique;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import logica.Usuario;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import logica.Ropa;
import logica.SQL_Ropa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import proyectoboutique.db.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import logica.Ropa_Tallas;
import logica.SQL_Ropa_Tallas;
import logica.SQL_Usuarios;



public class CRUD_Ropa extends javax.swing.JFrame {

    ButtonGroup btnGr;
    ButtonGroup btnGr1;
    
    private Usuario user;
    public CRUD_Ropa(Usuario user) {
        this.user=user;
        initComponents();
        btnGr = new ButtonGroup();
        btnGr1 = new ButtonGroup();
        btnGr.add(rbmasculino);
        btnGr.add(rbfemenino);
        btnGr1.add(rbsuperior);
        btnGr1.add(rbinferior);
        btnGr1.add(rbcalzado);
        CargarTabla();
        txtid.setEditable(false);
        //CargarComboTallas();
        jLabel4.setVisible(false);
        cmbtalla.setVisible(false);
        jScrollPane3.setVisible(false);
        txtexistencias.setVisible(false);
        btbagregartalla.setVisible(false);
        btnvolver.setVisible(false);
        jLabel11.setVisible(false);
        btnlimpiartallas.setVisible(false);

    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaropa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtpreciocosto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbtalla = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rbmasculino = new javax.swing.JRadioButton();
        rbfemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbsuperior = new javax.swing.JRadioButton();
        rbinferior = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cmbtipo1 = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        rbcalzado = new javax.swing.JRadioButton();
        btnseleccionartalla = new javax.swing.JButton();
        txtexistencias = new javax.swing.JTextField();
        btbagregartalla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtprecioventa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnvolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnlimpiartallas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        cmbfiltro = new javax.swing.JComboBox<>();
        btnRestablecer = new javax.swing.JButton();
        txtVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaropa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "P.Costo", "P.Venta", "Ganancia", "Genero", "Marca", "Clase", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaropa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaropaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaropa);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 25, 55, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 22, 177, -1));

        jLabel2.setText("Descripcion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 70, -1));

        jScrollPane2.setToolTipText("");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane2.setViewportView(txtdescripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 353, 60));

        jLabel3.setText("Precio Costo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 74, -1));
        jPanel2.add(txtpreciocosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, -1));

        jLabel4.setText("Talla:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 37, -1));

        cmbtalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clase" }));
        jPanel2.add(cmbtalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel5.setText("Genero:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 57, -1));

        rbmasculino.setBackground(new java.awt.Color(255, 255, 255));
        rbmasculino.setText("Masculino");
        jPanel2.add(rbmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        rbfemenino.setBackground(new java.awt.Color(255, 255, 255));
        rbfemenino.setText("Femenino");
        jPanel2.add(rbfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel7.setText("Marca:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 37, -1));
        jPanel2.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 85, -1));

        jLabel8.setText("Clase de prenda:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 97, 30));

        rbsuperior.setBackground(new java.awt.Color(255, 255, 255));
        rbsuperior.setText("Superior");
        rbsuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbsuperiorMouseClicked(evt);
            }
        });
        jPanel2.add(rbsuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        rbinferior.setBackground(new java.awt.Color(255, 255, 255));
        rbinferior.setText("Inferior");
        rbinferior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbinferiorMouseClicked(evt);
            }
        });
        jPanel2.add(rbinferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel9.setText("Tipo de prenda:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 274, 85, -1));

        cmbtipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clase de prenda primero" }));
        jPanel2.add(cmbtipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 271, 240, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 320, 83, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 320, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 320, 77, -1));

        jLabel10.setText("Id:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 25, 17, -1));

        txtid.setActionCommand("<Not Set>");
        txtid.setAutoscrolls(false);
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 22, 76, -1));

        rbcalzado.setBackground(new java.awt.Color(255, 255, 255));
        rbcalzado.setText("Calzado");
        rbcalzado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbcalzadoMouseClicked(evt);
            }
        });
        rbcalzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcalzadoActionPerformed(evt);
            }
        });
        jPanel2.add(rbcalzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        btnseleccionartalla.setText("Seleccionar Tallas");
        btnseleccionartalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionartallaActionPerformed(evt);
            }
        });
        jPanel2.add(btnseleccionartalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 190, -1));
        jPanel2.add(txtexistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, -1));

        btbagregartalla.setText("Agregar talla");
        btbagregartalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbagregartallaActionPerformed(evt);
            }
        });
        jPanel2.add(btbagregartalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, -1));

        jLabel6.setText("Precio Venta: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel2.add(txtprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Talla", "Existencias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 350, 120));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel11.setText("Existencias");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnlimpiartallas.setText("Limpiar");
        btnlimpiartallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiartallasActionPerformed(evt);
            }
        });
        jPanel2.add(btnlimpiartallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        cmbfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Genero", "Marca", "Clase", "Tipo" }));

        btnRestablecer.setText("Restablecer tabla");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(txtbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(cmbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRestablecer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtVolver.setText("< Volver al menu");
        txtVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
                    .addComponent(txtVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(txtVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = 0;
        boolean ban = false;
        try
        {
            id = Integer.parseInt(txtid.getText());
            ban = true;
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        SQL_Ropa modSql = new SQL_Ropa();
        Ropa mod = new Ropa();
        String nombre = txtnombre.getText();
        if(ban)
        {
            if(nombre.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes de ingresar un nombre a la prenda");
            }
            else
            {
                mod.setNombre(nombre);
                String descripcion = txtdescripcion.getText();
                if(descripcion.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Debes de ingresar una descripcion a la prenda");
                }else
                {
                    mod.setDescripcion(descripcion);
                    if(txtpreciocosto.getText().equals("") && txtprecioventa.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Debe ingresar valores en los precios");
                    }else
                    {
                        boolean bandera = false;
                        try
                        {
                            double precio_costo = Double.parseDouble(txtpreciocosto.getText());
                            double precio_venta = Double.parseDouble(txtprecioventa.getText());
                            if(precio_costo > 0 && precio_venta > 0)
                            {
                                if(precio_venta > precio_costo)
                                {
                                    mod.setPrecio_costo(precio_costo);
                                    mod.setPrecio_venta(precio_venta);
                                    mod.setGanancia(precio_venta - precio_costo);
                                    bandera = true;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "El precio de costo no debe ser mayor al de venta");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Los precios deben ser mayores a cero");
                            }
                        }catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en el precio");
                        }
                        if(bandera)
                        {
                            if(cmbtalla.getSelectedItem().toString().equals("Seleccione una clase"))
                            {
                                JOptionPane.showMessageDialog(null, "Debe seleccionar una talla");
                            }
                            else
                            {
                                String sexo;
                                if(rbmasculino.isSelected()==true)
                                {
                                    sexo = "Masculino";
                                    mod.setGenero(sexo);
                                }else 
                                {
                                    if(rbfemenino.isSelected()==true)
                                    {
                                        sexo = "Femenino";
                                        mod.setGenero(sexo);
                                    }else
                                    {
                                        JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
                                    }
                                }
                                try
                                {
                                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                    if(model.getRowCount()>0){
                                        /*
                                         for (int i = 0; i<model.getRowCount(); i++) {
                                            final String col1 = (String) model.getValueAt(i, 0);
                                            final String col2 = (String) model.getValueAt(i, 1);
                                            System.out.println("Talla: " + col1 + " Existencia: " + col2);
                                        }
                                        */
                                    }
                                    else   
                                    {
                                       JOptionPane.showMessageDialog(null, "Debe Agregar las tallas");
                                    }
                                }catch(NumberFormatException e)
                                {
                                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en las existencias");
                                }
                                String marca = txtmarca.getText();
                                if(marca.equals(""))
                                {
                                    JOptionPane.showMessageDialog(null, "Debes de ingresar una marca");
                                }else
                                {
                                    mod.setMarca(marca);
                                    int clase=-1;
                                    if(rbsuperior.isSelected()==true)
                                    {
                                        clase = 1;
                                    }else 
                                    {
                                        if(rbinferior.isSelected()==true)
                                        {
                                            clase = 2;
                                        }else
                                        {
                                            if(rbcalzado.isSelected()==true)
                                            {
                                                clase = 3;
                                            }
                                        }
                                    }
                                    if(!cmbtipo1.getSelectedItem().toString().equals("Seleccione una clase de prenda primero"))
                                    {
                                         mod.setIdtipoprenda(traerIDTipoPrenda(cmbtipo1.getSelectedItem().toString(),clase));
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de ropa");
                                    }
                                    mod.setIdropa(id);
                                if(modSql.Modificar(mod))
                                    {
                                          //consulta para traer el ultimo id deROPA REGISTRADO
                                          //SELECT MAX(idropa) AS 'idropa' FROM ropa
                                         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                            if(model.getRowCount()>0){
                                                Ropa_Tallas rt =new Ropa_Tallas();
                                                SQL_Ropa_Tallas sqlropatallas=new SQL_Ropa_Tallas();
                                                sqlropatallas.Eliminar(id);
                                                for (int i = 0; i<model.getRowCount(); i++) {

                                                     rt.setIdropa(id);
                                                     rt.setIdtalla(traerIDTalla(model.getValueAt(i, 0).toString(), clase));
                                                     rt.setExistencias(Integer.parseInt(model.getValueAt(i, 1).toString()));
                                                     sqlropatallas.Agregar(rt);
                                                }
                                            }
                                        //una vez que guardo la ropa guardara las tallas

                                        JOptionPane.showMessageDialog(this, "Registro guardado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                                        Limpiar();
                                        CargarTabla();
                                    }else
                                    {
                                        JOptionPane.showMessageDialog(this, "Error al guardar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = 0;
        try
        {
            id = Integer.parseInt(txtid.getText());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        if(!txtid.getText().equals(""))
        {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                if(model.getRowCount()>0){/*
                        for (int i = 0; i<model.getRowCount(); i++) {
                        final String col1 = (String) model.getValueAt(i, 0);
                        final String col2 = (String) model.getValueAt(i, 1);
                        System.out.println("Talla: " + col1 + " Existencia: " + col2);
                    }*/
             //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             if(model.getRowCount()>0){
                SQL_Ropa_Tallas sqlropatallas = new SQL_Ropa_Tallas();
                for (int i = 0; i<model.getRowCount(); i++) 
                {
                    Ropa_Tallas rt =new Ropa_Tallas();
                    rt.setIdropa(id);
                    rt.setIdtalla(traerIDTalla((String) model.getValueAt(i, 0), 0));
                    rt.setExistencias(Integer.parseInt(model.getValueAt(i, 1).toString()));
                    sqlropatallas.Eliminar(id);
                }
             }
            try
            {
                Connection con = Conexion.getCon();
                PreparedStatement ps = con.prepareStatement("DELETE FROM ropa WHERE idropa=?");
                ps.setInt(1, Integer.parseInt(txtid.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro eliminado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                Limpiar();
                CargarTabla();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, "Error al eliminar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        SQL_Ropa modSql = new SQL_Ropa();
        Ropa mod = new Ropa();
        String nombre = txtnombre.getText();
        if(nombre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Debes de ingresar un nombre a la prenda");
        }
        else
        {
            mod.setNombre(nombre);
            String descripcion = txtdescripcion.getText();
            if(descripcion.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes de ingresar una descripcion a la prenda");
            }else
            {
                mod.setDescripcion(descripcion);
                if(txtpreciocosto.getText().equals("") && txtprecioventa.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Debe ingresar valores en los precios");
                }else
                {
                    boolean bandera = false;
                    try
                    {
                        double precio_costo = Double.parseDouble(txtpreciocosto.getText());
                        double precio_venta = Double.parseDouble(txtprecioventa.getText());
                        if(precio_costo > 0 && precio_venta > 0)
                        {
                            if(precio_venta > precio_costo)
                            {
                                mod.setPrecio_costo(precio_costo);
                                mod.setPrecio_venta(precio_venta);
                                mod.setGanancia(precio_venta - precio_costo);
                                bandera = true;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "El precio de costo no debe ser mayor al de venta");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Los precios deben ser mayores a cero");
                        }
                    }catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en el precio");
                    }
                    if(bandera)
                    {
                        if(cmbtalla.getSelectedItem().toString().equals("Seleccione una clase"))
                        {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar una talla");
                        }
                        else
                        {
                            String sexo;
                            if(rbmasculino.isSelected()==true)
                            {
                                sexo = "Masculino";
                                mod.setGenero(sexo);
                            }else 
                            {
                                if(rbfemenino.isSelected()==true)
                                {
                                    sexo = "Femenino";
                                    mod.setGenero(sexo);
                                }else
                                {
                                    JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
                                }
                            }
                            try
                            {
                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                if(model.getRowCount()>0){
                                    /*
                                     for (int i = 0; i<model.getRowCount(); i++) {
                                        final String col1 = (String) model.getValueAt(i, 0);
                                        final String col2 = (String) model.getValueAt(i, 1);
                                        System.out.println("Talla: " + col1 + " Existencia: " + col2);
                                    }
                                    */
                                }
                                else   
                                {
                                   JOptionPane.showMessageDialog(null, "Debe Agregar las tallas");
                                }
                            }catch(NumberFormatException e)
                            {
                                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en las existencias");
                            }
                            String marca = txtmarca.getText();
                            if(marca.equals(""))
                            {
                                JOptionPane.showMessageDialog(null, "Debes de ingresar una marca");
                            }else
                            {
                                mod.setMarca(marca);
                                int clase=-1;
                                if(rbsuperior.isSelected()==true)
                                {
                                    clase = 1;
                                }else 
                                {
                                    if(rbinferior.isSelected()==true)
                                    {
                                        clase = 2;
                                    }else
                                    {
                                        if(rbcalzado.isSelected()==true)
                                        {
                                            clase = 3;
                                        }
                                    }
                                }
                                if(!cmbtipo1.getSelectedItem().toString().equals("Seleccione una clase de prenda primero"))
                                {
                                     mod.setIdtipoprenda(traerIDTipoPrenda(cmbtipo1.getSelectedItem().toString(),clase));
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de ropa");
                                }
                            if(modSql.Agregar(mod))
                                {
                                      //consulta para traer el ultimo id deROPA REGISTRADO
                                      //SELECT MAX(idropa) AS 'idropa' FROM ropa
                                     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                        if(model.getRowCount()>0){
                                            SQL_Ropa_Tallas sqlropatallas=new SQL_Ropa_Tallas();
                                            for (int i = 0; i<model.getRowCount(); i++) {

                                                 Ropa_Tallas rt =new Ropa_Tallas();
                                                 rt.setIdropa(traerUltimoIDRopa());
                                                 rt.setIdtalla(traerIDTalla(model.getValueAt(i, 0).toString(), clase));
                                                 rt.setExistencias(Integer.parseInt(model.getValueAt(i, 1).toString()));
                                                 sqlropatallas.Agregar(rt);
                                            }
                                        }
                                    //una vez que guardo la ropa guardara las tallas

                                    JOptionPane.showMessageDialog(this, "Registro guardado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                                    Limpiar();
                                    CargarTabla();
                                }else
                                {
                                    JOptionPane.showMessageDialog(this, "Error al guardar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
              }
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tablaropaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaropaMouseClicked
        //Este metodo es para que se le pueda hacer clic a la tabla
        try
        {
            int fila = tablaropa.getSelectedRow();
            int id = Integer.parseInt(tablaropa.getValueAt(fila, 0).toString());
            PreparedStatement ps, ps2;
            ResultSet rs, rs2;
            ResultSetMetaData rsm;
            Connection con = Conexion.getCon();
            Connection con2 = Conexion.getCon();
            String consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.idropa=? ";
            String consulta_talla = "SELECT t.nombre, rt.existencias FROM Tallas t INNER JOIN ropa_talla rt ON t.idtalla = rt.idtalla INNER JOIN ropa r ON rt.idropa = r.idropa WHERE r.idropa=?";
            ps=con.prepareStatement(consultaSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next())
            {
                txtid.setText(String.valueOf(id));
                txtnombre.setText(rs.getString(2));
                txtdescripcion.setText(rs.getString(3));
                txtpreciocosto.setText(rs.getString(4));
                txtprecioventa.setText(rs.getString(5));
                //cmbtalla.setSelectedItem(rs.getString("talla"));
                if(rs.getString(6).equals("Masculino"))
                {
                    rbmasculino.setSelected(true);
                }else if(rs.getString(6).equals("Femenino"))
                {
                    rbfemenino.setSelected(true);
                }
                //txtcantidad.setText(rs.getString("cantidad"));
                txtmarca.setText(rs.getString(7));
                if(rs.getString(8).equals("Superior"))
                {
                    rbsuperior.setSelected(true);
                    TraerTipos(1);
                    TraerTallas(1);
                }else
                {
                    if(rs.getString(8).equals("Inferior"))
                    {
                        rbinferior.setSelected(true);
                        TraerTipos(2);
                        TraerTallas(2);
                    }else if(rs.getString(8).equals("Calzado"))
                    {
                        rbcalzado.setSelected(true);
                        TraerTipos(3);
                        TraerTallas(3);
                    }
                }
                cmbtipo1.setSelectedItem(rs.getString(9));
                
                DefaultTableModel modelotabla = (DefaultTableModel) jTable1.getModel();
                modelotabla.setRowCount(0);
                ps2 = con2.prepareStatement(consulta_talla);
                ps2.setInt(1, id);
                rs2 = ps2.executeQuery();
                rsm = rs2.getMetaData();
                int columnas = rsm.getColumnCount();;
                while(rs2.next())
                {
                    Object[] fila2 = new Object[columnas];
                    for(int indice=0; indice<columnas; indice++)
                    {
                        fila2[indice] = rs2.getObject(indice+1);
                    }
                    modelotabla.addRow(fila2);
                }
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tablaropaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        DefaultTableModel modelotabla = (DefaultTableModel) tablaropa.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        String busqueda = txtbuscar.getText();
        if(busqueda.trim().equals(""))
        {
            //CargarTabla();
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor al campo de busqueda dependiendo del filtro seleccionado");
        }
        int columnas;
        //724 tamano tabla de forma horizontal
        int[] anchos = {30,100,150,40,30,60,40,70,80,124};
        for(int i = 0; i<tablaropa.getColumnCount(); i++)
        {
            tablaropa.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
            try
            {
                Connection con = Conexion.getCon();
                String consultaSQL = "";
                String filtro = cmbfiltro.getSelectedItem().toString();
                if(filtro.equals("Id"))
                {
                    consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.idropa = '"+busqueda+"' ";
                }else
                {
                    if(filtro.equals("Nombre"))
                    {
                        consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.nombre like '%"+busqueda+"%' ";
                    }else
                    {
                            if(filtro.equals("Genero"))
                            {
                                consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.genero like '%"+busqueda+"%' ";
                            }
                            else
                            {
                                if(filtro.equals("Marca"))
                                {
                                    consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda  WHERE r.marca like '%"+busqueda+"%' ";
                                }
                                else
                                {
                                    if(filtro.equals("Clase"))
                                    {
                                        consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE cp.nombre like '%"+busqueda+"%' ";
                                    }
                                    else
                                    {
                                        if(filtro.equals("Tipo"))
                                        {
                                            consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE tp.nombre like '%"+busqueda+"%' ";
                                        }
                                    }
                                }
                            }
                    }
                }
                ps = con.prepareStatement(consultaSQL);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                while(rs.next())
                {
                    Object[] fila = new Object[columnas];
                    for(int indice=0; indice<columnas; indice++)
                    {
                        fila[indice] = rs.getObject(indice+1);
                    }
                    modelotabla.addRow(fila);
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.frmCRopa = null;
    }//GEN-LAST:event_formWindowClosing

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        dispose();
        MenuPrincipal.frmCRopa = null;
    }//GEN-LAST:event_txtVolverMouseClicked

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        /*if(evt.getExtendedKeyCode()==KeyEvent.VK_ENTER)
        {
           btnbuscarActionPerformed(java.awt.event.ActionEvent evt);
           se crearia un nuevo metodo con lo del boton de buscar
        }*/
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        CargarTabla();
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        DefaultTableModel modelotabla = (DefaultTableModel) tablaropa.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        String busqueda = txtbuscar.getText();
        if(busqueda.trim().equals(""))
        {
            CargarTabla();
        }
        else
        {
        int columnas;
        int[] anchos = {30,100,150,40,30,60,40,70,80,124};
        for(int i = 0; i<tablaropa.getColumnCount(); i++)
        {
            tablaropa.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
            try
            {
                Connection con = Conexion.getCon();
                String consultaSQL = "";
                String filtro = cmbfiltro.getSelectedItem().toString();
                if(filtro.equals("Id"))
                {
                    consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.idropa = '"+busqueda+"' ";
                }else
                {
                    if(filtro.equals("Nombre"))
                    {
                        consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.nombre like '%"+busqueda+"%' ";
                    }else
                    {
                            if(filtro.equals("Genero"))
                            {
                                consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.genero like '%"+busqueda+"%' ";
                            }
                            else
                            {
                                if(filtro.equals("Marca"))
                                {
                                    consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE r.marca like '%"+busqueda+"%' ";
                                }
                                else
                                {
                                    if(filtro.equals("Clase"))
                                    {
                                        consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE cp.nombre like '%"+busqueda+"%' ";
                                    }
                                    else
                                    {
                                        if(filtro.equals("Tipo"))
                                        {
                                            consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda WHERE tp.nombre like '%"+busqueda+"%' ";
                                        }
                                    }
                                }
                            }
                    }
                }
                ps = con.prepareStatement(consultaSQL);
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                while(rs.next())
                {
                    Object[] fila = new Object[columnas];
                    for(int indice=0; indice<columnas; indice++)
                    {
                        fila[indice] = rs.getObject(indice+1);
                    }
                    modelotabla.addRow(fila);
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    int claseSeleccionada =1;
    private void rbsuperiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbsuperiorMouseClicked
        TraerTallas(1);
        TraerTipos(1);
        claseSeleccionada=1;
        LimpiarTablaTallas();
    }//GEN-LAST:event_rbsuperiorMouseClicked

    private void rbinferiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbinferiorMouseClicked
        TraerTallas(2);
        TraerTipos(2);
        claseSeleccionada=2;
        LimpiarTablaTallas();
    }//GEN-LAST:event_rbinferiorMouseClicked

    private void TraerTallas(int idClase){
        try
        {
            Connection con = Conexion.getCon();
            String consultaSQL = "select idtalla,nombre from Tallas where idclasePrenda=?";
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(consultaSQL);
            ps.setInt(1, idClase);
            rs = ps.executeQuery();
            cmbtalla.removeAllItems();
            while(rs.next())
            {
               cmbtalla.addItem(rs.getString(2));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void TraerTipos(int idClase)
    {
        try
        {
            Connection con = Conexion.getCon();
            String consultaSQL = "select idTipoPrenda,nombre from TipoPrenda where idclasePrenda=?";
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(consultaSQL);
            ps.setInt(1, idClase);
            rs = ps.executeQuery();
            cmbtipo1.removeAllItems();
            while(rs.next())
            {
               cmbtipo1.addItem(rs.getString(2));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void rbcalzadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbcalzadoMouseClicked
        TraerTallas(3);
        TraerTipos(3);
        claseSeleccionada=3;
        LimpiarTablaTallas();
    }//GEN-LAST:event_rbcalzadoMouseClicked

    private void rbcalzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcalzadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbcalzadoActionPerformed

    private void btnseleccionartallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionartallaActionPerformed
        System.out.println(claseSeleccionada);
        MostrarOcultarComponentes(false);            
    }//GEN-LAST:event_btnseleccionartallaActionPerformed

    private void btbagregartallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbagregartallaActionPerformed
        if(!(cmbtalla.getSelectedItem().toString().equals("Seleccione una clase")))
        {
            int existencias = Integer.parseInt(txtexistencias.getText());
            if(existencias > 0)
            {
                try
                {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    int columnas = model.getRowCount();
                    boolean existe =false;
                    for (int i = 0; i<columnas; i++) {
                        if(model.getValueAt(i, 0).toString().equalsIgnoreCase(cmbtalla.getSelectedItem().toString())){
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        Object[] row = { cmbtalla.getSelectedItem(), existencias};
                        model.addRow(row); 
                    }
                    else{
                      JOptionPane.showMessageDialog(null, "Ya tienes esta talla registradas");
                    }

                }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un valor numerico en las existencias");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No puedes agregar existencias negativas");
            }
        }else
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una talla");
        }
    }//GEN-LAST:event_btbagregartallaActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        MostrarOcultarComponentes(true);
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnlimpiartallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiartallasActionPerformed
        LimpiarTablaTallas();
    }//GEN-LAST:event_btnlimpiartallasActionPerformed

    private void MostrarOcultarComponentes(boolean accion){
        jLabel5.setVisible(accion);
        rbmasculino.setVisible(accion);
        rbfemenino.setVisible(accion);
        jLabel7.setVisible(accion);
        jLabel9.setVisible(accion);
        cmbtipo1.setVisible(accion);
        txtmarca.setVisible(accion);
        btnAgregar.setVisible(accion);
        btnEliminar.setVisible(accion);
        btnLimpiar.setVisible(accion);
        btnModificar.setVisible(accion);
        btnseleccionartalla.setVisible(accion);
        jLabel3.setVisible(accion);
        txtpreciocosto.setVisible(accion);
        jLabel6.setVisible(accion);
        txtprecioventa.setVisible(accion);
        
        btbagregartalla.setVisible(!accion);
        txtexistencias.setVisible(!accion);
        jLabel4.setVisible(!accion);
        cmbtalla.setVisible(!accion);
        jScrollPane3.setVisible(!accion);
        btnvolver.setVisible(!accion);
        jLabel11.setVisible(!accion);
        btnlimpiartallas.setVisible(!accion);
    }
    private void Limpiar()
    {
        txtnombre.setText("");
        txtdescripcion.setText("");
        txtpreciocosto.setText("");
        cmbtalla.setSelectedItem("Seleccione");
        txtmarca.setText("");
        btnGr.clearSelection();
        btnGr1.clearSelection();
        cmbtipo1.setVisible(true);
        txtid.setText("");
        cmbtalla.removeAllItems();
        cmbtalla.addItem("Seleccione una clase");
        cmbtalla.setSelectedItem("Seleccione una clase");
        cmbtipo1.addItem("Seleccione una clase de prenda primero");
        cmbtipo1.setSelectedItem("Seleccione una clase de prenda primero");
        txtexistencias.setText("");
        txtprecioventa.setText("");
        LimpiarTablaTallas();
    }
    
    private void LimpiarTablaTallas()
    {
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) 
        {          
            tb.removeRow(tb.getRowCount()-1);
        }
        txtexistencias.setText("");
    }
    
    private void CargarTabla()
    {
        DefaultTableModel modelotabla = (DefaultTableModel) tablaropa.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        //724 tamano tabla de forma horizontal
        int[] anchos = {40,100,150,50,50,50,60,70,80,110};
        for(int i = 0; i<tablaropa.getColumnCount(); i++)
        {
            tablaropa.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try
        {
            Connection con = Conexion.getCon();
            //String consultaSQL = "SELECT idropa, nombre, descripcion, precio, genero, marca FROM ropa";
            String consultaSQL = "SELECT DISTINCT r.idropa, r.nombre, r.descripcion, r.precio_costo, r.precio_venta, r.ganancia, r.genero, r.marca, cp.nombre, tp.nombre FROM ropa r INNER JOIN ropa_talla rp ON r.idropa = rp.idropa INNER JOIN Tallas t ON rp.idtalla=t.idtalla INNER JOIN ClasePrenda cp ON t.idclasePrenda=cp.idClasePrenda INNER JOIN TipoPrenda tp ON r.idtipoprenda = tp.idTipoPrenda ";
            ps = con.prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            Object[] fila = new Object[columnas];
            while(rs.next())
            {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getDouble(4);
                fila[4] = rs.getDouble(5);
                fila[5] = rs.getDouble(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                fila[8] = rs.getString(9);
                fila[9] = rs.getString(10);
                modelotabla.addRow(fila);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
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
            java.util.logging.Logger.getLogger(CRUD_Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Ropa(null).setVisible(true);
            }
        }); 
    }
    
     private int traerIDTipoPrenda(String nombre,int clase){
        PreparedStatement ps = null;
        Connection con = Conexion.getCon();
        ResultSet rs;
        String consultaSQL = "Select idTipoPrenda from TipoPrenda where nombre=? and idclaseprenda=? ;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, nombre);
          ps.setInt(2, clase);
          rs = ps.executeQuery();
          if(rs.next()){
              return rs.getInt(1);
          }
          return -1;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return -1;
        }
     }
     private int traerIDTalla(String nombre,int clase){
         PreparedStatement ps = null;
        Connection con = Conexion.getCon();
        ResultSet rs;
        String consultaSQL = "Select idtalla from Tallas where nombre=? and idclasePrenda=? ;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          ps.setString(1, nombre);
          ps.setInt(2, clase);
          rs = ps.executeQuery();
          if(rs.next()){
              return rs.getInt(1);
          }
          return -1;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return -1;
        }
     }
      private int traerUltimoIDRopa(){
         PreparedStatement ps = null;
        Connection con = Conexion.getCon();
        ResultSet rs;
        String consultaSQL = "Select MAX(idropa) from ropa;";
        try
        {
          ps=con.prepareStatement(consultaSQL);
          rs = ps.executeQuery();
          if(rs.next()){
              return rs.getInt(1);
          }
          return -1;
        }catch(SQLException ex)
        {
            Logger.getLogger(SQL_Usuarios.class.getName()).log(Level.SEVERE, null,ex);
            return -1;
        }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbagregartalla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnlimpiartallas;
    private javax.swing.JButton btnseleccionartalla;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> cmbfiltro;
    private javax.swing.JComboBox<String> cmbtalla;
    private javax.swing.JComboBox<String> cmbtipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbcalzado;
    private javax.swing.JRadioButton rbfemenino;
    private javax.swing.JRadioButton rbinferior;
    private javax.swing.JRadioButton rbmasculino;
    private javax.swing.JRadioButton rbsuperior;
    private javax.swing.JTable tablaropa;
    private javax.swing.JLabel txtVolver;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtexistencias;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpreciocosto;
    private javax.swing.JTextField txtprecioventa;
    // End of variables declaration//GEN-END:variables
}
