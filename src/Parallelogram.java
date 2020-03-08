import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class Parallelogram extends IrregularPolygon {
    public Parallelogram(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, points, borderColor, innerColor);
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
