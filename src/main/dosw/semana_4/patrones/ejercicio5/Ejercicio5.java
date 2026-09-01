package main.dosw.semana_4.patrones.ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 5 - ADAPTER + FACADE");

        BankFacade facade = new BankFacade();

        facade.procesarPago(250.00);
    }
}