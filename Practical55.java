import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practical55 extends Application {
    private VBox createBar(String label, int percentage, Color color) {
        double maxHeight = 220;
        double barHeight = (percentage / 100.0) * maxHeight;

        Rectangle bar = new Rectangle(70, barHeight);
        bar.setFill(color);

        Text caption = new Text(label + " - " + percentage + "%");
        VBox box = new VBox(8, bar, caption);
        box.setAlignment(Pos.BOTTOM_CENTER);
        return box;
    }

    @Override
    public void start(Stage stage) {
        HBox bars = new HBox(18);
        bars.setPadding(new Insets(20));
        bars.setAlignment(Pos.BOTTOM_CENTER);

        bars.getChildren().addAll(
            createBar("Projects", 20, Color.RED),
            createBar("Quizzes", 10, Color.BLUE),
            createBar("Midterm Exams", 30, Color.GREEN),
            createBar("Final Exam", 40, Color.ORANGE)
        );

        Scene scene = new Scene(bars, 560, 340);
        stage.setTitle("Practical 55");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        launch(args);
    }
}

