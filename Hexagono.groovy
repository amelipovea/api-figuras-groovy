import com.arq.figurasreflexionpoo.model.FiguraGeometrica;

class Hexagono implements FiguraGeometrica {
    double lado;

    Hexagono(double lado) { this.lado = lado; }

    // Fórmula del área de un hexágono regular: (3 * √3 * lado^2) / 2 ≈ 2.598076 * lado^2
    public double calcularArea() { return 2.598076 * lado * lado; }
    public double calcularPerimetro() { return 6 * lado; }
}
return Hexagono;
