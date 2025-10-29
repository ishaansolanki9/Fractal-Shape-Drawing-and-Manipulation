/**
 * Abstract class for all fractal shapes.
 */
public abstract class FractalShape {
    private int numLevels;

    /**
     * Constructor for FractalShape.
     * @param numLevels The number of levels in the fractal.
     */
    public FractalShape(int numLevels) {
        this.numLevels = numLevels;
    }

    /**
     * Get the number of levels of the fractal.
     * @return number of levels.
     */
    public int getNumLevels() {
        return numLevels;
    }

    /**
     * Set the number of levels for the fractal.
     * @param numLevels Number of levels.
     */
    public void setNumLevels(int numLevels) {
        this.numLevels = numLevels;
    }

    /**
     * Abstract method to return the center of the fractal.
     * @return The center point of the fractal.
     */
    public abstract Point getCenter();

    /**
     * Abstract method to set the center of the fractal.
     * @param center The new center point.
     */
    public abstract void setCenter(Point center);

    /**
     * Abstract method to rotate the fractal about its center.
     * @param angle The angle in radians.
     */
    public abstract void rotate(double angle);

    /**
     * Abstract method to return the points of the fractal.
     * @return An array of points.
     */
    public abstract Point[] getPoints();

    /**
     * Abstract method to return the lines of the fractal.
     * @return An array of lines.
     */
    public abstract Line[] getLines();
}
