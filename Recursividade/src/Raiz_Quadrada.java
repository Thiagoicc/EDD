public class Raiz_Quadrada {
    public static void main(String[] args) {
        System.out.print(RaizQ(13, 3.2, 0.001));
    }

    public static Double RaizQ(int x, Double x0, Double e)    {
        if(Math.abs(Math.pow(x0, 2.0) - x) <= e)    {
            return x0;
        }

        else    {
            return RaizQ(x, (Math.pow(x0, 2.0) + x) / (2 * x0), e);
        }
    }
}
