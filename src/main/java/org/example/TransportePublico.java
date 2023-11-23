package org.example;

public class TransportePublico implements Transporte {
    public float calcularTempo(float valor) {
        return valor*8;
    }
}
