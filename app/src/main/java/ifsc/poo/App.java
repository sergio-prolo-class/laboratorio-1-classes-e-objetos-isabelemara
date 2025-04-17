package ifsc.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int MAX_LAMPADAS = 100; //máximo de lampadas que podem ser criadas
        Lampada[] lampadas = new Lampada[MAX_LAMPADAS];
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            if (contador >= MAX_LAMPADAS) {
                System.out.println("Número máximo de lâmpadas atingido.");
                break;
            }

            System.out.print("A nova lâmpada deve começar ligada? (s/n): ");
            resposta = scanner.nextLine().trim().toLowerCase();
            boolean estadoInicial = resposta.equals("s");

            lampadas[contador] = new Lampada(estadoInicial);
            contador++;

            System.out.print("Deseja criar outra lâmpada? (s/n): ");
            resposta = scanner.nextLine().trim().toLowerCase();

        } while (resposta.equals("s"));

        System.out.println("\nEstados das lâmpadas:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Lâmpada " + (i + 1) + " está " +
                    (lampadas[i].verEstado() ? "ligada" : "desligada"));
        }

        System.out.println("Total de lâmpadas criadas: " + Lampada.getTotalLampadas());
        scanner.close();
    }
}