package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Stage2{



    public static void start(String title){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        Button button = new Button("Next page");

        button.setOnAction(e -> {
            window.close();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        window.setScene(new Scene(layout, 300, 275));
        window.show();
    }

}
