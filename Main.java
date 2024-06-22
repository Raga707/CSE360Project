import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Pos;

public class Main extends Application {
    private UsersData usersData;

    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("PediaFlow");

        usersData = new UsersData();

        // Create the logo image view
        ImageView logo = new ImageView(new Image("image.png"));
        logo.setFitHeight(300); // Increase logo height
        logo.setPreserveRatio(true);

        // Create the text fields
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setMaxWidth(150); // Decrease max width

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(150); // Decrease max width

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
        VBox vbox = new VBox(20, logo, usernameField, passwordField, loginButton); // Increase spacing
        vbox.setAlignment(Pos.CENTER);

        // Create the scene and add it to the stage
        Scene scene = new Scene(vbox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void launchCharacterPage(String characterType) {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 800, 600);
        stage.setScene(scene);

        switch (characterType) {
            case "Doctor":
                vbox.getChildren().add(new javafx.scene.control.Label("Welcome Doctor!"));
                // Add more Doctor-specific UI elements here
                break;
            case "Nurse":
                vbox.getChildren().add(new javafx.scene.control.Label("Welcome Nurse!"));
                // Add more Nurse-specific UI elements here
                break;
            case "Patient":
                vbox.getChildren().add(new javafx.scene.control.Label("Welcome Patient!"));
                // Add more Patient-specific UI elements here
                break;
        }

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}