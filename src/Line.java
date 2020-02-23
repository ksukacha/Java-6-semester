import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class Line extends Ray {
    public Line(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        super(theCenter, borderColor, hasDirection, secondPoint);
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
