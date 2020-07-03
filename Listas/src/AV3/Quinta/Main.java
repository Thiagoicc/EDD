package AV3.Quinta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabela tabela = new Tabela();

        int resp, escolha;

        do {
            System.out.println("Olá, aqui é da Nextel! \n1 - Cadastrar Amigo \n2 - Exibir Aniversariantes \n3 - Exibir Aniversariantes por mês" +
                    " \n4 - Exibir Maiores de Idade \n5 - Excluir Pessoa pelo Nome \n6 - Excluir Pessoa pelo Mês");
            escolha = sc.nextInt();

            switch (escolha)    {
                case 1:
                    System.out.println("Digite o nome do amigo: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Digite a data de nascimento: \n Formato - dd/mm/aaaa ");
                    String data = sc.next();

                    tabela.adicionar(nome, data);
                    break;
                case 2:
                    tabela.exibirTudo();
                    break;
                case 3:
                    System.out.println("Digite o mês para exibição: ");
                    String mes = sc.next();

                    tabela.exibirMes(mes);
                    break;
                case 4:
                    tabela.exibirMaiores();
                    break;
                case 5:
                    System.out.println("Digite o nome do amigo para excluir: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    tabela.excluirNome(name);
                    break;
                case 6:
                    System.out.println("Digite o mês que deseja excluir: ");
                    String month = sc.next();

                    tabela.excluirMes(month);
                    break;
            }

            System.out.println("Deseja repetir o processo? \n1 - Sim \n2 - Não");
            resp = sc.nextInt();

        } while (resp == 1);
    }
}


