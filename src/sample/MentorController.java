package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class MentorController implements Initializable {
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colAge;

    @FXML
    private TableColumn<?, ?> colClass;

    @FXML
    private TableColumn<?, ?> colFatherName;

    @FXML
    private TableColumn<?, ?> colNRCNo;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colOccupation;

    @FXML
    private TableView<Mentor> tableView;

    private final DataStore store = DataStore.getInstance();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableView.getItems().addAll(store.mentors);
    }
}
