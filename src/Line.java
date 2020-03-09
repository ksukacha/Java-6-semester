import java.awt.Point;
import java.awt.Color;

public class Line extends Ray {
    public Line(Point theCenter, Point secondPoint, Color borderColor, boolean hasDirection) {
        super(theCenter, secondPoint, borderColor, hasDirection);

        if(getSecondPoint().y < getLocation().y) {
            double beta = Math.PI/2 -  Math.atan((double)Math.abs((getLocation().y - getSecondPoint().y))/Math.abs((getSecondPoint().x - getLocation().x)));
            if(getSecondPoint().x>getLocation().x) {
                this.setTheCenter(new Point((int)(getLocation().x - 3000*Math.tan(beta)), 3000));
            }else {
                this.setTheCenter(new Point((int)(getLocation().x + 3000*Math.tan(beta)), 3000));
            }
        } else if(getSecondPoint().y > getLocation().y) {
            double alpha = Math.atan((double)Math.abs((getLocation().y - getSecondPoint().y))/Math.abs((getSecondPoint().x - getLocation().x)));
            double beta = Math.PI/2 -  Math.atan((double)Math.abs((getLocation().y - getSecondPoint().y))/Math.abs((getSecondPoint().x - getLocation().x)));
            double yToAdd = 3000;
            double xToAdd = Math.tan(beta) * yToAdd;
            if(getSecondPoint().x > getLocation().x) {
                this.setTheCenter(new Point((int) (getLocation().x - xToAdd), (int) (getLocation().y - yToAdd)));
            }else {
                this.setTheCenter(new Point((int) (getLocation().x + xToAdd), (int) (getLocation().y - yToAdd)));
            }
        }
    }
}
