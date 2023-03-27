
import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.stage.Stage;


public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Chicken3D chicken3D = new Chicken3D();
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-200);
        camera.setTranslateY(-50);
        Scene scene = new Scene(chicken3D, 800, 600, true, SceneAntialiasing.BALANCED);
        scene.setCamera(camera);

        primaryStage.setScene(scene);
        primaryStage.setTitle("3D Chicken");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
