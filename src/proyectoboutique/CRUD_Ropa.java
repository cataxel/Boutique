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



public class CRUD_Ropa extends javax.swing.JFrame {

    ButtonGroup btnGr;
    ButtonGroup btnGr1;
    
    private Usuario user;
    public CRUD_Ropa(Usuario user) {
        this.user=user;
        initComponents();
        cmbtipoS.setVisible(false);
        cmbtipoI.setVisible(false);
        //txtid.setVisible(false);
        btnGr = new ButtonGroup();
        btnGr1 = new ButtonGroup();
        btnGr.add(rbmasculino);
        btnGr.add(rbfemenino);
        btnGr1.add(rbsuperior);
        btnGr1.add(rbinferior);
        CargarTabla();
        txtid.setEditable(false);
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
        txtprecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbtalla = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rbmasculino = new javax.swing.JRadioButton();
        rbfemenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbsuperior = new javax.swing.JRadioButton();
        rbinferior = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cmbtipo1 = new javax.swing.JComboBox<>();
        cmbtipoS = new javax.swing.JComboBox<>();
        cmbtipoI = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
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
                "Id", "Nombre", "Descripcion", "Precio", "Talla", "Genero", "Cantidad", "Marca", "Clase", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jLabel1.setText("Nombre:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion:");

        jScrollPane2.setToolTipText("");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane2.setViewportView(txtdescripcion);

        jLabel3.setText("Precio:");

        jLabel4.setText("Talla:");

        cmbtalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CH", "M", "G", "XG" }));

        jLabel5.setText("Genero:");

        rbmasculino.setBackground(new java.awt.Color(255, 255, 255));
        rbmasculino.setText("Masculino");

        rbfemenino.setBackground(new java.awt.Color(255, 255, 255));
        rbfemenino.setText("Femenino");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Clase de prenda:");

        rbsuperior.setBackground(new java.awt.Color(255, 255, 255));
        rbsuperior.setText("Superior");

        rbinferior.setBackground(new java.awt.Color(255, 255, 255));
        rbinferior.setText("Inferior");

        jLabel9.setText("Tipo de prenda:");

        cmbtipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clase de prenda primero" }));

        cmbtipoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Camiseta", "Camisa", "Sudadera", "Chaqueta", "Sueter", "Abrigo" }));

        cmbtipoI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Pantalon de vestir", "Pantalon deportivo", "Shorts", "Bermudas", " " }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel10.setText("Id:");

        txtid.setActionCommand("<Not Set>");
        txtid.setAutoscrolls(false);
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cmbtalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(rbmasculino)
                                    .addGap(75, 75, 75)
                                    .addComponent(rbfemenino))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(rbsuperior)
                                .addGap(18, 18, 18)
                                .addComponent(rbinferior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnModificar)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(91, 91, 91)
                                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(btnEliminar))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(cmbtipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cmbtipoI, javax.swing.GroupLayout.Alignment.LEADING, 0, 165, Short.MAX_VALUE)
                                            .addComponent(cmbtipoS, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(rbmasculino)
                    .addComponent(rbfemenino))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbsuperior)
                    .addComponent(rbinferior)
                    .addComponent(btnActualizar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbtipoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cmbtipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbtipoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnModificar)))
                .addContainerGap())
        );

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
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        cmbfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Talla", "Genero", "Marca", "Clase", "Tipo" }));

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
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtVolver))
                .addContainerGap())
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try
        {
            int id = Integer.parseInt(txtid.getText());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        if(!txtid.getText().equals(""))
        {
            try
            {
                Connection con = Conexion.getCon();
                PreparedStatement ps = con.prepareStatement("UPDATE ropa SET nombre=?, descripcion=?, precio=?, talla=?, genero=?, cantidad=?, marca=?, clase=?, tipo=? WHERE idropa=?");
                String nombre = txtnombre.getText();
                ps.setString(1, nombre);
                String descripcion = txtdescripcion.getText();
                ps.setString(2, descripcion);
                try
                {
                    double precio = Double.parseDouble(txtprecio.getText());
                    ps.setDouble(3, precio);
                }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en el precio");
                }
                if(!cmbtalla.getSelectedItem().toString().equals("Seleccione"))
                {
                    String talla = cmbtalla.getSelectedItem().toString();
                    ps.setString(4, talla);
                }else
                {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una talla");
                }
                String sexo;
                if(rbmasculino.isSelected()==true && rbfemenino.isSelected()==false)
                {
                    sexo = "Masculino";
                    ps.setString(5, sexo);
                }else 
                {
                    if(rbfemenino.isSelected()==true && rbmasculino.isSelected()==false)
                    {
                        sexo = "Femenino";
                        ps.setString(5, sexo);
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
                    }
                }
                try
                {
                    int cantidad = Integer.parseInt(txtcantidad.getText());
                    ps.setInt(6, cantidad);
                }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en la cantidad");
                }
                String marca = txtmarca.getText();
                ps.setString(7, marca);
                String clase;
                String tipo;
                if(rbsuperior.isSelected()==true && rbinferior.isSelected()==false)
                {
                    clase = "Superior";
                    ps.setString(8, clase);
                    if(!cmbtipoS.getSelectedItem().toString().equals("Seleccione"))
                    {
                        tipo = cmbtipoS.getSelectedItem().toString();
                        ps.setString(9, tipo);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de ropa");
                    }
                }else 
                {
                    if(rbinferior.isSelected()==true && rbsuperior.isSelected()==false)
                    {
                        clase = "Inferior";
                        ps.setString(8, clase);
                        if(!cmbtipoI.getSelectedItem().toString().equals("Seleccione"))
                        {
                           tipo = cmbtipoI.getSelectedItem().toString();
                           ps.setString(9, tipo);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de ropa");
                        }
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una clase y posteriormente un tipo");
                    }
            }
                ps.setInt(10, Integer.parseInt(txtid.getText()));    
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registro modificado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                Limpiar();
                CargarTabla();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, "Error al modificar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try
        {
            int id = Integer.parseInt(txtid.getText());
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para obtener un id");
        }
        if(!txtid.getText().equals(""))
        {
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
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        SQL_Ropa modSql = new SQL_Ropa();
        Ropa mod = new Ropa();
        String nombre = txtnombre.getText();
        mod.setNombre(nombre);
        String descripcion = txtdescripcion.getText();
        mod.setDescripcion(descripcion);
        try
        {
            double precio = Double.parseDouble(txtprecio.getText());
            mod.setPrecio(precio);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en el precio");
        }
        if(!cmbtalla.getSelectedItem().toString().equals("Seleccione"))
        {
            String talla = cmbtalla.getSelectedItem().toString();
            mod.setTalla(talla);
        }else
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una talla");
        }
        String sexo;
        if(rbmasculino.isSelected()==true && rbfemenino.isSelected()==false)
        {
            sexo = "Masculino";
            mod.setGenero(sexo);
        }else 
        {
            if(rbfemenino.isSelected()==true && rbmasculino.isSelected()==false)
            {
                sexo = "Femenino";
                mod.setGenero(sexo);
                cmbtipoI.setVisible(true);
            }else
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
            }
        }
        try
        {
            int cantidad = Integer.parseInt(txtcantidad.getText());
            mod.setCantidad(cantidad);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en la cantidad");
        }
        String marca = txtmarca.getText();
        mod.setMarca(marca);
        String clase;
        String tipo;
        if(rbsuperior.isSelected()==true && rbinferior.isSelected()==false)
        {
            clase = "Superior";
            mod.setClase(clase);
            if(!cmbtipoS.getSelectedItem().toString().equals("Seleccione"))
            {
                tipo = cmbtipoS.getSelectedItem().toString();
                mod.setTipo(tipo);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de ropa");
            }
        }else 
        {
            if(rbinferior.isSelected()==true && rbsuperior.isSelected()==false)
            {
                clase = "Inferior";
                mod.setClase(clase);
                if(!cmbtipoI.getSelectedItem().toString().equals("Seleccione"))
                {
                   tipo = cmbtipoI.getSelectedItem().toString();
                   mod.setTipo(tipo);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de ropa");
                }
            }else
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una clase y posteriormente un tipo");
            }
        }
        if(modSql.Agregar(mod))
            {
                JOptionPane.showMessageDialog(this, "Registro guardado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                Limpiar();
                CargarTabla();
            }else
            {
                JOptionPane.showMessageDialog(this, "Error al guardar el registro", "Registro", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(rbsuperior.isSelected()==true && rbinferior.isSelected()==false)
        {
            cmbtipoS.setVisible(true);
            cmbtipoI.setVisible(false);
            cmbtipo1.setVisible(false);
            cmbtipoI.setSelectedItem("Seleccione");
            cmbtipoS.setSelectedItem("Seleccione");
        }else 
        {
            if(rbinferior.isSelected()==true && rbsuperior.isSelected()==false)
            {
                cmbtipoI.setVisible(true);
                cmbtipoS.setVisible(false);
                cmbtipo1.setVisible(false);
                cmbtipoS.setSelectedItem("Seleccione");
                cmbtipoI.setSelectedItem("Seleccione");
            }else
            {
                if(rbinferior.isSelected()==false && rbsuperior.isSelected()==false)
                {
                    cmbtipoI.setVisible(false);
                    cmbtipoS.setVisible(false);
                    cmbtipo1.setVisible(true);
                    cmbtipoI.setSelectedItem("Seleccione");
                    cmbtipoS.setSelectedItem("Seleccione");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una clase y posteriormente un tipo");
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tablaropaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaropaMouseClicked
        try
        {
            int fila = tablaropa.getSelectedRow();
            int id = Integer.parseInt(tablaropa.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getCon();
            String consultaSQL = "SELECT nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE idropa=?";
            ps=con.prepareStatement(consultaSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next())
            {
                txtid.setText(String.valueOf(id));
                txtnombre.setText(rs.getString("nombre"));
                txtdescripcion.setText(rs.getString("descripcion"));
                txtprecio.setText(rs.getString("precio"));
                cmbtalla.setSelectedItem(rs.getString("talla"));
                if(rs.getString("genero").equals("Masculino"))
                {
                    rbmasculino.setSelected(true);
                }else if(rs.getString("genero").equals("Femenino"))
                {
                    rbfemenino.setSelected(true);
                }
                txtcantidad.setText(rs.getString("cantidad"));
                txtmarca.setText(rs.getString("marca"));
                if(rs.getString("clase").equals("Superior"))
                {
                    rbsuperior.setSelected(true);
                    cmbtipoI.setVisible(false);
                    cmbtipoS.setVisible(true);
                    cmbtipo1.setVisible(false);
                    cmbtipoS.setSelectedItem(rs.getString("tipo"));
                }else if(rs.getString("clase").equals("Inferior"))
                {
                    rbinferior.setSelected(true);
                    cmbtipoI.setVisible(true);
                    cmbtipoS.setVisible(false);
                    cmbtipo1.setVisible(false);
                    cmbtipoI.setSelectedItem(rs.getString("tipo"));
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
            CargarTabla();
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
                    consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE idropa = '"+busqueda+"' ";
                }else
                {
                    if(filtro.equals("Nombre"))
                    {
                        consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE nombre like '%"+busqueda+"%' ";
                    }else
                    {
                        if(filtro.equals("Talla"))
                        {
                            consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE talla = '"+busqueda+"' ";
                        }
                        else
                        {
                            if(filtro.equals("Genero"))
                            {
                                consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE genero like '%"+busqueda+"%' ";
                            }
                            else
                            {
                                if(filtro.equals("Marca"))
                                {
                                    consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE marca like '%"+busqueda+"%' ";
                                }
                                else
                                {
                                    if(filtro.equals("Clase"))
                                    {
                                        consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE clase like '%"+busqueda+"%' ";
                                    }
                                    else
                                    {
                                        if(filtro.equals("Tipo"))
                                        {
                                            consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa WHERE tipo like '%"+busqueda+"%' ";
                                        }
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

    private void Limpiar()
    {
        txtnombre.setText("");
        txtdescripcion.setText("");
        txtprecio.setText("");
        txtcantidad.setText("");
        cmbtalla.setSelectedItem("Seleccione");
        txtmarca.setText("");
        btnGr.clearSelection();
        btnGr1.clearSelection();
        cmbtipoI.setSelectedItem("Seleccione");
        cmbtipoS.setSelectedItem("Seleccione");
        cmbtipoI.setVisible(false);
        cmbtipoS.setVisible(false);
        cmbtipo1.setVisible(true);
        txtid.setText("");
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
        int[] anchos = {30,100,150,40,30,60,40,70,80,124};
        for(int i = 0; i<tablaropa.getColumnCount(); i++)
        {
            tablaropa.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try
        {
            Connection con = Conexion.getCon();
            String consultaSQL = "SELECT idropa, nombre, descripcion, precio, talla, genero, cantidad, marca, clase, tipo FROM ropa";
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JComboBox<String> cmbfiltro;
    private javax.swing.JComboBox<String> cmbtalla;
    private javax.swing.JComboBox<String> cmbtipo1;
    private javax.swing.JComboBox<String> cmbtipoI;
    private javax.swing.JComboBox<String> cmbtipoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JRadioButton rbfemenino;
    private javax.swing.JRadioButton rbinferior;
    private javax.swing.JRadioButton rbmasculino;
    private javax.swing.JRadioButton rbsuperior;
    private javax.swing.JTable tablaropa;
    private javax.swing.JLabel txtVolver;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
