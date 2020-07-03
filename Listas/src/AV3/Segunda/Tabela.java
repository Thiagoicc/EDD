package AV3.Segunda;

public class Tabela {
    No[] tabela = new No[20];

    public int hashing(double chave, int tamanho) {
        return (int) (chave % tamanho);
    }

    public void adicionar(String nome, Double salario) {
        No novo = new No(nome, salario);
        if (tabela[hashing(salario, tabela.length)] != null) {
            novo.proximo = tabela[hashing(salario, tabela.length)];
        }
        tabela[hashing(salario, tabela.length)] = novo;
    }

    public void aumento(double aumento) {
        for (No no : tabela) {
            No atual = no;
            while (atual != null) {
                atual.setSalario(atual.getSalario() + (atual.getSalario() * (aumento / 100.0)));
                atual = atual.proximo;
            }
        }
    }

    public void salarioConsulta() {
        double soma = 0;
        for (No no : tabela) {
            No atual = no;
            while (atual != null) {
                if (atual.getSalario() > 500) {
                    soma += atual.getSalario();
                }
                atual = atual.proximo;
            }
        }
        System.out.println("Soma: " + soma);
    }

    public void exibir() {
        for (No no : tabela) {
            No atual = no;
            while (atual != null) {
                System.out.println(atual.toString());
                atual = atual.proximo;
            }
        }
    }

    public void excluir(String nome) {
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {
                if (tabela[i].getNome().equals(nome) && tabela[i].proximo == null) {
                    tabela[i] = null;
                } else {
                    No atual = tabela[i];
                    No aux = tabela[i].proximo;

                    while (aux != null) {
                        if (aux.getNome().equals(nome)) {
                            atual.proximo = aux.proximo;
                        }
                        atual = atual.proximo;
                        aux = aux.proximo;
                    }
                }
            }
        }
    }
}