package AV1.Terceira;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Lista lista = new Lista();

		for(int i = 0; i < 5; i++)	{
			System.out.println("Digite o nome do aluno: ");
			String nomeAux = sc.next();
			System.out.println("Digite a nota do aluno: ");
			Double notaAux = sc.nextDouble();
			lista.addInicio(new Aluno(nomeAux,notaAux));
		}
		
		lista.alunoNotaSete();

		sc.close();
	}
}
