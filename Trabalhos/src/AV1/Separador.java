package AV1;

public class Separador {
    char[] letras = new char[256];
    int[] quant = new int[256];
    int cont = 0;

    public int encontrar(char[] t, char b) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public void ler(String s) {
        for (int i = 0; i < s.length(); i++) {
            int pos = encontrar(letras, s.charAt(i));

            if (pos == -1) {
                letras[cont] = s.charAt(i);
                quant[cont] = 1;
                cont++;
            } else {
                quant[pos]++;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < cont; i++)
            System.out.println("o caractere " + letras[i] + " se repete " + quant[i] + " vez");
    }
}