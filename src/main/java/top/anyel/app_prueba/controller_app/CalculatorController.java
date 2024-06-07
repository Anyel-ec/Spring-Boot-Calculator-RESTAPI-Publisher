package top.anyel.app_prueba.controller_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.anyel.app_prueba.service_app.CalculatorService_appd;

@RestController
@RequestMapping("/calculator/v1")
public class CalculatorController {

    private final CalculatorService_appd calculatorService;

    @Autowired
    public CalculatorController(CalculatorService_appd calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/sumar")
    public ResponseEntity<Integer> sumar(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.sumar(num1, num2);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/restar")
    public ResponseEntity<Double> restar(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.restar(num1, num2);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/dividir")
    public ResponseEntity<Double> dividir(@RequestParam double num1, @RequestParam double num2) {
        try {
            double result = calculatorService.dividir(num1, num2);
            return ResponseEntity.ok(result);
        } catch (ArithmeticException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<Double> multiplicar(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.multiplicar(num1, num2);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/raiz_cuadrada")
    public ResponseEntity<Double> raizCuadrada(@RequestParam double num1) {
        double result = calculatorService.raizCuadrada(num1);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/raiz_n")
    public ResponseEntity<Double> raizN(@RequestParam double base, @RequestParam double exponente) {
        double result = calculatorService.raizN(base, exponente);
        return ResponseEntity.ok(result);
    }
}
