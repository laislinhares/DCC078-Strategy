package org.example;

public class Maps {

    private float valor;

    public Maps(float valor) {
        this.valor = valor;
    }

    public float calcularTempo(Transporte transporte) {
        return transporte.calcularTempo(valor);
    }
}
