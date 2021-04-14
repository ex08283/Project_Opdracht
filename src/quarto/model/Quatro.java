package quarto.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quatro {
    private BlokkenBox blokkenBox;
    private SpeelBord speelBord;
    private Ranking ranking;
    private Speler speler1;
    private Speler speler2;

    private Settings settings; ///commmnt


    public Quatro() {
        this.blokkenBox = blokkenBox;
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







}
