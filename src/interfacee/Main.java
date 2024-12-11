package interfacee;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Pablo");
		
		Rectangulo rectangulo1 = new Rectangulo();
		
		rectangulo1.setAltura(15);
		rectangulo1.setBase(30);
		
		System.out.println("Área del rectángulo " + rectangulo1.calcularArea());

	}

}
