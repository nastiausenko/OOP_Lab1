
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class WorkOneController implements Initializable {

    private MainController mainController;

    private Stage stage;
 
    @FXML
    private Button cancelButton;

    @FXML
    private ListView<String> listView;

    @FXML
    private Button okButton;

    private String[] groups = {"ІМ-21", "ІМ-22", "ІМ-23", "ІМ-24", "ІП-21", "ІП-22", "ІП-23", "ІП-24", "ІП-25", "ІО-21", "ІО-22", "ІО-23", "ІО-24", "ІО-25", "ІО-26"};
    String selectedGroup;

    public void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    private void cancel(ActionEvent event) {
        stage.close();
    }

    @FXML
    private void setText(ActionEvent event) {
        mainController.displayText(selectedGroup);

        stage.close();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        listView.getItems().addAll(groups);
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                selectedGroup = listView.getSelectionModel().getSelectedItem();
            }
        });
        
    }

    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }
}
