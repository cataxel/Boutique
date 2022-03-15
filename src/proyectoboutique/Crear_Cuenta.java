/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoboutique;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import logica.GenerarContraseña;
import logica.SQL_Usuarios;
import logica.Usuario;
import logica.hash;

public class Crear_Cuenta extends javax.swing.JFrame {
    
    public Crear_Cuenta() {
        initComponents();
        setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cuadroimagen = new javax.swing.JLabel();
        titulocc = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        contra = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        confirmarcontra = new javax.swing.JLabel();
        txtconfirmarcontra = new javax.swing.JPasswordField();
        btncrear = new javax.swing.JPanel();
        txtcrear = new javax.swing.JLabel();
        generarcontra = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btncrear1 = new javax.swing.JPanel();
        txtinicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        cuadroimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroimagen.setText("imagen");

        titulocc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulocc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulocc.setText("CREAR CUENTA");

        correo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        correo.setText("Correo electrónico");

        txtcorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtcorreo.setText("Ingrese una direccion de correo");
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcorreoMousePressed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        nombre.setText("Nombre de usuario");

        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese su nombre de usuario");
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        contra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        contra.setText("Contraseña");

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });

        confirmarcontra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        confirmarcontra.setText("Confirmar contraseña");

        txtconfirmarcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtconfirmarcontra.setText("********");
        txtconfirmarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtconfirmarcontraMousePressed(evt);
            }
        });

        txtcrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcrear.setText("CREAR CUENTA");
        txtcrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btncrearLayout = new javax.swing.GroupLayout(btncrear);
        btncrear.setLayout(btncrearLayout);
        btncrearLayout.setHorizontalGroup(
            btncrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btncrearLayout.setVerticalGroup(
            btncrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcrear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        generarcontra.setBackground(new java.awt.Color(255, 255, 255));
        generarcontra.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        generarcontra.setForeground(new java.awt.Color(0, 153, 255));
        generarcontra.setText("Generar contraseña");
        generarcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarcontraMouseClicked(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));

        txtVolver.setText("< Volver a menu");
        txtVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolverLayout.createSequentialGroup()
                .addComponent(txtVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        ver.setText("Ver");
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        ocultar.setText("Ocultar");
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nombre");

        txtnombre.setForeground(new java.awt.Color(204, 204, 204));
        txtnombre.setText("Ingrese su nombre");
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
            }
        });

        txtinicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtinicio.setText("Iniciar sesion");
        txtinicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtinicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btncrear1Layout = new javax.swing.GroupLayout(btncrear1);
        btncrear1.setLayout(btncrear1Layout);
        btncrear1Layout.setHorizontalGroup(
            btncrear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncrear1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btncrear1Layout.setVerticalGroup(
            btncrear1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncrear1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cuadroimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btncrear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titulocc, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ver)
                            .addComponent(ocultar)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(confirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(generarcontra))
                    .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuadroimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(titulocc)
                        .addGap(15, 15, 15)
                        .addComponent(correo)
                        .addGap(4, 4, 4)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombre)
                        .addGap(3, 3, 3)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contra)
                        .addGap(4, 4, 4)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ver)
                            .addComponent(ocultar))
                        .addGap(8, 8, 8)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(confirmarcontra))
                            .addComponent(generarcontra))
                        .addGap(4, 4, 4)
                        .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncrear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMousePressed
        if(txtcorreo.getText().contains("Ingrese una direccion de correo"))
        {
            txtcorreo.setText("");
            txtcorreo.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);
        }
         else
        {
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty())
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
            {
                if(txtusuario.getText().isEmpty())
                {
                    txtusuario.setText("Ingrese su nombre de usuario");
                    txtusuario.setForeground(Color.gray);
                } 
                else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtcorreoMousePressed

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if(txtusuario.getText().contains("Ingrese su nombre de usuario"))
        {
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty() )
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
            {
                if(txtcorreo.getText().isEmpty())
                    {
                        txtcorreo.setText("Ingrese una direccion de correo");
                        txtcorreo.setForeground(Color.gray);
                    }
                else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(String.valueOf(txtcontra.getPassword()).contains("********"))
        {
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty() )
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
            {
                if(txtusuario.getText().isEmpty())
                {
                    txtusuario.setText("Ingrese su nombre de usuario");
                    txtusuario.setForeground(Color.gray);
                }
                else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtconfirmarcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconfirmarcontraMousePressed
        if(String.valueOf(txtconfirmarcontra.getPassword()).contains("********"))
        {
            txtconfirmarcontra.setText("");
            txtconfirmarcontra.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtcontra.getPassword()).isEmpty() )
            {
                txtcontra.setText("********");
                txtcontra.setForeground(Color.gray);
            }
            else
                 if(txtusuario.getText().isEmpty())
                    {
                        txtusuario.setText("Ingrese su nombre de usuario");
                        txtusuario.setForeground(Color.gray);
                    }
            else
                {
                    if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre");
                        txtnombre.setForeground(Color.gray);
                    }
                }
        }
    }//GEN-LAST:event_txtconfirmarcontraMousePressed

    private void generarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarcontraMouseClicked
        GenerarContraseña objContra = new GenerarContraseña(8);
        String clave = objContra.generarContra();
        txtcontra.setText(clave);
        txtcontra.setForeground(Color.black);
        txtconfirmarcontra.setText(clave);
        txtconfirmarcontra.setForeground(Color.black);
    }//GEN-LAST:event_generarcontraMouseClicked

    private void txtcrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcrearMouseClicked
        
        SQL_Usuarios modSql = new SQL_Usuarios();
        Usuario mod = new Usuario();
        
        if(txtusuario.getText().equals("") || String.valueOf(txtcontra.getPassword()).equals("") || String.valueOf(txtconfirmarcontra.getPassword()).equals("") || txtnombre.getText().equals("") || txtcorreo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Hay campos vacios, debes llenar todos los campos", "Registro", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(!(String.valueOf(txtcontra.getPassword()).equals(String.valueOf(txtconfirmarcontra.getPassword()))))
               JOptionPane.showMessageDialog(this, "Las contraseñas no concuerdan, intente ingresarlas nuevamente", "Registro", JOptionPane.ERROR_MESSAGE);
            else
            {
                if(!(VerificarCorreo(txtcorreo.getText())))
                {
                    JOptionPane.showMessageDialog(this, "El correo ingresado no es valido, intente ingresarlo nuevamente", "Registro", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    if(modSql.ExisteUsuario((txtusuario.getText())) != 0)
                    {
                       JOptionPane.showMessageDialog(this, "El Usuario ingresado ya existe, intente con un nuevo nombre de usuario", "Registro", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                       if(modSql.ExisteCorreo((txtcorreo.getText())) != 0)
                       {
                           JOptionPane.showMessageDialog(this, "El correo ingresado ya esta registrado en otra cuenta, intente ingresar un nuevo correo", "Registro", JOptionPane.ERROR_MESSAGE);
                       }
                       else
                        {
                        String usuario = txtusuario.getText();
                        mod.setUsuario(usuario);
                        String clave = String.valueOf(txtcontra.getPassword());
                        mod.setContra(hash.sha1(clave));
                        String nombre = txtnombre.getText();
                        mod.setNombre((nombre));
                        String correo = txtcorreo.getText().toLowerCase();
                        mod.setCorreo(correo);
                        mod.setId_tipo(1);
                        if(modSql.Registrar(mod))
                        {
                           JOptionPane.showMessageDialog(this, "Cuenta creada con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
                           Limpiar();
                        }else
                        {
                           JOptionPane.showMessageDialog(this, "Error al guardar la cuenta", "Registro", JOptionPane.ERROR_MESSAGE);
                        }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtcrearMouseClicked

    
    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        dispose();
        MenuPrincipal.frmReg = null;
    }//GEN-LAST:event_txtVolverMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        ocultar.setVisible(true);
        txtcontra.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        ver.setVisible(true);
        ocultar.setVisible(false);
        txtcontra.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed
        if(String.valueOf(txtnombre.getText()).contains("Ingrese su nombre"))
        {
            txtnombre.setText("");
            txtnombre.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
        {
            if(String.valueOf(txtcontra.getPassword()).isEmpty() )
            {
                txtcontra.setText("********");
                txtcontra.setForeground(Color.gray);
            }
            else
                 if(txtusuario.getText().isEmpty())
                    {
                        txtusuario.setText("Ingrese su nombre de usuario");
                        txtusuario.setForeground(Color.gray);
                    }
            else
                {
                    if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty())
                    {
                        txtconfirmarcontra.setText("********");
                        txtconfirmarcontra.setForeground(Color.gray);
                    }
                }
        }
    }//GEN-LAST:event_txtnombreMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.frmReg = null;
    }//GEN-LAST:event_formWindowClosing

    private void txtinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtinicioMouseClicked
        dispose();
        InicioSesion in_sesion = new InicioSesion();
        in_sesion.setVisible(true);
        MenuPrincipal.frmReg = null;
    }//GEN-LAST:event_txtinicioMouseClicked
    
    ///Merodo para verificar correo
    public boolean VerificarCorreo(String correo)
    {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        //si se cumple los requisitos da true si no da false
        return mat.find();
    }
    
    /*public boolean UsuarioExiste(String username){
        boolean existe=false;
        for (Usuario usuario : objUsuarios) {
            if(usuario.getUsuario().equals(username)){
                existe=true;
                break;
            }
        }
        return existe;
    }*/
    
    /*public boolean CorreoRegistrado(String correo)
    {
         boolean existe=false;
        for (Usuario usuario : objUsuarios) {
            if(usuario.getCorreo().equals(correo)){
                existe=true;
                break;
            }
        }
        return existe;
    }*/
    
    private void Limpiar()
    {
        txtcontra.setText("********");
        txtcontra.setForeground(Color.gray);
        txtconfirmarcontra.setText("********");
        txtconfirmarcontra.setForeground(Color.gray);
        txtcorreo.setText("Ingrese una direccion de correo");
        txtcorreo.setForeground(Color.gray);
        txtnombre.setText("Ingrese su nombre");
        txtnombre.setForeground(Color.gray);
        txtusuario.setText("Ingrese su nombre de usuario");
        txtusuario.setForeground(Color.gray);
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
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Cuenta().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnVolver;
    private javax.swing.JPanel btncrear;
    private javax.swing.JPanel btncrear1;
    private javax.swing.JLabel confirmarcontra;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel cuadroimagen;
    private javax.swing.JLabel generarcontra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titulocc;
    private javax.swing.JLabel txtVolver;
    private javax.swing.JPasswordField txtconfirmarcontra;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JLabel txtcrear;
    private javax.swing.JLabel txtinicio;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
