package Constructor;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(10, 5);

        System.out.println("=== DATOS INICIALES DEL RECTÁNGULO ===");
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área inicial: " + r.calcularArea());

        r.setBase(15);
        r.setAltura(8);

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}