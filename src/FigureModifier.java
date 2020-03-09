import java.awt.*;

public class FigureModifier {
    public static void addSegmentToMultilineSegment(Shape multilineSegment, Shape lineSegment) {
        try {
            ((MultilineSegment)multilineSegment).addSegment((LineSegment)lineSegment);
        } catch (ClassCastException ex) {//TODO think about handling exceptions
            ex.printStackTrace();
        }
    }

    public static void addPointToPolygon(Shape polygon, Point newPoint) {
        try {
            ((Polygon)polygon).addPoint(newPoint);
        } catch (ClassCastException ex) {//TODO think about handling exceptions
            ex.printStackTrace();
        }
    }
}
