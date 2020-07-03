public class Combinação {
    public static void main(String[] args) {
        System.out.println("Combinações Recursivas" + combrec(5,3));
        System.out.println("Combinações Iterativas" + combite(5,3));
    }

    public static int combrec(int n, int k)    {
        if(k == 1)
            return n;
        if(k == n)
            return 1;
        if(1 < k && k < n)
            return combrec(n-1, k-1) + combrec(n-1, k);

        return 0;
    }

    public static int combite(int n, int k) {
        return fat(n) / (fat(k) * fat(n-k));
    }

    public static int fat(int n)    {
        if(n == 0)
            return 1;

        else
            return  n * fat(n - 1);
    }
}
