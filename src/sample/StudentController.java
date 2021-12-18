package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    Button btnAdd;
    @FXML
    Button btnEdit;
    @FXML
    Button btnDelete;
    @FXML
    private TableColumn<String, Student> colAddress;

    @FXML
    private TableColumn<Integer, Student> colAge;

    @FXML
    private TableColumn<Classroom, Classroom> colClass;

    @FXML
    private TableColumn<String, Student> colFatherName;

    @FXML
    private TableColumn<?, ?> colMentor;

    @FXML
    private TableColumn<?, ?> colNRCNo;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<Occupation, Occupation> colOccupation;

    @FXML
    private TableView<Student> tableView;

    private final DataStore store = DataStore.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnAdd.setOnAction(event -> {
            showAddStudentUI();


        });
        btnDelete.setOnAction(event -> {

        });
        btnEdit.setOnAction(event -> {

        });

        tableView.getItems().addAll(store.students);

    }
    private void showAddStudentUI(){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(AddStudentController.class.getResource("../resources/addStudentView.fxml"));
        try{
            Parent node = fxmlLoader.load();
            Scene scene = new Scene(node);
            stage.setScene(scene);
            stage.setUserData(this);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void setTable(){
      tableView.getItems().clear();
      tableView.getItems().addAll(DataStore.getInstance().students) ;
    }
}
