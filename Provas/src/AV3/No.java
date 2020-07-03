package AV3;

public class No {
    No proximo, direita, esquerda;

    String nome, mes, dia;

    int tamanho;

    public No(String nome, String mes, String dia, int tamanho) {
        proximo = null;
        this.nome = nome;
        this.mes = mes;
        this.dia = dia;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", mes='" + mes + '\'' +
                ", dia='" + dia + '\'' +
                '}';
    }
}
