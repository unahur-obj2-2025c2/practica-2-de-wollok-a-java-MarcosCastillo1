package me.gonzager.drones;

import me.gonzager.mision.Mision;

public abstract class Dron {
        private Integer autonomia ;
        protected final Integer procesamiento;
        private Mision mision;
        
        public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
            this.autonomia = autonomia;
            this.procesamiento = procesamiento;
            this.mision = mision;
        }
        
       
       public Integer eficienciaOperativa(){
        return autonomia * 10 + mision.extraEfeciencia(); 
       }
       
       public Boolean esAvanzado(){
        return this.esAvanzadoSegunTipo() || mision.esAvanzadoSegunMision(this);
       }
      
       protected abstract  Boolean esAvanzadoSegunTipo();

       public Integer getAutonomia() {
           return autonomia;
       }

       public void setAutonomia(Integer autonomia) {
           this.autonomia = autonomia;
       }

       public Integer getProcesamiento() {
           return procesamiento;
       }

       public Mision getMision() {
           return mision;
       }

       public void setMision(Mision mision) {
           this.mision = mision;
       } 
       

       public void disminuirAutonomia(){
         autonomia = autonomia -2;
       }

}
