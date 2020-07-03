package AV3;

public class Tabela {
    No[] tabela = new No[26];

    Arvore arvore = new Arvore();

    public int hashing(int chave, int tamanho) {
        return chave % tamanho;
    }

    public void adicionar(String nome, String mes, String dia, int tamanho) {
        No novo = new No(nome, mes, dia, tamanho);
        char inicial = nome.charAt(0);
        if (tabela[hashing((int) inicial, tabela.length)] == null) {
            tabela[hashing((int) inicial, tabela.length)] = novo;
        } else {
            arvore.adicionar(nome, mes, dia, tamanho, tabela[hashing((int) inicial, tabela.length)]);
        }
    }

    public void exibirPessoas() {
        for (int i = 33; i <= 58; i++) {
            if (tabela[hashing(i, tabela.length)] != null)
                arvore.exibirEmOrdem(tabela[hashing(i, tabela.length)]);
        }
    }

    public void exibirPessoa(String nome) throws NullPointerException {
        char inicial = nome.charAt(0);
        arvore.pesquisar(nome.length(), tabela[hashing((int) inicial, tabela.length)]);
    }

    public void exibirInicial(char inicial) throws NullPointerException {
        arvore.exibirEmOrdem(tabela[hashing((int) inicial, tabela.length)]);
    }
}
