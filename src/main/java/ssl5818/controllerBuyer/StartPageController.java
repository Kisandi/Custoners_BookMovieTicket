package ssl5818.controllerBuyer;

import javafx.event.ActionEvent;
import ssl5818.Main;

import java.io.IOException;

public class StartPageController {
    public void nextPage(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("MovieSelectionPage.fxml");
    }
}
