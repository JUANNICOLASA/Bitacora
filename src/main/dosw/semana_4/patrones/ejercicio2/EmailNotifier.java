package main.dosw.semana_4.patrones.ejercicio2;

public class EmailNotifier implements NotificationObserver {

    private final MessageFactory factory;

    public EmailNotifier() {
        this.factory = new EmailMessageFactory();
    }

    @Override
    public void notify(String event) {

        String message = factory.build(event);

        System.out.println("EMAIL:");
        System.out.println(message);
    }
}
