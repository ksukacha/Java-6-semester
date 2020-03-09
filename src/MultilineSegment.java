import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class MultilineSegment extends Shape1D {
    private List<LineSegment> lineSegments = new ArrayList<>();

    public MultilineSegment(Point theCenter, Point secondPoint, Color borderColor, boolean hasDirection) {
        super(theCenter, borderColor, hasDirection);
        this.lineSegments.add(new LineSegment(theCenter, secondPoint, borderColor, hasDirection));
    }

    public void addSegment(LineSegment newSegment) {
        this.lineSegments.add(newSegment);
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        for(LineSegment lineSegment: lineSegments) {
            lineSegment.draw(graphics2D);
        }
    }

    @Override
    public void move(Point point) {

    }
}
