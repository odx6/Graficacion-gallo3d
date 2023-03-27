package figura3d;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleFanArray;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TriangleStripArray;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseWheelListener;
import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleFanArray;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TriangleStripArray;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleFanArray;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TriangleStripArray;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import javax.media.j3d.Alpha;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TriangleFanArray;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TriangleStripArray;
import javax.swing.JLabel;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;


/**
 *
 * @author gaspa
 */
public class Gallito1 extends JPanel  implements  MouseWheelListener {
      private Transform3D trans;
    private TransformGroup objTrans;
    private double shearX = 0.0;
    private double shearY = 0.0;
    private double shearZ = 0.0;
    private JLabel label;
    
    public Gallito1(){
       GraphicsConfiguration config= SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas3D =new Canvas3D(config);
        
        this.setLayout(new BorderLayout());
        add(canvas3D);
        
        SimpleUniverse universo=new SimpleUniverse(canvas3D);
        universo.getViewingPlatform().setNominalViewingTransform();
    
        BranchGroup escena = crearGrafoEscena();
        escena.compile();
        
        universo.addBranchGraph(escena);
        addMouseWheelListener(this);
        //EVer
        objTrans = new TransformGroup();
        objTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        
         
          universo.getCanvas().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Actualizar los valores de shear según la posición del mouse
                int x = e.getX();
                int y = e.getY();
                shearX = (double) (x - universo.getCanvas().getWidth() / 2) / (universo.getCanvas().getWidth() / 2);
                shearY = (double) (y - universo.getCanvas().getHeight() / 2) / (universo.getCanvas().getHeight() / 2);
                updateTransform();
            }
        });
        //
    }

    private BranchGroup crearGrafoEscena() {
         BranchGroup objetoRaiz= new BranchGroup();
        //-------------------------FIGURA1--------------------------------------
        int tab[]=new int[1];
        tab[0]=6;
        TriangleFanArray trFan= new TriangleFanArray
                (6,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tab);
         trFan.setCoordinate(0,new Point3f(-0.1f,-0.2f,0f));
       trFan.setCoordinate(1,new Point3f(-0.2f,0f,0f));
       trFan.setCoordinate(2,new Point3f(-0.1f,0.2f,0f));
       trFan.setCoordinate(3,new Point3f(0.1f,0.2f,0f));
        trFan.setCoordinate(4,new Point3f(0.2f,0f,0f));
         trFan.setCoordinate(5,new Point3f(0.1f,-0.2f,0f));
        
       for(int i=0;i<6;i++)trFan.setColor(i,new Color3f(Color.yellow));
        
        //----------------------------------------------------------------------
        TransformGroup mouse= new TransformGroup();
        mouse.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        objetoRaiz.addChild(mouse);
        ////////////////////////////////////////////////////////////////////////
        
        Appearance app = new Appearance();
        app.setPolygonAttributes(new PolygonAttributes(PolygonAttributes.POLYGON_FILL,PolygonAttributes.CULL_NONE,0f));
        
       
        //---------------------------------------------------------------
        //FIGURA1
        Shape3D f1= new Shape3D(trFan,app);
       mouse.addChild(f1);
       
        //rotar la figura con el cursor
        MouseRotate mr = new MouseRotate();
        mr.setTransformGroup(mouse);
        mr.setSchedulingBounds(new BoundingSphere(new Point3d(),1000f));
        objetoRaiz.addChild(mr);
         //transladar la
         MouseTranslate t1= new  MouseTranslate();
         t1.setTransformGroup(mouse);
         t1.setSchedulingBounds(new BoundingSphere(new Point3d(),10000f));
         objetoRaiz.addChild(t1);
         
         MouseZoom  zoom =new MouseZoom();
         zoom.setTransformGroup(mouse);
         zoom.setSchedulingBounds(new BoundingSphere(new Point3d(),10000f));
         objetoRaiz.addChild(zoom);
        return objetoRaiz;
        
        
     
       
    }
    
    public static void main(String[]args){
        JFrame ventana= new JFrame("FIGURITA_UWUU:>");
        Gallito1 panel = new Gallito1();
        ventana.add(panel);
        ventana.setSize(700,700);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
      System.out.println("se activo la baina ");
    }
    private void updateTransform() {
        // Actualizar la matriz de transformación con los valores de shear
        trans = new Transform3D();
        double[] matrix = {
            1.0, 0.0, 0.0, 0.0,
            shearY, 1.0, shearX, 0.0,
            shearZ, shearX, 1.0, 0.0,
            0.0, 0.0, 0.0, 1.0
        };
        trans.set(matrix);
        objTrans.setTransform(trans);
    }
    
}


