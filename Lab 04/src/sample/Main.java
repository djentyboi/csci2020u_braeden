package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.PipedOutputStream;
import java.util.EventListener;

public class Main extends Application implements EventHandler<ActionEvent> {

    //Create Buttons and Labels
    Button register = new Button();
    Label username = new Label();
    Label password = new Label();
    Label fullName = new Label();
    Label email = new Label();
    Label phoneNum = new Label();
    Label dateOfBirth = new Label();

    //Create Any Text Fields
    TextField usernameInput = new TextField();
    PasswordField passwordInput = new PasswordField();
    TextField fullNameInput = new TextField();
    TextField emailInput = new TextField();
    TextField phoneNumInput = new TextField();
    DatePicker DOBInput = new DatePicker();

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab 04 Solution");
        primaryStage.setScene(new Scene(layout, 350, 300));
        primaryStage.show();

        //Set label and button text
        register.setText("Register");
        username.setText("Username: ");
        password.setText("Password: ");
        fullName.setText("Full Name: ");
        email.setText("E-Mail: ");
        phoneNum.setText("Phone Number: ");
        dateOfBirth.setText("Date of Birth: ");

        //Set event on register button
        register.setOnAction(this);

        //Set gridpane constraints
        GridPane.setConstraints(username, 0, 0);
        GridPane.setConstraints(usernameInput, 1, 0);

        GridPane.setConstraints(password, 0, 1);
        GridPane.setConstraints(passwordInput, 1, 1);

        GridPane.setConstraints(fullName, 0, 2);
        GridPane.setConstraints(fullNameInput, 1, 2);

        GridPane.setConstraints(email, 0, 3);
        GridPane.setConstraints(emailInput, 1, 3);

        GridPane.setConstraints(phoneNum, 0, 4);
        GridPane.setConstraints(phoneNumInput, 1, 4);

        GridPane.setConstraints(dateOfBirth, 0, 5);
        GridPane.setConstraints(DOBInput, 1, 5);

        GridPane.setConstraints(register, 1, 6);

        //Add everything to the layout
        layout.getChildren().addAll(username, usernameInput, password, passwordInput, fullName, fullNameInput, email, emailInput, phoneNum, phoneNumInput, dateOfBirth, DOBInput, register);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        //Print out inputted data
        System.out.println("Username: " + usernameInput.getText());
        System.out.println("Full Name: " + fullNameInput.getText());
        System.out.println("E-Mail: " + emailInput.getText());
        System.out.println("Phone Number: " + phoneNumInput.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
