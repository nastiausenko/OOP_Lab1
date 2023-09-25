
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WorkTwoController {

    private MainController mainController;    

    private Stage stage;

    @FXML
    private TextField textField;

    @FXML
    private Button cancelButton;

    @FXML
    private Button okButton;

    public void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    private void cancel(ActionEvent event) {
        stage.close();
    }

    @FXML
    private void setText(ActionEvent event) {
        String text = textField.getText();
        mainController.displayText(text);

        stage.close();
    }

    public void setMainController(MainController mainController){
        this.mainController = mainController;
    }

    
}
