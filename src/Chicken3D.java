

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;

public class Chicken3D extends Group {
    private Chicken chicken;

    public Chicken3D() {
        this.chicken = new Chicken(0, 0, 0, 50, Color.WHITE, Color.RED, Color.YELLOW, Color.RED, Color.RED);

        // Cuerpo del pollo
        Box body = new Box(chicken.getSize(), chicken.getSize() * 2, chicken.getSize());
        body.setTranslateX(chicken.getX());
        body.setTranslateY(chicken.getY());
        body.setTranslateZ(chicken.getZ());
        body.setMaterial(new PhongMaterial(chicken.getBodyColor()));
        this.getChildren().add(body);

        // Cabeza del pollo
        Sphere head = new Sphere(chicken.getSize());
        head.setTranslateX(chicken.getX());
        head.setTranslateY(chicken.getY() + (chicken.getSize() * 2));
        head.setTranslateZ(chicken.getZ());
        head.setMaterial(new PhongMaterial(chicken.getHeadColor()));
        this.getChildren().add(head);

        // Pico del pollo
        Box beak = new Box(chicken.getSize() / 2, chicken.getSize() / 4, chicken.getSize() / 4);
        beak.setTranslateX(chicken.getX());
        beak.setTranslateY(chicken.getY() + (chicken.getSize() * 2) - (chicken.getSize() / 4));
        beak.setTranslateZ(chicken.getZ() + (chicken.getSize() / 2));
        beak.setMaterial(new PhongMaterial(chicken.getBeakColor()));
        this.getChildren().add(beak);

        // Cresta del pollo
        Cylinder comb = new Cylinder(chicken.getSize() / 4, chicken.getSize() / 2);
        comb.setTranslateX(chicken.getX());
        comb.setTranslateY(chicken.getY() + (chicken.getSize() * 2));
        comb.setTranslateZ(chicken.getZ() + (chicken.getSize() / 2));
        comb.setMaterial(new PhongMaterial(chicken.getCombColor()));
        this.getChildren().add(comb);

        // Carúnculas del pollo
        Sphere wattle1 = new Sphere(chicken.getSize());

wattle1.setTranslateX(chicken.getX() + (chicken.getSize() / 2));
wattle1.setTranslateY(chicken.getY() + (chicken.getSize() * 2) - (chicken.getSize() / 4));
wattle1.setTranslateZ(chicken.getZ() + (chicken.getSize() / 2));
wattle1.setMaterial(new PhongMaterial(chicken.getWattleColor()));
this.getChildren().add(wattle1);


 Sphere wattle2 = new Sphere(chicken.getSize() / 6);
    wattle2.setTranslateX(chicken.getX() + (chicken.getSize() / 2) + (chicken.getSize() / 4));
    wattle2.setTranslateY(chicken.getY() + (chicken.getSize() * 2) - (chicken.getSize() / 4));
    wattle2.setTranslateZ(chicken.getZ() + (chicken.getSize() / 2));
    wattle2.setMaterial(new PhongMaterial(chicken.getWattleColor()));
    this.getChildren().add(wattle2);
}
    }