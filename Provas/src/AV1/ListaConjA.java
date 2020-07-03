package AV1;

public class ListaConjA {
    No inicio;
    No fim;

    public ListaConjA() {
        inicio = null;
        fim = null;
    }

    public void adicionar(int valor) {
        No novo = new No(valor);

        if(inicio == null)  {
            inicio = novo;
            fim = novo;
        } else {
            if(inicio.valor >= novo.valor) {
                novo.proximo = inicio;
                inicio = novo;
            }
            else if(novo.valor >= fim.valor) {
                fim.proximo = novo;
                fim = novo;
            } else {
                No atual = inicio;

                while (novo.valor > atual.proximo.valor && atual != null)    {
                    atual = atual.proximo;
                }

                novo.proximo = atual.proximo;
                atual.proximo = novo.proximo;
            }
        }
    }

    public void exibir() {
        No atual = inicio;

        System.out.println("Conjunto A: ");

        while (atual != null) {
            System.out.print(atual.valor + " \n");
            atual = atual.proximo;
        }
    }
}
