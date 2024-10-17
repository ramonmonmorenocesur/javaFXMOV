package modelo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource(".\\..\\vista\\vista.fxml"));
                

        stage.setTitle("ProyectoNuevo");
        stage.setScene(new Scene(root,600,600));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }

    
}