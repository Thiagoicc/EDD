package AV1.Terceira;

public class No {
    Aluno aluno;
    No proximo;
    No anterior;
    
	public No(Aluno aluno) {
		this.aluno = aluno;
		proximo = null;
		anterior = null;
	}
}