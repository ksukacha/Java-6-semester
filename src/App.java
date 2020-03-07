import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {
    private FigureFactory figureFactory;
    private List<Shape> shapes;

    private JPanel mainPanel;
    private JPanel drawPanel;

    private JToggleButton segmentButton;
    private JToggleButton rayButton;
    private JToggleButton lineButton;
    private JToggleButton multiLineSegmentButton;

    private JToggleButton circleButton;
    private JToggleButton ellipseButton;
    private JToggleButton parallelogramButton;
    private JToggleButton rhombusButton;
    private JToggleButton rectangleButton;
    private JToggleButton rightAngledTriangleButton;
    private JToggleButton isoscelesTriangleButton;
    private JToggleButton regularPolygonButton;
    private JToggleButton polygonButton;

    private JButton borderColorButton;
    private JButton innerColorButton;

    private ToolElement toolElement;
    private JDialog numSidesJDialog;

    //todo change the tool layout (too wide)
    public App() {
        figureFactory = new FigureFactory();
        shapes = new ArrayList<>();
        toolElement = ToolElement.LINE;
        setContentPane(mainPanel);
        setUpGUI();
        setSize(1400, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setUpGUI() {
        rhombusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toolElement = ToolElement.RHOMBUS;
            }
        });
        //todo add the rest

        drawPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                //todo add switch for current tool element
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });

        drawPanel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new App();
    }
}
