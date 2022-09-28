package exerciciosPOOJavaII.pratica03;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
//        -------------------------
        Pereciveis produtoPerecivel1 = new Pereciveis(2, "leite", 5.00);
        produtoPerecivel1.calcular(5);
        produtos.add(produtoPerecivel1);

//        ---------------------------
        Pereciveis produtoPerecivel2 = new Pereciveis(5, "yogurt", 7.00);
        produtoPerecivel2.calcular(3);
        produtos.add(produtoPerecivel2);


        for (Produto produto : produtos) {
            System.out.println(produto);
        }


    }

}
