package com.company;

public class Elbil extends Bil{
    int batterikapacitetKWH;
    int maxKm;
    double whPrKm;
    double kmPrL;

    public Elbil(int regNr, String mærke, String model, int årgnag, int antalDøre, int batterikapacitetKWH, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgnag, antalDøre);
        this.batterikapacitetKWH = batterikapacitetKWH;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWH() {
        return batterikapacitetKWH;
    }

    public void setBatterikapacitetKWH(int batterikapacitetKWH) {
        this.batterikapacitetKWH = batterikapacitetKWH;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil:" + super.toString() + " batterikapacitetKWH= " + batterikapacitetKWH  + " maxKm= " + maxKm + " whPrKm= " + whPrKm + "\n";

}

    @Override
    public double beregnGrønAfgift() {

        this.kmPrL = 100/(whPrKm/91.25);

        if (kmPrL >= 20 && kmPrL <= 50) {
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
