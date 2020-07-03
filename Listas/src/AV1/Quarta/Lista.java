package AV1.Quarta;

public class Lista {
	public No primeiro;
	public No ultimo;
	
	public Lista()	{
		primeiro = null;
		ultimo = null;
	}

	public void calImp(Funcionario funcionario)	{
		double imp = 0.0;

		if(funcionario.getSalario() <= 850)	{
			imp = imp + 0;
		}

		else if(funcionario.getSalario() > 850 && funcionario.getSalario() < 1200)	{
			imp = imp + funcionario.getSalario() * 0.1;
		}

		else
			imp = imp + funcionario.getSalario() * 0.2;

		System.out.println(funcionario.toString());
		System.out.println("Imposto: " + imp);
		System.out.println("Salário a receber: " + (funcionario.getSalario() - imp));
		System.out.println();
	}

	public void ordCres(Funcionario funcionario){
		No novo = new No(funcionario);

		if(primeiro == null)	{
			primeiro = novo;
			ultimo = novo;

		} else if (primeiro.funcionario.getSalario() > novo.funcionario.getSalario())	{
			primeiro.anterior = novo;
			novo.proximo = primeiro;
			primeiro = novo;

		} else	{
			No atual = primeiro;
			while(atual.proximo != null && novo.funcionario.getSalario() > atual.proximo.funcionario.getSalario())	{
				atual = atual.proximo;
			}

			if(atual.proximo == null) {
				novo.anterior = atual;
				atual.proximo = novo;
				ultimo = novo;
			} else {
				novo.proximo = atual.proximo;
				novo.anterior = atual;
				atual.proximo = novo;
				novo.proximo.anterior = novo;
			}
		}
	}

	public void ordDesc(Funcionario funcionario){
		No novo = new No(funcionario);

		if(primeiro == null)	{
			primeiro = novo;
			ultimo = novo;

		} else if (primeiro.funcionario.getSalario() < novo.funcionario.getSalario())	{
			primeiro.anterior = novo;
			novo.proximo = primeiro;
			primeiro = novo;

		} else	{
			No atual = primeiro;
			while(atual.proximo != null && novo.funcionario.getSalario() < atual.proximo.funcionario.getSalario())	{
				atual = atual.proximo;
			}

			if(atual.proximo == null) {
				novo.anterior = atual;
				atual.proximo = novo;
				ultimo = novo;
			} else {
				novo.proximo = atual.proximo;
				novo.anterior = atual;
				atual.proximo = novo;
				novo.proximo.anterior = novo;
			}
		}
	}

	public void exibir()	{
		No atual = primeiro;
		while(atual != null)	{
			calImp(atual.funcionario);
			atual = atual.proximo;
		}
		System.out.println();
	}

	public void exiCres() {
		No atual = primeiro;

		while (atual != null) {
			System.out.println(atual.funcionario.toString());
			atual = atual.proximo;
		}
		System.out.println();
	}

	public void exiDesc() {
		No atual = ultimo;

		while (atual != null) {
			System.out.println(atual.funcionario.toString());
			atual = atual.anterior;
		}
		System.out.println();
	}

	public void findLet(char c)	{
		No atual = primeiro;
		boolean achou = false;

		while (atual != null)	{
			if (atual.funcionario.getNome().charAt(0) == c) {
				System.out.println(atual.funcionario.toString());
				achou = true;
			}

			if(!achou && atual.proximo == null)
				System.out.println("Funcionário com a inicial " + c + " não encontrado");
				atual = atual.proximo;
		}
		System.out.println();
	}
}
