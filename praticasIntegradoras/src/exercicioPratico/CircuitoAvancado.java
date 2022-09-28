package exercicioPratico;

public class CircuitoAvancado extends Circuito {
    private final double VALOR_MINIMO  = 2800 ;

    @Override
    public Double calcularValorCircuito(Participante participante) {
        if(participante.getIdade() >= 18) {
            return VALOR_MINIMO;
        }
        return null;
    }
}
