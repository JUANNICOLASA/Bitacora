package main.dosw.semana_4.patrones.ejercicio1;

public interface PaymentFactory {

    PaymentStrategy createPaymentMethod(String type);
}