package AV1.Segunda;

public class No {
    public Funcionario funcionario;
    public No proximo;

    public No(Funcionario funcionario) {
        this.funcionario = funcionario;
        proximo = null;
    }
}
