import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class Parallelogram extends IrregularPolygon {
    public Parallelogram(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, points, borderColor, innerColor);
    }
}
