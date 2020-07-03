import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fiboaux;

        System.out.println("Digite o número de sua preferência");
        fiboaux = entrada.nextInt();

        for(int i = 1; i <= fiboaux; i++){
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int n)   {
        if(n == 1)
            return 0;

        else if(n == 2)
            return 1;

        else
            return  fibo(n - 2) + fibo(n - 1);
    }
}
