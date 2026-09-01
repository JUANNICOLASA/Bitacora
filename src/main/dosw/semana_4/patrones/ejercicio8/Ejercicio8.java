package main.dosw.semana_4.patrones.ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 8 - BUILDER + OBSERVER");


        Order order = new OrderBuilder()
                .setSize("Grande")
                .setMeat("Doble Carne")
                .setBread("Brioche")
                .addTopping("Queso")
                .addTopping("Lechuga")
                .addTopping("Tomate")
                .addSide("Papas")
                .addSide("Gaseosa")
                .addExtra("Salsa especial")
                .build();

        System.out.println("Pedido construido correctamente.");
        System.out.println(
                "Tamaño: " + order.getSize()
        );
        System.out.println(
                "Carne: " + order.getMeat()
        );
        System.out.println(
                "Pan: " + order.getBread()
        );


        order.addObserver(new KitchenService());
        order.addObserver(new BillingService());
        order.addObserver(new DeliveryService());


        order.confirm();
    }
}