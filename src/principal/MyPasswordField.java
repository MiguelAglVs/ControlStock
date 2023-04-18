package principal;

import login.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class MyPasswordField extends JPasswordField {

    private Color borderColor = new Color(78, 115, 223);
    private Color focusBorderColor = new Color(107, 144, 255);
    private Color placeholderColor = new Color(190, 190, 190);
    private String placeholderText = "";
    private int borderRadius = 0;
    private final JButton showHideButton;

    public MyPasswordField() {
        setOpaque(false);
        setBorder(null);
        setCaretColor(borderColor);
        setEchoChar('•');

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                setCaretColor(focusBorderColor);
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                setCaretColor(borderColor);
                repaint();
            }
        });

        setCursor(new Cursor(Cursor.TEXT_CURSOR));

        // Crea los iconos y los redimensiona
        ImageIcon hideIcon = new ImageIcon("src/img/hide.png");
        ImageIcon showIcon = new ImageIcon("src/img/show.png");
        int iconSize = 20; // Tamaño deseado de los iconos
        hideIcon.setImage(hideIcon.getImage().getScaledInstance(iconSize, iconSize, Image.SCALE_SMOOTH));
        showIcon.setImage(showIcon.getImage().getScaledInstance(iconSize, iconSize, Image.SCALE_SMOOTH));

        showHideButton = new JButton();
        showHideButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        showHideButton.setFocusable(false);
        showHideButton.setBorderPainted(false);
        showHideButton.setContentAreaFilled(false);
        showHideButton.setIcon(hideIcon);
        showHideButton.setPressedIcon(showIcon);
        showHideButton.setRolloverIcon(showIcon);
        showHideButton.setSelectedIcon(showIcon);
        showHideButton.addActionListener(e -> toggleEchoChar());
        add(showHideButton);
    }

    private void toggleEchoChar() {
        if (getEchoChar() == '•') {
            setEchoChar((char) 0);
        } else {
            setEchoChar('•');
        }
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        setCaretColor(borderColor);
        repaint();
    }

    public Color getFocusBorderColor() {
        return focusBorderColor;
    }

    public void setFocusBorderColor(Color focusBorderColor) {
        this.focusBorderColor = focusBorderColor;
        repaint();
    }

    public Color getPlaceholderColor() {
        return placeholderColor;
    }

    public void setPlaceholderColor(Color placeholderColor) {
        this.placeholderColor = placeholderColor;
        repaint();
    }

    public String getPlaceholderText() {
        return placeholderText;
    }

    public void setPlaceholderText(String placeholderText) {
        this.placeholderText = placeholderText;
        repaint();
    }

    public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja el fondo
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja el borde inferior
        g2.setColor(hasFocus() ? focusBorderColor : borderColor);
        g2.fillRect(0, getHeight() - 2, getWidth(), 2);

        g2.dispose();

        super.paintComponent(g);
        // Dibuja el texto de placeholder
        if (getPassword().length == 0 && !placeholderText.isEmpty()) {
            g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(placeholderColor);
            g2.setFont(new Font(getFont().getFamily(), Font.PLAIN, getFont().getSize()));
            int x = getInsets().left;
            int y = (getHeight() - g2.getFontMetrics().getHeight()) / 2 + g2.getFontMetrics().getAscent();
            g2.drawString(placeholderText, x, y);
            g2.dispose();
        }
        // Dibuja el botón de mostrar/ocultar
        int buttonWidth = showHideButton.getPreferredSize().width;
        int buttonHeight = getHeight() - getInsets().top - getInsets().bottom;
        int buttonX = getWidth() - getInsets().right - buttonWidth;
        int buttonY = getInsets().top;
        showHideButton.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
    }
}
