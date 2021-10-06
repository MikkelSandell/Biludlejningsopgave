package com.company;


import java.util.ArrayList;

public class Garage {
    double ialt = 0;
    ArrayList<Bil> cars = new ArrayList<>();
    public Garage() {
    }

    public void addBenzinbil(Benzinbil benzinbil){
        cars.add(benzinbil);
    }
    public void addDieselbil(Dieselbil dieselbil){
        cars.add(dieselbil);
    }
    public void  addElbil(Elbil elbil) {
        cars.add(elbil);
    }
    public double beregnGrønAfgiftForBilpark(double sum){
        this.ialt = sum + ialt;
        return ialt;
    }
    public double sum(){
        return ialt;
    }
    @Override
    public String toString() {
        return "Biller i Garagen \n" + cars;
    }

}