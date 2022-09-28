package exerciciosPOOJavaII.pratica02;

public class Main {
    public static void main(String[] args) {
        try {
            double razao = PraticaExcecoes.calcularRazao();
            System.out.println(razao);
        } catch(Exception exc) {
            System.out.println(new IllegalArgumentException("Nao pode ser dividido por zero."));
        } finally {
            System.out.println("Programa Finalizado.");
        }

    }
}
