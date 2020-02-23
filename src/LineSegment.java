import java.awt.*;

public class LineSegment extends Shape1D {
    private Point secondPoint;

    public LineSegment(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        super(theCenter, borderColor, hasDirection);
        this.secondPoint = secondPoint;
    }

    @Override
    public void draw(Graphics2D graphics2D) {

    }

    @Override
    public void move(Point point) {

    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }
}

