package vildan.fxandgpio3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class HelloController {

    @FXML
    private Label ledDurum;

    @FXML
    void ledleriSondur(ActionEvent event) {
        ledDurum.setText("ledler söndü");
    }

    @FXML
    void ledleriYak(ActionEvent event) {
        ledDurum.setText("ledler yandı");
    }


}//end class
