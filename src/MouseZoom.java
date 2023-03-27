import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.AWTEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import javax.vecmath.Vector3d;

public class MouseZoom implements MouseWheelListener {
    private TransformGroup viewTG;
    private Transform3D viewT3D = new Transform3D();
    private Vector3d translation = new Vector3d();
    private double zoomFactor = 1.0;

    public MouseZoom(Canvas3D canvas, TransformGroup viewTG) {
        this.viewTG = viewTG;
        canvas.addMouseWheelListener(this);
    }

    public void mouseWheelMoved(MouseWheelEvent e) {
        int notches = e.getWheelRotation();
        if (notches < 0) {
            zoomFactor *= 1.1;
        } else {
            zoomFactor *= 0.9;
        }

        viewTG.getTransform(viewT3D);
        viewT3D.get(translation);
        translation.z *= zoomFactor;
        viewT3D.setTranslation(translation);
        viewTG.setTransform(viewT3D);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java3D MouseZoom Example");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas3D canvas = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
        frame.add(canvas);

        SimpleUniverse universe = new SimpleUniverse(canvas);
        BranchGroup root = new BranchGroup();

        TransformGroup viewTG = universe.getViewingPlatform().getViewPlatformTransform();
        MouseZoom mouseZoom = new MouseZoom(canvas, viewTG);

//        root.addChild();
        universe.addBranchGraph(root);

        frame.setVisible(true);
    }
}