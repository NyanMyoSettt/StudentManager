package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {
    @FXML
    private Button btnSignIn;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private Label label;

    @FXML
    private StackPane stackPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnSignIn.setOnAction(actionEvent -> {
            if(txtUserName.getText().equals("admin") && txtPassword.getText().equals("admin")){
                label.setText("");
                showHomeScreen(btnSignIn);

            } else {
                txtUserName.clear();
                txtPassword.clear();
                label.setText("Invalid username or Password \n Please try again");
            }
        });
    }
    private void showHomeScreen(Button button){
        Stage stage = (Stage) button.getScene().getWindow();
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HomeViewController.class.getResource("../resources/homeView.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }


}
