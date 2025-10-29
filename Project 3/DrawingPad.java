import java.awt.*;
import javax.swing.*;

/**
 * Represents a drawing canvas for shapes.
 * @author YourName
 */
public class DrawingPad {
    private Canvas canvas;
    private JFrame frame;
    private Graphics graphics;

    public DrawingPad(int width, int height) {
        frame = new JFrame();
        canvas = new Canvas();
        canvas.setSize(width, height);
        canvas.setBackground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.add(canvas);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public Graphics getGraphicsContext() {
        if (graphics == null) {
            graphics = canvas.getGraphics();
            graphics.setColor(Color.BLACK);
        }
        return graphics;
    }

    public void draw(Shape shape) {
        Graphics g = getGraphicsContext();
        for (Line line : shape.getLines()) {
            Point p1 = line.getFirstPoint();
            Point p2 = line.getSecondPoint();
            g.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
        }
    }

    public void erase() {
        Graphics g = getGraphicsContext();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        g.setColor(Color.BLACK);
    }
}
