package main.dosw.semana_4.patrones.ejercicio1;

public class UsaPaymentFactory implements PaymentFactory {

    @Override
    public PaymentStrategy createPaymentMethod(String type) {

        if (type == null) {
            throw new IllegalArgumentException("El tipo de pago no puede ser null.");
        }

        return switch (type.toUpperCase()) {
            case "PAYPAL" -> new PaypalStrategy();
            case "STRIPE" -> new StripeStrategy();
            case "TARJETA" -> new TarjetaStrategy();
            default -> throw new IllegalArgumentException(
                    "Método de pago no soportado en USA: " + type
            );
        };
    }
}