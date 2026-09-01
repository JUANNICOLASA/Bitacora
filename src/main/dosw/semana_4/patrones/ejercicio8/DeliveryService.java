package main.dosw.semana_4.patrones.ejercicio8;

public class DeliveryService implements OrderObserver {

    @Override
    public void onConfirm(String details) {

        System.out.println(
                "[DOMICILIARIO] Preparando ruta de entrega para: "
                        + details
        );
    }
}