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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
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
        historialtable();
        cargarDatosEnComboBox();
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

    private void historialtable() {
        JSONParser parser = new JSONParser();

        try {
            Object data = parser.parse(new FileReader("db/historial_ventas.json"));

            Object[][] array = null;
            JSONObject jsonObject = (JSONObject) data;

            JSONArray ventas = (JSONArray) jsonObject.get("Ventas");

            int cont = 0;
            array = new Object[ventas.size()][3];

            for (Object v : ventas) {
                JSONObject venta = (JSONObject) v;

                String productoNombre = (String) venta.get("productoNombre");
                long cantidadVendida = (long) venta.get("cantidadVendida");
                String fechaVenta = (String) venta.get("fechaVenta");

                array[cont][0] = productoNombre;
                array[cont][1] = cantidadVendida;
                array[cont][2] = fechaVenta;

                cont++;
            }

            myTableH.setModel(new javax.swing.table.DefaultTableModel(
                    array,
                    new String[]{
                        "Producto", "Cantidad Vendida", "Fecha Venta"
                    }
            ));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void cargarDatosEnComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Seleccionar"); // Agrega la opción "Seleccionar" al modelo

        JSONParser parser = new JSONParser();

        try {
            Object data = parser.parse(new FileReader("db/inventario.json"));
            JSONObject jsonObject = (JSONObject) data;
            JSONArray productos = (JSONArray) jsonObject.get("Productos");

            for (Object p : productos) {
                JSONObject producto = (JSONObject) p;
                String estado = (String) producto.get("estado");

                // Mostrar solo los productos con estado "visible"
                if ("visible".equals(estado)) {
                    long id = (long) producto.get("id");
                    String nombre = (String) producto.get("nombre");
                    String item = id + " - " + nombre;
                    model.addElement(item);
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Porductotxt.setModel(model);
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
        Porductotxt = new principal.ComboBoxP();
        myButton1 = new principal.MyButton();
        txtCantidad = new principal.MyTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        myTableH = new principal.MyTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btneliminar1 = new principal.MyButton();
        btneliminar2 = new principal.MyButton();
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
        btneditar.setToolTipText("Edirae producto seleccionado (Tambien recupera el elemento seleccionado en la papelera)");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        pnlInventario.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 50));

        btneliminar.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.setToolTipText("Envia el producto seleccionado a la papelera");
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

        btnrecuperar.setBackground(new java.awt.Color(153, 153, 153));
        btnrecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnrecuperar.setText("Papelera");
        btnrecuperar.setToolTipText("Ver productos en la papelera");
        btnrecuperar.setBorderColor(new java.awt.Color(153, 153, 153));
        btnrecuperar.setColor(new java.awt.Color(153, 153, 153));
        btnrecuperar.setColorClick(new java.awt.Color(153, 153, 153));
        btnrecuperar.setColorOver(new java.awt.Color(102, 102, 102));
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
        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    addProductActionPerformed(null);
                }
            }
        });
        cantidadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    addProductActionPerformed(null);
                }
            }
        });
        cantidadmintxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    addProductActionPerformed(null);
                }
            }
        });
        cantidadmaxtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    addProductActionPerformed(null);
                }
            }
        });
        reftxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    addProductActionPerformed(null);
                }
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

        cantidadmaxtxt.setBackground(new java.awt.Color(251, 252, 253));
        cantidadmaxtxt.setForeground(new java.awt.Color(58, 59, 69));
        cantidadmaxtxt.setBorderColor(new java.awt.Color(209, 211, 225));
        cantidadmaxtxt.setCaretColor(new java.awt.Color(187, 187, 187));
        cantidadmaxtxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlAddProduct.add(cantidadmaxtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 270, 50));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(58, 59, 69));
        jLabel23.setText("Cantidad:");
        pnlAddProduct.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        cantidadmintxt.setBackground(new java.awt.Color(251, 252, 253));
        cantidadmintxt.setForeground(new java.awt.Color(58, 59, 69));
        cantidadmintxt.setBorderColor(new java.awt.Color(209, 211, 225));
        cantidadmintxt.setCaretColor(new java.awt.Color(187, 187, 187));
        cantidadmintxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
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

        Porductotxt.setBackground(new java.awt.Color(251, 252, 253));
        Porductotxt.setForeground(new java.awt.Color(209, 211, 225));
        Porductotxt.setBorderColor(new java.awt.Color(209, 211, 225));
        Porductotxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlVentas.add(Porductotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 270, 50));

        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Vender");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    myButton1ActionPerformed(null);
                }
            }
        });
        pnlVentas.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 270, 50));

        txtCantidad.setBackground(new java.awt.Color(251, 252, 253));
        txtCantidad.setForeground(new java.awt.Color(58, 59, 69));
        txtCantidad.setBorderColor(new java.awt.Color(209, 211, 225));
        txtCantidad.setCaretColor(new java.awt.Color(187, 187, 187));
        txtCantidad.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlVentas.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 270, 50));

        myTableH.setAutoCreateRowSorter(true);
        myTableH.setBackground(new java.awt.Color(255, 255, 255));
        myTableH.setForeground(new java.awt.Color(0, 0, 0));
        myTableH.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(myTableH);

        pnlVentas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 360));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(58, 59, 69));
        jLabel25.setText("Cantidad:");
        pnlVentas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(58, 59, 69));
        jLabel26.setText("Producto:");
        pnlVentas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        btneliminar1.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar1.setText("Eliminar ultimo");
        btneliminar1.setToolTipText("Envia el producto seleccionado a la papelera");
        btneliminar1.setBorderColor(new java.awt.Color(255, 51, 51));
        btneliminar1.setColor(new java.awt.Color(255, 51, 51));
        btneliminar1.setColorClick(new java.awt.Color(255, 0, 0));
        btneliminar1.setColorOver(new java.awt.Color(204, 0, 0));
        btneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar1ActionPerformed(evt);
            }
        });
        pnlVentas.add(btneliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 270, 50));

        btneliminar2.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar2.setText("Limpiar historial");
        btneliminar2.setToolTipText("Envia el producto seleccionado a la papelera");
        btneliminar2.setBorderColor(new java.awt.Color(255, 51, 51));
        btneliminar2.setColor(new java.awt.Color(255, 51, 51));
        btneliminar2.setColorClick(new java.awt.Color(255, 0, 0));
        btneliminar2.setColorOver(new java.awt.Color(204, 0, 0));
        btneliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar2ActionPerformed(evt);
            }
        });
        pnlVentas.add(btneliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 270, 50));

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
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    creraUsuActionPerformed(null);
                }
            }
        });
        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    creraUsuActionPerformed(null);
                }
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    creraUsuActionPerformed(null);
                }
            }
        });
        txtRepPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    creraUsuActionPerformed(null);
                }
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
                cargarDatosEnComboBox();

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
            // Obtener el ID y el nombre del producto seleccionado
            String idString = myTableP.getValueAt(filaSeleccionada, 0).toString();
            String nombre = myTableP.getValueAt(filaSeleccionada, 1).toString();

            // Pedir confirmación al usuario
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de editar el producto " + nombre + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
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
                                // Actualizar el estado del producto a "visible" si está en "oculto"
                                String estado = (String) producto.get("estado");
                                if (estado.equals("oculto")) {
                                    producto.put("estado", "visible");
                                }
                                // Actualizar los datos del producto con los valores ingresados en la tabla
                                String nuevoNombre = myTableP.getValueAt(filaSeleccionada, 1).toString();
                                String nuevaReferencia = myTableP.getValueAt(filaSeleccionada, 2).toString();
                                long nuevaCantidad = Long.parseLong(myTableP.getValueAt(filaSeleccionada, 3).toString());
                                producto.put("nombre", nuevoNombre);
                                producto.put("ref", nuevaReferencia);
                                producto.put("cantidad", nuevaCantidad);

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

                        JOptionPane.showMessageDialog(null, "Producto editado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException | ParseException e) {
                        e.printStackTrace();
                    }
                } catch (NumberFormatException ex) {
                    // Manejar el caso cuando el ID no es un número válido
                    System.out.println("Error en la fila " + filaSeleccionada + ": El ID no es un número válido");
                }
            } else {
                // El usuario canceló la edición
                JOptionPane.showMessageDialog(null, "Edición cancelada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione el producto a editar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        myTableP.clearSelection();
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

            if (cantidadProductosVisibles == 0) {
                // No hay productos ocultos, llamar a la función infotable()
                infotable();
                return;
            }

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

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        String file = "db/inventario.json";
        String ventasFile = "db/historial_ventas.json"; // Ruta del archivo de historial de ventas

        String selectedItem = (String) Porductotxt.getSelectedItem();
        String cantidad = txtCantidad.getText();
        String[] parts = selectedItem.split(" - ");

        if (parts.length == 2 && !cantidad.isEmpty()) {
            String id = parts[0];
            String nombreProducto = parts[1];

            try {
                // Leer el archivo JSON del inventario
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(file));

                // Obtener el array de productos
                JSONArray productos = (JSONArray) jsonObject.get("Productos");

                // Buscar el objeto correspondiente al ID seleccionado
                for (Object obj : productos) {
                    JSONObject producto = (JSONObject) obj;
                    String productoId = producto.get("id").toString();
                    if (productoId.equals(id)) {
                        // Obtener la cantidad actual y restar la cantidad ingresada
                        long cantidadActual = (long) producto.get("cantidad");
                        long cantidadRestante = cantidadActual - Long.parseLong(cantidad);

                        // Verificar si la cantidad restante es mayor o igual a 0
                        if (cantidadRestante >= 0) {
                            // Actualizar la cantidad en el objeto
                            producto.put("cantidad", cantidadRestante);

                            // Cambiar el estado a "oculto" si la cantidad llega a 0
                            if (cantidadRestante == 0) {
                                producto.put("estado", "oculto");
                            }

                            // Guardar los cambios en el archivo JSON del inventario
                            FileWriter fileWriter = new FileWriter(file);
                            fileWriter.write(jsonObject.toJSONString());
                            fileWriter.flush();
                            fileWriter.close();

                            // Crear un objeto para almacenar los detalles de la venta
                            JSONObject venta = new JSONObject();
                            venta.put("productoNombre", nombreProducto);
                            venta.put("cantidadVendida", cantidad != null ? Long.parseLong(cantidad) : 0);

                            // Obtener la fecha y hora actual y formatearla como "dd/MM/yyyy hh:mm a"
                            Date fechaActual = new Date();
                            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
                            String fechaVenta = formatoFecha.format(fechaActual);
                            venta.put("fechaVenta", fechaVenta);

                            // Verificar si el archivo de historial de ventas existe
                            File ventasFileObj = new File(ventasFile);
                            if (!ventasFileObj.exists()) {
                                // Si el archivo no existe, crear un nuevo objeto JSON para el historial de ventas
                                JSONObject ventasObject = new JSONObject();
                                JSONArray ventasArray = new JSONArray();
                                ventasArray.add(venta);
                                ventasObject.put("Ventas", ventasArray);

                                // Guardar el objeto JSON del historial de ventas en el archivo
                                FileWriter newVentasFileWriter = new FileWriter(ventasFile);
                                newVentasFileWriter.write(ventasObject.toJSONString());
                                newVentasFileWriter.flush();
                                newVentasFileWriter.close();
                            } else {
                                // Si el archivo existe, leer el archivo JSON del historial de ventas
                                JSONObject ventasObject = (JSONObject) parser.parse(new FileReader(ventasFile));

                                // Obtener el array de ventas
                                JSONArray ventas = (JSONArray) ventasObject.get("Ventas");

                                // Agregar el objeto de venta al array de ventas
                                ventas.add(venta);

                                // Guardar los cambios en el archivo JSON del historial de ventas
                                FileWriter ventasFileWriter = new FileWriter(ventasFile);
                                ventasFileWriter.write(ventasObject.toJSONString());
                                ventasFileWriter.flush();
                                ventasFileWriter.close();
                            }

                            // Vaciar los campos y seleccionar "seleccionar"
                            txtCantidad.setText("");
                            Porductotxt.setSelectedIndex(0);
                            infotable();
                            historialtable();

                            // Notificar al usuario la cantidad restante
                            JOptionPane.showMessageDialog(null, "Se han descontado " + cantidad + " del stock. Quedan " + cantidadRestante + " unidades.");

                        } else {
                            // Notificar al usuario la cantidad actual en stock
                            JOptionPane.showMessageDialog(null, "No se puede realizar el descuento del stock. La cantidad en stock es de " + cantidadActual + " unidades.");
                        }

                        break; // Salir del bucle una vez que se encuentre el ID correspondiente
                    }
                }
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un elemento válido y especifica la cantidad.");
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void btneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar1ActionPerformed
        String ventasFile = "db/historial_ventas.json"; // Ruta del archivo de historial de ventas

        try {
            // Leer el archivo JSON del historial de ventas
            JSONParser parser = new JSONParser();
            JSONObject ventasObject = (JSONObject) parser.parse(new FileReader(ventasFile));

            // Obtener el array de ventas
            JSONArray ventasArray = (JSONArray) ventasObject.get("Ventas");

            // Verificar si hay elementos en el array de ventas
            if (!ventasArray.isEmpty()) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar la última venta del historial?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Eliminar el último elemento del array de ventas
                    ventasArray.remove(ventasArray.size() - 1);

                    // Guardar los cambios en el archivo JSON del historial de ventas
                    FileWriter ventasFileWriter = new FileWriter(ventasFile);
                    ventasFileWriter.write(ventasObject.toJSONString());
                    ventasFileWriter.flush();
                    ventasFileWriter.close();

                    historialtable();

                    JOptionPane.showMessageDialog(null, "Se ha eliminado la última venta del historial de ventas.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay ventas registradas en el historial de ventas.");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btneliminar1ActionPerformed

    private void btneliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar2ActionPerformed
        String ventasFile = "db/historial_ventas.json"; // Ruta del archivo de historial de ventas

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas limpiar el historial de ventas?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Crear un objeto JSON vacío para el historial de ventas
                JSONObject ventasObject = new JSONObject();
                JSONArray ventasArray = new JSONArray();
                ventasObject.put("Ventas", ventasArray);

                // Guardar el objeto JSON vacío en el archivo de historial de ventas
                FileWriter ventasFileWriter = new FileWriter(ventasFile);
                ventasFileWriter.write(ventasObject.toJSONString());
                ventasFileWriter.flush();
                ventasFileWriter.close();

                historialtable();

                JOptionPane.showMessageDialog(null, "Se ha limpiado el historial de ventas.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btneliminar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel Paginas;
    private principal.ComboBoxP Porductotxt;
    private principal.MyButton addProduct;
    private javax.swing.JLabel btnAddProduct;
    private javax.swing.JLabel btnInventario;
    private javax.swing.JLabel btnPerfiles;
    private javax.swing.JLabel btnVentas;
    private principal.MyButton btneditar;
    private principal.MyButton btneliminar;
    private principal.MyButton btneliminar1;
    private principal.MyButton btneliminar2;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private principal.MyButton myButton1;
    private principal.MyTable myTableH;
    private principal.MyTable myTableP;
    private principal.MyTextField nombretxt;
    private javax.swing.JPanel pnlAddProduct;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlPerfiles;
    private javax.swing.JPanel pnlVentas;
    private principal.MyTextField reftxt;
    private principal.MyTextField txtCantidad;
    private principal.MyTextField txtPalabra;
    private principal.MyPasswordField txtPass;
    private principal.MyPasswordField txtRepPass;
    private principal.MyComboBox txtRol;
    private principal.MyTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
