package AV3;

public class Lista {
    No primeiro;
    No ultimo;
    No raiz;
    No n = new No();
    Separador sp = new Separador();

    public Lista() {
        primeiro = null;
        ultimo = null;
        raiz = null;
    }

    public void add(char letra, No no) {
        No novo = new No(letra);
        if (raiz == null) {
            raiz = novo;
        } else {
            no = novo;
        }
    }

    public void add(No no) {
        No novo = new No();
        if (raiz == null) {
            raiz = novo;
        } else {
            no = novo;
        }
    }

    public void add() {
        sp.lerArq();

        for (int i = 0; i < sp.cont; i++) {
            No novo = new No(sp.letras[i], sp.quant[i]);

            if (primeiro == null) {
                primeiro = novo;
                ultimo = novo;
            } else if (novo.numero < primeiro.numero) {
                novo.proximo = primeiro;
                primeiro = novo;

            } else if (novo.numero >= ultimo.numero) {
                ultimo.proximo = novo;
                ultimo = novo;
            } else {
                No atual = primeiro;

                while (novo.numero >= atual.proximo.numero) {
                    atual = atual.proximo;
                }
                novo.proximo = atual.proximo;
                atual.proximo = novo;
            }
        }
    }

    public void exibirPreOrdem() {
        if (raiz != null) {
            exibirPreOrdem(raiz);
        }
    }

    public void exibirPreOrdem(No raiz) {
        if (raiz.ehFolha()) {
            System.out.print(raiz.letra + "/n");
        }

        if (raiz.esquerda != null) {
            exibirPreOrdem(raiz.esquerda);
        }

        if (raiz.direita != null) {
            exibirPreOrdem(raiz.direita);
        }
    }

    public No dequeue() {
        No aux = primeiro;
        primeiro = primeiro.proximo;
        return aux;
    }

    public void addFinal(No no) {
        No novo = no;
        ultimo.proximo = no;
        no.anterior = ultimo;
        ultimo = no;

    }

    public void criarArvore() {
        while (tamanhoLista() > 1) {
            No no1 = dequeue();
            No no2 = dequeue();
            No novo = new No(no1, no2, no1.numero + no2.numero);
            addFinal(novo);
        }

    }

    public int tamanhoLista() {
        No atual = primeiro;
        if (primeiro == null) {
            return 0;
        } else {
            int cont = 0;
            while (atual != null) {
                atual = atual.proximo;
                cont++;
            }
            return cont;
        }
    }
}
