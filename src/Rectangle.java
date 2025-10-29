/**
 * Represents a Rectangle with a center, width, and height.
 * @author YourName
 */
public class Rectangle extends Polygon {
    private Point center;
    private double width;
    private double height;

    public Rectangle(Point center, double width, double height) {
        super(
            new Point(center.getX() - width / 2, center.getY() - height / 2),
            new Point(center.getX() + width / 2, center.getY() - height / 2),
            new Point(center.getX() + width / 2, center.getY() + height / 2),
            new Point(center.getX() - width / 2, center.getY() + height / 2)
        );
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point newCenter) {
        double dx = newCenter.getX() - center.getX();
        double dy = newCenter.getY() - center.getY();
        for (Point point : points) {
            point.setX(point.getX() + dx);
            point.setY(point.getY() + dy);
        }
        center = newCenter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
