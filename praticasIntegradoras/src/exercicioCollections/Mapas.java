package exercicioCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer,String> listas = new HashMap();
        Map<Integer,String> listas2 = new TreeMap();
        Map<Integer, String> listas3 = new LinkedHashMap<>();

        String[] listaNomes = new String[4];
        listaNomes[0] = "Eu";
//        listaNomes[1] = "Tu";
        listaNomes[2] = "Nos";
        listaNomes[3] = "Vos";

        for (int i = 0; i < 4; i++) {
            listas.put(i, listaNomes[i]);
        }

        listas2.put(1, "eu");
        listas2.put(5, "eles");
        listas2.put(3, "nos");
        listas2.put(2, null);
//        listas2.put(null, null);
//        emite NullPointerException

        listas3.put(1, "eu");
        listas3.put(5, "eles");
        listas3.put(3, "nos");
        listas3.put(2, null);

        System.out.println("listas " + listas);
//        listas {0=Eu, 1=null, 2=Nos, 3=Vos}
        System.out.println("listas2 " + listas2 + listas3);
//        listas2 {1=eu, 2=null, 3=nos, 5=eles} listas3 {1=eu, 5=eles, 3=nos, 2=null}
        System.out.println("listas-Chave " + listas.keySet());
//       listas-Chave [0, 1, 2, 3]
        System.out.println("listas2-chave " + listas2.keySet());
//        listas2-chave [1, 2, 3, 5]
        System.out.println("listas-Value " + listas.values());
//        listas-Value [Eu, null, Nos, Vos]
        System.out.println("listas2-Value " + listas2.values());
//       listas2-Value [eu, null, nos, eles]
    }
}
