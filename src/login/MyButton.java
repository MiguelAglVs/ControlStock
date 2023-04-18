package login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class MyButton extends JButton {

    public MyButton() {
        color = new Color(78, 115, 223);
        colorOver = new Color(59, 89, 152);
        colorClick = new Color(58, 94, 204);
        borderColor = new Color(78, 115, 223);
        setContentAreaFilled(false);
        setBackground(color);

        // Agrega un MouseListener para cambiar el color de fondo cuando el ratón entra y sale del botón
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }
        });

        // Establece el cursor de la mano para el botón
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        if (over) {
            setBackground(colorOver);
        } else {
            setBackground(color);
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 20;

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // dibuja el borde redondeado
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

        // dibuja el fondo redondeado
        if (over) {
            g2.setColor(colorOver);
        } else {
            g2.setColor(getBackground());
        }
        g2.fillRoundRect(1, 1, getWidth() - 3, getHeight() - 3, radius, radius);

        super.paintComponent(grphcs);
    }
}
