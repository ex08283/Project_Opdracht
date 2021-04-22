package quarto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// dela
public class SpeelBord {
    private final int ROW = 4;
    private final int COLUMN = 4;
    private Blok [][] bord;

    SpeelBord() {
        bord = new Blok[ROW][COLUMN];
    }

    public boolean isVierOpRij() {
        return true;
    }

    public boolean isGelijkSpel() { return true;}


    /*public boolean isRevealed() {
        return isRevealed;
    }

    void setRevealed() {
        this.isRevealed = true;
    }

    public Prediction getPrediction() {
        return prediction;
    }

    void setPrediction(Prediction prediction) {
        if (prediction == null) {
            throw new RuntimeException("Set prediction to NONE instead of null.");
        }
        this.prediction = prediction;
    }

     */
}
