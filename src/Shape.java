import java.awt.*;

public abstract class Shape {
    private Point theCenter;
    private Color borderColor;
    public Shape(Point theCenter, Color borderColor) {
        this.theCenter = theCenter;
        this.borderColor = borderColor;
    }

    public abstract void draw(Graphics2D graphics2D);
    public Point getLocation() {
        return theCenter;
    }
    public abstract void move(Point point);

    public Color getBorderColor() {
        return borderColor;
    }

    public void setTheCenter(Point theCenter) {
        this.theCenter = theCenter;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}
