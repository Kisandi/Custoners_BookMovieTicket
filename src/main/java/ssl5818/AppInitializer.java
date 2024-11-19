package ssl5818;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Main.stg = primaryStage;  // Assign the stage to the static variable
        AnchorPane load = FXMLLoader.load(getClass().getResource("/viewsBuyers/StartPage.fxml"));

        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movie Ticket Booking");
        primaryStage.show();
    }


}
