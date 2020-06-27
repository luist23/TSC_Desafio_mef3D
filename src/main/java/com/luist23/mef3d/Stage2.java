package main.java.com.luist23.mef3d;

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
        Button button = new Button("x∇(A)+xy∇^2 (B)=78.4");

        button.setOnAction(e -> {
            window.close();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        window.setScene(new Scene(layout, 300, 275));
        window.show();
    }

}
