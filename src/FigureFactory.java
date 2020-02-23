import java.awt.*;
import java.util.List;

public class FigureFactory {
    public LineSegment buildLineSegment(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new LineSegment(theCenter, borderColor, hasDirection, secondPoint);
    }
    public Ray buildRay(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new Ray(theCenter, borderColor, hasDirection, secondPoint);
    }
    public Line buildLine(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new Line(theCenter, borderColor, hasDirection, secondPoint);
    }
    public MultilineSegment buildMultilineSegment(Point theCenter, Color borderColor, boolean hasDirection, List<LineSegment> lineSegments) {
        return new MultilineSegment(theCenter, borderColor, hasDirection, lineSegments);
    }
    public Ellipse buildEllipse(Point theCenter, Color borderColor, Color innerColor, Point firstPoint, Point secondPoint) {
        return new Ellipse(theCenter, borderColor, innerColor, firstPoint, secondPoint);
    }
    public Circle buildCircle(Point theCenter, Color borderColor, Color innerColor, Point firstPoint, Point secondPoint) {
        return new Circle(theCenter, borderColor, innerColor, firstPoint, secondPoint);
    }
    public RegularPolygon buildRegularPolygon(Point theCenter, Color borderColor, Color innerColor, List<Point> points, int numSides) {
        return new RegularPolygon(theCenter,borderColor,innerColor, points, numSides);
    }
    public RightAngledTriangle buildRightAngledTriangle(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new RightAngledTriangle(theCenter,borderColor,innerColor, points);
    }
    public IsoscelesTriangle buildIsoscelesTriangle(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new IsoscelesTriangle(theCenter,borderColor,innerColor, points);
    }
    public Rectangle buildRectangle(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new Rectangle(theCenter,borderColor,innerColor, points);
    }
    public Rhombus buildRhombus(Point theCenter, Color borderColor, Color innerColor, List<Point> points) {
        return new Rhombus(theCenter,borderColor,innerColor, points);
    }
    public Parallelogram buildParallelogram(Point theCenter, Color borderColor, Color innerColor, List<Point> points){
        return new Parallelogram(theCenter,borderColor,innerColor, points);
    }
}
