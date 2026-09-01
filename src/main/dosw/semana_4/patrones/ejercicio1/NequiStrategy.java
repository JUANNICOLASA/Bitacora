package main.dosw.semana_4.patrones.ejercicio1;

public class NequiStrategy implements PaymentStrategy {

    @Override
    public void process(double amount) {
        System.out.println("Procesando pago de $" + amount + " vía Nequi (Colombia).");
    }
}