package exercicioPratico;

public class CircuitoMedio extends Circuito{
    private final double VALOR_MINIMO  = 2000;

    @Override
    public Double calcularValorCircuito(Participante participante) {
        if (participante.getIdade() < 18) {
            return this.VALOR_MINIMO;
        }
        return this.VALOR_MINIMO + 300;
    }
}
