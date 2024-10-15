package modelo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource(".\\..\\vista\\vista.fxml"));
        
       
        /* 
        Group root = new Group();
        Circle circulo = new Circle();
        circulo.setLayoutX(300);
        circulo.setLayoutY(200);
        circulo.setRadius(5);
        circulo.setFill(Color.RED);

        root.getChildren().add(circulo);
        */
        

        stage.setTitle("movimiento");
        stage.setScene(new Scene(root,600,400));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }

    
}
