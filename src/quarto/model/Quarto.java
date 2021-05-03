package quarto.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private BlokkenBox blokkenBox;
    private SpeelBord speelBord;
    private Ranking ranking;
    private Speler speler1;
    private Speler speler2;

    private Settings settings; ///commmnt


    public Quarto() {
        this.blokkenBox = new BlokkenBox();
        this.speelBord = speelBord;
        this.ranking = ranking;
        this.speler1 = speler1;
        this.speler2 = speler2;
    }

    public void lootSpeler(){
    }

    public boolean isWinnaar(){
        return true;
    }

    public void restart() {

    }


    public void saveGame() throws QuatroException {
        QuatroSaver saver = new QuatroSaver(this);

    }

    public Settings getSettings() {
        return settings;
    }

    public void loadGame() {

    }

    public Speler getSpeler1() {
        return speler1;
    }

    public Speler getSpeler2() {
        return speler2;
    }
}
