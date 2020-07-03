package AV2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Fila fila = new Fila();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String aux = sc.nextLine();

        fila.enqueue(aux);
        fila.salvarArq();
    }
}