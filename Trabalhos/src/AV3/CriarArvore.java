package AV3;

import java.io.IOException;

public class CriarArvore {
    String[][] tabelaString = new String[256][2];
    String s = "";
    int cont = 0;
    String arvore = "";
    Lista li = new Lista();

    Separador sp = new Separador();

    public void salvarArvore(No raiz) {

        if (raiz != null) {
            if (raiz.ehFolha()) {
                tabelaString[cont][0] = raiz.letra + "";
                tabelaString[cont][1] = s;
                cont++;
            }
            s = s + "0";
            salvarArvore(raiz.esquerda);
            s = s.substring(0, s.length() - 1);

            s = s + "1";
            salvarArvore(raiz.direita);
            s = s.substring(0, s.length() - 1);

        }

    }

    public void gravarTabela(No raiz) {
        if (raiz != null) {
            if (raiz.ehFolha()) {
                arvore += "1" + "0" + Integer.toBinaryString(raiz.letra);
            } else {
                arvore += "0";
            }
            gravarTabela(raiz.esquerda);
            gravarTabela(raiz.direita);
        }
    }

    public String escreverCod() {
        String linha = "";
        for (int i = 0; i < li.sp.linhaArq.length(); i++) {
            for (int ii = 0; ii < cont; ii++) {
                if ((li.sp.linhaArq.charAt(i) + "").equals(tabelaString[ii][0])) {
                    linha += tabelaString[ii][1];
                }
            }
        }
        return linha;
    }

    public void criarArvore() throws IOException {
        li.add();
        li.criarArvore();
        gravarTabela(li.ultimo);
        salvarArvore(li.ultimo);
        sp.salvarArq(arvore + escreverCod());
    }

}
