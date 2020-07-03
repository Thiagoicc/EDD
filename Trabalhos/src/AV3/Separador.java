package AV3;

import java.io.*;
import java.util.Scanner;

public class Separador {
    char[] letras = new char[256];
    int[] quant = new int[256];
    String linhaArq = "";
    int cont = 0;
    String s;

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

    public void lerArq() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("digite o nome do arquivo da area de trabalho:");
            s = sc.nextLine();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\thiag\\Desktop\\" + s + ".txt"));
            String linha = br.readLine();
            while (linha != null) {
                ler(linha);
                linhaArq += linha;
                linha = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void salvarArq(String s) throws IOException {
        FileWriter arq = new FileWriter("C:\\Users\\thiag\\Desktop\\cadeia.txt");
        PrintWriter gravar = new PrintWriter(arq);
        gravar.printf(s);
        arq.close();
    }
}
