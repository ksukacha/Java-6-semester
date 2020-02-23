import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class Parallelogram extends Polygon {
    public Parallelogram(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        super(theCenter, borderColor, innerColor, points);
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
