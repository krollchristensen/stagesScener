package org.example.stagesscener;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Indlæs Scene 1
        FXMLLoader scene1Loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Scene scene1 = new Scene(scene1Loader.load());

        // Indlæs Scene 2
        FXMLLoader scene2Loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        Scene scene2 = new Scene(scene2Loader.load());

        // Få fat i controllerne og bind scenerne
        Scene1Controller scene1Controller = scene1Loader.getController();
        Scene2Controller scene2Controller = scene2Loader.getController();

        scene1Controller.setStage(primaryStage);
        scene1Controller.setScene2(scene2);

        scene2Controller.setStage(primaryStage);
        scene2Controller.setScene1(scene1);

        // Indstil primary stage og vis Scene 1
        primaryStage.setScene(scene1);
        primaryStage.setTitle("JavaFX Scene Eksempel");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
