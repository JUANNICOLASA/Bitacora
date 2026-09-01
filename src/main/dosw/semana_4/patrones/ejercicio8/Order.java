package main.dosw.semana_4.patrones.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Order {

    private final String size;
    private final String meat;
    private final String bread;
    private final List<String> toppings;
    private final List<String> sides;
    private final List<String> extras;

    private final List<OrderObserver> observers = new ArrayList<>();

    public Order(
            String size,
            String meat,
            String bread,
            List<String> toppings,
            List<String> sides,
            List<String> extras
    ) {
        this.size = size;
        this.meat = meat;
        this.bread = bread;

        this.toppings = List.copyOf(toppings);
        this.sides = List.copyOf(sides);
        this.extras = List.copyOf(extras);
    }

    public void addObserver(OrderObserver observer) {

        if (observer == null) {
            throw new IllegalArgumentException(
                    "El observer no puede ser null."
            );
        }

        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void confirm() {

        System.out.println("\n¡PEDIDO CONFIRMADO!");

        String details = buildDetails();

        System.out.println(details);

        notifyObservers(details);
    }

    private void notifyObservers(String details) {

        for (OrderObserver observer : observers) {
            observer.onConfirm(details);
        }
    }

    private String buildDetails() {

        return "Hamburguesa "
                + size
                + " | Carne: " + meat
                + " | Pan: " + bread
                + " | Toppings: " + formatList(toppings)
                + " | Acompañamientos: " + formatList(sides)
                + " | Extras: " + formatList(extras);
    }

    private String formatList(List<String> items) {

        if (items.isEmpty()) {
            return "Ninguno";
        }

        return String.join(", ", items);
    }

    public String getSize() {
        return size;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public List<String> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    public List<String> getSides() {
        return Collections.unmodifiableList(sides);
    }

    public List<String> getExtras() {
        return Collections.unmodifiableList(extras);
    }
}