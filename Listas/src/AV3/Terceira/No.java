package AV3.Terceira;

public class No {
    No proximo;

    private String nome;
    private double nota;
    private int codico;

    public No(String nome, double nota, int codico) {
        proximo = null;
        this.nome = nome;
        this.nota = nota;
        this.codico = codico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getCodico() {
        return codico;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", codico=" + codico +
                '}';
    }
}
