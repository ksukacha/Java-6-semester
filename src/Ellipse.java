import javafx.util.Pair;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class Ellipse extends Shape2D {
    private Point firstPoint;
    private Point secondPoint;

    public Ellipse(Point theCenter, Point firstPoint, Point secondPoint, Color borderColor, Color innerColor) {
        super(theCenter, borderColor, innerColor);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        Pair<Double, Double> focuses = countFocuses();
        graphics2D.drawOval((int)(this.getLocation().x - focuses.getKey()), (int)(this.getLocation().y - focuses.getValue()),
                (int)(2*focuses.getKey()), (int)(2*focuses.getValue()));
    }

    @Override
    public void move(Point point) {
        super.move(point);
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Pair<Double, Double> countFocuses() {
        double b = Math.sqrt((Math.pow(secondPoint.x - this.getLocation().x, 2) * Math.pow(firstPoint.y - this.getLocation().y, 2) -
                              Math.pow(firstPoint.x - this.getLocation().x, 2) * Math.pow(secondPoint.y - this.getLocation().y, 2)) /
                             (Math.pow(secondPoint.x - this.getLocation().x, 2) - Math.pow(firstPoint.x - this.getLocation().x, 2)));
        double a = Math.sqrt(Math.pow(firstPoint.x - this.getLocation().x, 2) / (1 - (Math.pow(firstPoint.y - this.getLocation().y, 2) / Math.pow(b, 2))));
        return new Pair<>(a, b);
    }
}
