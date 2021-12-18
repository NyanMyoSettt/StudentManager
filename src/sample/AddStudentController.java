package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class AddStudentController implements Initializable {
    @FXML
    private ComboBox<Classroom> cmbClassroom;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtFatherName;

    @FXML
    private TextField txtNRCNo;

    @FXML
    private TextField txtName;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCancel;

    @FXML
    private ComboBox<Occupation> cmbOccupation;

    private final DataStore store = DataStore.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbClassroom.getItems().addAll(Classroom.defaultClassrooms());
        cmbOccupation.getItems().addAll(Occupation.defaultOccupation());

        btnSave.setOnAction(event ->{
            Student student = instantiateStudent();
            store.addNewStudent(student);

            Stage currentStage = (Stage) btnSave.getScene().getWindow();
            StudentController studentController = (StudentController) currentStage.getUserData();
            studentController.setTable();

            Stage presentStage = (Stage) btnSave.getScene().getWindow();
            presentStage.close();
        });
        btnCancel.setOnAction(event -> {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        });

    }
    private Student instantiateStudent(){
    Student student = new Student();
    student.setName(txtName.getText());
    student.setAge(Integer.parseInt(txtAge.getText()));
    student.setAddress(txtAddress.getText());
    student.setFatherName(txtFatherName.getText());
    student.setClassroom(cmbClassroom.getSelectionModel().getSelectedItem());
    student.setOccupation(cmbOccupation.getSelectionModel().getSelectedItem());
    student.setNrcNO(txtNRCNo.getText());

    return student;
    }

}
