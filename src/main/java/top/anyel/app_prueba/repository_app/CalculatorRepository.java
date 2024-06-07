package top.anyel.app_prueba.repository_app;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepository {

    public int sumar(int num1, int num2){
        return num1 + num2;
    }

    public double restar(double num1, double num2){
        return num1 - num2;
    }

    public double dividir(double num1, double num2){
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public double raizCuadrada(double num1){
        return Math.sqrt(num1);
    }

    public double raizN(double base, double exponente){
        return Math.pow(base, 1.0 / exponente);
    }
}