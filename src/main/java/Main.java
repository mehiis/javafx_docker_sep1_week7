import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Enter Celsius:");
        TextField celsiusInput = new TextField();
        Button convertButton = new Button("Convert");
        Label resultLabel = new Label();

        convertButton.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(celsiusInput.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                resultLabel.setText("Fahrenheit: " + fahrenheit);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        VBox root = new VBox(10, label, celsiusInput, convertButton, resultLabel);
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Celsius to Fahrenheit");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
