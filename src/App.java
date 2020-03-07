import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class App extends JFrame {
    private FigureFactory figureFactory = new FigureFactory();
    private List<Shape> shapes = new ArrayList<>();
    private List<Point> mousePressHistory = new ArrayList<>();
    private ToolElement toolElement;

    private JPanel mainPanel, drawPanel;
    private JToggleButton segmentButton, rayButton, lineButton, multiLineSegmentButton;
    private JToggleButton circleButton, ellipseButton, parallelogramButton, rhombusButton, rectangleButton,
            rightAngledTriangleButton, isoscelesTriangleButton, regularPolygonButton, polygonButton;
    private JButton borderColorButton, innerColorButton;
    private JDialog numSidesJDialog;

    private App() {
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

        Enumeration<AbstractButton> enumeration = group.getElements();
        while (enumeration.hasMoreElements()){
            enumeration.nextElement().addActionListener(e -> mousePressHistory.clear());
        }

        toolElement = ToolElement.LINE;
        lineButton.setSelected(true);

        setContentPane(mainPanel);
        setUpGUI();
        setSize(1400, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setUpGUI() {

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
                mousePressHistory.add(e.getPoint());
                if (SwingUtilities.isLeftMouseButton(e)) {
                    switch (toolElement) {
                        case SEGMENT:
                            break;
                        case RAY:
                            break;
                        case LINE:
                            break;
                        case MULTI_LINE_SEGMENT:
                            break;

                        case CIRCLE:
                            break;
                        case ELLIPSE:
                            break;
                        case PARALLELOGRAM:
                            break;
                        case RHOMBUS:
                            break;
                        case RECTANGLE:
                            break;
                        case RIGHT_ANGLED_TRIANGLE:
                            break;
                        case ISOSCELES_TRIANGLE:
                            break;
                        case REGULAR_POLYGON:
                            break;
                        case POLYGON:
                            break;
                    }
                }
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
