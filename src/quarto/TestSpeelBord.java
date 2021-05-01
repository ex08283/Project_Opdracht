package quarto;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import quarto.model.Blok.BlokSize;
import quarto.model.Blok.BlokFilling;
import quarto.model.Blok.BlokShape;
import quarto.model.Blok.BlokColor;
import quarto.model.Blok;
import quarto.model.BlokkenBox;
import quarto.model.SpeelBord;

import java.util.Iterator;
import java.util.Set;

public class TestSpeelBord {
    public static void main(String[] args) {
        SpeelBord speelbord = new SpeelBord();
        speelbord.placeBlok(3,3, new Blok(BlokSize.SMALL, BlokColor.DARK, BlokShape.ROUND, BlokFilling.EMPTY));

        Blok[][] bord = speelbord.getBord();



        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                System.out.println(bord[i][j] + " ");
            }
        }

        Set<Blok> blokSet = new BlokkenBox().getBlokSet();
        for (Blok blok : blokSet) {
            System.out.println(blok);
        }

        System.out.println(blokSet.size());

        blokSet.remove(new Blok(BlokSize.BIG, Blok.BlokColor.DARK, Blok.BlokShape.ROUND, Blok.BlokFilling.EMPTY));

        System.out.println(blokSet.size());

        Circle circle1 = new Circle(30, Color.RED);
        Circle circle2 = new Circle(25, Color.BROWN);
        circle2.setStroke(Color.RED);
        circle2.setStrokeWidth(10);

        Circle circle3 = new Circle(20, Color.RED);
        Circle circle4 = new Circle(16, Color.BROWN);
        circle4.setStroke(Color.RED);
        circle4.setStrokeWidth(8);

        System.out.println(circle1.toString());
        System.out.println(circle1.toString());

        Rectangle rectangle1 = new Rectangle(30, 30, Color.RED);
        Rectangle rectangle2 = new Rectangle(25,25, Color.BROWN);
        rectangle2.setStroke(Color.RED);
        rectangle2.setStrokeWidth(10);


//        Rectangle rectangle3 = new Circle(20, Color.RED);
//        Rectangle circle4 = new Circle(16, Color.BROWN);
//        circle4.setStroke(Color.RED);
//        circle4.setStrokeWidth(8);



    }
}
