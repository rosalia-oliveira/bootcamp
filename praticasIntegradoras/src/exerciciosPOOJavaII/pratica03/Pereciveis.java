package exerciciosPOOJavaII.pratica03;

public class Pereciveis extends Produto {
    private int diasParaVencer;
    private double valorTotalAPagar;
    private final double DESCONTO_PRIMEIRO_NIVEL = 0.25;
    private final double DESCONTO_SEGUNDO_NIVEL = 0.33;
    private final double DESCONTO_TERCEIRO_NIVEL = 0.50;


    public Pereciveis(int diasParaVencer, String nome, double preco) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    private double calcularDescontoPrimeiroNivel(double valor) {
        return valor / DESCONTO_PRIMEIRO_NIVEL;
    }

    private double calcularDescontoSegundoNivel(double valor) {
        return valor * DESCONTO_SEGUNDO_NIVEL;
    }

    private double calcularDescontoTerceiroNivel(double valor) {
        return valor * DESCONTO_TERCEIRO_NIVEL;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double valorCalculado = super.calcular(quantidadeDeProdutos);

        if (diasParaVencer == 1) {
            valorTotalAPagar = calcularDescontoPrimeiroNivel(valorCalculado);
        } else if(diasParaVencer == 2) {
           valorTotalAPagar = calcularDescontoSegundoNivel(valorCalculado);
        } else if(diasParaVencer == 3) {
            valorTotalAPagar = calcularDescontoTerceiroNivel(valorCalculado);
        } else {
            valorTotalAPagar = valorCalculado;
        }
        return valorTotalAPagar;
    }

    @Override
    public String toString() {
        String result = "Produto: " + super.toString() + "\n";
        result += "Quantidade de dias para vencer: " + diasParaVencer + "\n";
        result += "Valor Total a pagar: " + valorTotalAPagar + "\n";
        result += "-------------------------------------------------";
        return result;
    }
}
