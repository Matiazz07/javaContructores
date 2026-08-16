package Constructor;

public class TestVehiculo {
	public static void main(String[] args) {

		Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", 2024, 21500.50);

		System.out.println("=== DATOS DEL VEHÍCULO ===");
		System.out.println("Marca: " + miVehiculo.getMarca());
		System.out.println("Modelo: " + miVehiculo.getModelo());
		System.out.println("Año: " + miVehiculo.getAnio());
		System.out.println("Precio: $" + miVehiculo.getPrecio());

		miVehiculo.setPrecio(20000.00);
		System.out.println("\n=== PRECIO ACTUALIZADO ===");
		System.out.println("Nuevo Precio: $" + miVehiculo.getPrecio());
	}
}