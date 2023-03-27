
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.media.j3d.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.vecmath.*;

public class Sesgado3D extends JPanel {

    private Transform3D trans;
    private TransformGroup objTrans;
    private double shearX = 0.0;
    private double shearY = 0.0;
    private double shearZ = 0.0;
    private JLabel label;

    public Sesgado3D() {
 
        // Crear el universo
        SimpleUniverse universe = new SimpleUniverse();
        BranchGroup group = new BranchGroup();

        // Crear el cubo
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
        
       
        
       
        Appearance app = new Appearance();
        app.setPolygonAttributes(new PolygonAttributes(PolygonAttributes.POLYGON_FILL,PolygonAttributes.CULL_NONE,0f));
 
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
         
        Transform3D traslacion2 = new Transform3D();
        traslacion2.set(new Vector3f(0f,-0.5f,0.15f));//0.5f,0,0
        TransformGroup tg2 = new TransformGroup(traslacion2);
        //cono
        Cone cono2= new Cone(0.3f,0.1f,aparienciaRoja);//0.2 0.5
        //objetoRaiz.addChild(cono);
         tg2.addChild(cono2);
         
        
       Shape3D f1= new Shape3D(trFan,app);
       Shape3D f2= new Shape3D(trFan2,app);
       Shape3D  f3=new Shape3D(trStrip,app);
         //FIGURA2 5
 Shape3D  f4 = new Shape3D(trFan3,app);
  Shape3D  f5 =new Shape3D(trFan4,app);
  Shape3D  f6 =new Shape3D(trStrip1,app);
         
  Shape3D  f7 =new Shape3D(trFan5,app);
  Shape3D  f8 =new Shape3D(trFan6,app);
  Shape3D  f9 =new Shape3D(trStrip2,app);
         
  Shape3D  f10 =new Shape3D(trFan7,app);
 Shape3D  f11 = new Shape3D(trFan8,app);
 Shape3D  f12 = new Shape3D(trStrip3,app);
         
 Shape3D  f13= new Shape3D(trFan9,app);
  Shape3D  f14 =new Shape3D(trFan10,app);
  Shape3D  f15 =new Shape3D(trStrip4,app);
         
Shape3D  f16 =new Shape3D(trFan11,app);
  Shape3D  f17 =new Shape3D(trFan12,app);
  Shape3D  f18=new Shape3D(trStrip5,app);
         
 Shape3D  f19 = new Shape3D(trFan13,app);
  Shape3D  f20 =new Shape3D(trFan14,app);
 Shape3D  f21 = new Shape3D(trStrip6,app);
         
Shape3D  f22 =new Shape3D(trFan15,app);
Shape3D  f23 =new Shape3D(trFan16,app);
 Shape3D  f24 = new Shape3D(trStrip7,app);
         
 Shape3D  f25 = new Shape3D(trFan17,app);
Shape3D  f26 =new Shape3D(trFan18,app);
Shape3D  f27 =new Shape3D(trStrip8,app);
        
Shape3D  f28 =new Shape3D(trFan19,app);
Shape3D  f29 =new Shape3D(trFan20,app);
Shape3D  f30=new Shape3D(trStrip9,app);
       
        objTrans = new TransformGroup();
        objTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
         objTrans.addChild(tg1);    
         objTrans.addChild(tg2); 

        objTrans.addChild(f1);           
        objTrans.addChild(f2);
        objTrans.addChild(f3);
objTrans.addChild(f4);
objTrans.addChild(f5);
objTrans.addChild(f6);
objTrans.addChild(f7);
objTrans.addChild(f8);
objTrans.addChild(f9);
objTrans.addChild(f10);
objTrans.addChild(f11);
objTrans.addChild(f12);
objTrans.addChild(f13);
objTrans.addChild(f14);
objTrans.addChild(f15);
objTrans.addChild(f16);
objTrans.addChild(f17);
objTrans.addChild(f18);
objTrans.addChild(f19);
objTrans.addChild(f20);
objTrans.addChild(f21);
objTrans.addChild(f22);
objTrans.addChild(f23);
objTrans.addChild(f24);
objTrans.addChild(f25);
objTrans.addChild(f26);
objTrans.addChild(f27);
objTrans.addChild(f28);
objTrans.addChild(f29);
objTrans.addChild(f30);

   
        

        group.addChild(objTrans);
 MouseRotate mr = new MouseRotate();
        mr.setTransformGroup(objTrans);
        mr.setSchedulingBounds(new BoundingSphere(new Point3d(),1000f));
        group.addChild(mr);
         //transladar la
         MouseTranslate t1= new  MouseTranslate();
         t1.setTransformGroup(objTrans);
         t1.setSchedulingBounds(new BoundingSphere(new Point3d(),10000f));
         group.addChild(t1);
         
         com.sun.j3d.utils.behaviors.mouse.MouseZoom  zoom =new com.sun.j3d.utils.behaviors.mouse.MouseZoom();
         zoom.setTransformGroup(objTrans);
         zoom.setSchedulingBounds(new BoundingSphere(new Point3d(),10000f));
         group.addChild(zoom);
        // Agregar un listener para el movimiento del mouse
 
        universe.getCanvas().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Actualizar los valores de shear según la posición del mouse
                int x = e.getX();
                int y = e.getY();
                shearX = (double) (x - universe.getCanvas().getWidth() / 2) / (universe.getCanvas().getWidth() / 2);
                shearY = (double) (y - universe.getCanvas().getHeight() / 2) / (universe.getCanvas().getHeight() / 2);
                updateTransform();
            }
        });
        

        // Agregar la rama al universo y mostrarlo
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph(group);

        
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

    public static void main(String[] args) {
        new Sesgado3D();
    }
}

