package main.dosw.semana_4.patrones.ejercicio2;

public class WhatsAppNotifier implements NotificationObserver {

    private final MessageFactory factory;

    public WhatsAppNotifier() {
        this.factory = new WhatsAppMessageFactory();
    }

    @Override
    public void notify(String event) {

        String message = factory.build(event);

        System.out.println("WHATSAPP:");
        System.out.println(message);
    }
}