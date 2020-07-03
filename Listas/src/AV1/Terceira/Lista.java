package AV1.Terceira;

public class Lista {
	public No primeiro;
	public No ultimo;
	
	public Lista()	{
		primeiro = null;
		ultimo = null;
	}
	
	public void addInicio(Aluno aluno) {
        No novo = new No(aluno);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
    }
	
	public void alunoNotaSete() {
		No atual = primeiro;
		boolean achou = false;
		
		while(atual != null)	{
			if(atual.aluno.getNota() > 7)	{
				System.out.println("Notas maiores que sete: " + atual.aluno.toString());
				achou = true;
			}
			atual = atual.proximo;
		}
		
		if(achou == false)	{
			System.out.println("Todos os alunos com nota inferior a 7");
		}
	}
}
