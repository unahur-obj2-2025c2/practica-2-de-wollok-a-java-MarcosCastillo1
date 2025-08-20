package me.gonzager.drones;
import me.gonzager.mision.Mision;

public class Seguridad extends Dron{

    public Seguridad(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
       
        return super.esAvanzadoSegunTipo();
    }

    
}
