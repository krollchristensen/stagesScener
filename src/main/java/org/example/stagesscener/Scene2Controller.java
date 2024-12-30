package org.example.stagesscener;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scene2Controller {
    private Stage stage;
    private Scene scene1;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setScene1(Scene scene1) {
        this.scene1 = scene1;
    }

    @FXML
    private void switchToScene1() {
        stage.setScene(scene1);
    }
}
