package principal;

import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Timer;


import login.Login;

import desplazable.Desface;
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
        jLabel26 = new javax.swing.JLabel();

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

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Panel 2");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlVentas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, 60));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel Paginas;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private principal.MyTable myTableP;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlVentas;
    // End of variables declaration//GEN-END:variables
}
