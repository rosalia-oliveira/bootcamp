package exercicioCollections;

import exercicio01.Pessoa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> listas = new HashSet<>();
        Set<String> listas2 = new LinkedHashSet<>();
        Set<String> listas3 = new TreeSet<>();

        listas.add("Tu");
        listas.add("Nos");
        listas.add("Eles");
        System.out.println(listas);

        listas2.add("Eus");
        listas2.add("Tus");
        listas2.add("Eles");
        System.out.println(listas2);

        listas3.add("Nos");
        listas3.add("vos");
        listas3.add("Eles");
        System.out.println(listas3);
//        saida lindamente ordenada
    }
}
