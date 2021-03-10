package clases;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BasicFXMLController {

    @FXML
    private TextField texto;

    public void initialize() {
        // TODO
    }


    @FXML
    private void handleButtonAction(ActionEvent event) {
//        label.setText("Hello World!");
    	Stage popUp = new Stage();
    	popUp.initModality(Modality.APPLICATION_MODAL);
    	popUp.setTitle("Pop UP Windows");
    	Label popMsg = new Label(texto.getText());
    	
    	Scene popScence = new Scene(new StackPane(popMsg), 280,200);
    	
    	popUp.setScene(popScence);
    	popUp.show();
    	
    }
}