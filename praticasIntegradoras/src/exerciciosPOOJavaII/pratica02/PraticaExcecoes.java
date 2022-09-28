package exerciciosPOOJavaII.pratica02;

public abstract class PraticaExcecoes {
    private static int a = 0;
    private static int b = 300;



    public static void calcularRazao() {
        try {
            double razao = b / a;
            System.out.println(razao);
        } catch(Exception exc) {
            System.out.println(new IllegalArgumentException("Nao pode ser dividido por zero."));
        } finally {
            System.out.println("Programa Finalizado.");
        }

    }
}
