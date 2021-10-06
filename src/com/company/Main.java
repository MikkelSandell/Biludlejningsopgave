package com.company;

public class Main {
    public static void main(String[] args) {
        Benzinbil Benzinbil = new Benzinbil(21, "hundie", "Forster", 1997, 4, 5, 50);
        Dieselbil Diselbil = new Dieselbil(31, "Nissab", "GC", 2000, 6, true, 20);
        Elbil ElBil = new Elbil(45, "Skoda", "Outback", 2010, 7, 5000, 45, 200);
        Garage Garage = new Garage();
        Garage.addBenzinbil(Benzinbil);
        Garage.addDieselbil(Diselbil);
        Garage.addElbil(ElBil);

        System.out.println(Garage);
        Garage.beregnGrønAfgiftForBilpark(Benzinbil.beregnGrønAfgift());
        Garage.beregnGrønAfgiftForBilpark(Diselbil.beregnGrønAfgift());
        Garage.beregnGrønAfgiftForBilpark(ElBil.beregnGrønAfgift());
        System.out.println(Garage.sum());
    }

}
