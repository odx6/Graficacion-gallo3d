
import javafx.scene.paint.Color;







public class Chicken {
    private double x;
    private double y;
    private double z;
    private double size;
    private Color bodyColor;
    private Color headColor;
    private Color beakColor;
    private Color combColor;
    private Color wattleColor;
    
    public Chicken(double x, double y, double z, double size, Color bodyColor, Color headColor, Color beakColor, Color combColor, Color wattleColor) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.size = size;
        this.bodyColor = bodyColor;
        this.headColor = headColor;
        this.beakColor = beakColor;
        this.combColor = combColor;
        this.wattleColor = wattleColor;
    }

    
   

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public Color getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(Color beakColor) {
        this.beakColor = beakColor;
    }

    public Color getCombColor() {
        return combColor;
    }

    public void setCombColor(Color combColor) {
        this.combColor = combColor;
    }

    public Color getWattleColor() {
        return wattleColor;
    }

    public void setWattleColor(Color wattleColor) {
        this.wattleColor = wattleColor;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
     public Color getHeadColor() {
        return headColor;
    }
}


