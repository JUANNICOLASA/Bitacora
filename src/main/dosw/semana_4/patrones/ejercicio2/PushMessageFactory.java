package main.dosw.semana_4.patrones.ejercicio2;

public class PushMessageFactory implements MessageFactory {

    @Override
    public String build(String event) {

        return "{"
                + "\"type\":\"ORDER_STATUS\","
                + "\"message\":\"" + event + "\""
                + "}";
    }
}