package com.company;

public abstract class Bil {
    int regNr;
    String mærke;
    String model;
    int årgnag;
    int antalDøre;

    public Bil(int regNr, String mærke, String model, int årgnag, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgnag = årgnag;
        this.antalDøre = antalDøre;
    }
    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getÅrgnag() {
        return årgnag;
    }

    public void setÅrgnag(int årgnag) {
        this.årgnag = årgnag;
    }
    public int getantalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    @Override
    public String toString() {
        return " regNr= " + regNr + " mærke= " + mærke + " model= " + model + " årgnag= " + årgnag +
                " antalDøre= " + antalDøre;
    }
    public abstract double beregnGrønAfgift();
}

