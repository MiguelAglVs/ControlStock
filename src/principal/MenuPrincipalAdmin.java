package principal;

import desplazable.Desface;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import clases.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Login;

public class MenuPrincipalAdmin extends javax.swing.JFrame {

    Desface desplace;
    private Timer timer;

    public MenuPrincipalAdmin() {
        desplace = new Desface();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        MenuPlegable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnInventario = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnPerfiles = new javax.swing.JLabel();
        Paginas = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnlInventario = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pnlAddProduct = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlVentas = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pnlPerfiles = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRol = new principal.MyComboBox();
        myButton1 = new principal.MyButton();
        txtUsuario = new principal.MyTextField();
        txtPalabra = new principal.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtPass = new principal.MyPasswordField();
        txtRepPass = new principal.MyPasswordField();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPlegable.setBackground(new java.awt.Color(78, 115, 223));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoG.png"))); // NOI18N
        jLabel2.setText("ControlStock");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, -1));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setIconTextGap(10);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setIconTextGap(20);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(59, 89, 152));
        btnHome.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnHome.setText("Inicio");
        btnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnHome.setIconTextGap(50);
        btnHome.setName(""); // NOI18N
        btnHome.setOpaque(true);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(78, 115, 223));
        btnInventario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnInventario.setIconTextGap(35);
        btnInventario.setOpaque(true);
        btnInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });

        btnAddProduct.setBackground(new java.awt.Color(78, 115, 223));
        btnAddProduct.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addproduct.png"))); // NOI18N
        btnAddProduct.setText("Nuevo producto");
        btnAddProduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduct.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAddProduct.setIconTextGap(20);
        btnAddProduct.setOpaque(true);
        btnAddProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductMouseClicked(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(78, 115, 223));
        btnVentas.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedor.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVentas.setIconTextGap(50);
        btnVentas.setOpaque(true);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });

        btnPerfiles.setBackground(new java.awt.Color(78, 115, 223));
        btnPerfiles.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnPerfiles.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfiles.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnPerfiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearcuenta.png"))); // NOI18N
        btnPerfiles.setText("Crear cuenta");
        btnPerfiles.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        btnPerfiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfiles.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPerfiles.setIconTextGap(30);
        btnPerfiles.setOpaque(true);
        btnPerfiles.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPerfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuPlegableLayout = new javax.swing.GroupLayout(MenuPlegable);
        MenuPlegable.setLayout(MenuPlegableLayout);
        MenuPlegableLayout.setHorizontalGroup(
            MenuPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MenuPlegableLayout.setVerticalGroup(
            MenuPlegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPlegableLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(MenuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, -1, -1));

        Paginas.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(251, 252, 253));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(78, 115, 223));
        jSeparator1.setForeground(new java.awt.Color(78, 115, 223));
        pnlHome.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 59, 69));
        jLabel8.setText("Dashboard");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlHome.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setForeground(new java.awt.Color(58, 59, 69));
        jLabel9.setText("Home  /");
        pnlHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Dashboard ");
        pnlHome.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Panel 1");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlHome.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 60));

        Paginas.add(pnlHome, "card2");

        pnlInventario.setBackground(new java.awt.Color(251, 252, 253));
        pnlInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Inventario");
        pnlInventario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jLabel21.setForeground(new java.awt.Color(58, 59, 69));
        jLabel21.setText("Home  /");
        pnlInventario.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(78, 115, 223));
        jSeparator5.setForeground(new java.awt.Color(78, 115, 223));
        pnlInventario.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 10));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(58, 59, 69));
        jLabel22.setText("Inventario");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlInventario.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Panel 2");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlInventario.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 60));

        Paginas.add(pnlInventario, "card3");

        pnlAddProduct.setBackground(new java.awt.Color(251, 252, 253));
        pnlAddProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Nuevo Producto ");
        pnlAddProduct.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        jLabel18.setForeground(new java.awt.Color(58, 59, 69));
        jLabel18.setText("Home  /");
        pnlAddProduct.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(78, 115, 223));
        jSeparator4.setForeground(new java.awt.Color(78, 115, 223));
        pnlAddProduct.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 10));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 59, 69));
        jLabel19.setText("Nuevo Producto");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlAddProduct.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Panel 3");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlAddProduct.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 60));

        Paginas.add(pnlAddProduct, "card4");

        pnlVentas.setBackground(new java.awt.Color(251, 252, 253));
        pnlVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Ventas ");
        pnlVentas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        jLabel15.setForeground(new java.awt.Color(58, 59, 69));
        jLabel15.setText("Home  /");
        pnlVentas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(78, 115, 223));
        jSeparator3.setForeground(new java.awt.Color(78, 115, 223));
        pnlVentas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 10));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 59, 69));
        jLabel16.setText("Ventas");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlVentas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Panel 4");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlVentas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 60));

        Paginas.add(pnlVentas, "card5");

        pnlPerfiles.setBackground(new java.awt.Color(251, 252, 253));
        pnlPerfiles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 59, 69));
        jLabel4.setText("Palabra clave:");
        pnlPerfiles.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(58, 59, 69));
        jLabel5.setText("Nombre:");
        pnlPerfiles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 59, 69));
        jLabel3.setText("Rol:");
        pnlPerfiles.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 59, 69));
        jLabel6.setText("Confirmar  contraseña:");
        pnlPerfiles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        txtRol.setBackground(new java.awt.Color(251, 252, 253));
        txtRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Vendedor" }));
        txtRol.setBorderColor(new java.awt.Color(209, 211, 225));
        txtRol.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        txtRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRolActionPerformed(evt);
            }
        });
        pnlPerfiles.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 530, 50));

        myButton1.setForeground(new java.awt.Color(251, 252, 253));
        myButton1.setText("Crear");
        myButton1.setBorderColor(new java.awt.Color(251, 252, 253));
        myButton1.setBorderPainted(false);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        pnlPerfiles.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 560, 50));

        txtUsuario.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario.setForeground(new java.awt.Color(58, 59, 69));
        txtUsuario.setBorderColor(new java.awt.Color(209, 211, 225));
        txtUsuario.setCaretColor(new java.awt.Color(187, 187, 187));
        txtUsuario.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlPerfiles.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 270, 50));

        txtPalabra.setBackground(new java.awt.Color(251, 252, 253));
        txtPalabra.setForeground(new java.awt.Color(58, 59, 69));
        txtPalabra.setBorderColor(new java.awt.Color(209, 211, 225));
        txtPalabra.setCaretColor(new java.awt.Color(187, 187, 187));
        txtPalabra.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        pnlPerfiles.add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 270, 50));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(58, 59, 69));
        jLabel7.setText("Contraseña:");
        pnlPerfiles.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Usuarios ");
        pnlPerfiles.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jLabel12.setForeground(new java.awt.Color(58, 59, 69));
        jLabel12.setText("Home  /");
        pnlPerfiles.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(78, 115, 223));
        jSeparator2.setForeground(new java.awt.Color(78, 115, 223));
        pnlPerfiles.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 59, 69));
        jLabel13.setText("Usuarios");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlPerfiles.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtPass.setBackground(new java.awt.Color(251, 252, 253));
        txtPass.setForeground(new java.awt.Color(58, 59, 69));
        txtPass.setBorderColor(new java.awt.Color(209, 211, 225));
        txtPass.setCaretColor(new java.awt.Color(187, 187, 187));
        txtPass.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlPerfiles.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 270, 50));

        txtRepPass.setBackground(new java.awt.Color(251, 252, 253));
        txtRepPass.setForeground(new java.awt.Color(58, 59, 69));
        txtRepPass.setBorderColor(new java.awt.Color(209, 211, 225));
        txtRepPass.setCaretColor(new java.awt.Color(187, 187, 187));
        txtRepPass.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlPerfiles.add(txtRepPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 270, 50));

        Paginas.add(pnlPerfiles, "card6");

        jPanel3.add(Paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 800, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -130, 10, 10);
        } else if (MenuPlegable.getX() == -130) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 10);
        }
        if (timer != null && timer.isRunning()) {
            timer.restart();
        } else {
            timer = new Timer(10000, (ActionEvent e) -> {
                if (MenuPlegable.getX() == 0) {
                    desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -130, 10, 10);
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Login loginWindow = new Login();
        loginWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        btnHome.setBackground(new java.awt.Color(59, 89, 152));
        pnlHome.setVisible(true);

        btnInventario.setBackground(new java.awt.Color(78, 115, 223));
        pnlInventario.setVisible(false);

        btnAddProduct.setBackground(new java.awt.Color(78, 115, 223));
        pnlAddProduct.setVisible(false);

        btnVentas.setBackground(new java.awt.Color(78, 115, 223));
        pnlVentas.setVisible(false);

        btnPerfiles.setBackground(new java.awt.Color(78, 115, 223));
        pnlPerfiles.setVisible(false);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        btnHome.setBackground(new java.awt.Color(78, 115, 223));
        pnlHome.setVisible(false);

        btnInventario.setBackground(new java.awt.Color(59, 89, 152));
        pnlInventario.setVisible(true);

        btnAddProduct.setBackground(new java.awt.Color(78, 115, 223));
        pnlAddProduct.setVisible(false);

        btnVentas.setBackground(new java.awt.Color(78, 115, 223));
        pnlVentas.setVisible(false);

        btnPerfiles.setBackground(new java.awt.Color(78, 115, 223));
        pnlPerfiles.setVisible(false);
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnAddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductMouseClicked
        btnHome.setBackground(new java.awt.Color(78, 115, 223));
        pnlHome.setVisible(false);

        btnInventario.setBackground(new java.awt.Color(78, 115, 223));
        pnlInventario.setVisible(false);

        btnAddProduct.setBackground(new java.awt.Color(59, 89, 152));
        pnlAddProduct.setVisible(true);

        btnVentas.setBackground(new java.awt.Color(78, 115, 223));
        pnlVentas.setVisible(false);

        btnPerfiles.setBackground(new java.awt.Color(78, 115, 223));
        pnlPerfiles.setVisible(false);
    }//GEN-LAST:event_btnAddProductMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        btnHome.setBackground(new java.awt.Color(78, 115, 223));
        pnlHome.setVisible(false);

        btnInventario.setBackground(new java.awt.Color(78, 115, 223));
        pnlInventario.setVisible(false);

        btnAddProduct.setBackground(new java.awt.Color(78, 115, 223));
        pnlAddProduct.setVisible(false);

        btnVentas.setBackground(new java.awt.Color(59, 89, 152));
        pnlVentas.setVisible(true);

        btnPerfiles.setBackground(new java.awt.Color(78, 115, 223));
        pnlPerfiles.setVisible(false);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnPerfilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilesMouseClicked
        btnHome.setBackground(new java.awt.Color(78, 115, 223));
        pnlHome.setVisible(false);

        btnInventario.setBackground(new java.awt.Color(78, 115, 223));
        pnlInventario.setVisible(false);

        btnAddProduct.setBackground(new java.awt.Color(78, 115, 223));
        pnlAddProduct.setVisible(false);

        btnVentas.setBackground(new java.awt.Color(78, 115, 223));
        pnlVentas.setVisible(false);

        btnPerfiles.setBackground(new java.awt.Color(59, 89, 152));
        pnlPerfiles.setVisible(true);
    }//GEN-LAST:event_btnPerfilesMouseClicked

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        String usuario = txtUsuario.getText();
        String palabra = txtPalabra.getText();
        String contrasena = new String(txtPass.getPassword());
        String repContrasena = new String(txtRepPass.getPassword());
        String rol = (String) txtRol.getSelectedItem();

        // Encriptar la contraseña
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

        if (usuario.isEmpty() || palabra.isEmpty() || contrasena.isEmpty() || repContrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!contrasena.equals(repContrasena)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario nuevoUsuario = new Usuario(0, usuario, contrasenaEncriptada, palabra, rol);
        GestorArchivo gestorArchivo = new GestorArchivo("usuarios.csv");
        try {
            gestorArchivo.escribirUsuario(nuevoUsuario);
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "Usuario registrado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

        txtUsuario.setText("");
        txtPalabra.setText("");
        txtPass.setText("");
        txtRepPass.setText("");
        txtRol.setSelectedIndex(0);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRolActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel Paginas;
    private javax.swing.JLabel btnAddProduct;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnInventario;
    private javax.swing.JLabel btnPerfiles;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private principal.MyButton myButton1;
    private javax.swing.JPanel pnlAddProduct;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlPerfiles;
    private javax.swing.JPanel pnlVentas;
    private principal.MyTextField txtPalabra;
    private principal.MyPasswordField txtPass;
    private principal.MyPasswordField txtRepPass;
    private principal.MyComboBox txtRol;
    private principal.MyTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
