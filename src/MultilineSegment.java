import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class MultilineSegment extends Shape1D {
    private List<LineSegment> lineSegments;

    public MultilineSegment(Point theCenter, Color borderColor, boolean hasDirection, List<LineSegment> lineSegments) {
        super(theCenter, borderColor, hasDirection);
        this.lineSegments = lineSegments;
    }

    @Override
    public void draw(Graphics2D graphics2D) {

    }

    @Override
    public void move(Point point) {

    }
}
