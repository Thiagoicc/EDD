package AV3.Quinta;

public class Amigo {
    private String nome, data;

    public Amigo(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
