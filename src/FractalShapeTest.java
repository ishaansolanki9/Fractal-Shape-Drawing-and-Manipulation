import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractalShapeTest {
    @Test
    public void testSnowflakePoints() {
        EquilateralTriangle triangle = new EquilateralTriangle(new Point(0, 0), 100);
        SnowflakeFractal fractal = new SnowflakeFractal(triangle, 2);

        assertEquals(12, fractal.getPoints().length, "Snowflake points should match level calculation.");
    }

    @Test
    public void testRotation() {
        Point center = new Point(0, 0);
        EquilateralTriangle triangle = new EquilateralTriangle(center, 100);
        triangle.rotate(Math.PI / 2);
        assertEquals(0, triangle.getCenter().getX(), 0.001);
    }
}
