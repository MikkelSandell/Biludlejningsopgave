package com.company;

public class Dieselbil extends Bil{
    boolean partikelfilter;
    int kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgnag, int antalDøre, boolean partikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgnag, antalDøre);
        this.partikelfilter = partikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean getPartikelfilter() {
        return partikelfilter;
    }

    public void setPartikelfilter(boolean partikelfilter) {
        this.partikelfilter = partikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DiselBil:" + super.toString() + " partikelfilter= " + partikelfilter  + " kmPrL= " + kmPrL + "\n";
    }

    @Override
    public double beregnGrønAfgift() {
        if (partikelfilter) {
            if (kmPrL >= 20 && kmPrL <= 50) {
                return 130+1000;
            } else if (kmPrL >= 15 && kmPrL <= 20) {
                return 1390+1000;
            } else if (kmPrL >= 5 && kmPrL <= 10) {
                return 2770+1000;
            } else if (kmPrL <= 5) {
                return 15260+1000;
            }
        }else if (kmPrL >= 20 && kmPrL <= 50) {
            return 130;
        } else if (kmPrL >= 15 && kmPrL <= 20) {
            return 1390;
        } else if (kmPrL >= 5 && kmPrL <= 10) {
            return 2770;
        } else if (kmPrL <= 5) {
            return 15260;
        }
        return 0;
    }
}
