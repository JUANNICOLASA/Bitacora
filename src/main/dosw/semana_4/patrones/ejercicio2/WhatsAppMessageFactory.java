package main.dosw.semana_4.patrones.ejercicio2;

public class WhatsAppMessageFactory implements MessageFactory {

    @Override
    public String build(String event) {

        return "WhatsApp: " + event;
    }
}