package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeViewController implements Initializable {
    @FXML
    Button btnStudent;

    @FXML
    StackPane stackPane;

    @FXML
    Button btnClassroom;

    @FXML
    Button btnMentor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnStudent.setOnAction(event -> {
            showScreen("student");
        });
        btnClassroom.setOnAction(event -> {
            showScreen("classView");
        });
        btnMentor.setOnAction(event -> {
            showScreen("mentorView");
        });
    }

    private void showScreen(String fxml){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(StudentController.class.getResource("../resources/" + fxml + ".fxml"));
            Parent homeNode = fxmlLoader.load();
            stackPane.getChildren().add(homeNode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
