import com.arq.figurasreflexionpoo.model.FiguraGeometrica;

class Octagono implements FiguraGeometrica {
    double lado;

    Octagono(double lado) { this.lado = lado; }

    // Fórmula del área de un octágono regular: 2 * (1 + √2) * lado^2 ≈ 4.828427 * lado^2
    public double calcularArea() { return 4.828427 * lado * lado; }
    public double calcularPerimetro() { return 8 * lado; }
}
return Octagono;
