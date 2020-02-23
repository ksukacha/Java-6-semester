import java.awt.*;

public class Ray extends LineSegment {
    public Ray(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        super(theCenter, borderColor, hasDirection, secondPoint);
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        super.draw(graphics2D);
    }

    @Override
    public void move(Point point) {
        super.move(point);
    }

    public void changeEndPoints() {

    }
}
