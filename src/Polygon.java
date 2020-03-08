import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class Polygon extends Shape2D {
    private List<Point> points;

    public Polygon(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, borderColor, innerColor);
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
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
