import java.awt.*;

public abstract class Shape1D extends Shape {
    private boolean hasDirection;

    public Shape1D(Point theCenter, Color borderColor, boolean hasDirection) {
        super(theCenter, borderColor);
        this.hasDirection = hasDirection;
    }

    public boolean isHasDirection() {
        return hasDirection;
    }

    public void setHasDirection(boolean hasDirection) {
        this.hasDirection = hasDirection;
    }
}
