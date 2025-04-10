package ifsc.poo;

public class Lampada {
    private boolean ligada;


    //liga a Lampada
    public void ligar() {
        this.ligada = true;
    }

    //desliga a lampada
    public void desliga() {
        this.ligada = false;
    }

    //sai se está ligada ou desligada
    public boolean resultado() {
        return this.ligada;
    }

}