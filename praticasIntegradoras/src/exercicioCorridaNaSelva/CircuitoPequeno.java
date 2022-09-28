package exercicioCorridaNaSelva;

public class CircuitoPequeno extends Circuito {
    private final double VALOR_MINIMO  = 1300;

    @Override
    public Double calcularValorCircuito(Participante participante) {
        if(participante.getIdade() < 18) {
            return VALOR_MINIMO;
        }
        return VALOR_MINIMO + 200;
    }
}
