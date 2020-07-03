package AV3.Terceira;

public class Tabela {
    No[] tabela = new No[15];

    public int hashing(int chave, int tamanho) {
        return chave % tamanho;
    }

    public void adicionar(String nome, double nota, int cod) {
        No novo = new No(nome, nota,cod);
        if (tabela[hashing(cod, tabela.length)] != null) {
            novo.proximo = tabela[hashing(cod, tabela.length)];
        }
        tabela[hashing(cod, tabela.length)] = novo;
    }

    public void aprovados() {
        for (No no : tabela) {
            No atual = no;

            while (atual != null) {
                if (atual.getNota() >= 7) {
                    System.out.println(atual.toString());
                }
                atual = atual.proximo;
            }
        }
    }

    public void alunos()    {
        for (No no : tabela) {
            No atual = no;

            while (atual != null) {
                System.out.println(atual.toString());
                atual = atual.proximo;
            }
        }
    }
}
