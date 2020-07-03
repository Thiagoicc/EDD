package AV1;

import java.util.Scanner;

public class Operações {
    ListaConjA conjA = new ListaConjA();
    ListaConjB conjB = new ListaConjB();
    ListaConjC conjC = new ListaConjC();

    Scanner sc = new Scanner(System.in);

    public void adicionarConjA() {
        System.out.println("Digite a quantidade de números a serem adicionados no conjunto A: ");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++)  {
            System.out.println("Digite o " + (i + 1) + "º número do conjunto: ");
            int numA = sc.nextInt();

            conjA.adicionar(numA);
        }
    }

    public void exibirA()   {
        conjA.exibir();
    }

    public void adicionarConjB() {
        System.out.println("Digite a quantidade de números a serem adicionados no conjunto B: ");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++)  {
            System.out.println("Digite o " + (i + 1) + "º número do conjunto: ");
            int numB = sc.nextInt();

            conjB.adicionar(numB);
        }
    }

    public void exibirB()   {
        conjB.exibir();
    }

    public boolean pesquisarConjA(int dado) {
        No atual = conjA.inicio;

        while (atual != null)   {
            if (dado == atual.valor) {  //VERIFICA SE O VALOR DADO É IGUAL O ATUAL
                return true;
            }

            atual = atual.proximo;
        }
        return false;
    }

    public boolean pesquisarConjB(int dado) {
        No atual = conjB.inicio;

        while (atual != null)   {
            if (dado == atual.valor) {  //VERIFICA SE O VALOR DADO É IGUAL O ATUAL
                return true;
            }

            atual = atual.proximo;
        }
        return false;
    }

    public boolean pesquisarConjC(int dado) {
        No atual = conjC.inicio;

        while (atual != null)   {
            if (dado == atual.valor) {  //VERIFICA SE O VALOR DADO É IGUAL O ATUAL
                return true;
            }

            atual = atual.proximo;
        }
        return false;
    }

    public void uniao() {
        No atual = conjA.inicio;

        while (atual != null)   {
            conjC.adicionar(atual.valor);
            atual = atual.proximo;
        }

        atual = conjB.inicio;

        while (atual != null)    {
            if(pesquisarConjC(atual.valor)) {   //VERIFICAR SE O VALOR ATUAL SE ENCONTRA NO CONJ C
                atual = atual.proximo;
            }
            else {
                conjC.adicionar(atual.valor);
                atual = atual.proximo;
            }
        }

        conjC.exibir();
    }

    public void intersecao()    {
        No atual = conjA.inicio;

        while (atual != null)   {
            if (pesquisarConjB(atual.valor))    {
                conjC.adicionar(atual.valor);
                atual = atual.proximo;
            }   else {
                atual = atual.proximo;
            }
        }

        conjC.exibir();
    }

    public void diferenca() {
        No atual = conjA.inicio;

        while (atual != null)   {
            if (pesquisarConjB(atual.valor))    {
                atual = atual.proximo;
            }   else    {
                conjC.adicionar(atual.valor);
                atual = atual.proximo;
            }
        }

        conjC.exibir();
    }
}

