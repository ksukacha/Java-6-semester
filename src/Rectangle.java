import java.awt.Point;
import java.awt.Color;
import java.util.List;

public class Rectangle extends IrregularPolygon {
    public Rectangle(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, points, borderColor, innerColor);
    }
}
