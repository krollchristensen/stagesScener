package org.example.stagesscener;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scene1Controller {
    private Stage stage;
    private Scene scene2;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setScene2(Scene scene2) {
        this.scene2 = scene2;
    }

    @FXML
    private void switchToScene2() {
        stage.setScene(scene2);
    }
}
