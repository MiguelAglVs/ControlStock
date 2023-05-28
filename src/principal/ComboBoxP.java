package principal;

import javax.swing.*;
import java.awt.*;

public class ComboBoxP extends JComboBox<String> {

    private Color borderColor = new Color(78, 115, 223);
    private Color focusBorderColor = new Color(107, 144, 255);

    public ComboBoxP() {
        setOpaque(false);
        setBackground(Color.white);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0)); // Solo se agrega un borde inferior
        setForeground(borderColor);

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                setBorder(BorderFactory.createLineBorder(focusBorderColor, 1));
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0)); // Se vuelve a agregar el borde inferior vacío
            }
        });

        seleccionarPrimerElemento();
    }

    private void seleccionarPrimerElemento() {
        addItem("Seleccionar"); // Agrega la opción "Seleccionar" al principio de la lista
        setSelectedIndex(0); // Establece la opción "Seleccionar" como seleccionada por defecto
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        setForeground(borderColor);
    }

    public Color getFocusBorderColor() {
        return focusBorderColor;
    }

    public void setFocusBorderColor(Color focusBorderColor) {
        this.focusBorderColor = focusBorderColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(hasFocus() ? focusBorderColor : borderColor);
        g2.fillRect(0, getHeight() - 2, getWidth(), 2);

        g2.dispose();

        super.paintComponent(g);
    }

}
