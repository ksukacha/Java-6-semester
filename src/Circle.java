import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends Ellipse {
    public Circle(Point theCenter, Point firstPoint, Color borderColor, Color innerColor) {
        super(theCenter, firstPoint, firstPoint, borderColor, innerColor);
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        super.draw(graphics2D);
    }

    @Override
    public void move(Point point) {
        super.move(point);
    }
}
