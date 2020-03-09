import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape2D {
    private List<Point> points;

    public Polygon(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        super(theCenter, borderColor, innerColor);
        this.points = new ArrayList<>();
        this.points.addAll(points);
    }

    public void addPoint(Point newPoint) {
        this.getPoints().add(newPoint);
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        int[] xPoints = new int[points.size()];
        int[] yPoints = new int[points.size()];
        int counter = 0;
        for(Point point: points) {
            xPoints[counter] = point.x;
            yPoints[counter] = point.y;
            counter++;
        }
        graphics2D.drawPolygon(xPoints, yPoints, counter);
    }

    @Override
    public void move(Point point) {
    }
}
