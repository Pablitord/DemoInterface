package interfacee;

public class Main {

	public static void main(String[] args) {
		System.out.println("Pablo God ");
		
		Rectangulo rectangulo1 = new Rectangulo();
		
		rectangulo1.setAltura(15);
		rectangulo1.setBase(30);
		
		Triangulo triangulo1 = new Triangulo();
		
		triangulo1.setAltura(30);
		triangulo1.setBase(15);
		
		Circulo circulo1 = new Circulo();
		
		circulo1.setR(2.5);
		
		System.out.println("\nÁrea del rectángulo " + rectangulo1.calcularArea());
		
		System.out.println("\nÁrea del triángulo: " + triangulo1.calcularArea() );
		
		System.out.println("\nÁrea del círculo: " + circulo1.calcularArea());
	}

}
