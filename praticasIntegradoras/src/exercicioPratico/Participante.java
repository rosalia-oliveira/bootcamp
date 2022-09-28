package exercicioPratico;

public class Participante {
    private String rg;
    private String nome;
    private String sobrenome;
    private int idade;
    private String numeroCelular;
    private String numeroEmergencia;
    private String grupoSanguineo;

    public Participante(String rg, String nome, String sobrenome, int idade, String numeroCelular, String numeroEmergencia, String grupoSanguineo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.idade = idade;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        String r = "Nome: " + nome + "\n";
        r += "Sobrenome: " + sobrenome + "\n";
        r += "Idade: " + idade + "\n";
        r += "RG: " + rg + "\n";
        r += "Contato: " + numeroCelular + "\n";
        r += "Contato Emergencia: " + numeroEmergencia + "\n";
        r += "Grupo Sanguineo: " + grupoSanguineo + "\n";

        return r;
    }
}
