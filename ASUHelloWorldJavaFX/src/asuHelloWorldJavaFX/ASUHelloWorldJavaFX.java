package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ASUHelloWorldJavaFX extends Application {
    private Stage window;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Heart Health System");

        // Main UI
        Label titleLabel = new Label("Welcome to Heart Health Imaging and Recording System");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: white; -fx-padding: 10px;");

        Button patientIntakeButton = new Button("Patient Intake");
        Button ctScanViewButton = new Button("CT Scan Tech View");
        Button patientViewButton = new Button("Patient View");

        // Style buttons
        styleButton(patientIntakeButton);
        styleButton(ctScanViewButton);
        styleButton(patientViewButton);

        VBox layout = new VBox(20);
        layout.getChildren().addAll(titleLabel, patientIntakeButton, ctScanViewButton, patientViewButton);
        layout.setAlignment(Pos.CENTER);

        // Set actions for buttons
        patientIntakeButton.setOnAction(e -> window.setScene(createPatientIntakeForm()));
        ctScanViewButton.setOnAction(e -> window.setScene(createCTScanTechView()));
        patientViewButton.setOnAction(e -> window.setScene(createPatientView()));

        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }

    private void styleButton(Button button) {
        button.setStyle("-fx-background-color: #0000ff; -fx-text-fill: white; -fx-font-size: 14px;");
    }

    private Scene createPatientIntakeForm() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Labels and TextFields for the form
        Label firstNameLabel = new Label("First Name:");
        TextField firstNameInput = new TextField();
        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameInput, 1, 0);

        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameInput = new TextField();
        grid.add(lastNameLabel, 0, 1);
        grid.add(lastNameInput, 1, 1);

        Label emailLabel = new Label("Email:");
        TextField emailInput = new TextField();
        grid.add(emailLabel, 0, 2);
        grid.add(emailInput, 1, 2);

        Label phoneLabel = new Label("Phone Number:");
        TextField phoneInput = new TextField();
        grid.add(phoneLabel, 0, 3);
        grid.add(phoneInput, 1, 3);

        Label healthLabel = new Label("Health History:");
        TextField healthInput = new TextField();
        grid.add(healthLabel, 0, 4);
        grid.add(healthInput, 1, 4);

        Label insuranceLabel = new Label("Insurance ID:");
        TextField insuranceInput = new TextField();
        grid.add(insuranceLabel, 0, 5);
        grid.add(insuranceInput, 1, 5);

        // Save Button with event handler to save the patient info
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> savePatientInfo(
            firstNameInput.getText(),
            lastNameInput.getText(),
            emailInput.getText(),
            phoneInput.getText(),
            healthInput.getText(),
            insuranceInput.getText()
        ));
        grid.add(saveButton, 1, 6);

        // Return the Scene
        return new Scene(grid, 300, 250);
    }


    private Scene createCTScanTechView() {
        // Adapted from the second code snippet
    }

    private Scene createPatientView() {
        // Adapted from the third code snippet
    }

    public static void main(String[] args) {
        launch(args);
    }
}
