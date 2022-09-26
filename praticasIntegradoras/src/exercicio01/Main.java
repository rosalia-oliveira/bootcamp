package exercicio01;

public class Main {

    public static void main (String[] args) {
        Pessoa pessoaVazio   = new Pessoa();
        Pessoa pessoaNomeIdadeId = new Pessoa("Rosalia", 40, "3hgy4");
        Pessoa pessoaCompleto = new Pessoa("Rosalia", 40, "3hgy4", 66.5, 170);
        double calculoIMC = pessoaCompleto.calcularIMC();

        System.out.println("Os dados da pessoa cadastrada são: " + "\n" +
                pessoaCompleto.toString());

        System.out.println("A pessoa cadastrada é maior de idade? " + pessoaCompleto.ehMaioridade());

        if (calculoIMC == -1 ) {
            System.out.println("Abaixo do peso");
        } else if(calculoIMC == 0) {
            System.out.println("Peso Saudável");
        } else {
            System.out.println("Sobrepeso");
        }
    }
}

