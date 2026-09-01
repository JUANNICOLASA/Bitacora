package main.dosw.semana_4.patrones.ejercicio2;

public class EmailMessageFactory implements MessageFactory {

    @Override
    public String build(String event) {
        return "<html><body>"
                + "<h3>Notificación del pedido</h3>"
                + "<p>" + event + "</p>"
                + "</body></html>";
    }
}