package main.dosw.semana_4.patrones.ejercicio5;

public class BankFacade {

    private final LegacyBankService legacy;
    private final PaymentProcessor adapter;

    public BankFacade() {

        this.legacy = new LegacyBankService();

        this.adapter = new LegacyBankAdapter(
                legacy,
                "ACC-999"
        );
    }

    public void procesarPago(double monto) {

        if (monto <= 0) {
            throw new IllegalArgumentException(
                    "El monto debe ser mayor que cero."
            );
        }

        System.out.println(
                "\nIniciando proceso de pago..."
        );

        legacy.initializeSystem();
        legacy.establishConnection();
        legacy.authenticateUser();
        legacy.loadSecurityContext();
        legacy.loadAccountContext("ACC-999");

        adapter.pay(monto);

        System.out.println(
                "Pago procesado correctamente."
        );
    }
}