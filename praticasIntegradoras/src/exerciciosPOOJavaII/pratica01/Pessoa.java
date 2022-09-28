package exerciciosPOOJavaII.pratica01;
import java.lang.Math;

public class Pessoa {
    String nome;
    int idade;
    String id;
    double peso;
    int altura;
    private final int alturaConvertida = 100;
    public Pessoa() { }
    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa (String nome, int idade, String id, double peso, int altura) {
        this. nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this. altura = altura;
    }

    public int calcularIMC() {
        double potencia = (Math.pow(this.altura, 2)) / this.alturaConvertida;
        double imc = (this.peso / potencia) * 100;
        if(imc < 20) {
            return - 1;
        } else if( imc > 20 && imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaioridade() {
        return (this.idade >= 18);
    }

    @Override
    public String toString() {
        return ("Nome: " + this.nome + "\n" +
        "Idade: " + this.idade + "\n" +
        "Peso: " + this.peso + "\n" +
        "Altura: " + (this.altura != 0 ? this.altura : 170) + "cm");
    }

}
