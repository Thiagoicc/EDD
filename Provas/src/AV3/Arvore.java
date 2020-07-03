package AV3;

public class Arvore {
    No raiz;

    public Arvore() {
        raiz = null;
    }

    public void adicionar(String nome, String mes, String dia, int tamanho, No raiz) {
        if (tamanho < raiz.tamanho) {
            if (raiz.esquerda == null) {
                raiz.esquerda = new No(nome, mes, dia, tamanho);
            } else {
                adicionar(nome, mes, dia, tamanho, raiz.esquerda);
            }
        } else if (tamanho > raiz.tamanho) {
            if (raiz.direita == null) {
                raiz.direita = new No(nome, mes, dia, tamanho);
            } else {
                adicionar(nome, mes, dia, tamanho, raiz.direita);
            }
        }
    }

    public boolean pesquisar(int tamanho, No raiz) {
        if (tamanho == raiz.tamanho) {
            System.out.print(raiz.toString());
            System.out.println();
            return true;
        } else if (tamanho < raiz.tamanho) {
            if (raiz.esquerda == null) {
                return false;
            } else {
                return pesquisar(tamanho, raiz.esquerda);
            }
        } else {
            if (raiz.direita == null) {
                return false;
            } else {
                return pesquisar(tamanho, raiz.direita);
            }
        }
    }

    public void exibirEmOrdem(No raiz) {
        if (raiz.esquerda != null) {
            exibirEmOrdem(raiz.esquerda);
        }

        System.out.print(raiz.toString());
        System.out.println();

        if (raiz.direita != null) {
            exibirEmOrdem(raiz.direita);
        }
    }
}
