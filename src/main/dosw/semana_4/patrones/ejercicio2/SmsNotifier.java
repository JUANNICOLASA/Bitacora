package main.dosw.semana_4.patrones.ejercicio2;

public class SmsNotifier implements NotificationObserver {

    private final MessageFactory factory;

    public SmsNotifier() {
        this.factory = new SmsMessageFactory();
    }

    @Override
    public void notify(String event) {

        String message = factory.build(event);

        System.out.println("SMS:");
        System.out.println(message);
    }
}