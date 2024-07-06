import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Pos;

public class Main extends Application {
    private UsersData usersData;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("PediaFlow");

        usersData = new UsersData();
        showLoginPage();
    }

    private void showLoginPage() {
        // Create the logo image view
        ImageView logo = new ImageView(new Image("image.png"));
        logo.setFitHeight(300);
        logo.setPreserveRatio(true);

        // Create the text fields
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setMaxWidth(150);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(150);

        // Create the login button
        Button loginButton = new Button("Log In");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            User user = usersData.validateLogin(username, password);
            if (user != null) {
                launchCharacterPage(user.getCharacterType());
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid username or password.");
                alert.showAndWait();
            }
        });

        // Add the logo and fields to a layout
        VBox vbox = new VBox(20, logo, usernameField, passwordField, loginButton);
        vbox.setAlignment(Pos.CENTER);

        // Create the scene and add it to the stage
        Scene scene = new Scene(vbox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void launchCharacterPage(String characterType) {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 800, 600);

        Button logoutButton = new Button("Logout");
        logoutButton.setOnAction(e -> showLoginPage());

        switch (characterType) {
            case "Doctor":
                vbox.getChildren().add(new Label("Welcome Doctor!"));
                setupDoctorInterface(vbox);
                break;
            case "Nurse":
                vbox.getChildren().add(new Label("Welcome Nurse!"));
                setupNurseInterface(vbox);
                break;
            case "Patient":
                vbox.getChildren().add(new Label("Welcome Patient!"));
                setupPatientInterface(vbox);
                break;
        }
// switch case to go through the doctor nurse and patient portal 
        vbox.getChildren().add(logoutButton);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setupDoctorInterface(VBox vbox) {
        // Doctor's Interface
        vbox.getChildren().addAll(
            new Label("Patient Examination and Prescription:"),
            new Label("Enter examination findings:"),
            new TextField(), // Text field for examination findings
            new Label("Prescribe medications:"),
            new TextField(), // Text field for prescribing medications
            new Button("Save") // Save button
        );
    }

    private void setupNurseInterface(VBox vbox) {
        // Nurse's Interface
        vbox.getChildren().addAll(
            new Label("Patient Check-In and Vitals:"),
            new Label("Enter patient name:"),
            new TextField(), // Text field for patient name
            new Label("Enter patient age:"),
            new TextField(), // Text field for patient age
            new Label("Enter reason for visit:"),
            new TextField(), // Text field for reason for visit
            new Label("Enter weight:"),
            new TextField(), // Text field for weight
            new Label("Enter height:"),
            new TextField(), // Text field for height
            new Label("Enter body temperature:"),
            new TextField(), // Text field for body temperature
            new Label("Enter blood pressure:"),
            new TextField(), // Text field for blood pressure
            new Button("Save") // Save button
        );
    }

    private void setupPatientInterface(VBox vbox) {
        // Patient's Interface
        vbox.getChildren().addAll(
            new Label("Account Management and Visit Summaries:"),
            new Label("Update contact information:"),
            new TextField(), // Text field for contact information
            new Button("Save"), // Save button for contact information
            new Label("Visit Summaries:"),
            new Label("Vitals, doctor's notes, prescriptions"), // Placeholder for visit summaries
            new Label("Message Doctor or Nurse:"),
            new TextField(), // Text field for messaging
            new Button("Send") // Send button
        );
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// correct 