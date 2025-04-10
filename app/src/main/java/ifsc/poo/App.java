package ifsc.poo;

public class App {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.ligar();
        lampada2.desliga();

        System.out.println("lampada 1 está" + (lampada1.resultado() ? "ligada" : "desligada"));
        System.out.println("lampada 2 está" + (lampada2.resultado() ? "ligada" : "desligada"));
    }
}
