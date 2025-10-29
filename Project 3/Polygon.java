import java.util.ArrayList;

/**
 * Represents a generic Polygon with multiple points.
 * @author YourName
 */
public abstract class Polygon extends Shape {
    protected Point[] points;

    public Polygon(Point... points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public Line[] getLines() {
        ArrayList<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            lines.add(new Line(points[i], points[(i + 1) % points.length]));
        }
        return lines.toArray(new Line[0]);
    }

    @Override
    public void rotate(double angle) {
        Point center = getCenter();
        for (Point point : points) {
            point.rotateAbout(center, angle);
        }
    }

    /**
     * Gets the center of the polygon.
     * @return the center Point
     */
    public abstract Point getCenter();

    /**
     * Sets the center of the polygon to a new point.
     * @param newCenter the new center Point
     */
    public abstract void setCenter(Point newCenter);
}
