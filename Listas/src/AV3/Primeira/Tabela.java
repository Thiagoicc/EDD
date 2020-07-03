package AV3.Primeira;

public class Tabela {

    No[] tabela = new No[4];

    public int hashing(int chave, int tamanho) {
        return chave % tamanho;
    }

    public void adicionar(int chave, String dado, String tipo) {
        No novo = new No(dado, tipo);
        if (tabela[hashing(chave, tabela.length)] != null) {
            novo.proximo = tabela[hashing(chave, tabela.length)];
        }
        tabela[hashing(chave, tabela.length)] = novo;
    }

    public void pesquisar(int chave) {
        if (tabela[hashing(chave, tabela.length)] == null) {
            System.out.println("Produtos desse tipo não cadastrados");
        } else {
            No atual = tabela[hashing(chave, tabela.length)];

            while (atual != null) {
                System.out.println("Descrição: " + atual.getDado());
                atual = atual.proximo;
            }
        }
    }

    public void contagem() {
        for (int i = 0; i < tabela.length; i++) {
            int cont = 0;
            No atual = tabela[i];
            while (atual != null) {
                cont++;
                atual = atual.proximo;
            }

            if (tabela[i] != null) {
                System.out.println("Tipo: " + tabela[i].getTipo() + " - Quantidade: " + cont);
            } else if (i == 0) {
                System.out.println("Tipo: A - Quantidade: 0");
            } else if (i == 1) {
                System.out.println("Tipo: H - Quantidade: 0");
            } else if (i == 2) {
                System.out.println("Tipo: L - Quantidade: 0");
            } else if (i == 3) {
                System.out.println("Tipo: V - Quantidade: 0");
            }
        }
    }
}
