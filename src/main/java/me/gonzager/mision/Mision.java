package me.gonzager.mision;

import me.gonzager.drones.Dron;

public interface Mision {
    Integer extraEfeciencia();
    Boolean esAvanzadoSegunMision(Dron dron);
}
