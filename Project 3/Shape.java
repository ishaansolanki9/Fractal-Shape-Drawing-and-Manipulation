/**
 * Abstract class representing a generic shape.
 * @author YourName
 */
public abstract class Shape {

    /**
     * Rotates the shape by a given angle in radians.
     * @param angle the angle in radians to rotate the shape
     */
    public abstract void rotate(double angle);

    /**
     * Returns the points that define the shape.
     * @return an array of Points
     */
    public abstract Point[] getPoints();

    /**
     * Returns the lines that make up the shape.
     * @return an array of Lines
     */
    public abstract Line[] getLines();

    @Override
    public abstract boolean equals(Object obj);
}
