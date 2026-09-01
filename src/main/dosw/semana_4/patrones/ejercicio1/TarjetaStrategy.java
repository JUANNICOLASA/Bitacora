package main.dosw.semana_4.patrones.ejercicio1;

public class TarjetaStrategy implements PaymentStrategy {

    @Override
    public void process(double amount) {
        System.out.println("Procesando pago de $" + amount + " vía Tarjeta.");
    }
}