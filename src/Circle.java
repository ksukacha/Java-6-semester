import java.awt.*;

public class Circle extends Ellipse {
    public Circle(Point theCenter, Color borderColor, Color innerColor, Point firstPoint, Point secondPoint) {
        super(theCenter, borderColor, innerColor, firstPoint, secondPoint);
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
