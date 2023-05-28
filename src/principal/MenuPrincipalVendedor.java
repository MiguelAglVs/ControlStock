package principal;

import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Timer;

import login.Login;

import desplazable.Desface;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MenuPrincipalVendedor extends javax.swing.JFrame {

    Desface desplace;
    private Timer timer;

    public MenuPrincipalVendedor() {
        desplace = new Desface();
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

            array = new Object[productos.size()][4];

            for (Object p : productos) {
                JSONObject producto = (JSONObject) p;

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
        jPanel3 = new javax.swing.JPanel();
        MenuPlegable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        Paginas = new javax.swing.JPanel();
        pnlInventario = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        myTableP = new principal.MyTable();
        pnlVentas = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        myTableH = new principal.MyTable();
        jLabel26 = new javax.swing.JLabel();
        Porductotxt = new principal.ComboBoxP();
        jLabel25 = new javax.swing.JLabel();
        txtCantidad = new principal.MyTextField();
        myButton1 = new principal.MyButton();

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
        MenuPlegable.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 180, 50));

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
        myTableP.setForeground(new java.awt.Color(255, 255, 255));
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

        pnlInventario.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 370));

        Paginas.add(pnlInventario, "card3");

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

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(58, 59, 69));
        jLabel26.setText("Producto:");
        pnlVentas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        Porductotxt.setBackground(new java.awt.Color(251, 252, 253));
        Porductotxt.setForeground(new java.awt.Color(209, 211, 225));
        Porductotxt.setBorderColor(new java.awt.Color(209, 211, 225));
        Porductotxt.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlVentas.add(Porductotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 270, 50));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(58, 59, 69));
        jLabel25.setText("Cantidad:");
        pnlVentas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        txtCantidad.setBackground(new java.awt.Color(251, 252, 253));
        txtCantidad.setForeground(new java.awt.Color(58, 59, 69));
        txtCantidad.setBorderColor(new java.awt.Color(209, 211, 225));
        txtCantidad.setCaretColor(new java.awt.Color(187, 187, 187));
        txtCantidad.setFocusBorderColor(new java.awt.Color(75, 110, 175));
        pnlVentas.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 270, 50));

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

        Paginas.add(pnlVentas, "card5");

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

        btnVentas.setBackground(new java.awt.Color(78, 115, 223));
        pnlVentas.setVisible(false);
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        btnInventario.setBackground(new java.awt.Color(78, 115, 223));
        pnlInventario.setVisible(false);

        btnVentas.setBackground(new java.awt.Color(59, 89, 152));
        pnlVentas.setVisible(true);
    }//GEN-LAST:event_btnVentasMouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel Paginas;
    private principal.ComboBoxP Porductotxt;
    private javax.swing.JLabel btnInventario;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private principal.MyButton myButton1;
    private principal.MyTable myTableH;
    private principal.MyTable myTableP;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlVentas;
    private principal.MyTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
