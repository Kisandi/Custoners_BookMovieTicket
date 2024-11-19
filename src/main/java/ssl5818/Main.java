package ssl5818;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {
    public static Stage stg;
    public static void main(String[] args) {
        AppInitializer.main(args);
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/viewsBuyers/" + fxml));
        stg.getScene().setRoot(pane);
    }
}
