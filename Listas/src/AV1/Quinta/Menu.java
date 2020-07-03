package AV1.Quinta;

import java.util.Scanner;

public class Menu {
    ListaPar listaPar = new ListaPar();
    ListaImpar listaImpar = new ListaImpar();
    Lista lista = new Lista();

    Scanner sc = new Scanner(System.in);

    public void addPI(){
        for(int i = 0;i < 20;i++) {
            System.out.println("Digite o número desejado: ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                listaPar.addInit(n);
            } else {
                listaImpar.addInit(n);
            }
        }
    }

    public void addGel(){
        int[] par = listaPar.exibir();
        int[] impar = listaImpar.exibir();

        for(int i = 0;i < listaPar.cont;i++){
            lista.addCres(par[i]);
        }
        for(int i = 0;i < listaImpar.cont;i++){
            lista.addCres(impar[i]);
        }

        lista.exibirCres();
        lista.exibirDec();
    }

}