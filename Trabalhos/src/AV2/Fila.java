package AV2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fila {
    No primeiro;
    No ultimo;
    Separador sp = new Separador();

    public Fila() {
        primeiro = null;
        ultimo = null;
    }

    public void dequeue() {
        primeiro = primeiro.proximo;
    }

    public void enqueue(String arquivo) {
        sp.lerArq(arquivo);

        for (int i = 0; i < sp.cont; i++) {
            No novo = new No(sp.letras[i], sp.quant[i]);

            if (primeiro == null) {
                primeiro = novo;
                ultimo = novo;
            } else if (primeiro.numero >= novo.numero) {
                primeiro.anterior = novo;
                novo.proximo = primeiro;
                primeiro = novo;

            } else if (novo.numero >= ultimo.numero) {
                ultimo.proximo = novo;
                novo.anterior = ultimo;
                ultimo = novo;
            } else {
                No atual = primeiro;

                while (novo.numero >= atual.numero) {
                    atual = atual.proximo;
                }
                novo.proximo = atual;
                novo.anterior = atual.anterior;
                atual.anterior.proximo = novo;
                atual.anterior = novo;

            }

        }
    }

    public void salvarArq() throws IOException {

        FileWriter arq = new FileWriter("C:\\Users\\thiag\\Desktop\\cadeia.txt");
        PrintWriter gravarar = new PrintWriter(arq);

        No atual = primeiro;
        while (atual != null) {
            gravarar.printf("caractere: " + atual.letra + "%n");
            gravarar.printf(" quant: " + atual.numero + "%n");
            gravarar.printf("%n");

            atual = atual.proximo;
        }

        arq.close();
    }
}
