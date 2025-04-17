package ifsc.poo;

public class Lampada {
    private boolean ligada;
    private static int totalLampadas = 0;

    public Lampada() {
        this.ligada = false;
        totalLampadas++;
    }

    public Lampada(boolean estadoInicial) {
        this.ligada = estadoInicial;
        totalLampadas++;
    }

    public boolean setLigada(boolean estado) {
        if (this.ligada != estado) {
            this.ligada = estado;
            return true;
        }
        return false;
    }

    public boolean verEstado() {
        return this.ligada;
    }

    public static int getTotalLampadas() {
        return totalLampadas;
    }
}