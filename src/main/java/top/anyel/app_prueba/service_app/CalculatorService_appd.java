package top.anyel.app_prueba.service_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.app_prueba.repository_app.CalculatorRepository;

@Service
public class CalculatorService_appd {

    private final CalculatorRepository calculatorRepository;

    @Autowired
    public CalculatorService_appd(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    public int sumar(int num1, int num2){
        return calculatorRepository.sumar(num1, num2);
    }

    public double restar(double num1, double num2){
        return calculatorRepository.restar(num1, num2);
    }

    public double multiplicar(double num1, double num2){
        return calculatorRepository.multiplicar(num1, num2);
    }

    public double dividir(double num1, double num2){
        return calculatorRepository.dividir(num1, num2);
    }

    public double raizCuadrada(double num1){
        return calculatorRepository.raizCuadrada(num1);
    }

    public double raizN(double base, double exponente){
        return calculatorRepository.raizN(base, exponente);
    }
}
