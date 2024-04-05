public class CalcularDesconto {
    public static double calcularValorDesconto (double precoOriginal, double percentualDesconto) {
        double valorDesconto = precoOriginal * (percentualDesconto/100);
        return valorDesconto;
    }
    public static double calcularValorFinal (double precoOriginal, double percentualDesconto) {
        double valorFinal = precoOriginal - (precoOriginal * (percentualDesconto/100));
        return valorFinal;
    }
}
