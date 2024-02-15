package FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
