import java.awt.Point;
import java.awt.Color;
import java.util.ArrayList;

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
}

