package main.dosw.semana_4.patrones.ejercicio2;

public class PushNotifier implements NotificationObserver {

    private final MessageFactory factory;

    public PushNotifier() {
        this.factory = new PushMessageFactory();
    }

    @Override
    public void notify(String event) {

        String message = factory.build(event);

        System.out.println("PUSH:");
        System.out.println(message);
    }
}