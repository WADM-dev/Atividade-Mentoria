package FiguraGeometrica;
 double raio;
public class Circulo extends FiguraGeometrica{

}

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
}
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
}
