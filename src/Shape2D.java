import java.awt.*;

public abstract class Shape2D extends Shape {
    private Color innerColor;

    public Shape2D(Point theCenter, Color borderColor, Color innerColor) {
        super(theCenter, borderColor);
        this.innerColor = innerColor;
    }

    @Override
    public void draw(Graphics2D graphics2D) {

    }

    @Override
    public void move(Point point) {

    }
}
