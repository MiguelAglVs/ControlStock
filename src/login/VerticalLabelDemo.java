package login;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;

import javax.swing.*;

public class VerticalLabelDemo extends JFrame {

    public VerticalLabelDemo() {
        super("Vertical Label Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Vertical Label");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Realizar una transformación en el JLabel
        AffineTransform transform = new AffineTransform();
        transform.rotate(-Math.PI / 2, 0, 0);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        Rectangle2D bounds = label.getFont().getStringBounds(label.getText(), frc);
        double width = bounds.getHeight();
        double height = bounds.getWidth();
        Shape shape = transform.createTransformedShape(new Rectangle2D.Double(0, -width, height, width));
        label.setBounds(shape.getBounds());
        label.setBorder(BorderFactory.createLineBorder(Color.RED)); // Opcional: añadir borde para ver la forma del JLabel

        // Añadir el JLabel al JFrame
        getContentPane().setLayout(null);
        getContentPane().add(label);
        setSize(300, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VerticalLabelDemo demo = new VerticalLabelDemo();
            demo.setVisible(true);
        });
    }
}
