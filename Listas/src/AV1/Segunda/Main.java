package AV1.Segunda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Lista lista = new Lista();

        for (int i = 0; i < 8; i++) {
            System.out.println("Nome: ");
                String nomeAux = sc.next();
            System.out.println("Salário: ");
                double salAux = sc.nextDouble();

            lista.adicionar(new Funcionario(nomeAux,salAux));
        }

        System.out.printf("Digite o salário para comparação: ");
            double salAux = sc.nextDouble();

        lista.exibir();
        lista.maiorSal();
        lista.mediaSal();
        lista.maiorSalEscolha(salAux);
    }
}
