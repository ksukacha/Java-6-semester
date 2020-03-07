import javax.swing.*;
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

    private App() {
        figureFactory = new FigureFactory();
        shapes = new ArrayList<>();
        toolElement = ToolElement.LINE;

        ButtonGroup group = new ButtonGroup();
        group.add(segmentButton);
        group.add(rayButton);
        group.add(lineButton);
        group.add(multiLineSegmentButton);
        group.add(circleButton);
        group.add(ellipseButton);
        group.add(parallelogramButton);
        group.add(rhombusButton);
        group.add(rectangleButton);
        group.add(rightAngledTriangleButton);
        group.add(isoscelesTriangleButton);
        group.add(regularPolygonButton);
        group.add(polygonButton);

        setContentPane(mainPanel);
        setUpGUI();
        setSize(1400, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setUpGUI() {

        segmentButton.addActionListener(e -> toolElement = ToolElement.SEGMENT);
        rayButton.addActionListener(e -> toolElement = ToolElement.RAY);
        lineButton.addActionListener(e -> toolElement = ToolElement.LINE);
        multiLineSegmentButton.addActionListener(e -> toolElement = ToolElement.MULTI_LINE_SEGMENT);

        circleButton.addActionListener(e -> toolElement = ToolElement.CIRCLE);
        ellipseButton.addActionListener(e -> toolElement = ToolElement.ELLIPSE);
        parallelogramButton.addActionListener(e -> toolElement = ToolElement.PARALLELOGRAM);
        rhombusButton.addActionListener(e -> toolElement = ToolElement.RHOMBUS);
        rectangleButton.addActionListener(e -> toolElement = ToolElement.RECTANGLE);
        rightAngledTriangleButton.addActionListener(e -> toolElement = ToolElement.RIGHT_ANGLED_TRIANGLE);
        isoscelesTriangleButton.addActionListener(e -> toolElement = ToolElement.ISOSCELES_TRIANGLE);
        regularPolygonButton.addActionListener(e -> toolElement = ToolElement.REGULAR_POLYGON);
        polygonButton.addActionListener(e -> toolElement = ToolElement.POLYGON);


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
