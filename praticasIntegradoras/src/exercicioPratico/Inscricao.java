package exercicioPratico;

public class Inscricao {
    private Participante participante;
    private int numeroInscricao;
    private Circuito circuito;
    private static int codigoInscricao = 0;

    public Inscricao(Participante participante, Circuito circuito) {
        this.participante = participante;
        this.circuito = circuito;
        gerarCodigoInscricao();
    }

    private void gerarCodigoInscricao() {
        numeroInscricao = ++ codigoInscricao;
    }

    public Double calcularValor() {
        return circuito.calcularValorCircuito(participante);
    }

    @Override
    public String toString() {
        String r = "Participante: " + numeroInscricao + "\n"  + participante;
        r += "Codigo Inscricao: " + numeroInscricao + "\n";
        r +=  "Valor: " + calcularValor() + "\n";
        r += "--------------------------------------------" + "\n\n";

        return r;
    }
}
