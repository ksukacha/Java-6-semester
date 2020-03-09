import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape2D extends Shape {
    private Color innerColor;

    public Shape2D(Point theCenter, Color borderColor, Color innerColor) {
        super(theCenter, borderColor);
        this.innerColor = innerColor;
    }
}
