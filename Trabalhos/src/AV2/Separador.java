package AV2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    public void lerArq(String arquivo) {
        String nome = arquivo;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\thiag\\Desktop\\" + nome + ".txt"));
            String linha = br.readLine();

            while (linha != null) {
                ler(linha);
                linha = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
