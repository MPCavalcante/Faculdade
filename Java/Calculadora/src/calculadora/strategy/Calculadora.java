package calculadora.strategy;

public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double executar(double a, double b) {
        if (operacao == null) {
            throw new IllegalStateException("Operação não definida.");
        }
        return operacao.calcular(a, b);
    }
}
