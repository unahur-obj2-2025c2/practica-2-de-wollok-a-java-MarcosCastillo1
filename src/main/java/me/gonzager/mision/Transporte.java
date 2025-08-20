package me.gonzager.mision;

import me.gonzager.drones.Dron;

public class Transporte implements Mision {
    private static Transporte instance = new Transporte();

    public static void setInstance(Transporte instance) {
        Transporte.instance = instance;
    }
    private Transporte(){};
    public static Transporte getInstance(){
        return instance;
    }

    @Override
    public Integer extraEfeciencia() {
       return 100;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.getAutonomia() > 50;
    }

}
