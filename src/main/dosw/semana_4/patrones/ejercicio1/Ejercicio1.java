package main.dosw.semana_4.patrones.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 1 - STRATEGY + FACTORY METHOD");


        System.out.println("Usuario de Colombia:");

        PaymentFactory colombiaFactory = new ColombiaPaymentFactory();

        PaymentStrategy colombiaStrategy =
                colombiaFactory.createPaymentMethod("PSE");

        Checkout colombiaCheckout =
                new Checkout(colombiaStrategy);

        colombiaCheckout.processPayment(150000.0);

        System.out.println();

        System.out.println("Usuario cambia de PSE a Nequi:");

        colombiaCheckout.setPaymentStrategy(
                colombiaFactory.createPaymentMethod("NEQUI")
        );

        colombiaCheckout.processPayment(85000.0);

        System.out.println();

        System.out.println("Usuario de USA:");

        PaymentFactory usaFactory = new UsaPaymentFactory();

        PaymentStrategy usaStrategy =
                usaFactory.createPaymentMethod("PAYPAL");

        Checkout usaCheckout =
                new Checkout(usaStrategy);

        usaCheckout.processPayment(200.0);
    }
}