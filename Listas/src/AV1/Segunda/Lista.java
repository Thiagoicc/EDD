package AV1.Segunda;

public class Lista {
    No primeiro;
    No ultimo;

    public Lista() {
        primeiro = null;
        ultimo = null;
    }

    public void adicionar(Funcionario funcionario) {    //SIMPLESMENTE ENCADEADA ORDEM DESCRESCENTE
        No novo = new No(funcionario);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            if (ultimo.funcionario.getSalario() >= novo.funcionario.getSalario()) {
                ultimo.proximo = novo;
                ultimo = novo;
            } else if (novo.funcionario.getSalario() >= primeiro.funcionario.getSalario()) {
                novo.proximo = primeiro;
                primeiro = novo;
            } else {
                No atual = primeiro.proximo;
                No anterior = primeiro;

                while (atual != null) {
                    if (novo.funcionario.getSalario() > atual.funcionario.getSalario()) {
                        anterior.proximo = novo;
                        novo.proximo = atual;

                    }
                    atual = atual.proximo;
                    anterior = anterior.proximo;
                }
            }
        }
    }

    public void maiorSal()  {
        int cont = 0;
        No anterior = primeiro;
        No atual = primeiro.proximo;

        System.out.printf("Maior Salário: " + anterior.funcionario.getNome());

        while (atual != null && atual.funcionario.getSalario() == anterior.funcionario.getSalario()) {
            System.out.printf(" - " + atual.funcionario.getNome());
            atual = atual.proximo;
            anterior = anterior.proximo;
        }
        System.out.println();
    }

    public void mediaSal()  {
        double sumSal = 0;
        int quantSal = 0;
        No atual = primeiro;

        while (atual != null)   {
            sumSal += atual.funcionario.getSalario();
            atual = atual.proximo;
            quantSal++;
        }

        double result = sumSal / quantSal;
        System.out.println("Media Salarial: " + result);
    }

    public void maiorSalEscolha(double sal)  {
        No atual = primeiro;
        boolean achou = false;
        while (atual != null)   {
            if(atual.funcionario.getSalario() > sal)    {
                achou = true;
                System.out.printf("Salários maiores que %.2f: %s, Valor: %.2f%n",sal, atual.funcionario.getNome(),atual.funcionario.getSalario());
            }
            atual = atual.proximo;
        }

        if (!achou) {
            System.out.println("Não existem!");
        }
    }

    public void exibir() {
        No atual = primeiro;

        while (atual != null) {
            System.out.println(atual.funcionario.toString());
            atual = atual.proximo;
        }
    }
}
