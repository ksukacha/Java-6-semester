import javafx.util.Pair;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends Ellipse {
    public Circle(Point theCenter, Point firstPoint, Color borderColor, Color innerColor) {
        super(theCenter, firstPoint, firstPoint, borderColor, innerColor);
    }

    @Override
    public Pair<Double, Double> countFocuses() {
        double radius = Math.sqrt(Math.pow(this.getFirstPoint().x - this.getLocation().x, 2) +
                                  Math.pow(this.getFirstPoint().y - this.getLocation().y, 2));
        return new Pair<>(radius, radius);
    }
}
