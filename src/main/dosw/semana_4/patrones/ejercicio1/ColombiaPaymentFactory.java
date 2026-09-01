package main.dosw.semana_4.patrones.ejercicio1;

public class ColombiaPaymentFactory implements PaymentFactory {

    @Override
    public PaymentStrategy createPaymentMethod(String type) {

        if (type == null) {
            throw new IllegalArgumentException("El tipo de pago no puede ser null.");
        }

        return switch (type.toUpperCase()) {
            case "PSE" -> new PseStrategy();
            case "NEQUI" -> new NequiStrategy();
            case "TARJETA" -> new TarjetaStrategy();
            default -> throw new IllegalArgumentException(
                    "Método de pago no soportado en Colombia: " + type
            );
        };
    }
}