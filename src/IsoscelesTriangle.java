import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class IsoscelesTriangle extends IrregularPolygon {
    public IsoscelesTriangle(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, points, borderColor, innerColor);
    }
}
