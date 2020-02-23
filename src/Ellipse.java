import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class Ellipse extends Shape2D {
    private Point firstPoint;
    private Point secondPoint;
    private double smallFocus;
    private double bigFocus;

    public Ellipse(Point theCenter, Color borderColor, Color innerColor, Point firstPoint, Point secondPoint) {
        super(theCenter, borderColor, innerColor);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        super.draw(graphics2D);
    }

    @Override
    public void move(Point point) {
        super.move(point);
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public void setSmallFocus(double smallFocus) {
        this.smallFocus = smallFocus;
    }

    public void setBigFocus(double bigFocus) {
        this.bigFocus = bigFocus;
    }
}
