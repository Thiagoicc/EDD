import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fataux;

        System.out.println("Digite o número de sua preferência");
        fataux = entrada.nextInt();

        System.out.println(fat(fataux));

    }

    public static int fat(int n)    {
        if(n == 0)
            return 1;

        else
            return  n * fat(n - 1);
    }
}
