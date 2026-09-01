package main.dosw.semana_4.patrones.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 2 - OBSERVER + FACTORY METHOD");

        Pedido pedido = new Pedido();

        pedido.addObserver(new EmailNotifier());
        pedido.addObserver(new SmsNotifier());
        pedido.addObserver(new PushNotifier());
        pedido.addObserver(new WhatsAppNotifier());

        System.out.println("\n>>> PEDIDO PENDIENTE");

        pedido.cambiarEstado("PENDIENTE");

        System.out.println("\n>>> PEDIDO ENVIADO");

        pedido.cambiarEstado("ENVIADO");

        System.out.println("\n>>> PEDIDO ENTREGADO");

        pedido.cambiarEstado("ENTREGADO");
    }
}