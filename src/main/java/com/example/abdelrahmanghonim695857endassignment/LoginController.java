package com.example.abdelrahmanghonim695857endassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginController {

  @FXML
  private TextField UserNameTextField;
  @FXML
  private PasswordField PasswordPasswordField;
  @FXML
  private Button LoginButton;
  @FXML
  private Label LabelLoginMessage;
  @FXML
  private Button CancelButton;
  private UserRepository users = new UserRepository();


  public void CancelButtonOnAction(ActionEvent event)
  {
    Stage stage=(Stage) CancelButton.getScene().getWindow();
    stage.close();

  }
  public void LoginButtonOnAction(ActionEvent event) {

//    boolean loginSuccessful = false;
//    for (User user : users.getUsers()) {
//      if (UserNameTextField.getText().equals(user.getUserName()) && PasswordPasswordField.getText().equals(user.getPassword())) {
//        loginSuccessful = true;
//        break;
//      }
//    }
//
//    if (loginSuccessful) {
//      LabelLoginMessage.setText("Successful login :)");
//    } else {
//      LabelLoginMessage.setText("Invalid Username and password :(");
//    }

    if (users.isValidCredentials(UserNameTextField.getText(), PasswordPasswordField.getText())) {
      LabelLoginMessage.setText("Successful login :)");
    } else {
      LabelLoginMessage.setText("Invalid Username and password :(");
    }

  }


}