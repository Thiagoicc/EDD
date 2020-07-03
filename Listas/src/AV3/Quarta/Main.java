package AV3.Quarta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabela tabela = new Tabela();

        int resp, escolha;

        do {
            System.out.println("Olá, aqui é da Claro! \n1 - Cadastrar Pessoa \n2 - Exibir Pessoas \n3 - Consultar uma Pessoa \n4 - Consultar Inicial \n5 - Excluir Pessoa ");
            escolha = sc.nextInt();

            switch (escolha)    {
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    tabela.adicionar(nome);
                    break;
                case 2:
                    tabela.exibir();
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    tabela.exibirNome(name);
                    break;
                case 4:
                    System.out.println("Digite a letra desejada: ");
                    char letra = sc.next().charAt(0);

                    tabela.exibirLetra(letra);
                    break;
                case 5:
                    System.out.println("Digite o nome da pessoa: ");
                    sc.nextLine();
                    String namo = sc.nextLine();

                    tabela.excluir(namo);
                    break;
            }

            System.out.println("Deseja repetir o processo? \n1 - Sim \n2 - Não");
            resp = sc.nextInt();

        } while (resp == 1);
    }
}

