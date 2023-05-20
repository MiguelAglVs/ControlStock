package principal;

import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import clases.*;
import login.Login;

import desplazable.Desface;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MenuPrincipalAdmin extends javax.swing.JFrame {

    Desface desplace;
    private Timer timer;

    public MenuPrincipalAdmin() {
        initComponents();
        infotable();
    }

    private void infotable() {
        JSONParser parser = new JSONParser();

        try {
            Object data = parser.parse(new FileReader("db/inventario.json"));

            Object[][] array = null;
            JSONObject jsonObject = (JSONObject) data;

            JSONArray productos = (JSONArray) jsonObject.get("Productos");

            int cont = 0;

            // Contar la cantidad de productos visibles
            long cantidadProductosVisibles = productos.stream()
                    .filter(p -> "visible".equals(((JSONObject) p).get("estado")))
                    .count();

            array = new Object[(int) cantidadProductosVisibles][4];

            for (Object p : productos) {
                JSONObject producto = (JSONObject) p;

                String estado = (String) producto.get("estado");

                // Mostrar solo los productos con estado "visible"
                if ("visible".equals(estado)) {
                    long id = (long) producto.get("id");
                    String nombre = (String) producto.get("nombre");
                    long cantidad = (long) producto.get("cantidad");
                    String ref = (String) producto.get("ref");

                    array[cont][0] = id;
                    array[cont][1] = nombre;
                    array[cont][2] = ref;
                    array[cont][3] = cantidad;

                    cont++;
                }
            }

            myTableP.setModel(new javax.swing.table.DefaultTableModel(
                    array,
                    new String[]{
                        "Id", "Nombre", "Referencia", "Cantidad"
                    }
            ));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
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
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MenuPlegable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        btnPerfiles = new javax.swing.JLabel();
        Paginas = new javax.swing.JPanel();
        pnlInventario = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        myTableP = new principal.MyTable();
        btneditar = new principal.MyButton();
        btneliminar = new principal.MyButton();
        btnrecuperar = new principal.MyButton();
        pnlAddProduct = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombretxt = new principal.MyTextField();
        jLabel9 = new javax.swing.JLabel();
        reftxt = new principal.MyTextField();
        jLabel10 = new javax.swing.JLabel();
        addProduct = new principal.MyButton();
        cantidadtxt = new principal.MyTextField();
        cantidadmaxtxt = new principal.MyTextField();
        jLabel23 = new javax.swing.JLabel();
        cantidadmintxt = new principal.MyTextField();
        jLabel24 = new javax.swing.JLabel();
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
        creraUsu = new principal.MyButton();
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

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPlegable.setBackground(new java.awt.Color(78, 115, 223));
        MenuPlegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        MenuPlegable.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

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
        MenuPlegable.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 50));

        btnInventario.setBackground(new java.awt.Color(59, 89, 152));
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
        MenuPlegable.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 180, 50));

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
        MenuPlegable.add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 180, 50));

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
        MenuPlegable.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 158, 180, 50));

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
        MenuPlegable.add(btnPerfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 209, 180, 50));

        jPanel3.add(MenuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, -1, -1));

        Paginas.setLayout(new java.awt.CardLayout());

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

        myTableP.setAutoCreateRowSorter(true);
        myTableP.setBackground(new java.awt.Color(255, 255, 255));
        myTableP.setForeground(new java.awt.Color(0, 0, 0));
        myTableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(myTableP);

        pnlInventario.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 310));

        btneditar.setForeground(new java.awt.Color(255, 255, 255));
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        pnlInventario.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 50));

        btneliminar.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.setBorderColor(new java.awt.Color(255, 51, 51));
        btneliminar.setColor(new java.awt.Color(255, 51, 51));
        btneliminar.setColorClick(new java.awt.Color(255, 0, 0));
        btneliminar.setColorOver(new java.awt.Color(204, 0, 0));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        pnlInventario.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 240, 50));

        btnrecuperar.setBackground(new java.awt.Color(0, 204, 0));
        btnrecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnrecuperar.setText("Recuperar");
        btnrecuperar.setBorderColor(new java.awt.Color(0, 204, 0));
        btnrecuperar.setColor(new java.awt.Color(0, 204, 0));
        btnrecuperar.setColorClick(new java.awt.Color(0, 153, 0));
        btnrecuperar.setColorOver(new java.awt.Color(0, 153, 0));
        btnrecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecuperarActionPerformed(evt);
            }
        });
        pnlInventario.add(btnrecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 240, 50));

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

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 59, 69));
        jLabel8.setText("Nombre:");
        pnlAddProduct.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        nombretxt.setBackground(new java.awt.Color(251, 252, 253));
        nombretxt.setForeground(new java.awt.Color(58, 59, 69));
        nombretxt.setBorderColor(new java.awt.Color(209, 211, 225));
        nombretxt.setCaretColor(new java.awt.Color(187, 187, 187));
        nombretxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        pnlAddProduct.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 270, 50));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 59, 69));
        jLabel9.setText("Cantidad maxima:");
        pnlAddProduct.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        reftxt.setBackground(new java.awt.Color(251, 252, 253));
        reftxt.setForeground(new java.awt.Color(58, 59, 69));
        reftxt.setBorderColor(new java.awt.Color(209, 211, 225));
        reftxt.setCaretColor(new java.awt.Color(187, 187, 187));
        reftxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        reftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reftxtActionPerformed(evt);
            }
        });
        pnlAddProduct.add(reftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 270, 50));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 59, 69));
        jLabel10.setText("Referencia:");
        pnlAddProduct.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        addProduct.setForeground(new java.awt.Color(251, 252, 253));
        addProduct.setText("Agregar");
        addProduct.setBorderColor(new java.awt.Color(251, 252, 253));
        addProduct.setBorderPainted(false);
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        pnlAddProduct.add(addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 270, 50));

        cantidadtxt.setBackground(new java.awt.Color(251, 252, 253));
        cantidadtxt.setForeground(new java.awt.Color(58, 59, 69));
        cantidadtxt.setBorderColor(new java.awt.Color(209, 211, 225));
        cantidadtxt.setCaretColor(new java.awt.Color(187, 187, 187));
        cantidadtxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        cantidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadtxtActionPerformed(evt);
            }
        });
        pnlAddProduct.add(cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 270, 50));
        pnlAddProduct.add(cantidadmaxtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 270, 50));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(58, 59, 69));
        jLabel23.setText("Cantidad:");
        pnlAddProduct.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));
        pnlAddProduct.add(cantidadmintxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 270, 50));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(58, 59, 69));
        jLabel24.setText("Cantidad minima:");
        pnlAddProduct.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

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

        creraUsu.setForeground(new java.awt.Color(251, 252, 253));
        creraUsu.setText("Crear");
        creraUsu.setBorderColor(new java.awt.Color(251, 252, 253));
        creraUsu.setBorderPainted(false);
        creraUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creraUsuActionPerformed(evt);
            }
        });
        pnlPerfiles.add(creraUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 560, 50));

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

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
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

    private void creraUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creraUsuActionPerformed
        String usuario = txtUsuario.getText();
        String palabra = txtPalabra.getText();
        String contrasena = new String(txtPass.getPassword());
        String repContrasena = new String(txtRepPass.getPassword());
        String rol = (String) txtRol.getSelectedItem();

        String nombreUsuario = txtUsuario.getText();
        GestorArchivo gestorArchivo = new GestorArchivo("db/usuarios.csv");

        try {
            // Verificar si el usuario ya existe
            if (gestorArchivo.existeUsuario(nombreUsuario)) {
                JOptionPane.showMessageDialog(this, "El nombre de usuario ya está en uso", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

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

        // Validar la contraseña
        if (contrasena.length() < 6 || !contrasena.matches(".*[A-Z].*") || !contrasena.matches(".*[a-z].*") || !contrasena.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "La contraseña no cumple con los requisitos:\n-Tener al menos 6 caracteres.\n-Incluir una letra mayúscula.\n-Incluiruna letra minúscula\n-Incluir un dígito numérico.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario nuevoUsuario = new Usuario(0, usuario, contrasenaEncriptada, palabra, rol);
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
        // Método para validar la contraseña
    }//GEN-LAST:event_creraUsuActionPerformed

    private boolean validarContrasena(String contrasena) {
        // Verificar longitud mínima de 6 caracteres
        if (contrasena.length() < 6) {
            return false;
        }

        // Verificar si contiene al menos una letra mayúscula
        if (!contrasena.matches(".*[A-Z].*")) {
            return false;
        }

        // Verificar si contiene al menos una letra minúscula
        if (!contrasena.matches(".*[a-z].*")) {
            return false;
        }

        // Verificar si contiene al menos un dígito numérico
        if (!contrasena.matches(".*\\d.*")) {
            return false;
        }

        // Verificar si contiene al menos un carácter especial (opcional)
        if (!contrasena.matches(".*[!@#$%^&*()-_=+{};:,<.>].*")) {
            return false;
        }

        return true;
    }

    private void txtRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRolActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void reftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reftxtActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        String nombre = nombretxt.getText();
        String cantidadText = cantidadtxt.getText();
        String cantidadminText = cantidadmintxt.getText();
        String cantidadmaxText = cantidadmaxtxt.getText();
        String referencia = reftxt.getText();

        JSONParser parser = new JSONParser();

        if (nombre.isEmpty() || cantidadText.isEmpty() || referencia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                long cantidad;
                long cantidadmin;
                long cantidadmax;

                if (cantidadText.equals("")) {
                    cantidad = 0; // Establecer un valor predeterminado si el campo está vacío
                } else {
                    cantidad = Long.parseLong(cantidadText);
                }

                if (cantidadminText.equals("")) {
                    cantidadmin = 0; // Establecer un valor predeterminado si el campo está vacío
                } else {
                    cantidadmin = Long.parseLong(cantidadminText);
                }

                if (cantidadmaxText.equals("")) {
                    cantidadmax = 0; // Establecer un valor predeterminado si el campo está vacío
                } else {
                    cantidadmax = Long.parseLong(cantidadmaxText);
                }

                File file = new File("db/inventario.json");
                JSONObject jsonObject;
                JSONArray productos;

                if (file.exists() && file.length() > 0) {
                    // Leer el archivo JSON existente
                    Object data = parser.parse(new FileReader(file));
                    jsonObject = (JSONObject) data;
                    productos = (JSONArray) jsonObject.get("Productos");
                } else {
                    // Crear un nuevo archivo JSON
                    jsonObject = new JSONObject();
                    productos = new JSONArray();
                }

                // Generar un nuevo ID para el producto
                long nuevoId = generarNuevoId(productos);

                // Crear un nuevo objeto JSON para el producto
                JSONObject nuevoProducto = new JSONObject();
                nuevoProducto.put("id", nuevoId);
                nuevoProducto.put("nombre", nombre);
                nuevoProducto.put("cantidad", cantidad);
                nuevoProducto.put("cantidadmin", cantidadmin);
                nuevoProducto.put("cantidadmax", cantidadmax);
                nuevoProducto.put("ref", referencia);
                nuevoProducto.put("estado", "visible");

                // Agregar el nuevo producto a la lista de productos
                productos.add(nuevoProducto);

                // Actualizar el objeto JSON con la nueva lista de productos
                jsonObject.put("Productos", productos);

                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
                fileWriter.close();

                infotable();

                nombretxt.setText("");
                cantidadtxt.setText("");
                reftxt.setText("");
                cantidadmintxt.setText("");
                cantidadmaxtxt.setText("");
                JOptionPane.showMessageDialog(null, "Producto agregado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cantidad, cantidad mínima y cantidad máxima deben ser valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private long generarNuevoId(JSONArray productos) {
        // Encontrar el ID más alto actualmente en uso
        long maxId = 0;
        for (Object p : productos) {
            JSONObject producto = (JSONObject) p;
            long id = (long) producto.get("id");
            if (id > maxId) {
                maxId = id;
            }
        }

        // Generar un nuevo ID sumando 1 al ID más alto encontrado
        return maxId + 1;
    }//GEN-LAST:event_addProductActionPerformed

    private void cantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadtxtActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = myTableP.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener los valores de la fila seleccionada
            String idString = myTableP.getValueAt(filaSeleccionada, 0).toString();
            String nombre = myTableP.getValueAt(filaSeleccionada, 1).toString();
            String ref = myTableP.getValueAt(filaSeleccionada, 2).toString();
            String cantidadString = myTableP.getValueAt(filaSeleccionada, 3).toString();

            // Validar si el ID y la cantidad son números válidos
            try {
                long cantidad = Long.parseLong(cantidadString);

                // Verificar si se intenta editar el ID
                if (!idString.equals(Long.toString(filaSeleccionada))) {
                    // Actualizar el archivo JSON con los nuevos valores
                    actualizarJSON(filaSeleccionada, nombre, ref, cantidad);
                    JOptionPane.showMessageDialog(null, "La edición de los productos fue exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede editar el ID en la fila " + (filaSeleccionada + 1));
                }
            } catch (NumberFormatException ex) {
                // Manejar el caso cuando la cantidad no es un número válido
                System.out.println("Error en la fila " + filaSeleccionada + ": La cantidad no es un número válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para editar.");
        }

        myTableP.clearSelection();
    }

    private void actualizarJSON(int fila, String nombre, String ref, long cantidad) {
        JSONArray productos = new JSONArray();

        // Recorrer todas las filas de la tabla
        for (int i = 0; i < myTableP.getRowCount(); i++) {
            // Obtener los valores de la tabla
            String filaIdString = myTableP.getValueAt(i, 0).toString();
            String filaNombre = myTableP.getValueAt(i, 1).toString();
            String filaRef = myTableP.getValueAt(i, 2).toString();
            String filaCantidadString = myTableP.getValueAt(i, 3).toString();
            JSONObject datosJSON = obtenerDatosDesdeJSON(i);

            // Validar si el ID y la cantidad son números válidos
            try {
                long filaId = Long.parseLong(filaIdString);
                long filaCantidad = Long.parseLong(filaCantidadString);
                String estado = datosJSON.get("estado").toString(); // Obtener el estado desde el JSON
                long cantidadMin = Long.parseLong(datosJSON.get("cantidadmin").toString()); // Obtener la cantidad mínima desde el JSON
                long cantidadMax = Long.parseLong(datosJSON.get("cantidadmax").toString()); // Obtener la cantidad máxima desde el JSON

                // Si es la fila que se está editando y el estado actual es "oculto", cambiarlo a "visible"
                if (i == fila && "oculto".equals(estado)) {
                    estado = "visible";
                }

                // Crear un objeto JSON para el producto
                JSONObject producto = new JSONObject();
                producto.put("id", filaId);
                producto.put("nombre", filaNombre);
                producto.put("ref", filaRef);
                producto.put("cantidad", filaCantidad);
                producto.put("estado", estado); // Agregar el estado al objeto JSON
                producto.put("cantidadmin", cantidadMin); // Agregar la cantidad mínima al objeto JSON
                producto.put("cantidadmax", cantidadMax); // Agregar la cantidad máxima al objeto JSON

                // Agregar el producto al array de productos
                productos.add(producto);
            } catch (NumberFormatException ex) {
                // Manejar el caso cuando el ID o la cantidad no son números válidos
                System.out.println("Error en la fila " + i + ": El ID o la cantidad no son números válidos");
            }
        }

        // Crear un objeto JSON que contiene el array de productos
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Productos", productos);

        // Escribir el objeto JSON en el archivo
        try (FileWriter file = new FileWriter("db/inventario.json")) {
            file.write(jsonObject.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private JSONObject obtenerDatosDesdeJSON(int fila) {
        // Leer el archivo JSON y obtener los datos del producto en la fila específica
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("db/inventario.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray productos = (JSONArray) jsonObject.get("Productos");
            JSONObject producto = (JSONObject) productos.get(fila);

            return producto;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null; // Valor predeterminado si no se puede obtener el objeto JSON
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = myTableP.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener el ID y el nombre del producto seleccionado
            String idString = myTableP.getValueAt(filaSeleccionada, 0).toString();
            String nombre = myTableP.getValueAt(filaSeleccionada, 1).toString();

            // Pedir confirmación al usuario
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el producto " + nombre + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                // Verificar si el ID es un número válido
                try {
                    long id = Long.parseLong(idString);

                    // Leer el archivo JSON
                    JSONParser parser = new JSONParser();
                    try (FileReader reader = new FileReader("db/inventario.json")) {
                        Object data = parser.parse(reader);
                        JSONObject jsonObject = (JSONObject) data;
                        JSONArray productos = (JSONArray) jsonObject.get("Productos");

                        // Buscar el producto por su ID
                        for (Object p : productos) {
                            JSONObject producto = (JSONObject) p;
                            long productId = (long) producto.get("id");

                            if (productId == id) {
                                // Actualizar el estado del producto a "oculto"
                                producto.put("estado", "oculto");
                                break;
                            }
                        }

                        // Actualizar el objeto JSON con la lista de productos modificada
                        jsonObject.put("Productos", productos);

                        // Escribir los cambios de vuelta al archivo JSON
                        try (FileWriter file = new FileWriter("db/inventario.json")) {
                            file.write(jsonObject.toJSONString());
                            file.flush();
                        }

                        // Actualizar la tabla con la nueva información
                        infotable();

                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException | ParseException e) {
                        e.printStackTrace();
                    }
                } catch (NumberFormatException ex) {
                    // Manejar el caso cuando el ID no es un número válido
                    System.out.println("Error en la fila " + filaSeleccionada + ": El ID no es un número válido");
                }
            } else {
                // El usuario canceló el cambio de estado
                JOptionPane.showMessageDialog(null, "Eliminacion cancelada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione el producto a eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        myTableP.clearSelection();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnrecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecuperarActionPerformed
        JSONParser parser = new JSONParser();

        try {
            Object data = parser.parse(new FileReader("db/inventario.json"));

            Object[][] array = null;
            JSONObject jsonObject = (JSONObject) data;

            JSONArray productos = (JSONArray) jsonObject.get("Productos");

            int cont = 0;

            // Contar la cantidad de productos visibles
            long cantidadProductosVisibles = productos.stream()
                    .filter(p -> "oculto".equals(((JSONObject) p).get("estado")))
                    .count();

            array = new Object[(int) cantidadProductosVisibles][4];

            for (Object p : productos) {
                JSONObject producto = (JSONObject) p;

                String estado = (String) producto.get("estado");

                // Mostrar solo los productos con estado "visible"
                if ("oculto".equals(estado)) {
                    long id = (long) producto.get("id");
                    String nombre = (String) producto.get("nombre");
                    long cantidad = (long) producto.get("cantidad");
                    String ref = (String) producto.get("ref");

                    array[cont][0] = id;
                    array[cont][1] = nombre;
                    array[cont][2] = ref;
                    array[cont][3] = cantidad;

                    cont++;
                }
            }

            myTableP.setModel(new javax.swing.table.DefaultTableModel(
                    array,
                    new String[]{
                        "Id", "Nombre", "Referencia", "Cantidad"
                    }
            ));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnrecuperarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel Paginas;
    private principal.MyButton addProduct;
    private javax.swing.JLabel btnAddProduct;
    private javax.swing.JLabel btnInventario;
    private javax.swing.JLabel btnPerfiles;
    private javax.swing.JLabel btnVentas;
    private principal.MyButton btneditar;
    private principal.MyButton btneliminar;
    private principal.MyButton btnrecuperar;
    private principal.MyTextField cantidadmaxtxt;
    private principal.MyTextField cantidadmintxt;
    private principal.MyTextField cantidadtxt;
    private principal.MyButton creraUsu;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private principal.MyTable myTableP;
    private principal.MyTextField nombretxt;
    private javax.swing.JPanel pnlAddProduct;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlPerfiles;
    private javax.swing.JPanel pnlVentas;
    private principal.MyTextField reftxt;
    private principal.MyTextField txtPalabra;
    private principal.MyPasswordField txtPass;
    private principal.MyPasswordField txtRepPass;
    private principal.MyComboBox txtRol;
    private principal.MyTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
