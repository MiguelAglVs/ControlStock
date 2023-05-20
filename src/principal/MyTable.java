package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class MyTable extends JTable {

    private static final Color COLOR = new Color(255, 255, 255);
    private static final Color COLOR_OVER = new Color(200, 200, 200);
    private static final Color COLOR_CLICK = new Color(150, 150, 150);
    private static final Color BORDER_COLOR = new Color(78, 115, 223);

    public MyTable() {
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder());
        setRowHeight(30);
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (hasFocus || isSelected) {
                    c.setBackground(COLOR_CLICK);
                } else if (getSelectedRow() == row) {
                    c.setBackground(COLOR_OVER);
                } else {
                    c.setBackground(COLOR);
                }
                c.setForeground(Color.BLACK);
                return c;
            }
        });

        JTableHeader header = getTableHeader();
        header.setPreferredSize(new Dimension(header.getWidth(), 30));
        header.setDefaultRenderer(new MyHeaderRenderer());

        JScrollPane scrollPane = new JScrollPane(this);
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(10, Integer.MAX_VALUE));
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        scrollPane.getVerticalScrollBar().setBackground(BORDER_COLOR);

    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(BORDER_COLOR);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        g2.setColor(getBackground());
        g2.fillRoundRect(1, 1, getWidth() - 3, getHeight() - 3, 20, 20);

        super.paintComponent(grphcs);
    }

    private static class MyHeaderRenderer extends DefaultTableCellRenderer {

        public MyHeaderRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setForeground(Color.WHITE);
            setBackground(new Color(78, 115, 223));
            setFont(getFont().deriveFont(getFont().getSize() + 2f));
        }
    }

    private static class MyScrollBarUI extends BasicScrollBarUI {

        private final Dimension d = new Dimension();

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return d;
                }
            };
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return d;
                }
            };
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
            g.setColor(Color.WHITE);
            g.fillRect(r.x, r.y, r.width, r.height);
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(BORDER_COLOR);
            g2.fillRoundRect(r.x, r.y, r.width - 1, r.height - 1, 10, 10);
            g2.dispose();
        }
    }

}
