/**
 * Represents a Line with two endpoints.
 * @author YourName
 */
public class Line extends Shape {
    private Point firstPoint;  // The first endpoint of the line
    private Point secondPoint; // The second endpoint of the line

    public Line(Point first, Point second) {
        this.firstPoint = first;
        this.secondPoint = second;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    @Override
    public Point[] getPoints() {
        return new Point[] { firstPoint, secondPoint };
    }

    @Override
    public Line[] getLines() {
        return new Line[] { this };
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return firstPoint.equals(other.firstPoint) && secondPoint.equals(other.secondPoint);
    }

    @Override
    public String toString() {
        return "Line[" + firstPoint + ", " + secondPoint + "]";
    }
}
