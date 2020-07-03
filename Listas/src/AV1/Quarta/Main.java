package AV1.Quarta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Lista lista = new Lista();
		
		for(int i = 0; i < 3; i++)	{
			System.out.println("Digite o nome do funcionário: ");
			String nomeAux = sc.next();
			String nomeAuxMaisculo = nomeAux.toUpperCase();
			System.out.println("Digite o salário do funcionário: ");
			double salAux = sc.nextDouble();
			lista.ordCres(new Funcionario(nomeAuxMaisculo,salAux));
		}

		lista.exibir();

		System.out.println("Digite a letra para procurar: ");
		char letraAux = sc.next().charAt(0);
		char letraAuxMaiscula = Character.toUpperCase(letraAux);

		lista.findLet(letraAuxMaiscula);

		lista.exiCres();
		lista.exiDesc();


	}
}
