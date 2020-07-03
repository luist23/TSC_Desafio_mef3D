package main.java.com.luist23.mef3d;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.utils.Utiles;

public class Main extends Application {

    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Stage 1");
        button = new Button("Next page");


        button.setOnAction(e -> {
            Stage2.start("stage 2");
            //window.close();
        });

        HBox hBox= new HBox(button, Utiles.imagen("a",25,50));
        //StackPane layout = new StackPane();
        //layout.getChildren().add(button, Utiles.imagen("a"));

        window.setScene(new Scene(hBox));
        window.setMaximized(true); //pantalla completa
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
