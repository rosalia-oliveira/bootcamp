package exercicioCollections;

import exercicio01.Pessoa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Pessoa> listaArray = new ArrayList<>();
        LinkedList<Pessoa> listaLinked = new LinkedList<>();

        listaArray.add(new Pessoa("Rosalia", 40, "fht67"));
        listaArray.add(new Pessoa("Ro", 35, "fht67"));

        listaLinked.add(new Pessoa("RosaliaLinked", 40, "fht67"));
        listaLinked.add(new Pessoa("RoLinked", 35, "fht67"));

        System.out.println(listaArray);
        System.out.println(listaLinked);
    }

}
