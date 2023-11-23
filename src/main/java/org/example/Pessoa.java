package org.example;

public class Pessoa {

    private float tempo;

    public float getTempo() {
        return tempo;
    }

    public void calcularTempoCarro(float distancia) {
        Maps maps = new Maps(distancia);
        this.tempo = maps.calcularTempo(new Carro());
    }

    public void calcularTempoTransportePublico(float distancia) {
        Maps maps = new Maps(distancia);
        this.tempo = maps.calcularTempo(new TransportePublico());
    }

    public void calcularTempoBicicleta(float distancia) {
        Maps maps = new Maps(distancia);
        this.tempo = maps.calcularTempo(new Bicicleta());
    }

    public void calcularTempoApe(float distancia) {
        Maps maps = new Maps(distancia);
        this.tempo = maps.calcularTempo(new Andar());
    }
}
