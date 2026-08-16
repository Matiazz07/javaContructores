package Constructor;

public class Calculadora {
    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    public double promediar(double valor1, double valor2, double valor3) {
        return (valor1 + valor2 + valor3) / 3.0;
    }

    public void mostrarResultado() {
        System.out.println("Ahorita no joven estoy en hora de desayuno, en 15 minutos regreso");
    }

    public double restar(double valor3, double valor4) {
        return valor3 - valor4;
    }

    public double calcularDescuento(double precio, double porcentajeDescuento) {
        return precio - (precio * porcentajeDescuento / 100);
    }

}
