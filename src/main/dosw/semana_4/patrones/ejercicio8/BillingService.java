package main.dosw.semana_4.patrones.ejercicio8;

public class BillingService implements OrderObserver {

    @Override
    public void onConfirm(String details) {

        System.out.println(
                "[FACTURACIÓN] Generando cuenta para: "
                        + details
        );
    }
}