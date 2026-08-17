package Constructor;

public class TestCuadrado {
    public static void main(String[] args) {

        Cuadrado c = new Cuadrado(5);

        System.out.println("=== DATOS INICIALES DEL CUADRADO ===");
        System.out.println("Lado: " + c.getLado());
        System.out.println("Área inicial: " + c.calcularArea());

        c.setLado(6);

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println("Lado: " + c.getLado());
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}