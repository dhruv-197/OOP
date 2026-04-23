import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practical52 extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(12);
        root.setAlignment(Pos.CENTER);

        Random random = new Random();
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(font);
            text.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
            text.setOpacity(0.3 + (0.7 * random.nextDouble()));
            root.getChildren().add(text);
        }

        stage.setScene(new Scene(root, 450, 300));
        stage.setTitle("Practical 52");
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        launch(args);
    }
}

