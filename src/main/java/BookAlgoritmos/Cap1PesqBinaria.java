package BookAlgoritmos;

import java.util.ArrayList;
import java.util.List;

public class Cap1PesqBinaria {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("liss");
        pesquisaBinaria(lista, 8);
    }

    public static void pesquisaBinaria(List<Integer> list, Integer item) {
        Integer baixo = 0;
        Integer alto = list.size() - 1;
        Integer resposta = 0;

        while (baixo <= alto) {
            Integer meio = (baixo + alto) / 2;
            Integer chute = list.get(meio);

            if (chute == item) {
                resposta = meio;
            }

            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        System.out.println("array position: "+resposta.toString());;
    }

}
