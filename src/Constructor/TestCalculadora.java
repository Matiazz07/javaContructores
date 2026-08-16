package Constructor;

public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double producto = calc.multiplicar(5, 3);
        System.out.println("El resultado de la multiplicaion es: " + producto);
        double cociente = calc.dividir(10, 2);
        System.out.println("El resultado de la division es: " + cociente);
        double promedio = calc.promediar(10, 20, 30);
        System.out.println("El resultado del promedio es: " + promedio);
        calc.mostrarResultado();

        Calculadora calc2 = new Calculadora();
        double resultador = calc2.restar(100.5, 40.5);
        System.out.println("El resultado de la resta es: " + resultador);
        double descuento = calc2.calcularDescuento(200, 15);
        System.out.println("El resultado del descuento es: " + descuento);
    }

}