/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;
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
import javax.vecmath.Vector3f;


/**
 *
 * @author gaspa
 */
public class Gallito extends JPanel  implements  MouseWheelListener {
    
    public Gallito(){
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
         TriangleFanArray trFan2= new TriangleFanArray
                (6,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tab);
         trFan2.setCoordinate(0,new Point3f(-0.1f,-0.2f,0.3f));
       trFan2.setCoordinate(1,new Point3f(-0.2f,0f,0.3f));
       trFan2.setCoordinate(2,new Point3f(-0.1f,0.2f,0.3f));
       trFan2.setCoordinate(3,new Point3f(0.1f,0.2f,0.3f));
        trFan2.setCoordinate(4,new Point3f(0.2f,0f,0.3f));
         trFan2.setCoordinate(5,new Point3f(0.1f,-0.2f,0.3f));
        
       for(int i=0;i<6;i++)trFan2.setColor(i,new Color3f(Color.yellow));
        //relleno-----------------------------------------------------------
         int tab2[]=new int[1];
       tab2[0]=14;
        TriangleStripArray trStrip= new TriangleStripArray
                (14,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab2);
        trStrip.setCoordinate(0,new Point3f(-0.1f,-0.2f,0f));
       trStrip.setCoordinate(1,new Point3f(-0.1f,-0.2f,0.3f));
       trStrip.setCoordinate(2,new Point3f(-0.2f,0f,0f));
       trStrip.setCoordinate(3,new Point3f(-0.2f,0f,0.3f));
       trStrip.setCoordinate(4,new Point3f(-0.1f,0.2f,0f));
       trStrip.setCoordinate(5,new Point3f(-0.1f,0.2f,0.3f));
       trStrip.setCoordinate(6,new Point3f(0.1f,0.2f,0f));
       trStrip.setCoordinate(7,new Point3f(0.1f,0.2f,0.3f));
       trStrip.setCoordinate(8,new Point3f(0.2f,0f,0f));
       trStrip.setCoordinate(9,new Point3f(0.2f,0f,0.3f));
       trStrip.setCoordinate(10,new Point3f(0.1f,-0.2f,0f));
       trStrip.setCoordinate(11,new Point3f(0.1f,-0.2f,0.3f));
       trStrip.setCoordinate(12,new Point3f(-0.1f,-0.2f,0f));
       trStrip.setCoordinate(13,new Point3f(-0.1f,-0.2f,0.3f));
        for(int i=0;i<14;i++)trStrip.setColor(i,new Color3f(Color.orange));
        //----------------------------------------------------------------------
        //-------------------------FIGURA2--------------------------------------
        int tabl[]=new int[1];
        tabl[0]=3;
        TriangleFanArray trFan3= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabl);
         trFan3.setCoordinate(0,new Point3f(-0.1f,0.2f,0f));
       trFan3.setCoordinate(1,new Point3f(0.1f,0.6f,0f));
       trFan3.setCoordinate(2,new Point3f(0.1f,0.2f,0f));
       
        
       for(int i=0;i<3;i++)trFan3.setColor(i,new Color3f(Color.red));
        //----------------------------------------------------------------------
         TriangleFanArray trFan4= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabl);
         trFan4.setCoordinate(0,new Point3f(-0.1f,0.2f,0.3f));
       trFan4.setCoordinate(1,new Point3f(0.1f,0.6f,0.3f));
       trFan4.setCoordinate(2,new Point3f(0.1f,0.2f,0.3f));
      
        
       for(int i=0;i<3;i++)trFan4.setColor(i,new Color3f(Color.red));
        //relleno-----------------------------------------------------------
         int tab3[]=new int[1];
       tab3[0]=8;
        TriangleStripArray trStrip1= new TriangleStripArray
                (8,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab3);
        trStrip1.setCoordinate(0,new Point3f(-0.1f,0.2f,0f));
       trStrip1.setCoordinate(1,new Point3f(-0.1f,0.2f,0.3f));
       trStrip1.setCoordinate(2,new Point3f(0.1f,0.6f,0f));
       trStrip1.setCoordinate(3,new Point3f(0.1f,0.6f,0.3f));
       trStrip1.setCoordinate(4,new Point3f(0.1f,0.2f,0f));
       trStrip1.setCoordinate(5,new Point3f(0.1f,0.2f,0.3f));
       trStrip1.setCoordinate(6,new Point3f(-0.1f,0.2f,0f));
       trStrip1.setCoordinate(7,new Point3f(-0.1f,0.2f,0.3f));
       
        for(int i=0;i<8;i++)trStrip1.setColor(i,new Color3f(Color.red));
        //----------------------------------------------------------------------
        //-------------------------FIGURA3--------------------------------------
        int tabla[]=new int[1];
        tabla[0]=3;
        TriangleFanArray trFan5= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabl);
         trFan5.setCoordinate(0,new Point3f(-0.2f,0f,0f));
       trFan5.setCoordinate(1,new Point3f(-0.4f,0.2f,0f));
       trFan5.setCoordinate(2,new Point3f(-0.1f,0.2f,0f));
       
        
       for(int i=0;i<3;i++)trFan5.setColor(i,new Color3f(Color.green));
        //----------------------------------------------------------------------
         TriangleFanArray trFan6= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabl);
         trFan6.setCoordinate(0,new Point3f(-0.2f,0f,0.3f));
       trFan6.setCoordinate(1,new Point3f(-0.4f,0.2f,0.3f));
       trFan6.setCoordinate(2,new Point3f(-0.1f,0.2f,0.3f));
      
        
       for(int i=0;i<3;i++)trFan6.setColor(i,new Color3f(Color.green));
        //relleno-----------------------------------------------------------
         int tab4[]=new int[1];
       tab4[0]=8;
        TriangleStripArray trStrip2= new TriangleStripArray
                (8,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab4);
        trStrip2.setCoordinate(0,new Point3f(-0.2f,0f,0f));
       trStrip2.setCoordinate(1,new Point3f(-0.2f,0f,0.3f));
       trStrip2.setCoordinate(2,new Point3f(-0.4f,0.2f,0f));
       trStrip2.setCoordinate(3,new Point3f(-0.4f,0.2f,0.3f));
       trStrip2.setCoordinate(4,new Point3f(-0.1f,0.2f,0f));
       trStrip2.setCoordinate(5,new Point3f(-0.1f,0.2f,0.3f));
       trStrip2.setCoordinate(6,new Point3f(-0.2f,0f,0f));
       trStrip2.setCoordinate(7,new Point3f(-0.2f,0f,0.3f));
       
        for(int i=0;i<8;i++)trStrip2.setColor(i,new Color3f(Color.green));
        //----------------------------------------------------------------------
        //-------------------------FIGURA4--------------------------------------
        int tabla1[]=new int[1];
        tabla1[0]=4;
        TriangleFanArray trFan7= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla1);
         trFan7.setCoordinate(0,new Point3f(-0.4f,0.2f,0f));
       trFan7.setCoordinate(1,new Point3f(-0.6f,0.4f,0f));
       trFan7.setCoordinate(2,new Point3f(-0.3f,0.4f,0f));
       trFan7.setCoordinate(3,new Point3f(-0.1f,0.2f,0f));
       
        
       for(int i=0;i<4;i++)trFan7.setColor(i,new Color3f(Color.blue));
        //----------------------------------------------------------------------
         TriangleFanArray trFan8= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla1);
         trFan8.setCoordinate(0,new Point3f(-0.4f,0.2f,0.3f));
       trFan8.setCoordinate(1,new Point3f(-0.6f,0.4f,0.3f));
       trFan8.setCoordinate(2,new Point3f(-0.3f,0.4f,0.3f));
        trFan8.setCoordinate(3,new Point3f(-0.1f,0.2f,0.3f));
      
        
       for(int i=0;i<4;i++)trFan8.setColor(i,new Color3f(Color.blue));
        //relleno-----------------------------------------------------------
         int tab5[]=new int[1];
       tab5[0]=10;
        TriangleStripArray trStrip3= new TriangleStripArray
                (10,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab5);
        trStrip3.setCoordinate(0,new Point3f(-0.4f,0.2f,0f));
       trStrip3.setCoordinate(1,new Point3f(-0.4f,0.2f,0.3f));
       trStrip3.setCoordinate(2,new Point3f(-0.6f,0.4f,0f));
       trStrip3.setCoordinate(3,new Point3f(-0.6f,0.4f,0.3f));
       trStrip3.setCoordinate(4,new Point3f(-0.3f,0.4f,0f));
       trStrip3.setCoordinate(5,new Point3f(-0.3f,0.4f,0.3f));
       trStrip3.setCoordinate(6,new Point3f(-0.1f,0.2f,0f));
       trStrip3.setCoordinate(7,new Point3f(-0.1f,0.2f,0.3f));
       trStrip3.setCoordinate(8,new Point3f(-0.4f,0.2f,0f));
       trStrip3.setCoordinate(9,new Point3f(-0.4f,0.2f,0.3f));
       
        for(int i=0;i<8;i++)trStrip3.setColor(i,new Color3f(Color.blue));
        //----------------------------------------------------------------------
         //-------------------------FIGURA5--------------------------------------
        int tabla2[]=new int[1];
        tabla2[0]=3;
        TriangleFanArray trFan9= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla2);
         trFan9.setCoordinate(0,new Point3f(-0.7f,-0.1f,0f));
       trFan9.setCoordinate(1,new Point3f(-0.6f,0.4f,0f));
       trFan9.setCoordinate(2,new Point3f(-0.4f,0.2f,0f));
       
        
       for(int i=0;i<3;i++)trFan9.setColor(i,new Color3f(Color.pink));
        //----------------------------------------------------------------------
         TriangleFanArray trFan10= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla2);
       trFan10.setCoordinate(0,new Point3f(-0.7f,-0.1f,0.3f));
       trFan10.setCoordinate(1,new Point3f(-0.6f,0.4f,0.3f));
       trFan10.setCoordinate(2,new Point3f(-0.4f,0.2f,0.3f));
      
        
       for(int i=0;i<3;i++)trFan10.setColor(i,new Color3f(Color.pink));
        //relleno-----------------------------------------------------------
         int tab6[]=new int[1];
       tab6[0]=8;
        TriangleStripArray trStrip4= new TriangleStripArray
                (8,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab6);
        trStrip4.setCoordinate(0,new Point3f(-0.7f,-0.1f,0f));
       trStrip4.setCoordinate(1,new Point3f(-0.7f,-0.1f,0.3f));
       trStrip4.setCoordinate(2,new Point3f(-0.6f,0.4f,0f));
       trStrip4.setCoordinate(3,new Point3f(-0.6f,0.4f,0.3f));
       trStrip4.setCoordinate(4,new Point3f(-0.4f,0.2f,0f));
       trStrip4.setCoordinate(5,new Point3f(-0.4f,0.2f,0.3f));
       trStrip4.setCoordinate(6,new Point3f(-0.7f,-0.1f,0f));
       trStrip4.setCoordinate(7,new Point3f(-0.7f,-0.1f,0.3f));
       
        for(int i=0;i<8;i++)trStrip4.setColor(i,new Color3f(Color.pink));
        //----------------------------------------------------------------------
        //-------------------------FIGURA6--------------------------------------
        int tabla3[]=new int[1];
        tabla3[0]=4;
        TriangleFanArray trFan11= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla3);
         trFan11.setCoordinate(0,new Point3f(0.1f,0.5f,0f));
       trFan11.setCoordinate(1,new Point3f(0.1f,0.6f,0f));
       trFan11.setCoordinate(2,new Point3f(0.2f,0.6f,0f));
       trFan11.setCoordinate(3,new Point3f(0.2f,0.5f,0f));
       
        
       for(int i=0;i<4;i++)trFan11.setColor(i,new Color3f(Color.blue));
        //----------------------------------------------------------------------
         TriangleFanArray trFan12= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla3);
         trFan12.setCoordinate(0,new Point3f(0.1f,0.5f,0.3f));
       trFan12.setCoordinate(1,new Point3f(0.1f,0.6f,0.3f));
       trFan12.setCoordinate(2,new Point3f(0.2f,0.6f,0.3f));
        trFan12.setCoordinate(3,new Point3f(0.2f,0.5f,0.3f));
      
        
       for(int i=0;i<4;i++)trFan12.setColor(i,new Color3f(Color.blue));
        //relleno-----------------------------------------------------------
         int tab7[]=new int[1];
      tab7[0]=10;
        TriangleStripArray trStrip5= new TriangleStripArray
                (10,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab7);
        trStrip5.setCoordinate(0,new Point3f(0.1f,0.5f,0f));
       trStrip5.setCoordinate(1,new Point3f(0.1f,0.5f,0.3f));
       trStrip5.setCoordinate(2,new Point3f(0.1f,0.6f,0f));
       trStrip5.setCoordinate(3,new Point3f(0.1f,0.6f,0.3f));
       trStrip5.setCoordinate(4,new Point3f(0.2f,0.6f,0f));
       trStrip5.setCoordinate(5,new Point3f(0.2f,0.6f,0.3f));
       trStrip5.setCoordinate(6,new Point3f(0.2f,0.5f,0f));
       trStrip5.setCoordinate(7,new Point3f(0.2f,0.5f,0.3f));
       trStrip5.setCoordinate(8,new Point3f(0.1f,0.5f,0f));
       trStrip5.setCoordinate(9,new Point3f(0.1f,0.5f,0.3f));
       
        for(int i=0;i<10;i++)trStrip5.setColor(i,new Color3f(Color.blue));
        //----------------------------------------------------------------------
        //--------------------FIGURA7------------------------------------------
        int tabla4[]=new int[1];
        tabla4[0]=3;
        TriangleFanArray trFan13= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla4);
         trFan13.setCoordinate(0,new Point3f(0.2f,0.5f,0f));
       trFan13.setCoordinate(1,new Point3f(0.2f,0.6f,0f));
       trFan13.setCoordinate(2,new Point3f(0.3f,0.5f,0f));
       
        
       for(int i=0;i<3;i++)trFan13.setColor(i,new Color3f(Color.orange));
        //----------------------------------------------------------------------
         TriangleFanArray trFan14= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla4);
       trFan14.setCoordinate(0,new Point3f(0.2f,0.5f,0.3f));
       trFan14.setCoordinate(1,new Point3f(0.2f,0.6f,0.3f));
       trFan14.setCoordinate(2,new Point3f(0.3f,0.5f,0.3f));
      
        
       for(int i=0;i<3;i++)trFan14.setColor(i,new Color3f(Color.orange));
        //relleno-----------------------------------------------------------
         int tab8[]=new int[1];
       tab8[0]=8;
        TriangleStripArray trStrip6= new TriangleStripArray
                (8,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab8);
        trStrip6.setCoordinate(0,new Point3f(0.2f,0.5f,0f));
       trStrip6.setCoordinate(1,new Point3f(0.2f,0.5f,0.3f));
       trStrip6.setCoordinate(2,new Point3f(0.2f,0.6f,0f));
       trStrip6.setCoordinate(3,new Point3f(0.2f,0.6f,0.3f));
       trStrip6.setCoordinate(4,new Point3f(0.3f,0.5f,0f));
       trStrip6.setCoordinate(5,new Point3f(0.3f,0.5f,0.3f));
       trStrip6.setCoordinate(6,new Point3f(0.2f,0.5f,0f));
       trStrip6.setCoordinate(7,new Point3f(0.2f,0.5f,0.3f));
        for(int i=0;i<8;i++)trStrip6.setColor(i,new Color3f(Color.orange));
       
       //-------------------------FIGURA8--------------------------------------
        int tabla5[]=new int[1];
        tabla5[0]=4;
        TriangleFanArray trFan15= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla5);
         trFan15.setCoordinate(0,new Point3f(-0.02f,-0.2f,0f));
       trFan15.setCoordinate(1,new Point3f(0.02f,-0.2f,0f));
       trFan15.setCoordinate(2,new Point3f(0.02f,-0.5f,0f));
       trFan15.setCoordinate(3,new Point3f(-0.02f,-0.5f,0f));
       
        
       for(int i=0;i<4;i++)trFan15.setColor(i,new Color3f(Color.blue));
        //----------------------------------------------------------------------
         TriangleFanArray trFan16= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla5);
         trFan16.setCoordinate(0,new Point3f(-0.02f,-0.2f,0.05f));
       trFan16.setCoordinate(1,new Point3f(0.02f,-0.2f,0.05f));
       trFan16.setCoordinate(2,new Point3f(0.02f,-0.5f,0.05f));
        trFan16.setCoordinate(3,new Point3f(-0.02f,-0.5f,0.05f));
      
        
       for(int i=0;i<4;i++)trFan16.setColor(i,new Color3f(Color.blue));
        //relleno-----------------------------------------------------------
         int tab9[]=new int[1];
      tab9[0]=10;
        TriangleStripArray trStrip7= new TriangleStripArray
                (10,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab9);
        trStrip7.setCoordinate(0,new Point3f(-0.02f,-0.2f,0f));
       trStrip7.setCoordinate(1,new Point3f(-0.02f,-0.2f,0.05f));
       trStrip7.setCoordinate(2,new Point3f(0.02f,-0.2f,0f));
       trStrip7.setCoordinate(3,new Point3f(0.02f,-0.2f,0.05f));
       trStrip7.setCoordinate(4,new Point3f(0.02f,-0.5f,0f));
       trStrip7.setCoordinate(5,new Point3f(0.02f,-0.5f,0.05f));
       trStrip7.setCoordinate(6,new Point3f(-0.02f,-0.5f,0f));
       trStrip7.setCoordinate(7,new Point3f(-0.02f,-0.5f,0.05f));
       trStrip7.setCoordinate(8,new Point3f(-0.02f,-0.2f,0f));
       trStrip7.setCoordinate(9,new Point3f(-0.02f,-0.2f,0.05f));
       
        for(int i=0;i<10;i++)trStrip7.setColor(i,new Color3f(Color.blue));
        //-----------------------------------------------------------
       
        //-------------------------FIGURA9--------------------------------------
        int tabla6[]=new int[1];
        tabla6[0]=4;
        TriangleFanArray trFan17= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla6);
         trFan17.setCoordinate(0,new Point3f(-0.02f,-0.2f,0.3f));
       trFan17.setCoordinate(1,new Point3f(0.02f,-0.2f,0.3f));
       trFan17.setCoordinate(2,new Point3f(0.02f,-0.5f,0.3f));
       trFan17.setCoordinate(3,new Point3f(-0.02f,-0.5f,0.3f));
       
        
       for(int i=0;i<4;i++)trFan17.setColor(i,new Color3f(Color.blue));
        //----------------------------------------------------------------------
         TriangleFanArray trFan18= new TriangleFanArray
                (4,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla6);
         trFan18.setCoordinate(0,new Point3f(-0.02f,-0.2f,0.25f));
       trFan18.setCoordinate(1,new Point3f(0.02f,-0.2f,0.25f));
       trFan18.setCoordinate(2,new Point3f(0.02f,-0.5f,0.25f));
        trFan18.setCoordinate(3,new Point3f(-0.02f,-0.5f,0.25f));
      
        
       for(int i=0;i<4;i++)trFan18.setColor(i,new Color3f(Color.blue));
        //relleno-----------------------------------------------------------
         int tab10[]=new int[1];
      tab10[0]=10;
        TriangleStripArray trStrip8= new TriangleStripArray
                (10,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab10);
        trStrip8.setCoordinate(0,new Point3f(-0.02f,-0.2f,0.3f));
       trStrip8.setCoordinate(1,new Point3f(-0.02f,-0.2f,0.25f));
       trStrip8.setCoordinate(2,new Point3f(0.02f,-0.2f,0.3f));
       trStrip8.setCoordinate(3,new Point3f(0.02f,-0.2f,0.25f));
       trStrip8.setCoordinate(4,new Point3f(0.02f,-0.5f,0.3f));
       trStrip8.setCoordinate(5,new Point3f(0.02f,-0.5f,0.25f));
       trStrip8.setCoordinate(6,new Point3f(-0.02f,-0.5f,0.3f));
       trStrip8.setCoordinate(7,new Point3f(-0.02f,-0.5f,0.25f));
       trStrip8.setCoordinate(8,new Point3f(-0.02f,-0.2f,0.3f));
       trStrip8.setCoordinate(9,new Point3f(-0.02f,-0.2f,0.25f));
       
        for(int i=0;i<10;i++)trStrip8.setColor(i,new Color3f(Color.blue));
        //---------------------------FIGURA10--------------------------------
        int tabla7[]=new int[1];
        tabla7[0]=3;
        TriangleFanArray trFan19= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla7);
         trFan19.setCoordinate(0,new Point3f(0.04f,0.6f,0f));
       trFan19.setCoordinate(1,new Point3f(0.1f,0.7f,0f));
       trFan19.setCoordinate(2,new Point3f(0.2f,0.6f,0f));
       
        
       for(int i=0;i<3;i++)trFan19.setColor(i,new Color3f(Color.red));
        //----------------------------------------------------------------------
         TriangleFanArray trFan20= new TriangleFanArray
                (3,TriangleFanArray.COORDINATES|TriangleFanArray.COLOR_3,tabla7);
       trFan20.setCoordinate(0,new Point3f(0.04f,0.6f,0.3f));
       trFan20.setCoordinate(1,new Point3f(0.1f,0.7f,0.3f));
       trFan20.setCoordinate(2,new Point3f(0.2f,0.6f,0.3f));
      
        
       for(int i=0;i<3;i++)trFan20.setColor(i,new Color3f(Color.red));
        //relleno-----------------------------------------------------------
         int tab11[]=new int[1];
       tab11[0]=8;
        TriangleStripArray trStrip9= new TriangleStripArray
                (8,TriangleStripArray.COORDINATES|TriangleStripArray.COLOR_3,tab11);
        trStrip9.setCoordinate(0,new Point3f(0.04f,0.6f,0f));
       trStrip9.setCoordinate(1,new Point3f(0.04f,0.6f,0.3f));
       trStrip9.setCoordinate(2,new Point3f(0.1f,0.7f,0f));
       trStrip9.setCoordinate(3,new Point3f(0.1f,0.7f,0.3f));
       trStrip9.setCoordinate(4,new Point3f(0.2f,0.6f,0f));
       trStrip9.setCoordinate(5,new Point3f(0.2f,0.6f,0.3f));
       trStrip9.setCoordinate(6,new Point3f(0.04f,0.6f,0f));
       trStrip9.setCoordinate(7,new Point3f(0.04f,0.6f,0.3f));
        for(int i=0;i<8;i++)trStrip9.setColor(i,new Color3f(Color.red));
       
        //----------------------------------------------------------------------
        TransformGroup mouse= new TransformGroup();
        mouse.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        objetoRaiz.addChild(mouse);
        ////////////////////////////////////////////////////////////////////////
        
        Appearance app = new Appearance();
        app.setPolygonAttributes(new PolygonAttributes(PolygonAttributes.POLYGON_FILL,PolygonAttributes.CULL_NONE,0f));
        
        //--------------------------------------------------------------
         Appearance aparienciaRoja = new Appearance();
        Color3f rojo = new Color3f(Color.RED);
        ColoringAttributes ca= new ColoringAttributes();
        ca.setColor(rojo);
        aparienciaRoja.setColoringAttributes(ca);
        //----------------------------------------
        Transform3D traslacion1 = new Transform3D();
        traslacion1.set(new Vector3f(0.25f,0.45f,0.15f));//0.5f,0,0
        TransformGroup tg1 = new TransformGroup(traslacion1);
        //cono
        Cone cono= new Cone(0.1f,0.1f,aparienciaRoja);//0.2 0.5
        //objetoRaiz.addChild(cono);
         tg1.addChild(cono);
         mouse.addChild(tg1);
         //---------------------------------------------
         Transform3D traslacion2 = new Transform3D();
        traslacion2.set(new Vector3f(0f,-0.5f,0.15f));//0.5f,0,0
        TransformGroup tg2 = new TransformGroup(traslacion2);
        //cono
        Cone cono2= new Cone(0.3f,0.1f,aparienciaRoja);//0.2 0.5
        //objetoRaiz.addChild(cono);
         tg2.addChild(cono2);
         mouse.addChild(tg2);
        //---------------------------------------------------------------
        //FIGURA1
       mouse.addChild(new Shape3D(trFan,app));
        mouse.addChild(new Shape3D(trFan2,app));
        mouse.addChild(new Shape3D(trStrip,app));
         //FIGURA2 
         mouse.addChild(new Shape3D(trFan3,app));
         mouse.addChild(new Shape3D(trFan4,app));
         mouse.addChild(new Shape3D(trStrip1,app));
         
         mouse.addChild(new Shape3D(trFan5,app));
         mouse.addChild(new Shape3D(trFan6,app));
         mouse.addChild(new Shape3D(trStrip2,app));
         
          mouse.addChild(new Shape3D(trFan7,app));
         mouse.addChild(new Shape3D(trFan8,app));
         mouse.addChild(new Shape3D(trStrip3,app));
         
          mouse.addChild(new Shape3D(trFan9,app));
         mouse.addChild(new Shape3D(trFan10,app));
         mouse.addChild(new Shape3D(trStrip4,app));
         
         mouse.addChild(new Shape3D(trFan11,app));
         mouse.addChild(new Shape3D(trFan12,app));
         mouse.addChild(new Shape3D(trStrip5,app));
         
         mouse.addChild(new Shape3D(trFan13,app));
         mouse.addChild(new Shape3D(trFan14,app));
         mouse.addChild(new Shape3D(trStrip6,app));
         
          mouse.addChild(new Shape3D(trFan15,app));
        mouse.addChild(new Shape3D(trFan16,app));
         mouse.addChild(new Shape3D(trStrip7,app));
         
          mouse.addChild(new Shape3D(trFan17,app));
        mouse.addChild(new Shape3D(trFan18,app));
        mouse.addChild(new Shape3D(trStrip8,app));
        
        mouse.addChild(new Shape3D(trFan19,app));
        mouse.addChild(new Shape3D(trFan20,app));
        mouse.addChild(new Shape3D(trStrip9,app));
        
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
        Gallito panel = new Gallito();
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
    
}


