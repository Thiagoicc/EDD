package AV3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabela tabela = new Tabela();

        int resp, escolha;

        do {
            System.out.println("As-Salamu Alaikum, Gilson. \n1 - Cadastrar Pessoa \n2 - Exibir Pessoas (Ordem Alfabética) \n3 - Consultar uma Pessoa \n4 - Consultar Inicial (Ordem Alfabética)");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    sc.nextLine();
                    String nome = sc.nextLine().toUpperCase();

                    System.out.println("Digite o mês de nascimento da pessoa: ");
                    String mes = sc.next();

                    System.out.println("Digite o dia de nascimento da pessoa: ");
                    String dia = sc.next();

                    tabela.adicionar(nome, mes, dia, nome.length());
                    break;
                case 2:
                    tabela.exibirPessoas();
                    break;
                case 3:
                    try {
                        System.out.println("Digite o nome da pessoa: ");
                        sc.nextLine();
                        String name = sc.nextLine().toUpperCase();

                        tabela.exibirPessoa(name);
                    } catch (NullPointerException e) {
                        System.out.println("Pessoa não cadastrada");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Digite a letra inicial para pesquisa: ");
                        char inicial = sc.next().charAt(0);
                        char inicial2 = Character.toUpperCase(inicial);

                        tabela.exibirInicial(inicial2);
                    } catch (NullPointerException e) {
                        System.out.println("Pessoa com a inicial não cadastrada");
                    }
                    break;
            }

            System.out.println("Deseja repetir o processo? \n1 - Sim \n2 - Não");
            resp = sc.nextInt();

        } while (resp == 1);
    }
}

