package models;

public class Resultado {

    private String algoritmo;
    private String escenario;
    private int sample;
    private double tiempoNano;
    private double tiempoMilis;
    
    public Resultado(String algoritmo, String escenario, int sample, double tiempoNano) {
        this.algoritmo = algoritmo;
        this.escenario = escenario;
        this.sample = sample;
        this.tiempoNano = tiempoNano;
        this.tiempoMilis = tiempoNano / 1000000.0;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public int getSample() {
        return sample;
    }

    public void setSample(int sample) {
        this.sample = sample;
    }

    public double getTiempoNano() {
        return tiempoNano;
    }

    public void setTiempoNano(double tiempoNano) {
        this.tiempoNano = tiempoNano;
    }

    public double getTiempoMilis() {
        return tiempoMilis;
    }

    public void setTiempoMilis(double tiempoMilis) {
        this.tiempoMilis = tiempoMilis;
    }

    @Override
    public String toString() {
        return "Resultado; algoritmo=" + algoritmo + ", escenario=" + escenario + ", sample=" + sample + ", tiempoNano="
                + tiempoNano;
    }
    
}
