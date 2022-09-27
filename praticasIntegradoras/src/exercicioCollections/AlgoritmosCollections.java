package exercicioCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgoritmosCollections {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10);
        lista.add(20);
        lista.add(5);
        lista.add(3);
        lista.add(10);
        lista.add(-5);
        lista.add(6);
        lista.add(8);
        lista.add(-2);
        lista.add(4);


//        System.out.println("Lista na ordem crescente:");
        Collections.sort(lista);
        System.out.println("crescente => " + lista);
        Collections.swap(lista, 1, 4);
        System.out.println("swap => " + lista);

        Collections.rotate(lista, 2);
        System.out.println("rotate => " + lista);

//        System.out.println("Lista na ordem decrescente:");
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(lista, r);
        System.out.println("decrescente => " + lista);
        System.out.println("numero mínimo é => " + Collections.min(lista));
        System.out.println("numero máximo é => " + Collections.max(lista));

        Collections.shuffle(lista);
        System.out.println("shuffle => " + lista);

        Collections.shuffle(lista);
        System.out.println("shuffle => " + lista);
    }
}
