package AV3;

public class No {
    No proximo;
    No anterior;
    No esquerda;
    No direita;
    char letra;
    int numero;

    public No(char l, int q) {
        this.letra = l;
        this.numero = q;
        proximo = null;
        anterior = null;
    }

    public No(int n) {

        this.numero = n;
    }

    public No(char n) {
        this.direita = null;
        this.esquerda = null;
        this.letra = n;
    }

    public No() {
    }

    public No(No esquerda, No direita, int n) {
        this.direita = direita;
        this.esquerda = esquerda;
        this.numero = n;
    }

    public boolean ehFolha() {
        return esquerda == null && direita == null;
    }
}
