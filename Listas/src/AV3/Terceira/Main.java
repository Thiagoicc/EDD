package AV3.Terceira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tabela tabela = new Tabela();

        int resp, escolha;

        do {
            System.out.println("Olá, aqui é da Vivo! \n1 - Cadastrar Aluno \n2 - Mostrar Aprovados \n3 - Mostrar Alunos");
            escolha = sc.nextInt();

            switch (escolha)    {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double nota= sc.nextDouble();

                    System.out.println("Digite o códico do aluno: ");
                    int codigo = sc.nextInt();

                    tabela.adicionar(nome, nota, codigo);

                    break;
                case 2:
                    tabela.aprovados();
                    break;
                case 3:
                    tabela.alunos();
                    break;
            }

            System.out.println("Deseja repetir o processo? \n1 - Sim \n2 - Não");
            resp = sc.nextInt();

        } while (resp == 1);
    }
}

