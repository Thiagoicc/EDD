package AV2;

public class No {
    No proximo;
    No anterior;
    char letra;
    int numero;

    public No(char l, int q) {
        this.letra = l;
        this.numero = q;
        proximo = null;
        anterior = null;
    }
}
