package AV3.Quinta;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tabela {
    Amigo[] amigo = new Amigo[19];

    public int has(int mes) {
        int h = mes % amigo.length;
        int tentativa = 1;
        int pos = h;
        if (amigo[h] == null) {
            return h;
        } else {
            while (amigo[pos] != null) {
                pos = (h + tentativa) % amigo.length;
                h = pos;
                tentativa++;
            }
            return pos;
        }
    }

    public boolean calcularIdade(String dataNascimento) {
        Calendar cal = GregorianCalendar.getInstance();

        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);

        String[] dataNascimentovect = dataNascimento.split("/");

        int diaNascimento = Integer.parseInt(dataNascimentovect[0]);
        int mesNascimento = Integer.parseInt(dataNascimentovect[1]);
        int anoNascimento = Integer.parseInt(dataNascimentovect[2]);

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento && diaAtual < diaNascimento) {
            idade--;
        }

        return idade >= 18;
    }

    public void adicionar(String nome, String data) {
        String mes = data.substring(3, 5);
        int mesMes = Integer.parseInt(mes);

        amigo[has(mesMes)] = new Amigo(nome, data);
    }

    public void exibirMes(String mes) {
        for (Amigo value : amigo) {
            if (value != null) {
                if (mes.equals(value.getData().substring(3, 5))) {
                    System.out.println(value.toString());
                }
            }
        }
    }

    public void exibirMaiores() {
        for (Amigo value : amigo) {
            if (value != null) {
                if (calcularIdade(value.getData())) {
                    System.out.println("Maior de 18: " + value.toString());
                }
            }
        }
    }

    public void exibirTudo()    {
        for(Amigo value: amigo) {
            if (value != null)  {
                System.out.println(value.toString());
            }
        }
    }

    public void excluirNome(String nome) {
        for (int i = 0; i < amigo.length; i++) {
            if (amigo[i] != null) {
                if (nome.equals(amigo[i].getNome())) {
                    amigo[i] = null;
                }
            }
        }
    }

    public void excluirMes(String mes) {
        for (int i = 0; i < amigo.length; i++) {
            if (amigo[i] != null) {
                if (mes.equals(amigo[i].getData().substring(3,5))) {
                    amigo[i] = null;
                }
            }
        }
    }

}
