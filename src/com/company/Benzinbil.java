package com.company;

public class Benzinbil extends Bil{
    int oktantal;
    int kmPrL;

    public Benzinbil(int regNr, String mærke, String model, int årgnag, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgnag, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }
    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }
    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil:" + super.toString() + " oktantal= " + oktantal  + " kmPrL= " + kmPrL + "\n";
    }

    @Override
    public double beregnGrønAfgift() {
        if (kmPrL >= 20 && kmPrL <= 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL <= 20) {
            return 1050;
        } else if (kmPrL >= 5 && kmPrL <= 10) {
            return 5500;
        } else if (kmPrL <= 5) {
            return 10470;
        }
        return 0;
    }
}
