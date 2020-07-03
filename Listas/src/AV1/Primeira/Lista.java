package AV1.Primeira;

import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);

    private No primeiro;
    private No ultimo;

    public Lista() {
        primeiro = null;
        ultimo = null;
    }

    public void adicionarInicio(Produto valor) {
        No novo = new No(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro = novo;
        }
    }

    public void adicionarFinal(Produto valor) {
        No novo = new No(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    public void removerInicio() {
        if (primeiro != null) {
            if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                No aux = primeiro;
                primeiro = primeiro.proximo;
                aux.proximo = null;
            }
        }
    }

    public void removerFinal() {
        if (ultimo != null) {
            if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                No atual = primeiro;

                while (atual.proximo != ultimo) {
                    atual = atual.proximo;
                }

                ultimo = atual;
                ultimo.proximo = null;
            }
        }
    }

    public void apagarLista()   {
        if(primeiro == null)
            System.out.println("Lista Vazia!");
        else {
            primeiro = null;
            System.out.println("Lista Esvaziada!");
        }
    }

    public void exibir() {
        No atual = primeiro;

        while (atual != null) {
            System.out.println(atual.valor.toString());
            atual = atual.proximo;
        }
    }

    public void exibirQuant() {
        No atual = primeiro;
        int quant = 0;

        while (atual != null) {
            if(atual.valor.getQuantProd() > 500) {
                quant++;
            }

            atual = atual.proximo;
        }

        System.out.println("Produtos com mais de 500: " + quant);
    }

    public int calcDesc(double valor, int desc)  {
        return (int) (valor - (valor * desc / 100));
    }

    public void desconto(int des)   {
        No atual = primeiro;
        while (atual != null)   {
            double valor = atual.valor.getPrecProd();
            atual.valor.setPrecProd(calcDesc(valor,des));
            atual = atual.proximo;
        }
    }
}