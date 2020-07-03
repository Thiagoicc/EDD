package AV1.Primeira;

public class No {
    public Produto valor;
    public No proximo;

    public No(Produto valor) {
        this.valor = valor;
        proximo = null;
    }
}