import java.awt.*;
import java.util.List;

public class RegularPolygon extends Polygon {
    private int numSides;

    public RegularPolygon(Point theCenter, Color borderColor, Color innerColor, List<Point> points, int numSides) {
        super(theCenter, borderColor, innerColor, points);
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
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

