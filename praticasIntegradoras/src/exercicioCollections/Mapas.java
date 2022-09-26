package exercicioCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer,String> listas = new HashMap();
        Map<Integer,String> listas2 = new TreeMap();

        String[] listaNomes = new String[4];
        listaNomes[0] = "Eu";
//        listaNomes[1] = "Tu";
        listaNomes[2] = "Nos";
        listaNomes[3] = "Vos";

        for (int i = 0; i < 4; i++) {
            listas.put(i, listaNomes[i]);
            listas2.put(i, listaNomes[i]);
        }

        System.out.println("listas " + listas + " " + listas2);

        System.out.println(listas2);

        System.out.println("listas-Chave " + listas.keySet() + " " + listas2.keySet());
//        [0, 1, 2, 3]
        System.out.println("listas-Value " + listas.values() + " " + listas2.values());
//        [Eu, Tu, Nos, Vos]

    }
}
