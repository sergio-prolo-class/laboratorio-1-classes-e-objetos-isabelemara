package ifsc.poo;

public class App {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada(true);  // ligada
        Lampada lampada2 = new Lampada();      // desligada

        lampada1.setLigada(false); // desliga a 1
        lampada2.setLigada(true);  // liga a 2

        System.out.println("Lâmpada 1 está " + (lampada1.verEstado() ? "ligada" : "desligada"));
        System.out.println("Lâmpada 2 está " + (lampada2.verEstado() ? "ligada" : "desligada"));
        System.out.println("Total de lâmpadas criadas: " + Lampada.getTotalLampadas());
    }
}