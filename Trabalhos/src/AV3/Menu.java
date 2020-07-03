package AV3;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    CriarArvore c = new CriarArvore();
    Scanner sc = new Scanner(System.in);

    public void menu() throws IOException {
        System.out.println("digite 1 para compactar e 2 para descompactar");
        String op = sc.next();

        if (op.equals("1")) {
            c.criarArvore();
        } else {
            System.out.println("descompactador nao concluido");
        }
    }
}
