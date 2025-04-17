package ifsc.poo;

public class Lampada {
    private boolean ligada;
    private static int totalLampadas = 0;


    public Lampada(boolean estadoInicial) {
        this.ligada = estadoInicial;
        totalLampadas++;
    }


    public boolean verEstado() {
        return this.ligada;
    }

    public static int getTotalLampadas() {
        return totalLampadas;
    }
}