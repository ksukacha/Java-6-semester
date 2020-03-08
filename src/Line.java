import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics2D;

public class Line extends Ray {
    public Line(Point theCenter, Color borderColor, boolean hasDirection, Point secondPoint) {
        super(theCenter, borderColor, hasDirection, secondPoint);

        if(getSecondPoint().y < getLocation().y) {
            double beta = Math.PI/2 -  Math.atan((double)Math.abs((getLocation().y - getSecondPoint().y))/Math.abs((getSecondPoint().x - getLocation().x)));
            if(getSecondPoint().x>getLocation().x) {
                this.setTheCenter(new Point((int)(getLocation().x - getLocation().y*Math.tan(beta)), 2*getLocation().y));
                this.setSecondPoint(new Point((int) (getLocation().x + getLocation().y * Math.tan(beta)), 0));
            }else {
                this.setTheCenter(new Point((int)(getLocation().x + getLocation().y*Math.tan(beta)), 2*getLocation().y));
                this.setSecondPoint(new Point((int) (getLocation().x - getLocation().y * Math.tan(beta)), 0));
            }
        } else if(getSecondPoint().y > getLocation().y) {
            double alpha = Math.atan((double)Math.abs((getLocation().y - getSecondPoint().y))/Math.abs((getSecondPoint().x - getLocation().x)));
            double beta = Math.PI/2 -  Math.atan((double)Math.abs((getLocation().y - getSecondPoint().y))/Math.abs((getSecondPoint().x - getLocation().x)));
            double yToAdd = 3000;
            double xToAdd = Math.tan(beta) * yToAdd;
            if(getSecondPoint().x > getLocation().x) {
                this.setTheCenter(new Point((int) (getLocation().x - xToAdd), (int) (getLocation().y - yToAdd)));
                this.setSecondPoint(new Point((int) (getLocation().x + xToAdd),
                        (int) (getLocation().y + yToAdd)));
            }else {
                this.setTheCenter(new Point((int) (getLocation().x + xToAdd), (int) (getLocation().y - yToAdd)));
                this.setSecondPoint(new Point((int) (getLocation().x - xToAdd),
                        (int) (getLocation().y + yToAdd)));
            }
        }
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        super.draw(graphics2D);
    }

    @Override
    public void move(Point point) {
        super.move(point);
    }
}
