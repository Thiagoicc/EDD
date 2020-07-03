package AV1.Quinta;

public class No {
    int numero;
    No anterior;
    No proximo;

    public No(int numero) {
        this.numero = numero;
        anterior = null;
        proximo = null;
    }
}
