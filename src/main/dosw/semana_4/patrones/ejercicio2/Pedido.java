package main.dosw.semana_4.patrones.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final List<NotificationObserver> observers = new ArrayList<>();

    private String estado;

    public void addObserver(NotificationObserver observer) {

        if (observer == null) {
            throw new IllegalArgumentException(
                    "El observer no puede ser null."
            );
        }

        observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void cambiarEstado(String nuevoEstado) {

        if (nuevoEstado == null || nuevoEstado.isBlank()) {
            throw new IllegalArgumentException(
                    "El estado no puede estar vacío."
            );
        }

        this.estado = nuevoEstado;

        System.out.println(
                "\nEl pedido cambió al estado: " + estado
        );

        notificarObservers();
    }

    private void notificarObservers() {

        String event =
                "El pedido ahora está " + estado;

        for (NotificationObserver observer : observers) {
            observer.notify(event);
        }
    }
}