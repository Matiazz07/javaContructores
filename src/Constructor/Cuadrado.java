package Constructor;

public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return this.lado * this.lado;
    }

    public double calcularPerimetro() {
        return 4 * this.lado;
    }
}