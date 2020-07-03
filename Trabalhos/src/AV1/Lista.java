package AV1;

public class Lista {
    No primeiro;
    No ultimo;
    Separador sp = new Separador();

    public Lista() {
        primeiro = null;
        ultimo = null;
    }

    public void add(String s) {
        sp.ler(s);
        for (int i = 0; i < sp.cont; i++) {
            No novo = new No(sp.letras[i], sp.quant[i]);

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
                }
            }

        }
    }

    public void mostrar() {
        No atual = primeiro;
        while (atual != null) {
            System.out.print("caractere: " + atual.letra);
            System.out.println(" quant: " + atual.numero);
            atual = atual.proximo;
        }
    }
}
