package AV1.Quinta;

public class ListaImpar {
    No primeiro;
    No ultimo;
    int cont = 0;

    public ListaImpar() {
        primeiro = null;
        ultimo = null;
    }

    public void addInit(int numero){
        No novo = new No(numero);

        if(primeiro == null)    {
            primeiro = novo;
            ultimo = novo;
        }   else    {
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }

    public int[] exibir(){
        No atual = primeiro;
        int [] numI = new int[20];

        while(atual != null)    {
            numI[cont] = atual.numero;
            atual = atual.proximo;
            cont++;
        }
        return numI;
    }



}
