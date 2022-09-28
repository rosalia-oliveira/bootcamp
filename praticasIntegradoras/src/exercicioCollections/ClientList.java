package exercicioCollections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientList {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        Map<String, String> item = new LinkedHashMap<>();

        item.put("nome", new Pessoa("Rosalia").getNome());
        lista.add(item);
        item.put("nome", new Pessoa("Rogerio").getNome());
        lista.add(item);

        System.out.println(lista);

    }
}
