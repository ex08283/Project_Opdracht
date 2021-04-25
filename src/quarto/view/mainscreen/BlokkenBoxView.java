package quarto.view.mainscreen;

import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BlokkenBoxView extends GridPane {
    public static final Color BlUE_COLOR = Color.BLUE;
    public static final Color RED_COLOR = Color.RED;
    public static final int BIG_SIZE = 4;
    public static final int SMALL_SIZE = 2;
    private Circle circle;
    private Circle circle2;
    private Rectangle rectangle;
    private Rectangle rectangle2;

    public BlokkenBoxView() {
        layoutNodes();
        initialiseNodes();
    }


    public void initialiseNodes() {
        circle = new Circle(BIG_SIZE,BlUE_COLOR);
        circle2 = new Circle(SMALL_SIZE,BlUE_COLOR);
        rectangle = new Rectangle(BIG_SIZE,BIG_SIZE,BlUE_COLOR);
        rectangle2 = new Rectangle(SMALL_SIZE,SMALL_SIZE,BlUE_COLOR);

    }

    public void layoutNodes() {
        this.add(circle, 0, 0);
        this.add(rectangle, 1, 0);
        this.add(circle2, 0, 1);
        this.add(rectangle2, 1, 1);
        this.setGridLinesVisible(true);
    }

}