package AV3.Primeira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabela tabela = new Tabela();

        int resp, escolha;

        do {
            System.out.println("Olá, aqui é da Tim! \n1 - Cadastrar Produto \n2 - Consultar Produtos \n3 - Consultar Quantidade ");
            escolha = sc.nextInt();

            if (escolha == 1)   {
                System.out.println("Digite o Tipo \nA - Alimentação \nH - Higiene \nL - Limpeza \nV - Vestuário");
                String tipo = sc.next().toUpperCase();

                System.out.println("Digite a Descrição ");
                sc.nextLine();
                String descricao = sc.nextLine();

                switch (tipo) {
                    case "A":
                        tabela.adicionar(0, descricao, tipo);
                        break;
                    case "H":
                        tabela.adicionar(1, descricao, tipo);
                        break;
                    case "L":
                        tabela.adicionar(2, descricao, tipo);
                        break;
                    case "V":
                        tabela.adicionar(3, descricao, tipo);
                        break;
                }
            }

            if (escolha == 2)   {
                System.out.println("Digite o Tipo para consulta \nA - Alimentação \nH - Higiene \nL - Limpeza \nV - Vestuário");
                String tipo = sc.next().toUpperCase();

                switch (tipo) {
                    case "A":
                        tabela.pesquisar(0);
                        break;
                    case "H":
                        tabela.pesquisar(1);
                        break;
                    case "L":
                        tabela.pesquisar(2);
                        break;
                    case "V":
                        tabela.pesquisar(3);
                        break;
                }
            }

            if (escolha == 3)   {
                tabela.contagem();
            }

            System.out.println("Deseja repetir o processo? \n1 - Sim \n2 - Não");
            resp = sc.nextInt();

        } while (resp == 1);
    }
}
