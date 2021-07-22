package ec.edu.epn.calculator;

public class CalculadoraEjecutable {
    public static void main(String[] args) {
        System.out.println("*****Calculadora Ejecutable*****");
        Calculadora c = new Calculadora();

        //Usando el método de suma
        System.out.println("c.addition(15,6) = "+ c.addition(15,6));
        //Usando el método de resta
        System.out.println("c.subtraction(15,6) = "+ c.subtraction(15,6));
        //Usando el método de multiplicación
        System.out.println("c.multiplication(7,6) = "+ c.multiplication(7,6));
        //Usando el método de división
        System.out.println("c.division(42,6) = "+ c.division(42,6));

    }
}
