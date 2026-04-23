import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Practical54 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(10);

        TextField rollField = new TextField();
        rollField.setPromptText("Roll No");
        TextField nameField = new TextField();
        nameField.setPromptText("Name");
        TextField ageField = new TextField();
        ageField.setPromptText("Age");
        TextField emailField = new TextField();
        emailField.setPromptText("Email");
        Button submit = new Button("Submit");

        grid.add(rollField, 0, 0);
        grid.add(nameField, 0, 1);
        grid.add(ageField, 0, 2);
        grid.add(emailField, 0, 3);
        grid.add(submit, 0, 4);

        submit.setOnAction(e -> {
            try {
                int rollNo = Integer.parseInt(rollField.getText().trim());
                int age = Integer.parseInt(ageField.getText().trim());
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();

                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be empty");
                }
                if (!email.contains("@") || !email.contains(".")) {
                    throw new IllegalArgumentException("Email format is invalid");
                }

                String data = "RollNo: " + rollNo + ", Name: " + name + ", Age: " + age + ", Email: " + email;

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration");
                fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                        bw.write(data);
                        bw.newLine();
                    }
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(data);
                success.showAndWait();
            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers.");
            } catch (IllegalArgumentException ex) {
                showError(ex.getMessage());
            } catch (IOException ex) {
                showError("Unable to write file: " + ex.getMessage());
            }
        });

        stage.setScene(new Scene(grid, 420, 260));
        stage.setTitle("Practical 54");
        stage.show();
    }

    private void showError(String msg) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Validation Error");
        error.setHeaderText("Input Validation Failed");
        error.setContentText(msg);
        error.showAndWait();
    }

    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        launch(args);
    }
}

