/**
 * Represents a Snowflake Fractal.
 */
public class SnowflakeFractal extends FractalShape {
    private Polygon baseShape;

    /**
     * Constructor for SnowflakeFractal.
     * @param baseShape The base polygon of the fractal.
     * @param numLevels The number of levels in the fractal.
     */
    public SnowflakeFractal(Polygon baseShape, int numLevels) {
        super(numLevels);
        this.baseShape = baseShape;
    }

    public Polygon getBaseShape() {
        return baseShape;
    }

    public void setBaseShape(Polygon baseShape) {
        this.baseShape = baseShape;
    }

    @Override
    public Point getCenter() {
        return baseShape.getCenter();
    }

    @Override
    public void setCenter(Point center) {
        baseShape.setCenter(center);
    }

    @Override
    public void rotate(double angle) {
        baseShape.rotate(angle);
    }

    @Override
    public Point[] getPoints() {
        // Recursive generation of points for the fractal.
        if (getNumLevels() == 0) {
            return baseShape.getPoints();
        }

        // Generate points for each level
        List<Point> fractalPoints = new ArrayList<>();
        for (Line line : baseShape.getLines()) {
            Point[] subdividedPoints = generateSnowflake(line);
            fractalPoints.addAll(Arrays.asList(subdividedPoints));
        }
        return fractalPoints.toArray(new Point[0]);
    }

    @Override
    public Line[] getLines() {
        Point[] points = getPoints();
        Line[] lines = new Line[points.length];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        lines[points.length - 1] = new Line(points[points.length - 1], points[0]);
        return lines;
    }

    private Point[] generateSnowflake(Line line) {
        // Split line into three parts
        Point p1 = line.getFirstPoint();
        Point p2 = line.getSecondPoint();
        Point thirdPoint = new Point(
                (2 * p1.getX() + p2.getX()) / 3,
                (2 * p1.getY() + p2.getY()) / 3
        );
        Point twoThirdPoint = new Point(
                (p1.getX() + 2 * p2.getX()) / 3,
                (p1.getY() + 2 * p2.getY()) / 3
        );

        // Add middle "peak" point
        Point peak = calculatePeakPoint(thirdPoint, twoThirdPoint);
        return new Point[]{p1, thirdPoint, peak, twoThirdPoint, p2};
    }

    private Point calculatePeakPoint(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return new Point(
                p1.getX() - dy * Math.sqrt(3) / 2,
                p1.getY() + dx * Math.sqrt(3) / 2
        );
    }
}
