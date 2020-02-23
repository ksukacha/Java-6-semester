import java.awt.*;
import java.util.List;

public class FigureFactory {
    public Shape buildLineSegment(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new LineSegment(theCenter, borderColor, hasDirection, secondPoint);
    }
    public Shape buildRay(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new Ray(theCenter, borderColor, hasDirection, secondPoint);
    }
    public Shape buildLine(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new Line(theCenter, borderColor, hasDirection, secondPoint);
    }
    public Shape buildMultilineSegment(Point theCenter, Color borderColor, boolean hasDirection, List<LineSegment> lineSegments) {
        return new MultilineSegment(theCenter, borderColor, hasDirection, lineSegments);
    }
    public Shape buildEllipse(Point theCenter, Color borderColor, Color innerColor, Point firstPoint, Point secondPoint) {
        return new Ellipse(theCenter, borderColor, innerColor, firstPoint, secondPoint);
    }
    public Shape buildCircle(Point theCenter, Color borderColor, Color innerColor, Point firstPoint, Point secondPoint) {
        return new Circle(theCenter, borderColor, innerColor, firstPoint, secondPoint);
    }
    public Shape buildRegularPolygon(Point theCenter, Color borderColor, Color innerColor, List<Point> points, int numSides) {
        return new RegularPolygon(theCenter,borderColor,innerColor, points, numSides);
    }
    public Shape buildRightAngledTriangle(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new RightAngledTriangle(theCenter,borderColor,innerColor, points);
    }
    public Shape buildIsoscelesTriangle(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new IsoscelesTriangle(theCenter,borderColor,innerColor, points);
    }
    public Shape buildRectangle(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new Rectangle(theCenter,borderColor,innerColor, points);
    }
    public Shape buildRhombus(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new Rhombus(theCenter,borderColor,innerColor, points);
    }
    public Shape buildParallelogram(Point theCenter, Color borderColor, Color innerColor, List<Point> points){
        return new Parallelogram(theCenter,borderColor,innerColor, points);
    }
}
