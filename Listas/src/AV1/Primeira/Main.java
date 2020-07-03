package AV1.Primeira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Codico");
            int codicoaux = sc.nextInt();
            System.out.println("preco");
            double precoaux = sc.nextDouble();
            System.out.println("Quantidade");
            int quantaux = sc.nextInt();
            lista.adicionarInicio(new Produto(codicoaux,quantaux,precoaux));
            lista.exibir();
        }

        System.out.println("Digite o desconto dos produtos: ");
            double descAux = sc.nextDouble();

        lista.exibirQuant();
        lista.desconto((int) descAux);
        lista.exibir();
    }
}
