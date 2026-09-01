package main.dosw.semana_4.patrones.ejercicio8;

public class KitchenService implements OrderObserver {

    @Override
    public void onConfirm(String details) {

        System.out.println(
                "[COCINA] Pedido recibido. Preparando: "
                        + details
        );
    }
}