package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controlador implements Initializable {
    // atributos
    private Circle[] bolas;
    @FXML
    VBox escenarioPrincipal;
    @FXML
    Pane escenarioArriba;
    @FXML
    Pane escenarioAbajo;
    @FXML
    Label etiqueta1;
    @FXML
    Label etiqueta2;
    @FXML
    Label etiqueta3;
    @FXML
    Label etiqueta4;
    @FXML
    Label etiqueta5;
    @FXML
    Button botonPosicion;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bolas=new Circle[5];
        escenarioPrincipal.setStyle("-fx-background-color:darkgreen");
        escenarioArriba.setStyle("-fx-background-color:grey");
        escenarioAbajo.setStyle("-fx-background-color:white");
    }

    public void etiquetaSeleccionada(MouseEvent evento) {
        Label etiqueta = (Label) evento.getSource();
        if (etiqueta1.getTextFill() == Color.RED) {
            etiqueta1.setTextFill(Color.BLACK);
        }
        if (etiqueta2.getTextFill() == Color.RED) {
            etiqueta2.setTextFill(Color.BLACK);
        }
        if (etiqueta3.getTextFill() == Color.RED) {
            etiqueta3.setTextFill(Color.BLACK);
        }
        if (etiqueta4.getTextFill() == Color.RED) {
            etiqueta4.setTextFill(Color.BLACK);
        }
        if (etiqueta5.getTextFill() == Color.RED) {
            etiqueta5.setTextFill(Color.BLACK);
        }
        etiqueta.setTextFill(Color.RED);
    }

    public void posicionRaton(MouseEvent evento) {
        int posicionX= (int)evento.getX();
        int posicionY=(int)evento.getY();
        
        if (etiqueta1.getTextFill() == Color.RED) {
            etiqueta1.setText("Bola1 (" +
                    posicionX+ "," +posicionY + ")");
                  iniciarBola(posicionX, posicionY, 1);
                    
        } else if (etiqueta2.getTextFill() == Color.RED) {
            etiqueta2.setText("Bola2 (" +
                    posicionX+ "," +posicionY+ ")");
                    iniciarBola(posicionX, posicionY, 2);
        } else if (etiqueta3.getTextFill() == Color.RED) {
            etiqueta3.setText("Bola3 (" +
                   posicionX + "," + posicionY + ")");
                   iniciarBola(posicionX, posicionY, 3);
        } else if (etiqueta4.getTextFill() == Color.RED) {
            etiqueta4.setText("Bola4 (" +
                    posicionX+ "," + posicionY + ")");
                    iniciarBola(posicionX, posicionY, 4);
        } else if (etiqueta5.getTextFill() == Color.RED) {
            etiqueta5.setText("Bola5 (" +
                   posicionX+ "," + posicionY + ")");
                   iniciarBola(posicionX, posicionY, 5);
        }

    }
     public void iniciarBola(int posicionX,int posicionY,int numBolas){
        bolas[numBolas-1] = new Circle(posicionX,posicionY,5);

    } 
    public void posicionarBola(){
        if (bolas[0]!=null&&etiqueta1.getTextFill()==Color.RED){
            etiqueta1.setTextFill(Color.BLUE);
            bolas[0].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[0]);
        }
        if (bolas[1]!=null&&etiqueta2.getTextFill()==Color.RED){
            etiqueta2.setTextFill(Color.BLUE);
            bolas[1].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[1]);
        }
        if (bolas[2]!=null&&etiqueta3.getTextFill()==Color.RED){
            etiqueta3.setTextFill(Color.BLUE);
            bolas[2].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[2]);
        }
        if (bolas[3]!=null&&etiqueta4.getTextFill()==Color.RED){
            etiqueta4.setTextFill(Color.BLUE);
            bolas[3].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[3]);
        }
        if (bolas[4]!=null&&etiqueta5.getTextFill()==Color.RED){
            etiqueta5.setTextFill(Color.BLUE);
            bolas[4].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[4]);
        }
        if(etiqueta1.getTextFill()==Color.BLUE&&etiqueta2.getTextFill()==Color.BLUE&&etiqueta3.getTextFill()==Color.BLUE&&etiqueta4.getTextFill()==Color.BLUE&&etiqueta5.getTextFill()==Color.BLUE){
            botonPosicion.setVisible(false);
        }
       



    }

}