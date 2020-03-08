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
    public Shape buildMultilineSegment(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        return new MultilineSegment(theCenter, borderColor, hasDirection, secondPoint);
    }
    public Shape buildEllipse(Point theCenter, Point firstPoint, Point secondPoint, Color borderColor, Color innerColor) {
        return new Ellipse(theCenter, firstPoint, secondPoint, borderColor, innerColor);
    }
    public Shape buildCircle(Point theCenter, Point firstPoint, Color borderColor, Color innerColor) {
        return new Circle(theCenter, firstPoint, borderColor, innerColor);
    }
    public Shape buildRegularPolygon(Point theCenter, Point secondPoint, int numSides, Color borderColor, Color innerColor) {
        return new RegularPolygon(theCenter, secondPoint, numSides, borderColor,innerColor);
    }
    public Shape buildRightAngledTriangle(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        return new RightAngledTriangle(theCenter,  points, borderColor,innerColor);
    }
    public Shape buildIsoscelesTriangle(Point theCenter,  List<Point> points, Color borderColor, Color innerColor) {
        return new IsoscelesTriangle(theCenter, points, borderColor,innerColor);
    }
    public Shape buildRectangle(Point theCenter,  List<Point> points, Color borderColor, Color innerColor) {
        return new Rectangle(theCenter, points, borderColor,innerColor);
    }
    public Shape buildRhombus(Point theCenter, List<Point> points, Color borderColor, Color innerColor) {
        return new Rhombus(theCenter,points, borderColor,innerColor);
    }
    public Shape buildParallelogram(Point theCenter, List<Point> points, Color borderColor, Color innerColor){
        return new Parallelogram(theCenter, points, borderColor,innerColor);
    }
}
