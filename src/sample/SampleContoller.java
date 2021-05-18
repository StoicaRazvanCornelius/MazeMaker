
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SampleContoller {
    @FXML
    public Label helloWorld;
    @FXML
    public Button helloWorldButton;
    @FXML
    public GridPane gridPane;

    public void sayHelloWorld(ActionEvent actionEvent) {
        gridPane.getChildren().remove(helloWorld);
        gridPane.getChildren().remove(helloWorldButton);
        gridPane.getChildren().add(new Button("new Button"));
    }
}
