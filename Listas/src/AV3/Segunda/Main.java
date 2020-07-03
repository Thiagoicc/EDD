package AV3.Segunda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabela tabela = new Tabela();

        int resp, escolha;

        do {
            System.out.println("Olá, aqui é da Oi! \n1 - Cadastrar Funcionário \n2 - Concender Aumento \n3 - Consultar a Soma dos Salários \n4 - Consultar Funcionários \n5 - Excluir Funcionário ");
            escolha = sc.nextInt();

            switch (escolha)    {
                case 1:
                    System.out.println("Digite o nome do funcionário: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Digite o salário: ");
                    double salario = sc.nextDouble();

                    tabela.adicionar(nome, salario);
                    break;
                case 2:
                    System.out.println("Digite a porcentagem para aumentar o salário: ");
                    double aumento = sc.nextDouble();

                    tabela.aumento(aumento);
                    break;
                case 3:
                    tabela.salarioConsulta();
                    break;
                case 4:
                    tabela.exibir();
                    break;
                case 5:
                    System.out.println("Digite o nome do funcionário pra exclui-ló: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    tabela.excluir(name);
                    break;
            }

            System.out.println("Deseja repetir o processo? \n1 - Sim \n2 - Não");
            resp = sc.nextInt();

        } while (resp == 1);
    }
}

