package lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {

    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainScene.fxml")));
    Scene scene = new Scene(root);

    stage.setTitle("Lab1");
    stage.setScene(scene);
    stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}