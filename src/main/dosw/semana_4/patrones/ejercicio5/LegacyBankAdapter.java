package main.dosw.semana_4.patrones.ejercicio5;

public class LegacyBankAdapter implements PaymentProcessor {

    private final LegacyBankService legacy;
    private final String account;

    public LegacyBankAdapter(
            LegacyBankService legacy,
            String account
    ) {
        this.legacy = legacy;
        this.account = account;
    }

    @Override
    public void pay(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "El monto debe ser mayor que cero."
            );
        }

        int cents = (int) Math.round(amount * 100);

        legacy.verifyBalance(cents);
        legacy.prepareTransaction();
        legacy.executeTransaction(account, cents);
    }
}