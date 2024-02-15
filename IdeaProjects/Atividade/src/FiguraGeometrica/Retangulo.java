package FiguraGeometrica;
public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

        public double calcularAre(){
            return base * altura;
        }

        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
}

