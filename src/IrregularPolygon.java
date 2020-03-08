import java.awt.*;
import java.util.List;

public class IrregularPolygon extends Polygon {

    public IrregularPolygon(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, points, borderColor, innerColor);
    }
}
