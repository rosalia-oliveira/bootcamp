package exercicioPratico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Inscricao> inscricoes = new ArrayList<>();

//        Participante 1
        Participante participante1 = new Participante("167348", "Rosalia", "Padoin", 17, "99999999", "88888888", "AB");
        Circuito circuitoParticipante1 = new CircuitoPequeno();
        Inscricao inscricao1 = new Inscricao(participante1, circuitoParticipante1);
        inscricoes.add(inscricao1);

//        Participante 2
        Participante participante2 = new Participante("16734", "Ro", "Oliveira", 40, "99999999", "88888888", "AB");
        Circuito circuitoParticipante2 = new CircuitoAvancado();
        Inscricao inscricao2 = new Inscricao(participante2, circuitoParticipante2);

        inscricoes.add(inscricao2);

        inscricoes.stream().forEach(inscricao -> System.out.println(inscricao));

    }
}
