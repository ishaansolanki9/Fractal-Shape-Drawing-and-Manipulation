import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTests {

    @Test
    void testRectangleRotation() {
        Rectangle rect = new Rectangle(new Point(0, 0), 4, 2);
        rect.rotate(Math.PI / 2);
        Point[] points = rect.getPoints();
        assertEquals(new Point(-1, -2), points[0]);
        assertEquals(new Point(-1, 2), points[1]);
    }

    @Test
    void testPolygonLines() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Polygon triangle = new Polygon(p1, p2, p3) {
            @Override
            public Point getCenter() {
                return new Point(2, 1);
            }

            @Override
            public void setCenter(Point center) {
                // Implementation for testing
            }
        };
        assertEquals(3, triangle.getLines().length);
    }
}
