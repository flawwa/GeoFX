package dad.geofx.interfaz;

import dad.geofx.api.GeoService; // Importa la implementación concreta
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GeoService geoService = new GeoService(); // Instancia de la implementación concreta
        GeoController root = new GeoController(geoService); // Pasando la implementación concreta al constructor
        primaryStage.setTitle("Aplicación ficheros");
        primaryStage.setScene(new Scene(root.getView(), 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
