import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class LineSegment extends Shape1D {
    private Point secondPoint;

    public LineSegment(Point theCenter, Point secondPoint, Color borderColor, boolean hasDirection) {
        super(theCenter, borderColor, hasDirection);
        this.secondPoint = secondPoint;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        graphics2D.drawLine(this.getLocation().x, this.getLocation().y, secondPoint.x, secondPoint.y);
    }

    @Override
    public void move(Point point) {

    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint.x = secondPoint.x;
        this.secondPoint.y = secondPoint.y;
    }
}

