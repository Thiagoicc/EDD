package AV3.Primeira;

public class No {
    No proximo;
    private String dado, tipo;

    public No(String dado, String tipo) {
        proximo = null;
        this.dado = dado;
        this.tipo = tipo;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
