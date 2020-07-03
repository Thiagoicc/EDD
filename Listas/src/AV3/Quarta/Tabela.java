package AV3.Quarta;


public class Tabela {
    No[] tabela = new No[26];

    public int hashing(int chave, int tamanho) {
        return chave % tamanho;
    }

    public void adicionar(String nome) {
        No novo = new No(nome);
        if (tabela[hashing(nome.charAt(0), tabela.length)] != null) {
            novo.proximo = tabela[hashing(nome.charAt(0), tabela.length)];
        }
        tabela[hashing(nome.charAt(0), tabela.length)] = novo;
    }

    public void exibir() {
        for (No no : tabela) {
            No atual = no;

            while (atual != null) {
                System.out.println(atual.toString());
                atual = atual.proximo;
            }
        }
    }

    public void exibirNome(String nome) {
        for (No no : tabela) {
            No atual = no;

            while (atual != null) {
                if (nome.equals(atual.getNome()))
                    System.out.println(atual.toString());
                atual = atual.proximo;
            }
        }
    }

    public void exibirLetra(char primeira) {
        for (No no : tabela) {
            No atual = no;

            while (atual != null) {
                if (primeira == atual.getNome().charAt(0)) {
                    System.out.println(atual.toString());
                }
                    atual = atual.proximo;
            }
        }
    }

    public void excluir(String nome) {
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null ) {
                if (tabela[i].getNome().equals(nome) && tabela[i].proximo == null) {
                    tabela[i] = null;

                } else {
                    No atual = tabela[i];
                    No aux = tabela[i].proximo;

                    while (aux != null) {

                        if (aux.getNome().equals(nome)) {
                            atual.proximo = aux.proximo;
                        }
                        atual = atual.proximo;
                        aux= aux.proximo;
                    }
                }
            }
        }
    }
}
