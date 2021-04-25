package quarto;


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

    }
}
