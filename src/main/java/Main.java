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

        Label ktcLabel = new Label("Enter Kelvin:");
        TextField ktcInput = new TextField();
        Button ktcConvertButton = new Button("Convert");
        Label ktcResultLabel = new Label();

        Label ctoklabel = new Label("Enter celsius:");
        TextField ctokInput = new TextField();
        Button ctokconvertButton = new Button("Convert");
        Label ctokresultLabel = new Label();

        convertButton.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(celsiusInput.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                resultLabel.setText("Fahrenheit: " + fahrenheit);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        ktcConvertButton.setOnAction(e -> {
            try {
                double kelvin = Double.parseDouble(ktcInput.getText());
                double celsius = kelvin - 273.15;
                ktcResultLabel.setText("Celsius: " + celsius);
            } catch (NumberFormatException ex) {
                ktcResultLabel.setText("Invalid input!");
            }
        });

        ctokconvertButton.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(ctokInput.getText());
                double kelvin = celsius + 273.15;
                ctokresultLabel.setText("Kelvin: " + kelvin);
            } catch (NumberFormatException ex) {
                ctokresultLabel.setText("Invalid input!");
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(label, celsiusInput, convertButton, resultLabel,
                ktcLabel, ktcInput, ktcConvertButton, ktcResultLabel,
                ctoklabel, ctokInput, ctokconvertButton, ctokresultLabel);
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Temperature converter");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
