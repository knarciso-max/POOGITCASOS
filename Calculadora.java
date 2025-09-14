package paquete1;

public class Calculadora {
	
	//Crea una clase Calculadora con métodos sobrecargados llamados sumar.
	//Un método debe aceptar dos enteros.
	//Otro debe aceptar tres enteros.
	//Otro debe aceptar dos números decimales (double).
	//

	 // mEtodo sobrecargado que suma dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Metodo sobrecargado que suma tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Metodo sobrecargado que suma dos números decimales (double)
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método main para probar los métodos sobrecargados
    public static void main(String[] args) {
        // Crear un objeto de la clase calculadora
        Calculadora calc = new Calculadora();

        // Demostración de los tres métodos sobrecargados
        int sumaEnteros2 = calc.sumar(5, 10);            // Llama al método con 2 enteros
        int sumaEnteros3 = calc.sumar(3, 7, 2);          // Llama al método con 3 enteros
        double sumaDecimales = calc.sumar(4.5, 3.2);     // Llama al método con 2 doubles

        // Mostrar resultados en consola
        System.out.println("Suma de 2 enteros (5 + 10): " + sumaEnteros2);
        System.out.println("Suma de 3 enteros (3 + 7 + 2): " + sumaEnteros3);
        System.out.println("Suma de 2 decimales (4.5 + 3.2): " + sumaDecimales);
    }
}