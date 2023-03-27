import javax.media.j3d.*;
import javax.vecmath.*;

public class Poligonos extends Shape3D {

  public Poligonos() {

    // Definir los vértices de cada polígono
    Point3f[] vertices1 = {
      new Point3f(-0.5f, -0.5f, 0.0f),
      new Point3f(0.5f, -0.5f, 0.0f),
      new Point3f(0.0f, 0.5f, 0.0f)
    };

    Point3f[] vertices2 = {
      new Point3f(-0.5f, 0.5f, 0.0f),
      new Point3f(-0.5f, -0.5f, 0.0f),
      new Point3f(0.0f, 0.0f, -0.5f)
    };

    // Definir las caras de cada polígono
    TriangleArray triangleArray = new TriangleArray(7 * 3, GeometryArray.COORDINATES);
    triangleArray.setCoordinates(0, vertices1);
    triangleArray.setCoordinates(3, vertices2);

    // Crear la apariencia de los polígonos
    Appearance appearance = new Appearance();
    PolygonAttributes polyAttrib = new PolygonAttributes();
    polyAttrib.setPolygonMode(PolygonAttributes.POLYGON_FILL);
    polyAttrib.setCullFace(PolygonAttributes.CULL_NONE);
    appearance.setPolygonAttributes(polyAttrib);

    // Asignar la apariencia a la figura
    this.setGeometry(triangleArray);
    this.setAppearance(appearance);

  }
  public static void main(String[] args) {
        new Poligonos();
    }

}

