/**
 * Represents a 2D point in Cartesian coordinates.
 * @author YourName
 */
public class Point {
    private double x; // x-coordinate
    private double y; // y-coordinate

    /**
     * Constructs a point with the specified coordinates.
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the point.
     * @return the x-coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     * @param x the new x-coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate of the point.
     * @return the y-coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     * @param y the new y-coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Rotates this point about another point by a given angle in radians.
     * @param origin the origin point to rotate around
     * @param angle the angle in radians
     */
    public void rotateAbout(Point origin, double angle) {
        double dx = this.x - origin.x;
        double dy = this.y - origin.y;
        double newX = dx * Math.cos(angle) - dy * Math.sin(angle) + origin.x;
        double newY = dx * Math.sin(angle) + dy * Math.cos(angle) + origin.y;
        this.x = newX;
        this.y = newY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return Math.abs(this.x - other.x) < 0.000001 && Math.abs(this.y - other.y) < 0.000001;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
