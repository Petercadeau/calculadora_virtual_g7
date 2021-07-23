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
        //
        System.out.println("******Cambio en el main");
        //Usando el método de suma
        System.out.println("c.addition(5,10) = "+ c.addition(5,10));
        //Usando el método de resta
        System.out.println("c.subtraction(8,2) = "+ c.subtraction(8,2));
        //Usando el método de multiplicación
        System.out.println("c.multiplication(5,12) = "+ c.multiplication(5,12));
        //Usando el método de división
        System.out.println("c.division(6,2) = "+ c.division(6,2));
    }
}
