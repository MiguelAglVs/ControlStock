package login;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import principal.*;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        myButton3 = new login.MyButton();
        txtContrasena = new login.MyPasswordField();
        txtUsuario = new login.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        myButton2 = new login.MyButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 252, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 59, 69));
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 270, 50));

        myButton3.setForeground(new java.awt.Color(251, 252, 253));
        myButton3.setText("Iniciar");
        myButton3.setBorderColor(new java.awt.Color(251, 252, 253));
        myButton3.setBorderPainted(false);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        // Agregar KeyListener a txtUsuario
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    myButton3ActionPerformed(null);
                }
            }
        });

        // Agregar KeyListener a txtContrasena
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    myButton3ActionPerformed(null);
                }
            }
        });
        jPanel1.add(myButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 350, 50));

        txtContrasena.setBackground(new java.awt.Color(251, 252, 253));
        txtContrasena.setForeground(java.awt.Color.gray);
        txtContrasena.setText("Contraseña");
        txtContrasena.setBorderColor(new java.awt.Color(209, 211, 225));
        txtContrasena.setCaretColor(new java.awt.Color(187, 187, 187));
        txtContrasena.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
        });
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContrasenaMousePressed(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 350, 50));

        txtUsuario.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario.setForeground(java.awt.Color.gray);
        txtUsuario.setText("Nombre");
        txtUsuario.setBorderColor(new java.awt.Color(209, 211, 225));
        txtUsuario.setCaretColor(new java.awt.Color(187, 187, 187));
        txtUsuario.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 350, 50));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 59, 69));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BIENVENIDOS (1).png"))); // NOI18N
        jLabel2.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        myButton2.setBackground(new java.awt.Color(251, 252, 253));
        myButton2.setForeground(new java.awt.Color(78, 115, 223));
        myButton2.setText("Contraseña olvidada");
        myButton2.setBorderColor(new java.awt.Color(251, 252, 253));
        myButton2.setBorderPainted(false);
        myButton2.setColor(new java.awt.Color(251, 252, 253));
        myButton2.setColorClick(new java.awt.Color(251, 252, 253));
        myButton2.setColorOver(new java.awt.Color(251, 252, 253));
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(myButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 350, 50));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 59, 69));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exittxt.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        exittxt.setForeground(new java.awt.Color(0, 0, 0));
        exittxt.setText(" X");
        exittxt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exittxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exittxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exittxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exittxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exittxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exittxtMouseExited(evt);
            }
        });
        exitBtn.add(exittxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 820, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        Recordar ventanaRecordar = new Recordar();
        ventanaRecordar.setVisible(true);
        ventanaRecordar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_myButton2ActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        String archivo = "usuarios.csv";
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar usuario y contraseña", "Oops! algo salio mal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean usuarioEncontrado = false;
            int intentos = 0; // variable contador de intentos
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                int id = Integer.parseInt(campos[0]);
                String usuarioArchivo = campos[1];
                String contrasenaArchivo = campos[2];
                String rol = campos[3];

                if (usuarioArchivo.equalsIgnoreCase(usuario)) {
                    usuarioEncontrado = true;
                    // Encriptar la contraseña ingresada por el usuario
                    String contrasenaEncriptada = null;
                    try {
                        MessageDigest md = MessageDigest.getInstance("SHA-256");
                        byte[] hash = md.digest(contrasena.getBytes());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : hash) {
                            sb.append(String.format("%02x", b));
                        }
                        contrasenaEncriptada = sb.toString();
                    } catch (NoSuchAlgorithmException e) {
                        System.out.println("Error al encriptar la contraseña: " + e.getMessage());
                        return;
                    }
                    if (contrasenaArchivo.equals(contrasenaEncriptada)) {
                        MenuPrincipalAdmin ventanaPrincipal = new MenuPrincipalAdmin();
                        ventanaPrincipal.setVisible(true);
                        ventanaPrincipal.setLocationRelativeTo(null);
                        this.setVisible(false);
                        return;
                    } else {
                        intentos++;
                    }
                }
            }
            if (!usuarioEncontrado) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Oops! algo salió mal", JOptionPane.ERROR_MESSAGE);
            } else if (intentos > 3) {
                JOptionPane.showMessageDialog(null, "Ha superado el número máximo de intentos. La aplicación se cerrará.", "Oops! algo salió mal", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Oops! algo salió mal", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }//GEN-LAST:event_myButton3ActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void exittxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exittxtMouseClicked

    private void exittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseEntered
        exitBtn.setBackground(Color.red);
        exittxt.setForeground(Color.white);
    }//GEN-LAST:event_exittxtMouseEntered

    private void exittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseExited
        exitBtn.setBackground(Color.white);
        exittxt.setForeground(Color.black);
    }//GEN-LAST:event_exittxtMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMousePressed

    }//GEN-LAST:event_txtContrasenaMousePressed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText().equals("Nombre")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("Contraseña");
            txtContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (String.valueOf(txtContrasena.getPassword()).equals(("Contraseña"))) {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Nombre");
            txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exittxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private login.MyButton myButton2;
    private login.MyButton myButton3;
    public login.MyPasswordField txtContrasena;
    public login.MyTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
