import com.arq.figurasreflexionpoo.model.FiguraGeometrica;

class Trapecio implements FiguraGeometrica {
    double baseMayor;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() { return ((baseMayor + baseMenor) * altura) / 2.0; }
    public double calcularPerimetro() { return baseMayor + baseMenor + lado1 + lado2; }
}
return Trapecio;
