package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StringController {

    @FXML
    private TextField stringSplit;


    @FXML
    public void actio(Event e){
        System.out.println(stringSplit.getText());
    }

}
