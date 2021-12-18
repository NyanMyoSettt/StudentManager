package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassroomController implements Initializable {
    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnSave;

    @FXML
    private TableColumn<String  , Classroom> colClassName;

    @FXML
    private TableColumn<Integer, Classroom> colFees;

    @FXML
    private TextField txtClassName;

    @FXML
    private TextField txtFees;

    @FXML
    private TableView<Classroom> tableView;

    private final DataStore store = DataStore.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableView.getItems().addAll(store.classrooms);
    }
}
