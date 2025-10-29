/**
 * Main class to test the program.
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        Line line = new Line(p1, p2);

        System.out.println(line);
    }
}
