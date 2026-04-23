import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Practical53 extends Application {
    private double dx = 2.0;
    private boolean running = false;

    @Override
    public void start(Stage stage) {
        Pane playArea = new Pane();
        playArea.setPrefSize(600, 220);

        Circle ball = new Circle(20, Color.DODGERBLUE);
        ball.setCenterX(40);
        ball.setCenterY(110);
        playArea.getChildren().add(ball);

        Slider speedSlider = new Slider(1, 10, 3);
        speedSlider.setPrefWidth(220);

        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!running) {
                    return;
                }

                double speed = speedSlider.getValue();
                double nextX = ball.getCenterX() + (dx * speed);
                double radius = ball.getRadius();
                double width = playArea.getWidth();

                if (nextX - radius <= 0 || nextX + radius >= width) {
                    dx = -dx;
                }
                ball.setCenterX(ball.getCenterX() + (dx * speed));
            }
        };
        timer.start();

        startButton.setOnAction(e -> running = true);
        stopButton.setOnAction(e -> running = false);

        playArea.widthProperty().addListener((obs, oldVal, newVal) -> {
            double radius = ball.getRadius();
            if (ball.getCenterX() + radius > newVal.doubleValue()) {
                ball.setCenterX(newVal.doubleValue() - radius);
            }
        });

        HBox controls = new HBox(10, startButton, stopButton, speedSlider);
        controls.setPadding(new Insets(10));

        BorderPane root = new BorderPane();
        root.setCenter(playArea);
        root.setBottom(controls);

        stage.setScene(new Scene(root, 650, 300));
        stage.setTitle("Practical 53");
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        launch(args);
    }
}

