package AV1.Quinta;

public class ListaPar {
    No primeiro;
    No ultimo;
    int cont = 0;

    public ListaPar() {
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
        int [] numP = new int[20];

        while(atual != null)    {
            numP[cont] = atual.numero;
            atual = atual.proximo;
            cont++;
        }
        return numP;
    }



}
