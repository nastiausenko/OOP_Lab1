import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainController {
    
    @FXML
    private Label label;

    @FXML
    private MenuItem work1;

    @FXML
    private MenuItem work2;

    @FXML
    private void showFormOne(ActionEvent event) throws IOException {
        FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("workone.fxml"));
        Stage stage = new Stage();
        Parent root = loaderOne.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Work1");

        WorkOneController workOne = loaderOne.getController();
        workOne.setMainController(this);
        workOne.setStage(stage);

        stage.show(); 
    }

    @FXML
    private void showFormTwo(ActionEvent event) throws IOException {
        FXMLLoader loaderTwo = new FXMLLoader(getClass().getResource("worktwo.fxml"));
        Stage stage = new Stage();
        Parent root = loaderTwo.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Work2");
        
        WorkTwoController workTwo = loaderTwo.getController();
        workTwo.setMainController(this);
        workTwo.setStage(stage);

        stage.show();
    }

    public void displayText(String text) {
        label.setText(text);
    }

}