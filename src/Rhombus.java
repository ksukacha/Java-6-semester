import java.awt.*;
import java.util.List;

public class Rhombus extends IsoscelesTriangle {
    public Rhombus(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
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
