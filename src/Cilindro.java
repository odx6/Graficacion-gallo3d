/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ever
 */


/**
 *
 * @author gaspa
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Cilindro extends Application {

    private double mousePosX, mousePosY;
    private double mouseOldX, mouseOldY;
    private final Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
    private final Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
    
    private final Rotate rotateX1 = new Rotate(50, Rotate.X_AXIS);
    private final Rotate rotateY1 = new Rotate(50, Rotate.Y_AXIS);

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.LIGHTBLUE);
        
        //Crear el cilindro
        PhongMaterial material = new PhongMaterial();     
        PhongMaterial material2 = new PhongMaterial();       
        PhongMaterial verde = new PhongMaterial();    
        PhongMaterial blanco = new PhongMaterial();       
        PhongMaterial negro = new PhongMaterial();




        material.setDiffuseColor(Color.ORANGE);
         verde.setDiffuseColor(Color.GREEN);    
         negro.setDiffuseColor(Color.BLACK );     
         blanco.setDiffuseColor(Color.WHITE);

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
        PhongMaterial materialx = new PhongMaterial();
        materialx.setDiffuseColor(Color.WHITE);
        materialx.setSpecularColor(Color.LIGHTGRAY);
        
        esfera1.setMaterial(materialx);
        esfera2.setMaterial(materialx);
        esfera3.setMaterial(materialx);
        
        // Crear un objeto Group y agregar las esferas
        Group nube = new Group(esfera1, esfera2, esfera3);    
       

        
        // Aplicar una transformación de traslación a la nube
        Translate traslacion = new Translate(150, 50, 0);    
        

        nube.getTransforms().add(traslacion);       
        

         
// Aplicar el material al cilindros

        Cylinder cilindro = new Cylinder();
        cilindro.setRadius(50);
        cilindro.setHeight(130);
        cilindro.setTranslateX(350);
        cilindro.setTranslateY(186);//188
        cilindro.getTransforms().addAll(rotateX, rotateY);
        cilindro.setMaterial(material);
         material2.setDiffuseColor(Color.BLUE);
        Cylinder cilindro2 = new Cylinder();
        cilindro2.setRadius(35);
        cilindro2.setHeight(70);
        cilindro2.setTranslateX(350);
        cilindro2.setTranslateY(175);//186
        cilindro2.getTransforms().addAll(rotateX, rotateY);
        cilindro2.setMaterial(material2);
        
        
         Cylinder cilindro1 = new Cylinder();
        cilindro1.setRadius(30);
        cilindro1.setHeight(80);
        cilindro1.setTranslateX(430);
        cilindro1.setTranslateY(210);
        cilindro1.getTransforms().addAll(rotateX, rotateY);
         cilindro1.setMaterial(material);
        //crear la esfera
        Sphere sphere = new Sphere(35);
        sphere.setTranslateX(250);//250
        sphere.setTranslateY(285);//290
        sphere.setTranslateZ(0);
        sphere.getTransforms().addAll(rotateX, rotateY);
        sphere.setMaterial(negro);
        Sphere sphere1 = new Sphere(35);
        sphere1.setTranslateX(380);//380
        sphere1.setTranslateY(285);//290
        sphere1.setTranslateZ(0);
        sphere1.getTransforms().addAll(rotateX, rotateY);
        sphere1.setMaterial(negro);
        Sphere sphere3 = new Sphere(25);
        sphere3.setTranslateX(250);//250
        sphere3.setTranslateY(285);//290
        sphere3.setTranslateZ(0);
        sphere3.getTransforms().addAll(rotateX, rotateY);
        sphere3.setMaterial(blanco);
        Sphere sphere4 = new Sphere(25);
        sphere4.setTranslateX(380);//380
        sphere4.setTranslateY(285);//290
        sphere4.setTranslateZ(0);
        sphere4.getTransforms().addAll(rotateX, rotateY);
        sphere4.setMaterial(blanco);
        //crear el cubo
        Box box = new Box(100, 100, 100);
        box.setTranslateX(250);
        box.setTranslateY(200);
        box.setTranslateZ(0);
        box.getTransforms().addAll(rotateX, rotateY);
         box.setMaterial(verde);
        // Agregar el cilindro a la escena
        root.getChildren().add(cilindro);
          root.getChildren().add(cilindro1);
          root.getChildren().add(cilindro2);
          root.getChildren().add(sphere);
          root.getChildren().add(box);
          root.getChildren().add(sphere1);
          root.getChildren().add(sphere3);
          root.getChildren().add(sphere4);         
         

        
        // Vincular la rotación del cilindro a la posición del mouse
        scene.setOnMousePressed(event -> {
            mousePosX = event.getSceneX();
            mousePosY = event.getSceneY();
            mouseOldX = event.getSceneX();
            mouseOldY = event.getSceneY();
        });

        scene.setOnMouseDragged(event -> {
            mouseOldX = mousePosX;
            mouseOldY = mousePosY;
            mousePosX = event.getSceneX();
            mousePosY = event.getSceneY();
            double deltaX = (mousePosX - mouseOldX) / scene.getWidth() * 360;
            double deltaY = (mousePosY - mouseOldY) / scene.getHeight() * 360;
            rotateX.setAngle(rotateX.getAngle() - deltaY);
            rotateY.setAngle(rotateY.getAngle() + deltaX);
        });
        
// suponiendo que flower es el objeto Group que creaste anteriormente
           root.getChildren().add(nube);                
               

        primaryStage.setTitle("Cilindro en 3D");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


