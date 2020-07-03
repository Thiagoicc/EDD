package AV1.Quinta;

public class Lista {
    No primeiro;
    No ultimo;

    public Lista() {
        primeiro = null;
        ultimo = null;
    }

    public void addCres(int numero) {
        No novo = new No(numero);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else if (primeiro.numero > novo.numero) {
            primeiro.anterior = novo;
            novo.proximo = primeiro;
            primeiro = novo;

        } else {
            No atual = primeiro;
            while (atual.proximo != null && novo.numero > atual.proximo.numero) {
                atual = atual.proximo;
            }
            if (atual.proximo == null) {
                novo.anterior = atual;
                atual.proximo = novo;
                ultimo = novo;
            } else {
                novo.proximo = atual.proximo;
                novo.anterior = atual;
                atual.proximo = novo;
                novo.proximo.anterior = novo;
            }
        }
    }

    public void exibirCres(){
        No atual = primeiro;

        System.out.println("Lista Crescente");

        while(atual != null)    {
            System.out.println("Número: " + atual.numero);
            atual = atual.proximo;
        }

        System.out.println();
    }

    public void exibirDec(){
        No atual = ultimo;

        System.out.println("Lista Descrescente");

        while(atual != null)    {
            System.out.println("Número: " + atual.numero);
            atual = atual.anterior;
        }

        System.out.println();
    }
}