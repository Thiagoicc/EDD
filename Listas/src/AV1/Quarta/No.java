package AV1.Quarta;

public class No {
	Funcionario funcionario;
	No proximo;
	No anterior;
	
	public No(Funcionario funcionario)	{
		this.funcionario = funcionario;
		proximo = null;
		anterior = null;
	}
}
