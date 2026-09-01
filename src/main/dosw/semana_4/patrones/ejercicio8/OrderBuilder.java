package main.dosw.semana_4.patrones.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

    private String size;
    private String meat;
    private String bread;

    private final List<String> toppings = new ArrayList<>();
    private final List<String> sides = new ArrayList<>();
    private final List<String> extras = new ArrayList<>();

    public OrderBuilder setSize(String size) {

        validateText(size, "El tamaño");

        this.size = size;

        return this;
    }

    public OrderBuilder setMeat(String meat) {

        validateText(meat, "La carne");

        this.meat = meat;

        return this;
    }

    public OrderBuilder setBread(String bread) {

        validateText(bread, "El tipo de pan");

        this.bread = bread;

        return this;
    }

    public OrderBuilder addTopping(String topping) {

        validateText(topping, "El topping");

        toppings.add(topping);

        return this;
    }

    public OrderBuilder addSide(String side) {

        validateText(side, "El acompañamiento");

        sides.add(side);

        return this;
    }

    public OrderBuilder addExtra(String extra) {

        validateText(extra, "El extra");

        extras.add(extra);

        return this;
    }

    public Order build() {

        if (size == null) {
            throw new IllegalStateException(
                    "El pedido debe tener un tamaño."
            );
        }

        if (meat == null) {
            throw new IllegalStateException(
                    "El pedido debe tener un tipo de carne."
            );
        }

        if (bread == null) {
            throw new IllegalStateException(
                    "El pedido debe tener un tipo de pan."
            );
        }

        return new Order(
                size,
                meat,
                bread,
                toppings,
                sides,
                extras
        );
    }

    private void validateText(
            String value,
            String field
    ) {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                    field + " no puede estar vacío."
            );
        }
    }
}