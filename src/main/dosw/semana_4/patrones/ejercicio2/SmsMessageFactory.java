package main.dosw.semana_4.patrones.ejercicio2;

public class SmsMessageFactory implements MessageFactory {

    @Override
    public String build(String event) {

        String message = "Pedido: " + event;

        if (message.length() > 160) {
            return message.substring(0, 160);
        }

        return message;
    }
}