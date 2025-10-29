import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FractalDrawer extends Application {
    private Canvas canvas;

    @Override
    public void start(Stage stage) {
        // Set up GUI
        BorderPane root = new BorderPane();

        canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        VBox controls = createControls(gc);

        root.setCenter(canvas);
        root.setRight(controls);

        Scene scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Fractal Drawer");
        stage.show();
    }

    private VBox createControls(GraphicsContext gc) {
        VBox box = new VBox(10);

        // Fractal selection
        Label fractalLabel = new Label("Fractal Type:");
        ComboBox<String> fractalType = new ComboBox<>();
        fractalType.getItems().addAll("Snowflake", "Triangle", "Rectangle");

        // Fractal settings
        Label levelLabel = new Label("Levels:");
        Spinner<Integer> levels = new Spinner<>(0, 10, 0);

        Button drawButton = new Button("Draw Fractal");
        drawButton.setOnAction(e -> {
            String type = fractalType.getValue();
            int numLevels = levels.getValue();

            if ("Snowflake".equals(type)) {
                SnowflakeFractal snowflake = new SnowflakeFractal(new EquilateralTriangle(new Point(400, 300), 100), numLevels);
                drawFractal(gc, snowflake);
            }
        });

        box.getChildren().addAll(fractalLabel, fractalType, levelLabel, levels, drawButton);
        return box;
    }

    private void drawFractal(GraphicsContext gc, FractalShape fractal) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for (Line line : fractal.getLines()) {
            gc.strokeLine(line.getFirstPoint().getX(), line.getFirstPoint().getY(),
                    line.getSecondPoint().getX(), line.getSecondPoint().getY());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
