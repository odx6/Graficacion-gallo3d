import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Nube3D extends Application {

    
    public void start(Stage primaryStage) throws Exception {
        // Crear esferas para representar la nube
        Sphere esfera1 = new Sphere(30);
        Sphere esfera2 = new Sphere(40);
        Sphere esfera3 = new Sphere(35);
        
        // Configurar la posición de las esferas
        esfera1.setTranslateX(-20);
        esfera1.setTranslateY(10);
        esfera1.setTranslateZ(0);
        
        esfera2.setTranslateX(0);
        esfera2.setTranslateY(0);
        esfera2.setTranslateZ(0);
        
        esfera3.setTranslateX(30);
        esfera3.setTranslateY(-10);
        esfera3.setTranslateZ(0);
        
        // Cambiar el color de las esferas
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.WHITE);
        material.setSpecularColor(Color.LIGHTGRAY);
        
        esfera1.setMaterial(material);
        esfera2.setMaterial(material);
        esfera3.setMaterial(material);
        
        // Crear un objeto Group y agregar las esferas
        Group root = new Group(esfera1, esfera2, esfera3);
        
        // Aplicar una transformación de traslación a la nube
        Translate traslacion = new Translate(150, 150, 0);
        root.getTransforms().add(traslacion);
        
        // Crear una escena y agregar el objeto Group
        Scene scene = new Scene(root, 300, 300, Color.LIGHTBLUE);
        
        // Configurar el título de la ventana y mostrarla
        primaryStage.setTitle("Nube 3D");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
