
package proyectoboutique;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.SQL_Usuarios;
import logica.Usuario;
import logica.hash;

public class InicioSesion extends javax.swing.JFrame {
    
    
    public InicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        CuadroImagen = new javax.swing.JLabel();
        TituloInicioSesion = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        btniIngresar = new javax.swing.JPanel();
        txtentrar = new javax.swing.JLabel();
        btncrearcuenta = new javax.swing.JPanel();
        txtccuenta = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        txtVolver = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));

        CuadroImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CuadroImagen.setText("IMAGEN");

        TituloInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInicioSesion.setText("INICIAR SESION");

        Nombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Nombre.setText("NOMBRE DE USUARIO");

        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese el nombre de usuario");
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Contraseña.setText("CONTRASEÑA");

        txtentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtentrar.setText("INGRESAR");
        txtentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtentrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btniIngresarLayout = new javax.swing.GroupLayout(btniIngresar);
        btniIngresar.setLayout(btniIngresarLayout);
        btniIngresarLayout.setHorizontalGroup(
            btniIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtentrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btniIngresarLayout.setVerticalGroup(
            btniIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtccuenta.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        txtccuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtccuenta.setText("Crear cuenta");
        txtccuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtccuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtccuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btncrearcuentaLayout = new javax.swing.GroupLayout(btncrearcuenta);
        btncrearcuenta.setLayout(btncrearcuentaLayout);
        btncrearcuentaLayout.setHorizontalGroup(
            btncrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtccuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btncrearcuentaLayout.setVerticalGroup(
            btncrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtccuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });

        ver.setText("Ver");
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        ocultar.setText("Ocultar");
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        txtVolver.setText("< Volver al menu");
        txtVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CuadroImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(ver))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btncrearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btniIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(txtVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Nombre)
                        .addGap(7, 7, 7)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Contraseña)
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(ver))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(ocultar)))))
                .addGap(7, 7, 7)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncrearcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btniIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
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

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if(txtusuario.getText().contains("Ingrese el nombre de usuario"))
        {
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);   
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        //Se puso por ERROR :b
    }//GEN-LAST:event_txtcontraActionPerformed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(String.valueOf(txtcontra.getPassword()).contains("********"))
        {
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
        if(txtusuario.getText().isEmpty())
        {
            txtusuario.setText("Ingrese el nombre de usuario");
            txtusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtccuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtccuentaMouseClicked
        dispose();
        Crear_Cuenta objcrear = new Crear_Cuenta();
        objcrear.setVisible(true);
        MenuPrincipal.frmLog = null;
    }//GEN-LAST:event_txtccuentaMouseClicked

    private void txtentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtentrarMouseClicked
        SQL_Usuarios modSql = new SQL_Usuarios();
        Usuario mod = new Usuario();
        Date date = new Date();
        DateFormat fecha_hora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String contra = new String(txtcontra.getPassword());
        if(!(txtusuario.getText().equals("")) && !(contra.equals("")))
        {
            mod.setUsuario(txtusuario.getText());
            mod.setContra(hash.sha1(contra));
            mod.setLast_session(fecha_hora.format(date));
            if(modSql.Login(mod))
            {
                MenuPrincipal.frmLog = null;
                this.dispose();
                MenuPrincipal menu = new MenuPrincipal(mod);
                menu.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Revise los datos que escribió en los campos de información sean correctos, intente nuevamente", "Inicio de sesion", JOptionPane.CANCEL_OPTION);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar sus datos en los campos de información", "Inicio de sesion", JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_txtentrarMouseClicked

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

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        dispose();
        MenuPrincipal.frmLog = null;
    }//GEN-LAST:event_txtVolverMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal.frmLog = null;
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel CuadroImagen;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel TituloInicioSesion;
    private javax.swing.JPanel btncrearcuenta;
    private javax.swing.JPanel btniIngresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txtVolver;
    private javax.swing.JLabel txtccuenta;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JLabel txtentrar;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
