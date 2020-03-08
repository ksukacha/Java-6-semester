import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class RegularPolygon extends Polygon {
    private int numSides;

    public RegularPolygon(Point theCenter, Point secondPoint, int numSides, Color borderColor, Color innerColor) {
        super(theCenter, new ArrayList<>(), borderColor, innerColor);
        this.getPoints().add(secondPoint);
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

